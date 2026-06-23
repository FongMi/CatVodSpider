package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class Z extends h1 {
    Z() {
        super("ScriptDataLessthanSign", 16, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        char cE = c0631a.e();
        if (cE == '!') {
            q.k("<!");
            h1Var = h1.v;
        } else if (cE != '/') {
            q.k("<");
            if (cE != 65535) {
                c0631a.G();
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
