package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum H0 extends h1 {
    H0() {
        super("CommentEndDash", 47, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        G0 g0 = h1.W;
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE == '-') {
                h1Var = h1.Y;
            } else if (cE != 65535) {
                I i = q.n;
                i.i('-');
                i.i(cE);
            } else {
                q.p(this);
                q.m();
                h1Var = h1.c;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        I i2 = q.n;
        i2.i('-');
        i2.i((char) 65533);
        q.u(g0);
    }
}
