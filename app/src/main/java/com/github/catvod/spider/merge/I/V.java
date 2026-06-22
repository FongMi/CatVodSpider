package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class V implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ Object c;

    public /* synthetic */ V(Object obj, EditText editText, int i) {
        this.a = i;
        this.c = obj;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                C0754f0.e((C0754f0) this.c, this.b);
                break;
            default:
                Q0 q0 = (Q0) this.c;
                EditText editText = this.b;
                q0.getClass();
                Init.execute(new RunnableC0755g(q0, editText.getText().toString(), 3));
                break;
        }
    }
}
