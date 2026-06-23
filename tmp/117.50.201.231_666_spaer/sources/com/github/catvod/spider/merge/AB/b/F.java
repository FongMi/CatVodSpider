package com.github.catvod.spider.merge.AB.b;

import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class F implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ F(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != 0) {
            Q.l((Q) this.b, (JSONObject) this.c);
            return;
        }
        J j = (J) this.b;
        String strL = (String) this.c;
        j.getClass();
        if (strL.startsWith("http")) {
            strL = com.github.catvod.spider.merge.AB.m.c.l(strL, null);
        }
        j.M(strL);
    }
}
