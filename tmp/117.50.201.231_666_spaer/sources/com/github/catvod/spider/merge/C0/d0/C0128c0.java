package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0128c0 extends h1 {
    C0128c0() {
        super("Data", 0, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        char cS = c0123a.s();
        if (cS == 0) {
            q.q(this);
            q.i(c0123a.e());
            return;
        }
        if (cS == '&') {
            h1Var = h1.d;
        } else {
            if (cS != '<') {
                if (cS != 65535) {
                    q.k(c0123a.g());
                    return;
                } else {
                    q.j(new K());
                    return;
                }
            }
            h1Var = h1.j;
        }
        q.a(h1Var);
    }
}
