package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum L0 extends h1 {
    L0() {
        super("Doctype", 50, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        M0 m0 = h1.b0;
        char cE = c0123a.e();
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE != '>') {
                if (cE != 65535) {
                    q.q(this);
                } else {
                    q.p(this);
                }
            }
            q.q(this);
            q.f();
            q.m.f = true;
            q.n();
            q.u(h1.c);
            return;
        }
        q.u(m0);
    }
}
