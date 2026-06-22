package com.github.catvod.spider.merge.z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0281G implements InterfaceC0277C {
    private final int a;
    private final int b;

    public C0281G(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final void b(com.github.catvod.spider.merge.y.t tVar) {
        tVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0281G)) {
            return false;
        }
        C0281G c0281g = (C0281G) obj;
        return this.a == c0281g.a && this.b == c0281g.b;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(0, 1), this.a), this.b), 3);
    }
}
