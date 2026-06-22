package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0763k implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0763k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                C0775q.j((C0775q) this.b);
                break;
            case 1:
                v0.f((EditText) this.b);
                break;
            case 2:
                v0.a((v0) this.b);
                break;
            default:
                ((BaseApi) this.b).onClashUiNeutral();
                break;
        }
    }
}
