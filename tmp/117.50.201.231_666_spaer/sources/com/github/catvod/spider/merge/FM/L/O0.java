package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum O0 extends j1 {
    O0() {
        super("BeforeDoctypeName", 51, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        P0 p0 = j1.a0;
        if (c0217a.H()) {
            t.g();
            t.v(p0);
            return;
        }
        char cF = c0217a.f();
        if (cF == 0) {
            t.r(this);
            t.g();
            t.m.d.append((char) 65533);
        } else {
            if (cF == ' ') {
                return;
            }
            if (cF == 65535) {
                t.q(this);
                t.g();
                t.m.h = true;
                t.o();
                t.v(j1.a);
                return;
            }
            if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                return;
            }
            t.g();
            t.m.d.append(cF);
        }
        t.v(p0);
    }
}
