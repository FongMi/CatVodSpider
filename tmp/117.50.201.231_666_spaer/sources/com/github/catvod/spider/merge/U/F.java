package com.github.catvod.spider.merge.u;

import java.util.EmptyStackException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class F implements InterfaceC0654x {
    public static final F a = new F();

    private F() {
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final void a(com.github.catvod.spider.merge.t.q qVar) {
        if (qVar.n.d()) {
            throw new EmptyStackException();
        }
        qVar.o = qVar.n.e(r0.f() - 1);
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.h(0, 4), 1);
    }

    public final String toString() {
        return "popMode";
    }
}
