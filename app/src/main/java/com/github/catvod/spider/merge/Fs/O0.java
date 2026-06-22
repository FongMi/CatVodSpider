package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum O0 extends h1 {
    O0() {
        super("AfterDoctypeName", 53, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        C0636c0 c0636c0 = h1.c;
        if (c0631a.t()) {
            q.p(this);
            q.m.f = true;
            q.n();
            q.u(c0636c0);
            return;
        }
        if (c0631a.z('\t', '\n', '\r', '\f', ' ')) {
            c0631a.a();
            return;
        }
        if (c0631a.y('>')) {
            q.n();
            q.a(c0636c0);
            return;
        }
        if (c0631a.x("PUBLIC")) {
            q.m.c = "PUBLIC";
            h1Var = h1.e0;
        } else {
            if (!c0631a.x("SYSTEM")) {
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
