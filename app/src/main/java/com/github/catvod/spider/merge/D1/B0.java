package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class B0 extends i1 {
    B0() {
        super("AfterAttributeValue_quoted", 40, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        C0980d0 c0980d0 = i1.b;
        C1011t0 c1011t0 = i1.I;
        char cF = c0973a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF == '/') {
                s.v(i1.Q);
                return;
            }
            if (cF == '>') {
                s.p();
            } else if (cF != 65535) {
                c0973a.P();
                s.r(this);
            } else {
                s.q(this);
            }
            s.v(c0980d0);
            return;
        }
        s.v(c1011t0);
    }
}
