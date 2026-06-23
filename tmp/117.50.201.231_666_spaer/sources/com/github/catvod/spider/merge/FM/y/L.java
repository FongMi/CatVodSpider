package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class L implements InterfaceC0454C {
    private final int a;

    public L(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final void b(com.github.catvod.spider.merge.FM.x.t tVar) {
        int i = this.a;
        tVar.n.a(tVar.o);
        tVar.o = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof L) && this.a == ((L) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.i(0, 5), this.a), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.a));
    }
}
