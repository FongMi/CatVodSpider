package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0 extends i1 {
    C0() {
        super("SelfClosingStartTag", 41, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        C0980d0 c0980d0 = i1.b;
        char cF = c0973a.f();
        if (cF == '>') {
            s.k.m = true;
            s.p();
        } else {
            if (cF != 65535) {
                c0973a.P();
                s.r(this);
                s.v(i1.I);
                return;
            }
            s.q(this);
        }
        s.v(c0980d0);
    }
}
