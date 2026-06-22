package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class D implements InterfaceC0023y {
    public final int a;
    public final InterfaceC0023y b;

    public D(int i, InterfaceC0023y interfaceC0023y) {
        this.a = i;
        this.b = interfaceC0023y;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final void b(com.github.catvod.spider.merge.z.m mVar) {
        this.b.b(mVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return this.a == d.a && this.b.equals(d.b);
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.b(0, this.a), this.b), 2);
    }
}
