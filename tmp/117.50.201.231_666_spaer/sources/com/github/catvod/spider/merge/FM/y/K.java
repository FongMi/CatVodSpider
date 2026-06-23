package com.github.catvod.spider.merge.FM.y;

import java.util.EmptyStackException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class K implements InterfaceC0454C {
    public static final K a = new K();

    private K() {
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final void b(com.github.catvod.spider.merge.FM.x.t tVar) {
        if (tVar.n.d()) {
            throw new EmptyStackException();
        }
        tVar.o = tVar.n.e(r0.f() - 1);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.i(0, 4), 1);
    }

    public final String toString() {
        return "popMode";
    }
}
