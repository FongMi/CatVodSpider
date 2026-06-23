package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class U extends j1 {
    U() {
        super(ZrJ.d("2D222C0329281C"), 9, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0847e0 c0847e0 = j1.a;
        t.k.q(c0838a.n());
        char cF = c0838a.f();
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
                    t.v(c0847e0);
                    return;
                }
                c0838a.P();
                t.r(this);
                t.p();
                t.v(c0847e0);
                return;
            }
            j1Var = j1.P;
        }
        t.v(j1Var);
    }
}
