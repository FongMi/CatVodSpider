package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum J0 extends i1 {
    J0() {
        super("CommentEnd", 48, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        C0980d0 c0980d0 = i1.b;
        H0 h0 = i1.V;
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF == '!') {
                s.v(i1.Y);
                return;
            }
            if (cF == '-') {
                s.n.k('-');
                return;
            }
            if (cF != '>') {
                if (cF != 65535) {
                    J j = s.n;
                    j.l("--");
                    j.k(cF);
                } else {
                    s.q(this);
                }
            }
            s.n();
            s.v(c0980d0);
            return;
        }
        s.r(this);
        J j2 = s.n;
        j2.l("--");
        j2.k((char) 65533);
        s.v(h0);
    }
}
