package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class f1 extends h1 {
    f1() {
        super("TagOpen", 7, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        h1 h1Var2;
        char cS = c0631a.s();
        if (cS == '!') {
            h1Var = h1.T;
        } else if (cS == '/') {
            h1Var = h1.k;
        } else {
            if (cS != '?') {
                if (c0631a.C()) {
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
