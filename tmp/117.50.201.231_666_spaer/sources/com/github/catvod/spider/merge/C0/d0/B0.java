package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum B0 extends h1 {
    B0() {
        super("SelfClosingStartTag", 41, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        C0128c0 c0128c0 = h1.c;
        char cE = c0123a.e();
        if (cE == '>') {
            q.i.i = true;
            q.o();
        } else {
            if (cE != 65535) {
                c0123a.G();
                q.q(this);
                q.u(h1.J);
                return;
            }
            q.p(this);
        }
        q.u(c0128c0);
    }
}
