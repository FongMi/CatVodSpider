package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class cm extends nw {
    public final ii a;

    public cm(lq lqVar, ii iiVar) {
        super(lqVar);
        if (iiVar == null) {
            iiVar = new ii(new int[0]);
            iiVar.c(0);
        }
        this.a = iiVar;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public int b() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final ii c() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public boolean d(int i, int i2) {
        return this.a.f(i);
    }

    public String toString() {
        return this.a.toString();
    }
}
