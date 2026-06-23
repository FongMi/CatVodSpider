package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0138h0 extends h1 {
    C0138h0() {
        super("ScriptDataEscapedDashDash", 23, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        C0134f0 c0134f0 = h1.x;
        if (c0123a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.i(cE);
                return;
            }
            if (cE != '<') {
                q.i(cE);
                if (cE == '>') {
                    h1Var = h1.h;
                }
            } else {
                h1Var = h1.A;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        q.i((char) 65533);
        q.u(c0134f0);
    }
}
