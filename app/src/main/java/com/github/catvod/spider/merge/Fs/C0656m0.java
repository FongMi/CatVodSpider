package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0656m0 extends h1 {
    C0656m0() {
        super("ScriptDataDoubleEscaped", 28, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        char cS = c0631a.s();
        if (cS == 0) {
            q.q(this);
            c0631a.a();
            q.i((char) 65533);
            return;
        }
        if (cS == '-') {
            q.i(cS);
            h1Var = h1.F;
        } else {
            if (cS != '<') {
                if (cS != 65535) {
                    q.k(c0631a.p('-', '<', 0));
                    return;
                } else {
                    q.p(this);
                    q.u(h1.c);
                    return;
                }
            }
            q.i(cS);
            h1Var = h1.H;
        }
        q.a(h1Var);
    }
}
