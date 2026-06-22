package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0767m implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ Object c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0767m(Object obj, EditText editText, int i) {
        this.a = i;
        this.c = obj;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                C0775q.k((C0775q) this.c, this.b);
                break;
            default:
                Q0 q0 = (Q0) this.c;
                EditText editText = this.b;
                q0.getClass();
                Init.execute(new E(q0, editText.getText().toString(), 2));
                break;
        }
    }
}
