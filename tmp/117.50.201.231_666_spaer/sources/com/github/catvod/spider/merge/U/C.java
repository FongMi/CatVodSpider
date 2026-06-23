package com.github.catvod.spider.merge.u;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C implements InterfaceC0654x {
    private final int a;
    private final InterfaceC0654x b;

    public C(int i, InterfaceC0654x interfaceC0654x) {
        this.a = i;
        this.b = interfaceC0654x;
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final void a(com.github.catvod.spider.merge.t.q qVar) {
        this.b.a(qVar);
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final boolean b() {
        return true;
    }

    public final InterfaceC0654x c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return this.a == c.a && this.b.equals(c.b);
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.h(0, this.a), this.b), 2);
    }
}
