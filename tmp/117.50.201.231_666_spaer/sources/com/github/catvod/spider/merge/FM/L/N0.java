package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum N0 extends j1 {
    N0() {
        super("Doctype", 50, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        O0 o0 = j1.Z;
        char cF = c0217a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF != '>') {
                if (cF != 65535) {
                    t.r(this);
                } else {
                    t.q(this);
                }
            }
            t.r(this);
            t.g();
            t.m.h = true;
            t.o();
            t.v(j1.a);
            return;
        }
        t.v(o0);
    }
}
