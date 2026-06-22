package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum U extends j1 {
    U() {
        super(oZP.d("210E100F0D3810"), 9, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0026e0 c0026e0 = j1.a;
        t.k.q(c0017a.n());
        char cF = c0017a.f();
        if (cF == 0) {
            t.k.q(j1.r0);
            return;
        }
        if (cF == ' ') {
            j1Var = j1.H;
        } else {
            if (cF != '/') {
                if (cF != '<') {
                    if (cF != '>') {
                        if (cF != 65535) {
                            if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                                t.k.p(cF);
                                return;
                            }
                            j1Var = j1.H;
                        } else {
                            t.q(this);
                        }
                    }
                    t.v(c0026e0);
                    return;
                }
                c0017a.P();
                t.r(this);
                t.p();
                t.v(c0026e0);
                return;
            }
            j1Var = j1.P;
        }
        t.v(j1Var);
    }
}
