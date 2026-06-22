package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum X0 extends j1 {
    X0() {
        super(oZP.d("370A033609301B2B1822182C050A27340E391C0C362F08060C1C0324011C110A193505331C0A0532"), 59, null);
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
                t.v(c0026e0);
                return;
            }
            t.r(this);
            j1Var = j1.l0;
        }
        t.v(j1Var);
    }
}
