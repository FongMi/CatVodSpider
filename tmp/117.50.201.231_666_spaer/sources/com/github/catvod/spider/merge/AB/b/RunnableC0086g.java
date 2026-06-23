package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.AB.o.C0113q;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0086g implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ RunnableC0086g(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            x.i((x) this.b, (com.github.catvod.spider.merge.AB.d.d) this.c);
        } else if (i != 1) {
            C0113q.l((C0113q) this.b, (List) this.c);
        } else {
            Bili.d((Bili) this.b, (com.github.catvod.spider.merge.AB.g.b) this.c);
        }
    }
}
