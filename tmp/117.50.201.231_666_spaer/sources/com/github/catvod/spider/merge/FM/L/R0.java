package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum R0 extends j1 {
    R0() {
        super("AfterDoctypePublicKeyword", 54, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        C0226e0 c0226e0 = j1.a;
        char cF = c0217a.f();
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
                t.v(c0226e0);
                return;
            }
            t.r(this);
            j1Var = j1.f0;
        }
        t.v(j1Var);
    }
}
