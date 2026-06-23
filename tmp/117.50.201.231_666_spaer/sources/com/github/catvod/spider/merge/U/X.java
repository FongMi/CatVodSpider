package com.github.catvod.spider.merge.u;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class X extends i0 {
    public final int b;
    public final int c;

    public X(AbstractC0640i abstractC0640i, int i, int i2) {
        super(abstractC0640i);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.u.i0
    public final com.github.catvod.spider.merge.w.i c() {
        return com.github.catvod.spider.merge.w.i.g(this.b, this.c);
    }

    @Override // com.github.catvod.spider.merge.u.i0
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
