package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ൔ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0450 implements InterfaceC0444 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final int f1111;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final InterfaceC0444 f1112;

    public C0450(int i, InterfaceC0444 interfaceC0444) {
        this.f1111 = i;
        this.f1112 = interfaceC0444;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0450)) {
            return false;
        }
        C0450 c0450 = (C0450) obj;
        return this.f1111 == c0450.f1111 && this.f1112.equals(c0450.f1112);
    }

    public int hashCode() {
        return C0120.m406(C0120.m411(C0120.m410(C0120.m408(), this.f1111), this.f1112), 2);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ϳ */
    public boolean mo1671() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0444
    /* JADX INFO: renamed from: Ԩ */
    public void mo1672(AbstractC0386 abstractC0386) {
        this.f1112.mo1672(abstractC0386);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public InterfaceC0444 m1681() {
        return this.f1112;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public int m1682() {
        return this.f1111;
    }
}
