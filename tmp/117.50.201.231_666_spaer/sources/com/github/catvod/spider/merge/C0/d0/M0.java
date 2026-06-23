package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum M0 extends h1 {
    M0() {
        super("BeforeDoctypeName", 51, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        N0 n0 = h1.c0;
        if (c0123a.C()) {
            q.f();
            q.u(n0);
            return;
        }
        char cE = c0123a.e();
        if (cE == 0) {
            q.q(this);
            q.f();
            q.m.b.append((char) 65533);
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE == 65535) {
                q.p(this);
                q.f();
                q.m.f = true;
                q.n();
                q.u(h1.c);
                return;
            }
            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                return;
            }
            q.f();
            q.m.b.append(cE);
        }
        q.u(n0);
    }
}
