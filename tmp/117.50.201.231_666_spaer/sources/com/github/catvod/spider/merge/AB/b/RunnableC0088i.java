package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.AB.o.Z;
import java.io.PipedOutputStream;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0088i implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ RunnableC0088i(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            x.i((x) this.b, (com.github.catvod.spider.merge.AB.d.d) this.c);
            return;
        }
        if (i == 1) {
            J.g((J) this.b, (JSONObject) this.c);
            return;
        }
        if (i == 2) {
            Bili.d((Bili) this.b, (com.github.catvod.spider.merge.AB.g.b) this.c);
        } else if (i != 3) {
            ((Z) this.b).x((Map) this.c);
        } else {
            com.github.catvod.spider.merge.AB.o.C.a((com.github.catvod.spider.merge.AB.o.C) this.b, (PipedOutputStream) this.c);
        }
    }
}
