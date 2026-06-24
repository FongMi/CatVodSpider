package com.github.catvod.utils.merge;

import android.content.DialogInterface;

/** Dialog dismiss listener stub for QuarkDriveApi. */
public final class A implements DialogInterface.OnDismissListener {
    private final QuarkDriveApi client;
    private final int type;
    public A(QuarkDriveApi client, int type) { this.client = client; this.type = type; }
    @Override public void onDismiss(DialogInterface dialog) { }
}
