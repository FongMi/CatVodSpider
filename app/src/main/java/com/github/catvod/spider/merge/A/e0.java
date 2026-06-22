package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class e0 extends l0 {
    public final com.github.catvod.spider.merge.C.f b;

    public e0(AbstractC0008i abstractC0008i, com.github.catvod.spider.merge.C.f fVar) {
        super(abstractC0008i);
        if (fVar == null) {
            fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
            fVar.a(0);
        }
        this.b = fVar;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final com.github.catvod.spider.merge.C.f c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}
