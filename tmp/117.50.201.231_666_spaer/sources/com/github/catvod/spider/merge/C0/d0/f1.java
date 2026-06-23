package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum f1 extends h1 {
    f1() {
        super("TagOpen", 7, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        h1 h1Var2;
        char cS = c0123a.s();
        if (cS == '!') {
            h1Var = h1.T;
        } else if (cS == '/') {
            h1Var = h1.k;
        } else {
            if (cS != '?') {
                if (c0123a.C()) {
                    q.g(true);
                    h1Var2 = h1.l;
                } else {
                    q.q(this);
                    q.i('<');
                    h1Var2 = h1.c;
                }
                q.u(h1Var2);
                return;
            }
            q.e();
            h1Var = h1.S;
        }
        q.a(h1Var);
    }
}
