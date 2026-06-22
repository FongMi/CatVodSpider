package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c0 extends t0 {
    public final int b;
    public final int c;

    public c0(AbstractC0825m abstractC0825m, int i, int i2) {
        super(abstractC0825m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final com.github.catvod.spider.merge.Bk.k c() {
        return com.github.catvod.spider.merge.Bk.k.g(this.b, this.c);
    }

    @Override // com.github.catvod.spider.merge.KW.t0
    public final boolean d(int i, int i2) {
        return i >= this.b && i <= this.c;
    }

    public final String toString() {
        String strD = ZrJ.d("5E");
        StringBuilder sbAppendCodePoint = new StringBuilder(strD).appendCodePoint(this.b);
        sbAppendCodePoint.append(ZrJ.d("5E6D656A"));
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.c);
        sbAppendCodePoint2.append(strD);
        return sbAppendCodePoint2.toString();
    }
}
