package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0154p0 extends h1 {
    C0154p0() {
        super("ScriptDataDoubleEscapedDashDash", 30, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        C0148m0 c0148m0 = h1.E;
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.i(cE);
                return;
            }
            if (cE == '<') {
                q.i(cE);
                h1Var = h1.H;
            } else if (cE == '>') {
                q.i(cE);
                h1Var = h1.h;
            } else if (cE == 65535) {
                q.p(this);
                h1Var = h1.c;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        cE = 65533;
        q.i(cE);
        q.u(c0148m0);
    }
}
