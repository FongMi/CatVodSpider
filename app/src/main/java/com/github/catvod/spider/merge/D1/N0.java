package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum N0 extends i1 {
    N0() {
        super("BeforeDoctypeName", 51, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        O0 o0 = i1.b0;
        if (c0973a.H()) {
            s.g();
            s.v(o0);
            return;
        }
        char cF = c0973a.f();
        if (cF == 0) {
            s.r(this);
            s.g();
            s.m.d.append((char) 65533);
        } else {
            if (cF == ' ') {
                return;
            }
            if (cF == 65535) {
                s.q(this);
                s.g();
                s.m.h = true;
                s.o();
                s.v(i1.b);
                return;
            }
            if (cF == '\t' || cF == '\n' || cF == '\f' || cF == '\r') {
                return;
            }
            s.g();
            s.m.d.append(cF);
        }
        s.v(o0);
    }
}
