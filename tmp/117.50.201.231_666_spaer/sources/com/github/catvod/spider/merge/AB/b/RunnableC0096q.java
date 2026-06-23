package com.github.catvod.spider.merge.AB.b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.b.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class RunnableC0096q implements Runnable {
    public final int a;
    public final x b;

    public /* synthetic */ RunnableC0096q(x xVar, int i) {
        this.a = i;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x xVar = this.b;
        if (i != 0) {
            xVar.o();
        } else {
            x.b(xVar);
        }
    }
}
