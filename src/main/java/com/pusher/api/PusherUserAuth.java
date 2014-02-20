package com.pusher.api;

/**
 * Created by renatod on 13/02/14.
 */
public class PusherUserAuth {
// ------------------------------ FIELDS ------------------------------

    private String auth;
    private String channel_data;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getChannel_data() {
        return channel_data;
    }

    public void setChannel_data(String channel_data) {
        this.channel_data = channel_data;
    }
}