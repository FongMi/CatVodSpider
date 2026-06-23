package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class I implements InterfaceC0454C {
    private final int a;

    public I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final void b(com.github.catvod.spider.merge.FM.x.t tVar) {
        tVar.o = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof I) && this.a == ((I) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.i(0, 2), this.a), 2);
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.a));
    }
}
