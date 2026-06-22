package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0660o0 extends h1 {
    C0660o0() {
        super("ScriptDataDoubleEscapedDash", 29, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        C0656m0 c0656m0 = h1.E;
        char cE = c0631a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.i(cE);
                h1Var = h1.G;
            } else if (cE == '<') {
                q.i(cE);
                h1Var = h1.H;
            } else if (cE == 65535) {
                q.p(this);
                h1Var = h1.c;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        cE = 65533;
        q.i(cE);
        q.u(c0656m0);
    }
}
