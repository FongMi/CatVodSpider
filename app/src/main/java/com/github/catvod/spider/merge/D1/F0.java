package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class F0 extends i1 {
    F0() {
        super("CommentStart", 44, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        C0980d0 c0980d0 = i1.b;
        H0 h0 = i1.V;
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF == '-') {
                s.v(i1.U);
                return;
            }
            if (cF == '>') {
                s.r(this);
            } else if (cF != 65535) {
                c0973a.P();
            } else {
                s.q(this);
            }
            s.n();
            s.v(c0980d0);
            return;
        }
        s.r(this);
        s.n.k((char) 65533);
        s.v(h0);
    }
}
