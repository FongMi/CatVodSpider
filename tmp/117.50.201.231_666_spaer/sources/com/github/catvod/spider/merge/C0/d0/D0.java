package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum D0 extends h1 {
    D0() {
        super("MarkupDeclarationOpen", 43, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        if (c0123a.w("--")) {
            q.n.g();
            h1Var = h1.U;
        } else if (c0123a.x("DOCTYPE")) {
            h1Var = h1.a0;
        } else {
            if (!c0123a.w("[CDATA[")) {
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
