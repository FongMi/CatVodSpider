package com.github.catvod.spider.merge.b;

import android.content.DialogInterface;
import com.github.catvod.spider.Bili;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0130p implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0130p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                x.g((x) this.b);
                break;
            default:
                Bili.f((Bili) this.b);
                break;
        }
    }
}
