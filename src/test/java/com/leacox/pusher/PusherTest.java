package com.leacox.pusher;

import com.pusher.api.PusherApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PusherTest {
// ------------------------------ FIELDS ------------------------------

    private Logger log = LoggerFactory.getLogger(getClass());

// -------------------------- OTHER METHODS --------------------------

    @Test
    public void idioticTestApiAdherence() throws Exception {
        PusherApi pusherApi = new Pusher("fake", "fake", "fake");
        Assert.assertNotNull(pusherApi, "should adhere to interface");
    }

    @Test(expectedExceptions = {PusherRemoteException.class})
    public void testUnableToSend() throws Exception {
        PusherApi pusherApi = new Pusher("fake", "fake", "fake");
        log.warn("Next exception is expected!");
        pusherApi.triggerPush("fake", "fake", "fake");
    }
}
