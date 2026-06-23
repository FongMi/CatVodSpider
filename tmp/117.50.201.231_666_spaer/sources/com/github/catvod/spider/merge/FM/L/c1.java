package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum c1 extends j1 {
    c1() {
        super("AfterDoctypeSystemIdentifier", 64, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        C0226e0 c0226e0 = j1.a;
        char cF = c0217a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF != '>') {
            if (cF != 65535) {
                t.r(this);
                t.v(j1.n0);
                return;
            } else {
                t.q(this);
                t.m.h = true;
            }
        }
        t.o();
        t.v(c0226e0);
    }
}
