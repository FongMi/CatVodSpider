package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum b1 extends i1 {
    b1() {
        super("AfterDoctypeSystemIdentifier", 64, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        C0980d0 c0980d0 = i1.b;
        char cF = c0973a.f();
        if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r' || cF == ' ') {
            return;
        }
        if (cF != '>') {
            if (cF != 65535) {
                s.r(this);
                s.v(i1.o0);
                return;
            } else {
                s.q(this);
                s.m.h = true;
            }
        }
        s.o();
        s.v(c0980d0);
    }
}
