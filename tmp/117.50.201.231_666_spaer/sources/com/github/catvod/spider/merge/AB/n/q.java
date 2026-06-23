package com.github.catvod.spider.merge.AB.n;

import com.github.catvod.spider.Market;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final Market a;
    public final int b;

    public /* synthetic */ q(Market market, int i) {
        this.a = market;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Market.a(this.a, this.b);
    }
}
