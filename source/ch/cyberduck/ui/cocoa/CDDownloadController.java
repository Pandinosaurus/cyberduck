package ch.cyberduck.ui.cocoa;

/*
 *  Copyright (c) 2004 David Kocher. All rights reserved.
 *  http://cyberduck.ch/
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  Bug fixes, suggestions and comments should be sent to:
 *  dkocher@cyberduck.ch
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

import com.apple.cocoa.application.*;
import com.apple.cocoa.foundation.NSMutableArray;
import com.apple.cocoa.foundation.NSNotification;
import com.apple.cocoa.foundation.NSSelector;

import org.apache.log4j.Logger;

import ch.cyberduck.core.*;

/**
 * @version $Id$
 */
public class CDDownloadController extends CDController {
	private static Logger log = Logger.getLogger(CDDownloadController.class);

	private static NSMutableArray instances = new NSMutableArray();

	private NSTextField urlField;

	public void setUrlField(NSTextField urlField) {
		this.urlField = urlField;
	}

	public CDDownloadController() {
		instances.addObject(this);
		if(false == NSApplication.loadNibNamed("Download", this)) {
			log.fatal("Couldn't load Download.nib");
		}
	}

	public void awakeFromNib() {
		log.debug("awakeFromNib");
		this.window().setReleasedWhenClosed(true);
		CDQueueController controller = CDQueueController.instance();
		controller.beginSheet(this.window());
	}

	public void windowWillClose(NSNotification notification) {
		instances.removeObject(this);
	}
	
	public void cancelButtonClicked(Object sender) {
		log.debug("cancelButtonClicked");
		NSApplication.sharedApplication().endSheet(this.window(), ((NSButton)sender).tag());
	}
	
	public void downloadButtonClicked(Object sender) {
		log.debug("downloadButtonClicked");
		try {
			URL url = new URL(URLDecoder.decode(urlField.stringValue(), "UTF-8"));
			Host host = new Host(url.getProtocol(),
								 url.getHost(),
								 url.getPort());
			host.setCredentials(url.getUserInfo(), null);
			Session session = SessionFactory.createSession(host);
			String file = url.getFile();
			if(file.length() > 1) {
				Path path = PathFactory.createPath(SessionFactory.createSession(host), file);
				Queue queue = new DownloadQueue();
				queue.addRoot(path);
				CDQueueController.instance().startItem(queue);
			}
			else {
				throw new MalformedURLException("URL must contain reference to a file");
			}
			NSApplication.sharedApplication().endSheet(this.window(), ((NSButton)sender).tag());
		}
		catch(java.io.UnsupportedEncodingException e) {
			log.error(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			NSAlertPanel.beginCriticalAlertSheet("Error", //title
												 "OK", // defaultbutton
												 null, //alternative button
												 null, //other button
												 this.window(), //docWindow
												 null, //modalDelegate
												 null, //didEndSelector
												 null, // dismiss selector
												 null, // context
												 e.getMessage() // message
												 );
		}
		catch(MalformedURLException e) {
			NSAlertPanel.beginCriticalAlertSheet("Error", //title
												 "OK", // defaultbutton
												 null, //alternative button
												 null, //other button
												 this.window(), //docWindow
												 null, //modalDelegate
												 null, //didEndSelector
												 null, // dismiss selector
												 null, // context
												 e.getMessage() // message
												 );
		}
	}
}