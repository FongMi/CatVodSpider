package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum e1 extends h1 {
    e1() {
        super("PLAINTEXT", 6, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        char cS = c0123a.s();
        if (cS == 0) {
            q.q(this);
            c0123a.a();
            q.i((char) 65533);
        } else if (cS != 65535) {
            q.k(c0123a.o((char) 0));
        } else {
            q.j(new K());
        }
    }
}
