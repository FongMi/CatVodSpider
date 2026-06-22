package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum H0 extends i1 {
    H0() {
        super("Comment", 46, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        char cU = c0973a.u();
        if (cU == 0) {
            s.r(this);
            c0973a.a();
            s.n.k((char) 65533);
        } else if (cU == '-') {
            s.a(i1.W);
        } else {
            if (cU != 65535) {
                s.n.l(c0973a.q('-', 0));
                return;
            }
            s.q(this);
            s.n();
            s.v(i1.b);
        }
    }
}
