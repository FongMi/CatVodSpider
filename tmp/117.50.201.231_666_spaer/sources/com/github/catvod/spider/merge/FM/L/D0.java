package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum D0 extends j1 {
    D0() {
        super("SelfClosingStartTag", 41, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        C0226e0 c0226e0 = j1.a;
        char cF = c0217a.f();
        if (cF == '>') {
            t.k.m = true;
            t.p();
        } else {
            if (cF != 65535) {
                c0217a.P();
                t.r(this);
                t.v(j1.H);
                return;
            }
            t.q(this);
        }
        t.v(c0226e0);
    }
}
