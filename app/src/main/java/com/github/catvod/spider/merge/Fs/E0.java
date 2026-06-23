package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class E0 extends h1 {
    E0() {
        super("CommentStart", 44, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        C0636c0 c0636c0 = h1.c;
        G0 g0 = h1.W;
        char cE = c0631a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.u(h1.V);
                return;
            }
            if (cE == '>') {
                q.q(this);
            } else if (cE != 65535) {
                c0631a.G();
            } else {
                q.p(this);
            }
            q.m();
            q.u(c0636c0);
            return;
        }
        q.q(this);
        q.n.i((char) 65533);
        q.u(g0);
    }
}
