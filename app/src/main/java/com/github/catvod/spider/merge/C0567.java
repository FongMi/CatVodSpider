package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၷ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0567 extends AbstractC0573 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final C0245 f1256;

    public C0567(AbstractC0419 abstractC0419, C0245 c0245) {
        super(abstractC0419);
        this.f1256 = c0245 == null ? C0245.m885(0) : c0245;
    }

    public String toString() {
        return this.f1256.toString();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ϳ */
    public int mo1603() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: ԩ */
    public C0245 mo1610() {
        return this.f1256;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ԫ */
    public boolean mo1605(int i, int i2, int i3) {
        return this.f1256.m895(i);
    }
}
