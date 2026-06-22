package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum O0 extends i1 {
    O0() {
        super("DoctypeName", 52, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        StringBuilder sb;
        C0980d0 c0980d0 = i1.b;
        if (c0973a.J()) {
            s.m.d.append(c0973a.k());
            return;
        }
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF != ' ') {
                if (cF != '>') {
                    if (cF == 65535) {
                        s.q(this);
                        s.m.h = true;
                    } else if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r') {
                        sb = s.m.d;
                    }
                }
                s.o();
                s.v(c0980d0);
                return;
            }
            s.v(i1.c0);
            return;
        }
        s.r(this);
        sb = s.m.d;
        cF = 65533;
        sb.append(cF);
    }
}
