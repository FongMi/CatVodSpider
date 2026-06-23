package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum V extends j1 {
    V() {
        super("RcdataLessthanSign", 10, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        if (c0217a.E('/')) {
            t.i();
            t.a(j1.l);
            return;
        }
        if (!c0217a.H() || t.b() == null || c0217a.t(t.c())) {
            t.l("<");
            j1Var = j1.c;
        } else {
            O oH = t.h(false);
            oH.v(t.b());
            t.k = oH;
            t.p();
            j1Var = j1.h;
        }
        t.v(j1Var);
    }
}
