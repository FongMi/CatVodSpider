package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class J extends e0 {
    public J(AbstractC0008i abstractC0008i, com.github.catvod.spider.merge.C.f fVar) {
        super(abstractC0008i, fVar);
    }

    @Override // com.github.catvod.spider.merge.A.e0, com.github.catvod.spider.merge.A.l0
    public final int a() {
        return 8;
    }

    @Override // com.github.catvod.spider.merge.A.e0, com.github.catvod.spider.merge.A.l0
    public final boolean d(int i, int i2) {
        return i >= 0 && i <= i2 && !this.b.d(i);
    }

    @Override // com.github.catvod.spider.merge.A.e0
    public final String toString() {
        return "~" + this.b.toString();
    }
}
