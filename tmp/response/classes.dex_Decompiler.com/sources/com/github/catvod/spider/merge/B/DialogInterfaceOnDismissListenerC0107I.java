package com.github.catvod.spider.merge.b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0107I implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0107I(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                C0110L.b((C0110L) this.b);
                break;
            default:
                U.a((U) this.b);
                break;
        }
    }
}
