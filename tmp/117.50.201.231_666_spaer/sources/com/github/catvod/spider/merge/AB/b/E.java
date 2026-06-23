package com.github.catvod.spider.merge.AB.b;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class E implements DialogInterface.OnDismissListener {
    public final int a;
    public final Object b;

    public /* synthetic */ E(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        if (i != 0) {
            Q.a((Q) obj);
        } else {
            J.b((J) obj);
        }
    }
}
