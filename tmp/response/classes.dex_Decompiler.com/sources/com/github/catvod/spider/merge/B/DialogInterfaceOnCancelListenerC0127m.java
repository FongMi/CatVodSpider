package com.github.catvod.spider.merge.b;

import android.content.DialogInterface;
import com.github.catvod.spider.Bili;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0127m implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0127m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                x.c((x) this.b);
                break;
            default:
                Bili.c((Bili) this.b);
                break;
        }
    }
}
