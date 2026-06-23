package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum a1 extends h1 {
    a1() {
        super("AfterDoctypeSystemIdentifier", 64, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        C0128c0 c0128c0 = h1.c;
        char cE = c0123a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE != '>') {
            if (cE != 65535) {
                q.q(this);
                q.u(h1.p0);
                return;
            } else {
                q.p(this);
                q.m.f = true;
            }
        }
        q.n();
        q.u(c0128c0);
    }
}
