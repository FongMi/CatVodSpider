package com.github.catvod.spider.merge.u;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class G implements InterfaceC0654x {
    private final int a;

    public G(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final void a(com.github.catvod.spider.merge.t.q qVar) {
        int i = this.a;
        qVar.n.a(qVar.o);
        qVar.o = i;
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof G) && this.a == ((G) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(0, 5), this.a), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.a));
    }
}
