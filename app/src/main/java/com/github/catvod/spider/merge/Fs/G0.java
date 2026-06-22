package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum G0 extends h1 {
    G0() {
        super("Comment", 46, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        char cS = c0631a.s();
        if (cS == 0) {
            q.q(this);
            c0631a.a();
            q.n.i((char) 65533);
        } else if (cS == '-') {
            q.a(h1.X);
        } else {
            if (cS != 65535) {
                q.n.j(c0631a.p('-', 0));
                return;
            }
            q.p(this);
            q.m();
            q.u(h1.c);
        }
    }
}
