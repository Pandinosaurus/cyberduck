package ch.cyberduck.core.cryptomator.features;

/*
 * Copyright (c) 2002-2017 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.ConnectionCallback;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.Session;
import ch.cyberduck.core.cryptomator.CryptoVault;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.exception.InvalidFilenameException;
import ch.cyberduck.core.features.Delete;
import ch.cyberduck.core.features.Move;
import ch.cyberduck.core.transfer.TransferStatus;

import java.util.EnumSet;

public class CryptoMoveV6Feature implements Move {

    private final Session<?> session;
    private final Move proxy;
    private final CryptoVault vault;

    public CryptoMoveV6Feature(final Session<?> session, final Move delegate, final CryptoVault cryptomator) {
        this.session = session;
        this.proxy = delegate;
        this.vault = cryptomator;
    }

    @Override
    public Path move(final Path file, final Path renamed, final TransferStatus status, final Delete.Callback callback, final ConnectionCallback connectionCallback) throws BackgroundException {
        // Move inside vault moves actual files and only metadata files for directories but not the actual directories
        final Path target = proxy.move(
                vault.encrypt(session, file, file.isDirectory()),
                vault.encrypt(session, renamed, file.isDirectory()), status, callback, connectionCallback);
        if(file.isDirectory()) {
            vault.getDirectoryProvider().delete(file);
        }
        if(vault.contains(target)) {
            return vault.decrypt(session, target);
        }
        return target;
    }

    @Override
    public EnumSet<Flags> features(final Path source, final Path target) {
        // No need to handle recursion with encrypted filenames
        return EnumSet.of(Flags.recursive);
    }

    @Override
    public void preflight(final Path source, final Path target) throws BackgroundException {
        if(!vault.getFilenameProvider().isValid(target.getName())) {
            throw new InvalidFilenameException();
        }
        proxy.preflight(source, target);
    }

    @Override
    public Move withTarget(final Session<?> session) {
        proxy.withTarget(session);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CryptoMoveFeature{");
        sb.append("proxy=").append(proxy);
        sb.append('}');
        return sb.toString();
    }
}
