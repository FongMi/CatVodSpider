package com.github.catvod.spider.merge.AB.b;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class B implements DialogInterface.OnCancelListener {
    public final int a;
    public final Object b;

    public /* synthetic */ B(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        if (i != 0) {
            Q.g((Q) obj);
        } else {
            J.f((J) obj);
        }
    }
}
