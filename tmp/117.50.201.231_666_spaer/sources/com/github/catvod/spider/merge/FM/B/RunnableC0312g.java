package com.github.catvod.spider.merge.FM.b;

import android.widget.EditText;
import com.github.catvod.spider.merge.FM.d.C0336d;
import com.github.catvod.spider.merge.FM.o.C0392h;
import java.io.PipedOutputStream;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.b.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0312g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0312g(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u.i((u) this.b, (C0336d) this.c);
                break;
            case 1:
                C0392h.a((C0392h) this.b, (PipedOutputStream) this.c);
                break;
            case 2:
                ((com.github.catvod.spider.merge.FM.o.y) this.b).u((Map) this.c);
                break;
            default:
                com.github.catvod.spider.merge.FM.o.y.k((com.github.catvod.spider.merge.FM.o.y) this.b, (EditText) this.c);
                break;
        }
    }
}
