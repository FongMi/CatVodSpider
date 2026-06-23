package com.github.catvod.spider.merge.AB.b;

import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class N implements Runnable {
    public final int a;
    public final Q b;
    public final JSONObject c;

    public /* synthetic */ N(Q q, JSONObject jSONObject, int i) {
        this.a = i;
        this.b = q;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != 0) {
            Q.i(this.b, this.c);
        } else {
            Q.j(this.b, this.c);
        }
    }
}
