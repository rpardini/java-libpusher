package com.leacox.pusher;

/**
 * Original work Copyright 2010 Stephan Scheuermann
 * Modified work Copyright 2012 John Leacox
 * 
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/mit-license.php
 */

/**
 * A class for encapsulating the data needed for a pusher trigger.
 * 
 */
public class PusherRequest {

	private final String eventName;
	private final String channelName;
	private final String jsonData;
	private final String socketId;

	/**
	 * 
	 * @param eventName
	 * @param channelName
	 * @param jsonData
	 */
	public PusherRequest(String channelName, String eventName, String jsonData) {
		this.channelName = channelName;
		this.eventName = eventName;
		this.jsonData = jsonData;
		this.socketId = "";
	}

	/**
	 * 
	 * @param eventName
	 * @param channelName
	 * @param jsonData
	 * @param socketId
	 */
	public PusherRequest(String channelName, String eventName, String jsonData, String socketId) {
		this.channelName = channelName;
		this.eventName = eventName;
		this.jsonData = jsonData;
		this.socketId = socketId;
	}

	public String getEventName() {
		return eventName;
	}

	public String getChannelName() {
		return channelName;
	}

	public String getJsonData() {
		return jsonData;
	}

	public String getSocketId() {
		return socketId;
	}
}