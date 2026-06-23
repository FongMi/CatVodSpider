package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class L0 extends h1 {
    L0() {
        super("Doctype", 50, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        M0 m0 = h1.b0;
        char cE = c0631a.e();
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE != '>') {
                if (cE != 65535) {
                    q.q(this);
                } else {
                    q.p(this);
                }
            }
            q.q(this);
            q.f();
            q.m.f = true;
            q.n();
            q.u(h1.c);
            return;
        }
        q.u(m0);
    }
}
