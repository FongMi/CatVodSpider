package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum S extends h1 {
    S() {
        super("TagName", 9, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        C0636c0 c0636c0 = h1.c;
        q.i.o(c0631a.m());
        char cE = c0631a.e();
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
                    q.u(c0636c0);
                    return;
                }
                c0631a.G();
                q.q(this);
                q.o();
                q.u(c0636c0);
                return;
            }
            h1Var = h1.R;
        }
        q.u(h1Var);
    }
}
