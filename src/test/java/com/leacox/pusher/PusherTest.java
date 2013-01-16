package com.leacox.pusher;

import com.pusher.api.PusherApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PusherTest {
// -------------------------- OTHER METHODS --------------------------

    @Test
    public void idioticTestApiAdherence() throws Exception {
        PusherApi pusherApi = new Pusher("fake", "fake", "fake");
        Assert.assertNotNull(pusherApi, "should adhere to interface");
    }

    @Test(expectedExceptions = {PusherRemoteException.class})
    public void testUnableToSend() throws Exception {
        PusherApi pusherApi = new Pusher("fake", "fake", "fake");
        pusherApi.triggerPush("fake", "fake", "fake");
    }
}
