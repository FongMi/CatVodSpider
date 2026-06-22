package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class G implements InterfaceC0023y {
    public final int a;

    public G(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final void b(com.github.catvod.spider.merge.z.m mVar) {
        mVar.n.a(mVar.o);
        mVar.o = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            return this.a == ((G) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(0, 5), this.a), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.a));
    }
}
