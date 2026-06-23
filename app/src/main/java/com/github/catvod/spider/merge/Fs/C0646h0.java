package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0646h0 extends h1 {
    C0646h0() {
        super("ScriptDataEscapedDashDash", 23, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        h1 h1Var;
        C0642f0 c0642f0 = h1.x;
        if (c0631a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char cE = c0631a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.i(cE);
                return;
            }
            if (cE != '<') {
                q.i(cE);
                if (cE == '>') {
                    h1Var = h1.h;
                }
            } else {
                h1Var = h1.A;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        q.i((char) 65533);
        q.u(c0642f0);
    }
}
