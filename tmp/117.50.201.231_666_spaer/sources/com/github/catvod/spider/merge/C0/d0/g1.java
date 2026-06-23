package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum g1 extends h1 {
    g1() {
        super("EndTagOpen", 8, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.h1
    final void g(Q q, C0123a c0123a) {
        C0128c0 c0128c0 = h1.c;
        if (c0123a.t()) {
            q.p(this);
            q.k("</");
            q.u(c0128c0);
        } else {
            if (c0123a.C()) {
                q.g(false);
                q.u(h1.l);
                return;
            }
            boolean zY = c0123a.y('>');
            q.q(this);
            if (zY) {
                q.a(c0128c0);
            } else {
                q.e();
                q.a(h1.S);
            }
        }
    }
}
