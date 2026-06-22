package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum I0 extends i1 {
    I0() {
        super("CommentEndDash", 47, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        H0 h0 = i1.V;
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF == '-') {
                i1Var = i1.X;
            } else if (cF != 65535) {
                J j = s.n;
                j.k('-');
                j.k(cF);
            } else {
                s.q(this);
                s.n();
                i1Var = i1.b;
            }
            s.v(i1Var);
            return;
        }
        s.r(this);
        J j2 = s.n;
        j2.k('-');
        j2.k((char) 65533);
        s.v(h0);
    }
}
