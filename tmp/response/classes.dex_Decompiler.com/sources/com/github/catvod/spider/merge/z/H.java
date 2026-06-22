package com.github.catvod.spider.merge.z;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class H implements InterfaceC0277C {
    private final int a;
    private final InterfaceC0277C b;

    public H(int i, InterfaceC0277C interfaceC0277C) {
        this.a = i;
        this.b = interfaceC0277C;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final void b(com.github.catvod.spider.merge.y.t tVar) {
        this.b.b(tVar);
    }

    public final InterfaceC0277C c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        return this.a == h.a && this.b.equals(h.b);
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.g(com.github.catvod.spider.merge.B.l.f(0, this.a), this.b), 2);
    }
}
