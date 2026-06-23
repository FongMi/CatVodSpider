package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum N0 extends h1 {
    N0() {
        super("DoctypeName", 52, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        StringBuilder sb;
        C0128c0 c0128c0 = h1.c;
        if (c0123a.C()) {
            q.m.b.append(c0123a.j());
            return;
        }
        char cE = c0123a.e();
        if (cE != 0) {
            if (cE != ' ') {
                if (cE != '>') {
                    if (cE == 65535) {
                        q.p(this);
                        q.m.f = true;
                    } else if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                        sb = q.m.b;
                    }
                }
                q.n();
                q.u(c0128c0);
                return;
            }
            q.u(h1.d0);
            return;
        }
        q.q(this);
        sb = q.m.b;
        cE = 65533;
        sb.append(cE);
    }
}
