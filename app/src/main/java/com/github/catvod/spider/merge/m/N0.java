package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum N0 extends g1 {
    public N0() {
        super("AfterDoctypeName", 53);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        boolean zN = c0030a.n();
        C0033b0 c0033b0 = g1.a;
        if (zN) {
            p.l(this);
            p.m.f = true;
            p.j();
            p.o(c0033b0);
            return;
        }
        if (c0030a.s('\t', '\n', '\r', '\f', ' ')) {
            c0030a.a();
            return;
        }
        if (!c0030a.r('>')) {
            if (c0030a.q("PUBLIC")) {
                p.m.c = "PUBLIC";
                g1Var = g1.c0;
            } else if (c0030a.q("SYSTEM")) {
                p.m.c = "SYSTEM";
                g1Var = g1.i0;
            } else {
                p.m(this);
                p.m.f = true;
                p.o(g1.n0);
            }
            p.o(g1Var);
            return;
        }
        p.j();
        p.o(c0033b0);
        p.a.a();
    }
}
