package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum U extends i1 {
    U() {
        super("RcdataLessthanSign", 10, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        if (c0973a.E('/')) {
            s.i();
            s.a(i1.m);
            return;
        }
        if (!c0973a.H() || s.b() == null || c0973a.t(s.c())) {
            s.l("<");
            i1Var = i1.d;
        } else {
            O oH = s.h(false);
            oH.v(s.b());
            s.k = oH;
            s.p();
            i1Var = i1.i;
        }
        s.v(i1Var);
    }
}
