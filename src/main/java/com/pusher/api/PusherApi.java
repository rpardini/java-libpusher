package com.pusher.api;

/**
 * Interface for sending pushes to pusher.com.
 * Attention: this is NOT provided by pusher.com, nor is it canon. Please take this with a grain of salt.
 */
public interface PusherApi {
// -------------------------- OTHER METHODS --------------------------

    /**
     * Delivers a message to the Pusher API without providing a socket_id
     */
    String triggerPush(String channel, String event, String jsonData);

    /**
     * Delivers a message to the Pusher API
     */
    String triggerPush(String channel, String event, String jsonData, String socketId);
}
