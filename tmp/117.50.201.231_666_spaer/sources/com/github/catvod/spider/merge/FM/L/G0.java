package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum G0 extends j1 {
    G0() {
        super("CommentStart", 44, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        C0226e0 c0226e0 = j1.a;
        I0 i0 = j1.U;
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.v(j1.T);
                return;
            }
            if (cF == '>') {
                t.r(this);
            } else if (cF != 65535) {
                c0217a.P();
            } else {
                t.q(this);
            }
            t.n();
            t.v(c0226e0);
            return;
        }
        t.r(this);
        t.n.k((char) 65533);
        t.v(i0);
    }
}
