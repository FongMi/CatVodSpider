package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum U extends j1 {
    U() {
        super("TagName", 9, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        C0226e0 c0226e0 = j1.a;
        t.k.q(c0217a.n());
        char cF = c0217a.f();
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
                    t.v(c0226e0);
                    return;
                }
                c0217a.P();
                t.r(this);
                t.p();
                t.v(c0226e0);
                return;
            }
            j1Var = j1.P;
        }
        t.v(j1Var);
    }
}
