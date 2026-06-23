package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum S extends h1 {
    S() {
        super("TagName", 9, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        C0128c0 c0128c0 = h1.c;
        q.i.o(c0123a.m());
        char cE = c0123a.e();
        if (cE == 0) {
            q.i.o(h1.t0);
            return;
        }
        if (cE == ' ') {
            h1Var = h1.J;
        } else {
            if (cE != '/') {
                if (cE != '<') {
                    if (cE != '>') {
                        if (cE != 65535) {
                            if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                                q.i.n(cE);
                                return;
                            }
                            h1Var = h1.J;
                        } else {
                            q.p(this);
                        }
                    }
                    q.u(c0128c0);
                    return;
                }
                c0123a.G();
                q.q(this);
                q.o();
                q.u(c0128c0);
                return;
            }
            h1Var = h1.R;
        }
        q.u(h1Var);
    }
}
