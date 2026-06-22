package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum i1 extends j1 {
    i1() {
        super(oZP.d("300113150D323A1F122F"), 8, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0026e0 c0026e0 = j1.a;
        if (c0017a.w()) {
            t.q(this);
            t.l(oZP.d("4940"));
            t.v(c0026e0);
            return;
        }
        if (c0017a.H()) {
            t.h(false);
            j1Var = j1.j;
        } else {
            boolean zE = c0017a.E('>');
            t.r(this);
            if (zE) {
                t.a(c0026e0);
                return;
            } else {
                t.f();
                t.n.k('/');
                j1Var = j1.Q;
            }
        }
        t.v(j1Var);
    }
}
