package com.github.catvod.spider.merge.KW;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class m0 extends t0 {
    public final com.github.catvod.spider.merge.Bk.k b;

    public m0(AbstractC0825m abstractC0825m, com.github.catvod.spider.merge.Bk.k kVar) {
        super(abstractC0825m);
        if (kVar == null) {
            kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
            kVar.a(0);
        }
        this.b = kVar;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final com.github.catvod.spider.merge.Bk.k c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}
