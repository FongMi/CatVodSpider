package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class H implements InterfaceC0454C {
    private final int a;
    private final InterfaceC0454C b;

    public H(int i, InterfaceC0454C interfaceC0454C) {
        this.a = i;
        this.b = interfaceC0454C;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final void b(com.github.catvod.spider.merge.FM.x.t tVar) {
        this.b.b(tVar);
    }

    public final InterfaceC0454C c() {
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
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.j(com.github.catvod.spider.merge.FM.A.l.i(0, this.a), this.b), 2);
    }
}
