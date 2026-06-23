package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0 extends j1 {
    C0() {
        super("AfterAttributeValue_quoted", 40, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        C0226e0 c0226e0 = j1.a;
        C0257u0 c0257u0 = j1.H;
        char cF = c0217a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF == '/') {
                t.v(j1.P);
                return;
            }
            if (cF == '>') {
                t.p();
            } else if (cF != 65535) {
                c0217a.P();
                t.r(this);
            } else {
                t.q(this);
            }
            t.v(c0226e0);
            return;
        }
        t.v(c0257u0);
    }
}
