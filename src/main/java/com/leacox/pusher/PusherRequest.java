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
 */
public class PusherRequest {
// ------------------------------ FIELDS ------------------------------

    private final String eventName;
    private final String channelName;
    private final String jsonData;
    private final String socketId;
    private final Integer timeout;

// --------------------------- CONSTRUCTORS ---------------------------

    public PusherRequest(String channelName, String eventName, String jsonData) {
        this(channelName, eventName, jsonData, "");
    }

    public PusherRequest(String channelName, String eventName, String jsonData, String socketId) {
        this(channelName, eventName, jsonData, socketId, null);
    }

    public PusherRequest(String channelName, String eventName, String jsonData, String socketId, Integer timeout) {
        this.eventName = eventName;
        this.channelName = channelName;
        this.jsonData = jsonData;
        this.socketId = socketId;
        this.timeout = timeout;
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getChannelName() {
        return channelName;
    }

    public String getEventName() {
        return eventName;
    }

    public String getJsonData() {
        return jsonData;
    }

    public String getSocketId() {
        return socketId;
    }

    public Integer getTimeout() {
        return timeout;
    }
}