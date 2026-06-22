package com.github.catvod.spider.merge.z;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class m0 extends t0 {
    public final com.github.catvod.spider.merge.B.k b;

    public m0(AbstractC0294m abstractC0294m, com.github.catvod.spider.merge.B.k kVar) {
        super(abstractC0294m);
        if (kVar == null) {
            kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
            kVar.a(0);
        }
        this.b = kVar;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final com.github.catvod.spider.merge.B.k c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}
