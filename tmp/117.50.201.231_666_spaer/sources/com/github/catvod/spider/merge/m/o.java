package com.github.catvod.spider.merge.m;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class o implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0588G b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(C0588G c0588g, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = c0588g;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                C0588G.p(this.b, (Map) this.c, (String) this.d);
                break;
            default:
                final C0588G c0588g = this.b;
                final EditText editText = (EditText) this.c;
                final EditText editText2 = (EditText) this.d;
                c0588g.getClass();
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.m.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0588G.c(c0588g, editText, editText2);
                    }
                });
                break;
        }
    }
}
