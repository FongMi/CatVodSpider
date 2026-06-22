package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum V extends j1 {
    V() {
        super(oZP.d("270C13201834390A0432183D140124280B3B"), 10, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        if (c0017a.E('/')) {
            t.i();
            t.a(j1.l);
            return;
        }
        if (!c0017a.H() || t.b() == null || c0017a.t(t.c())) {
            t.l(oZP.d("49"));
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
