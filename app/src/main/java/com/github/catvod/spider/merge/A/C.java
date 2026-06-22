package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C implements InterfaceC0023y {
    public final int a;
    public final int b;

    public C(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final void b(com.github.catvod.spider.merge.z.m mVar) {
        mVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return this.a == c.a && this.b == c.b;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(0, 1), this.a), this.b), 3);
    }
}
