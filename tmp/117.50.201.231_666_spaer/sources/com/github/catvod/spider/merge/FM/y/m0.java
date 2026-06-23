package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class m0 extends t0 {
    public final com.github.catvod.spider.merge.FM.A.k b;

    public m0(AbstractC0471m abstractC0471m, com.github.catvod.spider.merge.FM.A.k kVar) {
        super(abstractC0471m);
        if (kVar == null) {
            kVar = new com.github.catvod.spider.merge.FM.A.k(new int[0]);
            kVar.a(0);
        }
        this.b = kVar;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final com.github.catvod.spider.merge.FM.A.k c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}
