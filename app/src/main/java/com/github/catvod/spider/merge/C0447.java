package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ഺ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0447 implements InterfaceC0444 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final int f1107;

    public C0447(int i) {
        this.f1107 = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0447) && this.f1107 == ((C0447) obj).f1107;
    }

    public int hashCode() {
        return C0120.m406(C0120.m410(C0120.m410(C0120.m408(), m1677().ordinal()), this.f1107), 2);
    }

    public String toString() {
        return String.format(SOY.d("193A30181A12167A74125D"), Integer.valueOf(this.f1107));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ϳ */
    public boolean mo1671() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ԩ */
    public void mo1672(AbstractC0386 abstractC0386) {
        abstractC0386.m1482(this.f1107);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public EnumC0446 m1677() {
        return EnumC0446.f1098;
    }
}
