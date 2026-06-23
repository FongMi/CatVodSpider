package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum J0 extends j1 {
    J0() {
        super("CommentEndDash", 47, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        I0 i0 = j1.U;
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF == '-') {
                j1Var = j1.W;
            } else if (cF != 65535) {
                J j = t.n;
                j.k('-');
                j.k(cF);
            } else {
                t.q(this);
                t.n();
                j1Var = j1.a;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        J j2 = t.n;
        j2.k('-');
        j2.k((char) 65533);
        t.v(i0);
    }
}
