package com.github.catvod.spider.merge.AB.b;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0089j implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ RunnableC0089j(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != 0) {
            Q.m((Q) this.b, (JSONObject) this.c);
        } else {
            x.d((x) this.b, (Map) this.c);
        }
    }
}
