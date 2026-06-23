package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class qc extends nw {
    public final int a;

    public qc(lq lqVar, int i) {
        super(lqVar);
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final int b() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final ii c() {
        ii iiVar = new ii(new int[0]);
        iiVar.c(this.a);
        return iiVar;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final boolean d(int i, int i2) {
        return this.a == i;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
