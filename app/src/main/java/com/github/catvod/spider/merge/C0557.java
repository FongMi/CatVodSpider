package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၮ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0557 extends AbstractC0573 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final int f1242;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final int f1243;

    public C0557(AbstractC0419 abstractC0419, int i, int i2) {
        super(abstractC0419);
        this.f1242 = i;
        this.f1243 = i2;
    }

    public String toString() {
        String strD = SOY.d("5D");
        StringBuilder sbAppendCodePoint = new StringBuilder(strD).appendCodePoint(this.f1242);
        sbAppendCodePoint.append(SOY.d("5D7C7F51"));
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f1243);
        sbAppendCodePoint2.append(strD);
        return sbAppendCodePoint2.toString();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ϳ */
    public int mo1603() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: ԩ */
    public C0245 mo1610() {
        return C0245.m886(this.f1242, this.f1243);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ԫ */
    public boolean mo1605(int i, int i2, int i3) {
        return i >= this.f1242 && i <= this.f1243;
    }
}
