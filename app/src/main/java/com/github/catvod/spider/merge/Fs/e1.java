package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum e1 extends h1 {
    e1() {
        super("PLAINTEXT", 6, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        char cS = c0631a.s();
        if (cS == 0) {
            q.q(this);
            c0631a.a();
            q.i((char) 65533);
        } else if (cS != 65535) {
            q.k(c0631a.o((char) 0));
        } else {
            q.j(new K());
        }
    }
}
