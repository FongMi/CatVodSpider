package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum S0 extends j1 {
    S0() {
        super(oZP.d("370A112E1E30310014351525103F0223003C1626132402211C091E241E"), 55, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0026e0 c0026e0 = j1.a;
        char cF = c0017a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF == '\"') {
            j1Var = j1.e0;
        } else {
            if (cF != '\'') {
                if (cF == '>') {
                    t.r(this);
                } else if (cF != 65535) {
                    t.r(this);
                    t.m.h = true;
                    j1Var = j1.n0;
                } else {
                    t.q(this);
                }
                t.m.h = true;
                t.o();
                t.v(c0026e0);
                return;
            }
            j1Var = j1.f0;
        }
        t.v(j1Var);
    }
}
