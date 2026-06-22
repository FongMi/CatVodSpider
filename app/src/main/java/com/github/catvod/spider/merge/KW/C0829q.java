package com.github.catvod.spider.merge.KW;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0829q extends t0 {
    public final int b;

    public C0829q(AbstractC0825m abstractC0825m, int i) {
        super(abstractC0825m);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final com.github.catvod.spider.merge.Bk.k c() {
        int i = this.b;
        com.github.catvod.spider.merge.Bk.k kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
        kVar.a(i);
        return kVar;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
