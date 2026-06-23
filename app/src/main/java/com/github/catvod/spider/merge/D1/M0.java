package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class M0 extends i1 {
    M0() {
        super("Doctype", 50, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        N0 n0 = i1.a0;
        char cF = c0973a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF != '>') {
                if (cF != 65535) {
                    s.r(this);
                } else {
                    s.q(this);
                }
            }
            s.r(this);
            s.g();
            s.m.h = true;
            s.o();
            s.v(i1.b);
            return;
        }
        s.v(n0);
    }
}
