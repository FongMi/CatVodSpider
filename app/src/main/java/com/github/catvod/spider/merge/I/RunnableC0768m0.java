package com.github.catvod.spider.merge.I;

import org.json.JSONException;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0768m0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ v0 c;

    public /* synthetic */ RunnableC0768m0(v0 v0Var, int i) {
        this.b = i;
        this.c = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        switch (this.b) {
            case 0:
                v0.h(this.c);
                break;
            default:
                this.c.p();
                break;
        }
    }
}
