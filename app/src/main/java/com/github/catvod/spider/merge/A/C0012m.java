package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0012m extends l0 {
    public final int b;

    public C0012m(AbstractC0008i abstractC0008i, int i) {
        super(abstractC0008i);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final com.github.catvod.spider.merge.C.f c() {
        com.github.catvod.spider.merge.C.f fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
        fVar.a(this.b);
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
