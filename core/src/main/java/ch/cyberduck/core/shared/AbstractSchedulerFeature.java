package ch.cyberduck.core.shared;

/*
 * Copyright (c) 2002-2017 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.PasswordCallback;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.Session;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.exception.ConnectionCanceledException;
import ch.cyberduck.core.exception.LoginFailureException;
import ch.cyberduck.core.features.Scheduler;
import ch.cyberduck.core.pool.SessionPool;
import ch.cyberduck.core.threading.BackgroundActionState;
import ch.cyberduck.core.threading.ScheduledThreadPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public abstract class AbstractSchedulerFeature<R> implements Scheduler<Void> {
    private static final Logger log = LogManager.getLogger(AbstractSchedulerFeature.class);

    private final long period;
    private final ScheduledThreadPool scheduler = new ScheduledThreadPool();

    public AbstractSchedulerFeature(final long period) {
        this.period = period;
    }

    @Override
    public Void repeat(final SessionPool pool, final PasswordCallback callback) {
        scheduler.repeat(new PoolOperator(pool, callback), period, TimeUnit.MILLISECONDS);
        return null;
    }

    public Void single(final Session<?> session, final PasswordCallback callback, final Path file) {
        scheduler.schedule(new SessionOperator(session, callback, file), 0L, TimeUnit.MILLISECONDS);
        return null;
    }

    protected abstract R operate(Session<?> session, PasswordCallback callback, Path file) throws BackgroundException;

    @Override
    public void shutdown() {
        log.debug("Shutting down scheduler thread pool");
        scheduler.shutdown();
    }

    private class PoolOperator implements Runnable {
        private final SessionPool pool;
        private final PasswordCallback callback;

        public PoolOperator(final SessionPool pool, final PasswordCallback callback) {
            this.pool = pool;
            this.callback = callback;
        }

        @Override
        public void run() {
            try {
                final Session<?> session = pool.borrow(BackgroundActionState.running);
                try {
                    AbstractSchedulerFeature.this.operate(session, callback, null);
                }
                finally {
                    pool.release(session, null);
                }
            }
            catch(LoginFailureException | ConnectionCanceledException e) {
                log.warn("Cancel processing scheduled task after failure {}", e.getMessage());
                AbstractSchedulerFeature.this.shutdown();
            }
            catch(BackgroundException e) {
                log.warn("Failure processing scheduled task. {}", e.getMessage(), e);
            }
            catch(Exception e) {
                log.error("Failure processing scheduled task {}", e.getMessage(), e);
                AbstractSchedulerFeature.this.shutdown();
            }
        }
    }

    private class SessionOperator implements Runnable {
        private final Session<?> session;
        private final PasswordCallback callback;
        private final Path file;

        public SessionOperator(final Session<?> session, final PasswordCallback callback, final Path file) {
            this.session = session;
            this.callback = callback;
            this.file = file;
        }

        @Override
        public void run() {
            try {
                AbstractSchedulerFeature.this.operate(session, callback, file);
            }
            catch(BackgroundException e) {
                log.warn("Failure processing scheduled task. {}", e.getMessage(), e);
            }
            catch(Exception e) {
                log.error("Failure processing scheduled task {}", e.getMessage(), e);
                AbstractSchedulerFeature.this.shutdown();
            }
        }
    }
}
