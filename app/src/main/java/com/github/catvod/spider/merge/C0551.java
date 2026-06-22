package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0561;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၝ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0551 extends AbstractC0421 {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final int f1229;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final int f1230;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public final boolean f1231;

    public C0551(AbstractC0419 abstractC0419, int i, int i2, boolean z) {
        super(abstractC0419);
        this.f1229 = i;
        this.f1230 = i2;
        this.f1231 = z;
    }

    public String toString() {
        return SOY.d("0A2034122B") + this.f1229 + SOY.d("40") + this.f1230;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ϳ */
    public int mo1603() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ԩ */
    public boolean mo1604() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0573
    /* JADX INFO: renamed from: Ԫ */
    public boolean mo1605(int i, int i2, int i3) {
        return false;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public AbstractC0561.C0566 m1803() {
        return new AbstractC0561.C0566(this.f1229, this.f1230, this.f1231);
    }
}
