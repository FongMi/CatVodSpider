package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum X0 extends h1 {
    X0() {
        super("BeforeDoctypeSystemIdentifier", 61, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        C0128c0 c0128c0 = h1.c;
        char cE = c0123a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
            h1Var = h1.m0;
        } else {
            if (cE != '\'') {
                if (cE == '>') {
                    q.q(this);
                } else if (cE != 65535) {
                    q.q(this);
                    q.m.f = true;
                    h1Var = h1.p0;
                } else {
                    q.p(this);
                }
                q.m.f = true;
                q.n();
                q.u(c0128c0);
                return;
            }
            h1Var = h1.n0;
        }
        q.u(h1Var);
    }
}
