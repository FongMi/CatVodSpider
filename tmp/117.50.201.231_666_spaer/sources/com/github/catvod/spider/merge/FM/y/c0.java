package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c0 extends t0 {
    public final int b;
    public final int c;

    public c0(AbstractC0471m abstractC0471m, int i, int i2) {
        super(abstractC0471m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
    public final com.github.catvod.spider.merge.FM.A.k c() {
        return com.github.catvod.spider.merge.FM.A.k.g(this.b, this.c);
    }

    @Override // com.github.catvod.spider.merge.FM.y.t0
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
