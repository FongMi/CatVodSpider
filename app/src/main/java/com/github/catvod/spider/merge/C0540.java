package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ྈ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0540 implements InterfaceC0444 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final int f1211;

    public C0540(int i) {
        this.f1211 = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0540) && this.f1211 == ((C0540) obj).f1211;
    }

    public int hashCode() {
        return C0120.m406(C0120.m410(C0120.m410(C0120.m408(), m1738().ordinal()), this.f1211), 2);
    }

    public String toString() {
        return String.format(SOY.d("0E2B21135C521E7B"), Integer.valueOf(this.f1211));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ϳ */
    public boolean mo1671() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ԩ */
    public void mo1672(AbstractC0386 abstractC0386) {
        abstractC0386.m1483(this.f1211);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public EnumC0446 m1738() {
        return EnumC0446.f1105;
    }
}
