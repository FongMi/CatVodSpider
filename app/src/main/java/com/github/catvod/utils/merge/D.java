package com.github.catvod.utils.merge;

/** Generic Runnable stub used by multiple API classes. */
public final class D implements Runnable {
    private final Object client;
    private final Object arg;
    private final int type;
    public D(Object client, Object arg, int type) { this.client = client; this.arg = arg; this.type = type; }
    @Override public void run() { }
}
