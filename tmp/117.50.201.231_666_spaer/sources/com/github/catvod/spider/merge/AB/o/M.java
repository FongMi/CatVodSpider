package com.github.catvod.spider.merge.AB.o;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class M implements DialogInterface.OnClickListener {
    public final int a;
    public final Z b;
    public final Object c;
    public final Object d;

    public /* synthetic */ M(Z z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a == 0) {
            Z.a(this.b, (Map) this.c, (String) this.d);
            return;
        }
        final Z z = this.b;
        final EditText editText = (EditText) this.c;
        final EditText editText2 = (EditText) this.d;
        z.getClass();
        Init.execute(new Runnable(z, editText, editText2) { // from class: com.github.catvod.spider.merge.AB.o.O
            public final Z a;
            public final EditText b;
            public final EditText c;

            {
                this.a = z;
                this.b = editText;
                this.c = editText2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Z.i(this.a, this.b, this.c);
            }
        });
    }
}
