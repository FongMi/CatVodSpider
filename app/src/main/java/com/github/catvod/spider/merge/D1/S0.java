package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class S0 extends i1 {
    S0() {
        super("DoctypePublicIdentifier_doubleQuoted", 56, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        StringBuilder sb;
        C0980d0 c0980d0 = i1.b;
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF == '\"') {
                s.v(i1.h0);
                return;
            }
            if (cF == '>') {
                s.r(this);
            } else if (cF != 65535) {
                sb = s.m.f;
            } else {
                s.q(this);
            }
            s.m.h = true;
            s.o();
            s.v(c0980d0);
            return;
        }
        s.r(this);
        sb = s.m.f;
        cF = 65533;
        sb.append(cF);
    }
}
