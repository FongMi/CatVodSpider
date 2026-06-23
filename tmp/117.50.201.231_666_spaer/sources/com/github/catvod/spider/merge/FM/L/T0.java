package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum T0 extends j1 {
    T0() {
        super("DoctypePublicIdentifier_doubleQuoted", 56, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        StringBuilder sb;
        C0226e0 c0226e0 = j1.a;
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF == '\"') {
                t.v(j1.g0);
                return;
            }
            if (cF == '>') {
                t.r(this);
            } else if (cF != 65535) {
                sb = t.m.f;
            } else {
                t.q(this);
            }
            t.m.h = true;
            t.o();
            t.v(c0226e0);
            return;
        }
        t.r(this);
        sb = t.m.f;
        cF = 65533;
        sb.append(cF);
    }
}
