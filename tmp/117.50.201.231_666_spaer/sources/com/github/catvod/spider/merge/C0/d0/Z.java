package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum Z extends h1 {
    Z() {
        super("ScriptDataLessthanSign", 16, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        char cE = c0123a.e();
        if (cE == '!') {
            q.k("<!");
            h1Var = h1.v;
        } else if (cE != '/') {
            q.k("<");
            if (cE != 65535) {
                c0123a.G();
                h1Var = h1.h;
            } else {
                q.p(this);
                h1Var = h1.c;
            }
        } else {
            q.h();
            h1Var = h1.t;
        }
        q.u(h1Var);
    }
}
