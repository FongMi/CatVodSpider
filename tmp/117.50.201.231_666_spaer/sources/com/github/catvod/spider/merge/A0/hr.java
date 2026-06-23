package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class hr extends nw {
    public final int a;
    public final int f;

    public hr(lq lqVar, int i, int i2) {
        super(lqVar);
        this.a = i;
        this.f = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final int b() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final ii c() {
        ii iiVar = new ii(new int[0]);
        iiVar.d(this.a, this.f);
        return iiVar;
    }

    @Override // com.github.catvod.spider.merge.A0.nw
    public final boolean d(int i, int i2) {
        return i >= this.a && i <= this.f;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.a);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }
}
