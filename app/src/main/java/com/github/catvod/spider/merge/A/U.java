package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class U extends l0 {
    public final int b;
    public final int c;

    public U(AbstractC0008i abstractC0008i, int i, int i2) {
        super(abstractC0008i);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final com.github.catvod.spider.merge.C.f c() {
        com.github.catvod.spider.merge.C.f fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
        fVar.b(this.b, this.c);
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.A.l0
    public final boolean d(int i, int i2) {
        return i >= this.b && i <= this.c;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.b);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.c);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }
}
