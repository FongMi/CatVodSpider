package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum V0 extends h1 {
    V0() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        C0636c0 c0636c0 = h1.c;
        char cE = c0631a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
            q.q(this);
            h1Var = h1.m0;
        } else {
            if (cE != '\'') {
                if (cE != '>') {
                    if (cE != 65535) {
                        q.q(this);
                        q.m.f = true;
                        h1Var = h1.p0;
                    } else {
                        q.p(this);
                        q.m.f = true;
                    }
                }
                q.n();
                q.u(c0636c0);
                return;
            }
            q.q(this);
            h1Var = h1.n0;
        }
        q.u(h1Var);
    }
}
