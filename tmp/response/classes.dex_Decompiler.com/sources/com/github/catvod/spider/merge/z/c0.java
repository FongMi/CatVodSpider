package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c0 extends t0 {
    public final int b;
    public final int c;

    public c0(AbstractC0294m abstractC0294m, int i, int i2) {
        super(abstractC0294m);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final com.github.catvod.spider.merge.B.k c() {
        return com.github.catvod.spider.merge.B.k.g(this.b, this.c);
    }

    @Override // com.github.catvod.spider.merge.z.t0
    public final boolean d(int i, int i2) {
        return i >= this.b && i <= this.c;
    }

    public final String toString() {
        String strD = oZP.d("52");
        StringBuilder sbAppendCodePoint = new StringBuilder(strD).appendCodePoint(this.b);
        sbAppendCodePoint.append(oZP.d("52415966"));
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.c);
        sbAppendCodePoint2.append(strD);
        return sbAppendCodePoint2.toString();
    }
}
