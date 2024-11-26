package ch.cyberduck.core.ocs;

/*
 * Copyright (c) 2002-2024 iterate GmbH. All rights reserved.
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

import ch.cyberduck.core.DescriptiveUrl;
import ch.cyberduck.core.ocs.model.Share;

import org.apache.http.HttpEntity;

import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class OcsDownloadShareResponseHandler extends OcsResponseHandler<DescriptiveUrl> {

    @Override
    public DescriptiveUrl handleEntity(final HttpEntity entity) throws IOException {
        final XmlMapper mapper = new XmlMapper();
        final Share value = mapper.readValue(entity.getContent(), Share.class);
        if(null != value.data) {
            if(null != value.data.url) {
                return new DescriptiveUrl(value.data.url, DescriptiveUrl.Type.http);
            }
        }
        return DescriptiveUrl.EMPTY;
    }
}
