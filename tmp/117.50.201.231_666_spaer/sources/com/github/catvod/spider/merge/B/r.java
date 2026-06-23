package com.github.catvod.spider.merge.b;

import android.widget.EditText;
import com.github.catvod.spider.merge.m.C0588G;
import com.github.catvod.spider.merge.m.C0602k;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((w) this.c).d((String) this.b, true);
                break;
            case 1:
                C0536B c0536b = (C0536B) this.c;
                String str = (String) this.b;
                int i = C0536B.e;
                c0536b.b(str, true);
                break;
            case 2:
                C0602k.c((File) this.b, ((com.github.catvod.spider.merge.f.g) this.c).toString());
                break;
            case 3:
                C0588G.k((C0588G) this.c, (Map) this.b);
                break;
            default:
                C0588G.f((C0588G) this.c, (EditText) this.b);
                break;
        }
    }
}
