package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ൕ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0451 implements InterfaceC0444 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final int f1113;

    public C0451(int i) {
        this.f1113 = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0451) && this.f1113 == ((C0451) obj).f1113;
    }

    public int hashCode() {
        return C0120.m406(C0120.m410(C0120.m410(C0120.m408(), m1683().ordinal()), this.f1113), 2);
    }

    public String toString() {
        return String.format(SOY.d("173D35135C521E7B"), Integer.valueOf(this.f1113));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ϳ */
    public boolean mo1671() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ԩ */
    public void mo1672(AbstractC0386 abstractC0386) {
        abstractC0386.m1476(this.f1113);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public EnumC0446 m1683() {
        return EnumC0446.f1100;
    }
}
