package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum A0 extends h1 {
    A0() {
        super("AfterAttributeValue_quoted", 40, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        C0128c0 c0128c0 = h1.c;
        C0159s0 c0159s0 = h1.J;
        char cE = c0123a.e();
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE == '/') {
                q.u(h1.R);
                return;
            }
            if (cE == '>') {
                q.o();
            } else if (cE != 65535) {
                c0123a.G();
                q.q(this);
            } else {
                q.p(this);
            }
            q.u(c0128c0);
            return;
        }
        q.u(c0159s0);
    }
}
