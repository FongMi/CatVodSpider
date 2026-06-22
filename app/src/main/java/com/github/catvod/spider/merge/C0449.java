package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ൎ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0449 implements InterfaceC0444 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final int f1109;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final int f1110;

    public C0449(int i, int i2) {
        this.f1109 = i;
        this.f1110 = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0449)) {
            return false;
        }
        C0449 c0449 = (C0449) obj;
        return this.f1109 == c0449.f1109 && this.f1110 == c0449.f1110;
    }

    public int hashCode() {
        return C0120.m406(C0120.m410(C0120.m410(C0120.m410(C0120.m408(), m1680().ordinal()), this.f1109), this.f1110), 3);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ϳ */
    public boolean mo1671() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ԩ */
    public void mo1672(AbstractC0386 abstractC0386) {
        abstractC0386.m1528(null, this.f1109, this.f1110);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public EnumC0446 m1680() {
        return EnumC0446.f1099;
    }
}
