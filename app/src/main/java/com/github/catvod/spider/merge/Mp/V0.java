package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum V0 extends j1 {
    V0() {
        super(ZrJ.d("38253F283A0116203F34382029362921212630272E233C2C1F2A2E3F"), 58, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0847e0 c0847e0 = j1.a;
        char cF = c0838a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            j1Var = j1.h0;
        } else if (cF == '\"') {
            t.r(this);
            j1Var = j1.k0;
        } else {
            if (cF != '\'') {
                if (cF != '>') {
                    if (cF != 65535) {
                        t.r(this);
                        t.m.h = true;
                        j1Var = j1.n0;
                    } else {
                        t.q(this);
                        t.m.h = true;
                    }
                }
                t.o();
                t.v(c0847e0);
                return;
            }
            t.r(this);
            j1Var = j1.l0;
        }
        t.v(j1Var);
    }
}
