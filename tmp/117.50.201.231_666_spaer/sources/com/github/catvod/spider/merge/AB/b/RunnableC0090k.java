package com.github.catvod.spider.merge.AB.b;

import com.github.catvod.spider.Config;
import com.github.catvod.spider.merge.AB.o.Z;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0090k implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ RunnableC0090k(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            x.a((x) this.c, (String) this.b);
            return;
        }
        if (i == 1) {
            Q.d((Q) this.c, (String) this.b);
        } else if (i != 2) {
            ((Z) this.c).x((Map) this.b);
        } else {
            Config.a((Config) this.c, (JSONObject) this.b);
        }
    }
}
