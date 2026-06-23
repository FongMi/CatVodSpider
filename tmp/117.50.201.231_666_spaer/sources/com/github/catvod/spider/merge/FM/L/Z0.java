package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum Z0 extends j1 {
    Z0() {
        super("BeforeDoctypeSystemIdentifier", 61, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        C0226e0 c0226e0 = j1.a;
        char cF = c0217a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF == '\"') {
            j1Var = j1.k0;
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
            j1Var = j1.l0;
        }
        t.v(j1Var);
    }
}
