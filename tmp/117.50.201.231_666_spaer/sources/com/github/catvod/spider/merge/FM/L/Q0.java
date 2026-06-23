package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum Q0 extends j1 {
    Q0() {
        super("AfterDoctypeName", 53, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        C0226e0 c0226e0 = j1.a;
        if (c0217a.w()) {
            t.q(this);
            t.m.h = true;
            t.o();
            t.v(c0226e0);
            return;
        }
        if (c0217a.F('\t', '\n', '\r', '\f', ' ')) {
            c0217a.a();
            return;
        }
        if (c0217a.E('>')) {
            t.o();
            t.a(c0226e0);
            return;
        }
        if (c0217a.D("PUBLIC")) {
            t.m.e = "PUBLIC";
            j1Var = j1.c0;
        } else {
            if (!c0217a.D("SYSTEM")) {
                t.r(this);
                t.m.h = true;
                t.a(j1.n0);
                return;
            }
            t.m.e = "SYSTEM";
            j1Var = j1.i0;
        }
        t.v(j1Var);
    }
}
