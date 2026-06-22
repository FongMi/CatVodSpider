package com.github.catvod.spider.merge.d1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum P0 extends i1 {
    P0() {
        super("AfterDoctypeName", 53, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        C0980d0 c0980d0 = i1.b;
        if (c0973a.w()) {
            s.q(this);
            s.m.h = true;
            s.o();
            s.v(c0980d0);
            return;
        }
        if (c0973a.F('\t', '\n', '\r', '\f', ' ')) {
            c0973a.a();
            return;
        }
        if (c0973a.E('>')) {
            s.o();
            s.a(c0980d0);
            return;
        }
        if (c0973a.D("PUBLIC")) {
            s.m.e = "PUBLIC";
            i1Var = i1.d0;
        } else {
            if (!c0973a.D("SYSTEM")) {
                s.r(this);
                s.m.h = true;
                s.a(i1.o0);
                return;
            }
            s.m.e = "SYSTEM";
            i1Var = i1.j0;
        }
        s.v(i1Var);
    }
}
