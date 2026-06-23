package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum G0 extends h1 {
    G0() {
        super("Comment", 46, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        char cS = c0123a.s();
        if (cS == 0) {
            q.q(this);
            c0123a.a();
            q.n.i((char) 65533);
        } else if (cS == '-') {
            q.a(h1.X);
        } else {
            if (cS != 65535) {
                q.n.j(c0123a.p('-', 0));
                return;
            }
            q.p(this);
            q.m();
            q.u(h1.c);
        }
    }
}
