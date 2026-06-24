package com.github.catvod.utils.merge;

/** Stub for GuangYaPanApi inner class. */
public final class E implements Runnable {
    private final GuangYaPanApi client;
    private final String deviceCode;
    private final int type;
    public E(GuangYaPanApi client, String deviceCode, int type) { this.client = client; this.deviceCode = deviceCode; this.type = type; }
    @Override public void run() { }
}
