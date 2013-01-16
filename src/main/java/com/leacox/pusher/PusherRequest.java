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

// --------------------------- CONSTRUCTORS ---------------------------

    public PusherRequest(String channelName, String eventName, String jsonData) {
        this.channelName = channelName;
        this.eventName = eventName;
        this.jsonData = jsonData;
        this.socketId = "";
    }

    public PusherRequest(String channelName, String eventName, String jsonData, String socketId) {
        this.channelName = channelName;
        this.eventName = eventName;
        this.jsonData = jsonData;
        this.socketId = socketId;
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
}