package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum g1 extends h1 {
    g1() {
        super("EndTagOpen", 8, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        C0636c0 c0636c0 = h1.c;
        if (c0631a.t()) {
            q.p(this);
            q.k("</");
            q.u(c0636c0);
        } else {
            if (c0631a.C()) {
                q.g(false);
                q.u(h1.l);
                return;
            }
            boolean zY = c0631a.y('>');
            q.q(this);
            if (zY) {
                q.a(c0636c0);
            } else {
                q.e();
                q.a(h1.S);
            }
        }
    }
}
