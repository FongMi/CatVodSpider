package com.github.catvod.spider.merge.m;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class H0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C0588G a;

    public H0(C0588G c0588g) {
        this.a = c0588g;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C0588G.i(this.a);
    }
}
