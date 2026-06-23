package com.github.catvod.spider.merge.u;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class I implements InterfaceC0654x {
    private final int a;

    public I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final void a(com.github.catvod.spider.merge.t.q qVar) {
        qVar.m = this.a;
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof I) && this.a == ((I) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(0, 7), this.a), 2);
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.a));
    }
}
