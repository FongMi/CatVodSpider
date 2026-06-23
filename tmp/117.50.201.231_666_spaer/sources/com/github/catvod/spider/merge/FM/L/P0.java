package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum P0 extends j1 {
    P0() {
        super("DoctypeName", 52, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        StringBuilder sb;
        C0226e0 c0226e0 = j1.a;
        if (c0217a.J()) {
            t.m.d.append(c0217a.k());
            return;
        }
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF != ' ') {
                if (cF != '>') {
                    if (cF == 65535) {
                        t.q(this);
                        t.m.h = true;
                    } else if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                        sb = t.m.d;
                    }
                }
                t.o();
                t.v(c0226e0);
                return;
            }
            t.v(j1.b0);
            return;
        }
        t.r(this);
        sb = t.m.d;
        cF = 65533;
        sb.append(cF);
    }
}
