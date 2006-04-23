/*
 *  SSHTools - Java SSH2 API
 *
 *  Copyright (C) 2002-2003 Lee David Painter and Contributors.
 *
 *  Contributions made by:
 *
 *  Brett Smith
 *  Richard Pernavas
 *  Erwin Bolwidt
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Library General Public License
 *  as published by the Free Software Foundation; either version 2 of
 *  the License, or (at your option) any later version.
 *
 *  You may also distribute it and/or modify it under the terms of the
 *  Apache style J2SSH Software License. A copy of which should have
 *  been provided with the distribution.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  License document supplied with your distribution for more details.
 *
 */
package com.sshtools.j2ssh.subsystem;

import com.sshtools.j2ssh.transport.InvalidMessageException;
import com.sshtools.j2ssh.transport.MessageNotAvailableException;
import com.sshtools.j2ssh.transport.MessageStoreEOFException;
import com.sshtools.j2ssh.util.OpenClosedState;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author $author$
 * @version $Revision$
 */
public class SubsystemMessageStore {
	private static Logger log = Logger.getLogger(SubsystemMessageStore.class);

	// List to hold messages as they are received

	/**  */
	protected List messages = new ArrayList();

	// Map to hold message implementation classes

	/**  */
	protected Map registeredMessages = new HashMap();
	private OpenClosedState state = new OpenClosedState(OpenClosedState.OPEN);

	private String encoding;

	/**
	 * Creates a new SubsystemMessageStore object.
	 */
	public SubsystemMessageStore(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * @param msg
	 */
	public synchronized void addMessage(SubsystemMessage msg) {
		if(log.isDebugEnabled()) {
			log.debug("Received "+msg.getMessageName()+
			    " subsystem message");
		}

		// Add the message
		messages.add(msg);

		// Notify the threads
		notifyAll();
	}

	/**
	 * @param msgdata
	 * @throws InvalidMessageException
	 */
	public synchronized void addMessage(byte[] msgdata)
	    throws InvalidMessageException {
		try {
			Class impl = (Class)registeredMessages.get(new Integer(msgdata[0]));

			if(impl == null) {
				throw new InvalidMessageException("The message with id "+
				    String.valueOf(msgdata[0])+" is not implemented");
			}

			SubsystemMessage msg = (SubsystemMessage)impl.newInstance();
			msg.fromByteArray(msgdata, encoding);
			addMessage(msg);

			return;
		}
		catch(IllegalAccessException e) {
            log.error(e.getMessage());
        }
		catch(InstantiationException e) {
            log.error(e.getMessage());
		}

		throw new InvalidMessageException("Could not instantiate message class");
	}

	/**
	 * @return
	 * @throws MessageStoreEOFException
	 */
	public synchronized SubsystemMessage nextMessage()
	    throws MessageStoreEOFException {
		try {
			return nextMessage(0);
		}
		catch(MessageNotAvailableException mnae) {
			return null;
		}
	}

	/**
	 * @param timeout
	 * @return
	 * @throws MessageStoreEOFException
	 * @throws MessageNotAvailableException
	 */
	public synchronized SubsystemMessage nextMessage(int timeout)
	    throws MessageStoreEOFException, MessageNotAvailableException {
		// If there are no messages available then wait untill there are.
		timeout = (timeout > 0) ? timeout : 0;

		while(messages.size() <= 0) {
			try {
				wait(timeout);

				if(timeout > 0) {
					break;
				}
			}
			catch(InterruptedException e) {
                log.error(e.getMessage());
			}
		}

		if(state.getValue() != OpenClosedState.OPEN) {
			throw new MessageStoreEOFException();
		}

		if(messages.size() > 0) {
			return (SubsystemMessage)messages.remove(0);
		}
		else {
			throw new MessageNotAvailableException();
		}
	}

	/**
	 * @param messageId
	 * @param implementor
	 */
	public void registerMessage(int messageId, Class implementor) {
		registeredMessages.put(new Integer(messageId), implementor);
	}

	public OpenClosedState getState() {
		return state;
	}

	public synchronized void close() {
		state.setValue(OpenClosedState.CLOSED);
		notifyAll();
	}
}
