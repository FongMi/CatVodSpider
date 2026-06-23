package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum E0 extends h1 {
    E0() {
        super("CommentStart", 44, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        C0128c0 c0128c0 = h1.c;
        G0 g0 = h1.W;
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.u(h1.V);
                return;
            }
            if (cE == '>') {
                q.q(this);
            } else if (cE != 65535) {
                c0123a.G();
            } else {
                q.p(this);
            }
            q.m();
            q.u(c0128c0);
            return;
        }
        q.q(this);
        q.n.i((char) 65533);
        q.u(g0);
    }
}
