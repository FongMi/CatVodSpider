package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0475q extends t0 {
    public final int b;

    public C0475q(AbstractC0471m abstractC0471m, int i) {
        super(abstractC0471m);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final com.github.catvod.spider.merge.FM.A.k c() {
        int i = this.b;
        com.github.catvod.spider.merge.FM.A.k kVar = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
        kVar.a(i);
        return kVar;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
