package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum D0 extends h1 {
    D0() {
        super("MarkupDeclarationOpen", 43, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        if (c0631a.w("--")) {
            q.n.g();
            h1Var = h1.U;
        } else if (c0631a.x("DOCTYPE")) {
            h1Var = h1.a0;
        } else {
            if (!c0631a.w("[CDATA[")) {
                q.q(this);
                q.e();
                q.a(h1.S);
                return;
            }
            q.h();
            h1Var = h1.q0;
        }
        q.u(h1Var);
    }
}
