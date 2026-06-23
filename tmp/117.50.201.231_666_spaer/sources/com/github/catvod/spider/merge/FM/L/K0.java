package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum K0 extends j1 {
    K0() {
        super("CommentEnd", 48, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        C0226e0 c0226e0 = j1.a;
        I0 i0 = j1.U;
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF == '!') {
                t.v(j1.X);
                return;
            }
            if (cF == '-') {
                t.n.k('-');
                return;
            }
            if (cF != '>') {
                if (cF != 65535) {
                    J j = t.n;
                    j.l("--");
                    j.k(cF);
                } else {
                    t.q(this);
                }
            }
            t.n();
            t.v(c0226e0);
            return;
        }
        t.r(this);
        J j2 = t.n;
        j2.l("--");
        j2.k((char) 65533);
        t.v(i0);
    }
}
