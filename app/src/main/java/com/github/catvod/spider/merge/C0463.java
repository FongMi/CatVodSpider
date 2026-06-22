package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ໞ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0463 implements InterfaceC0444 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final int f1126;

    public C0463(int i) {
        this.f1126 = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0463) && this.f1126 == ((C0463) obj).f1126;
    }

    public int hashCode() {
        return C0120.m406(C0120.m410(C0120.m410(C0120.m408(), m1698().ordinal()), this.f1126), 2);
    }

    public String toString() {
        return String.format(SOY.d("0A27221E39181E377953105E"), Integer.valueOf(this.f1126));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ϳ */
    public boolean mo1671() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ԩ */
    public void mo1672(AbstractC0386 abstractC0386) {
        abstractC0386.m1480(this.f1126);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public EnumC0446 m1698() {
        return EnumC0446.f1103;
    }
}
