package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum F0 extends j1 {
    F0() {
        super("MarkupDeclarationOpen", 43, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        if (c0217a.C("--")) {
            t.n.h();
            j1Var = j1.S;
        } else if (c0217a.D("DOCTYPE")) {
            j1Var = j1.Y;
        } else if (c0217a.C("[CDATA[")) {
            t.i();
            j1Var = j1.o0;
        } else {
            t.r(this);
            t.f();
            j1Var = j1.Q;
        }
        t.v(j1Var);
    }
}
