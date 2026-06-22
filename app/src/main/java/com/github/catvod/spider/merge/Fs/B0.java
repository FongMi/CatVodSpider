package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum B0 extends h1 {
    B0() {
        super("SelfClosingStartTag", 41, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        C0636c0 c0636c0 = h1.c;
        char cE = c0631a.e();
        if (cE == '>') {
            q.i.i = true;
            q.o();
        } else {
            if (cE != 65535) {
                c0631a.G();
                q.q(this);
                q.u(h1.J);
                return;
            }
            q.p(this);
        }
        q.u(c0636c0);
    }
}
