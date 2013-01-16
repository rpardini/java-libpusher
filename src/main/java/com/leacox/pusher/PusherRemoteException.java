package com.leacox.pusher;

/**
 * Simple exception class for errors thrown by the REST api (NOT for insfrastructure errors).
 */
public class PusherRemoteException extends RuntimeException {
// --------------------------- CONSTRUCTORS ---------------------------

    public PusherRemoteException(final String message) {
        super(message);
    }
}
