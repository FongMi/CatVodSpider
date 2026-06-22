package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum T extends i1 {
    T() {
        super("TagName", 9, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        C0980d0 c0980d0 = i1.b;
        s.k.q(c0973a.n());
        char cF = c0973a.f();
        if (cF == 0) {
            s.k.q(i1.s0);
            return;
        }
        if (cF == ' ') {
            i1Var = i1.I;
        } else {
            if (cF != '/') {
                if (cF != '<') {
                    if (cF != '>') {
                        if (cF != 65535) {
                            if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                                s.k.p(cF);
                                return;
                            }
                            i1Var = i1.I;
                        } else {
                            s.q(this);
                        }
                    }
                    s.v(c0980d0);
                    return;
                }
                c0973a.P();
                s.r(this);
                s.p();
                s.v(c0980d0);
                return;
            }
            i1Var = i1.Q;
        }
        s.v(i1Var);
    }
}
