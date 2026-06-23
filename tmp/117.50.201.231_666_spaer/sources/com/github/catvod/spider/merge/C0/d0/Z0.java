package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum Z0 extends h1 {
    Z0() {
        super("DoctypeSystemIdentifier_singleQuoted", 63, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        StringBuilder sb;
        C0128c0 c0128c0 = h1.c;
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE == '\'') {
                q.u(h1.o0);
                return;
            }
            if (cE == '>') {
                q.q(this);
            } else if (cE != 65535) {
                sb = q.m.e;
            } else {
                q.p(this);
            }
            q.m.f = true;
            q.n();
            q.u(c0128c0);
            return;
        }
        q.q(this);
        sb = q.m.e;
        cE = 65533;
        sb.append(cE);
    }
}
