package com.github.catvod.spider.merge.b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0100B implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0100B(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                ((C0104F) this.b).c = false;
                break;
            default:
                U.f((U) this.b);
                break;
        }
    }
}
