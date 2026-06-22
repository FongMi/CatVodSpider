package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0784z implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0784z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                G.c((G) this.b);
                break;
            case 1:
                C0754f0.f((C0754f0) this.b);
                break;
            default:
                v0.g((v0) this.b);
                break;
        }
    }
}
