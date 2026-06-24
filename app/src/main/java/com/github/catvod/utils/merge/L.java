package com.github.catvod.utils.merge;

/** Generic Runnable stub used by multiple API classes. */
public final class L implements Runnable {
    private final Object client;
    private final int type;
    public L(Object client, int type) { this.client = client; this.type = type; }
    @Override public void run() { }
}
