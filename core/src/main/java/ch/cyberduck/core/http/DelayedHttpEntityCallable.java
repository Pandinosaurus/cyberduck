package ch.cyberduck.core.http;

/*
 * Copyright (c) 2002-2022 iterate GmbH. All rights reserved.
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

import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.BackgroundException;

import org.apache.http.entity.AbstractHttpEntity;

public abstract class DelayedHttpEntityCallable<T> {

    private final Path file;

    public DelayedHttpEntityCallable(final Path file) {
        this.file = file;
    }

    public abstract T call(AbstractHttpEntity entity) throws BackgroundException;

    /**
     * @return -1 for chunked transfer
     */
    public abstract long getContentLength();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DelayedHttpEntityCallable{");
        sb.append("file=").append(file);
        sb.append('}');
        return sb.toString();
    }
}
