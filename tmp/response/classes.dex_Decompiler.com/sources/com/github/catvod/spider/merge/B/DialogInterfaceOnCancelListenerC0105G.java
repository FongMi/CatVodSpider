package com.github.catvod.spider.merge.b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0105G implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0105G(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                C0110L.f((C0110L) this.b);
                break;
            default:
                U.g((U) this.b);
                break;
        }
    }
}
