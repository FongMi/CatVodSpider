package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0134f0 extends h1 {
    C0134f0() {
        super("ScriptDataEscaped", 21, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        if (c0123a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char cS = c0123a.s();
        if (cS == 0) {
            q.q(this);
            c0123a.a();
            q.i((char) 65533);
            return;
        }
        if (cS == '-') {
            q.i('-');
            h1Var = h1.y;
        } else {
            if (cS != '<') {
                q.k(c0123a.p('-', '<', 0));
                return;
            }
            h1Var = h1.A;
        }
        q.a(h1Var);
    }
}
