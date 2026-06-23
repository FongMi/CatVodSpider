package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum O0 extends h1 {
    O0() {
        super("AfterDoctypeName", 53, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        C0128c0 c0128c0 = h1.c;
        if (c0123a.t()) {
            q.p(this);
            q.m.f = true;
            q.n();
            q.u(c0128c0);
            return;
        }
        if (c0123a.z('\t', '\n', '\r', '\f', ' ')) {
            c0123a.a();
            return;
        }
        if (c0123a.y('>')) {
            q.n();
            q.a(c0128c0);
            return;
        }
        if (c0123a.x("PUBLIC")) {
            q.m.c = "PUBLIC";
            h1Var = h1.e0;
        } else {
            if (!c0123a.x("SYSTEM")) {
                q.q(this);
                q.m.f = true;
                q.a(h1.p0);
                return;
            }
            q.m.c = "SYSTEM";
            h1Var = h1.k0;
        }
        q.u(h1Var);
    }
}
