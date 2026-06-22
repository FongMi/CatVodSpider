package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class I implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ Object c;

    public /* synthetic */ I(Object obj, EditText editText, int i) {
        this.a = i;
        this.c = obj;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                O.g((O) this.c, this.b);
                break;
            default:
                v0.m((v0) this.c, this.b);
                break;
        }
    }
}
