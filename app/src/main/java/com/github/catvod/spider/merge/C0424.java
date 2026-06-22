package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢶ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0424 extends AbstractC0573 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final int f1055;

    public C0424(AbstractC0419 abstractC0419, int i) {
        super(abstractC0419);
        this.f1055 = i;
    }

    public String toString() {
        return String.valueOf(this.f1055);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ϳ */
    public int mo1603() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0245 mo1610() {
        return C0245.m885(this.f1055);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ԫ */
    public boolean mo1605(int i, int i2, int i3) {
        return this.f1055 == i;
    }
}
