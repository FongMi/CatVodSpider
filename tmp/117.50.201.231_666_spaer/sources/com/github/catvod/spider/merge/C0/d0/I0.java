package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum I0 extends h1 {
    I0() {
        super("CommentEnd", 48, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        C0128c0 c0128c0 = h1.c;
        G0 g0 = h1.W;
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE == '!') {
                q.q(this);
                q.u(h1.Z);
                return;
            }
            if (cE == '-') {
                q.q(this);
                q.n.i('-');
                return;
            }
            if (cE != '>') {
                if (cE != 65535) {
                    q.q(this);
                    I i = q.n;
                    i.j("--");
                    i.i(cE);
                } else {
                    q.p(this);
                }
            }
            q.m();
            q.u(c0128c0);
            return;
        }
        q.q(this);
        I i2 = q.n;
        i2.j("--");
        i2.i((char) 65533);
        q.u(g0);
    }
}
