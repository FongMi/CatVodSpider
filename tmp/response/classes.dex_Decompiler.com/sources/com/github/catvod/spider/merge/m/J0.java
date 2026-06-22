package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum J0 extends j1 {
    J0() {
        super(oZP.d("36001A2C093B012A192528340607"), 47, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        I0 i0 = j1.U;
        char cF = c0017a.f();
        if (cF != 0) {
            if (cF == '-') {
                j1Var = j1.W;
            } else if (cF != 65535) {
                J j = t.n;
                j.k('-');
                j.k(cF);
            } else {
                t.q(this);
                t.n();
                j1Var = j1.a;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        J j2 = t.n;
        j2.k('-');
        j2.k((char) 65533);
        t.v(i0);
    }
}
