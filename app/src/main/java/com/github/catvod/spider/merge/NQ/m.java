package com.github.catvod.spider.merge.NQ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ Market a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(Market market, int i) {
        this.a = market;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Market.a(this.a, this.b);
    }
}
