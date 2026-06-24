package com.github.catvod.utils.merge;

public final class X implements Runnable {
    private final QuarkDriveApi client;
    private final int type;
    public X(QuarkDriveApi client, int type) { this.client = client; this.type = type; }
    @Override public void run() { }
}
