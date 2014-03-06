package com.pusher.api;

import com.leacox.pusher.PusherRequest;

/**
 * Interface for sending pushes to pusher.com.
 * Attention: this is NOT provided by pusher.com, nor is it canon. Please take this with a grain of salt.
 */
public interface PusherApi {
// -------------------------- OTHER METHODS --------------------------

    /**
     * Provides a representation of user authentication without data
     */
    PusherUserAuth getUserAuth(String sockedId, String channel);

    /**
     * Provides a representation of user authentication
     */
    PusherUserAuth getUserAuth(String sockedId, String channel, String data);

    /**
     * Delivers a message to the Pusher API without providing a socket_id
     */
    String triggerPush(String channel, String event, String jsonData);

    /**
     * Delivers a message to the Pusher API
     */
    String triggerPush(String channel, String event, String jsonData, String socketId);

    /**
     * Delivers a message to the Pusher API
     */
    String triggerPush(String channel, String event, String jsonData, String socketId, Integer timeout);
    /**
     * Delivers a message to the Pusher API
     */
    String triggerPush(PusherRequest pusherRequest);
}
