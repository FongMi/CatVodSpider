package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum V extends j1 {
    V() {
        super(ZrJ.d("2B202F2C3C243526383E3C2D182D18242F2B"), 10, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        if (c0838a.E('/')) {
            t.i();
            t.a(j1.l);
            return;
        }
        if (!c0838a.H() || t.b() == null || c0838a.t(t.c())) {
            t.l(ZrJ.d("45"));
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
