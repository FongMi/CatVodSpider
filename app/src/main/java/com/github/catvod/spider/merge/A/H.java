package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class H implements InterfaceC0023y {
    public final int a;

    public H(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0023y
    public final void b(com.github.catvod.spider.merge.z.m mVar) {
        mVar.m = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H) {
            return this.a == ((H) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(0, 7), this.a), 2);
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.a));
    }
}
