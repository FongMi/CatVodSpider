package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0171y0 extends h1 {
    C0171y0() {
        super("Rcdata", 2, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        h1 h1Var;
        char cS = c0123a.s();
        if (cS == 0) {
            q.q(this);
            c0123a.a();
            q.i((char) 65533);
            return;
        }
        if (cS == '&') {
            h1Var = h1.f;
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
            h1Var = h1.m;
        }
        q.a(h1Var);
    }
}
