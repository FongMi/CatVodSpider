package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class X0 extends j1 {
    X0() {
        super(ZrJ.d("3B263F3A2D201707242E3C3C09261B382A2910200A232C1600303F28250C1D26253921231026393E"), 59, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0847e0 c0847e0 = j1.a;
        char cF = c0838a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF == '\"') {
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
