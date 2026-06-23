package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class K0 extends h1 {
    K0() {
        super("CommentEndBang", 49, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        C0636c0 c0636c0 = h1.c;
        G0 g0 = h1.W;
        char cE = c0631a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.n.j("--!");
                q.u(h1.X);
                return;
            }
            if (cE != '>') {
                if (cE != 65535) {
                    I i = q.n;
                    i.j("--!");
                    i.i(cE);
                } else {
                    q.p(this);
                }
            }
            q.m();
            q.u(c0636c0);
            return;
        }
        q.q(this);
        I i2 = q.n;
        i2.j("--!");
        i2.i((char) 65533);
        q.u(g0);
    }
}
