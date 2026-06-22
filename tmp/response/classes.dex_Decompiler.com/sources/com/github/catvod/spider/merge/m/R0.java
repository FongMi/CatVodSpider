package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum R0 extends j1 {
    R0() {
        super(oZP.d("340903241E111A0C03381C30251A152D05363E0A0E36032711"), 54, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0026e0 c0026e0 = j1.a;
        char cF = c0017a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            j1Var = j1.d0;
        } else if (cF == '\"') {
            t.r(this);
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
            t.r(this);
            j1Var = j1.f0;
        }
        t.v(j1Var);
    }
}
