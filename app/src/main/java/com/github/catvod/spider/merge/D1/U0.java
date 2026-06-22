package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum U0 extends i1 {
    U0() {
        super("AfterDoctypePublicIdentifier", 58, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        C0980d0 c0980d0 = i1.b;
        char cF = c0973a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            i1Var = i1.i0;
        } else if (cF == '\"') {
            s.r(this);
            i1Var = i1.l0;
        } else {
            if (cF != '\'') {
                if (cF != '>') {
                    if (cF != 65535) {
                        s.r(this);
                        s.m.h = true;
                        i1Var = i1.o0;
                    } else {
                        s.q(this);
                        s.m.h = true;
                    }
                }
                s.o();
                s.v(c0980d0);
                return;
            }
            s.r(this);
            i1Var = i1.m0;
        }
        s.v(i1Var);
    }
}
