package com.github.catvod.utils.merge;

public final class C implements Runnable {
    private final QuarkDriveApi client;
    private final String arg;
    private final int type;
    public C(QuarkDriveApi client, String arg, int type) { this.client = client; this.arg = arg; this.type = type; }
    @Override public void run() { }
}
