package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum J0 extends j1 {
    J0() {
        super(ZrJ.d("3A2C26202D2B0D0625290C240A2B"), 47, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        I0 i0 = j1.U;
        char cF = c0838a.f();
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
