package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum W0 extends g1 {
    public W0() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char cE = c0030a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
            g1Var = g1.k0;
        } else {
            if (cE != '\'') {
                C0033b0 c0033b0 = g1.a;
                if (cE == '>') {
                    p.m(this);
                } else if (cE != 65535) {
                    p.m(this);
                    p.m.f = true;
                    g1Var = g1.n0;
                } else {
                    p.l(this);
                }
                p.m.f = true;
                p.j();
                p.o(c0033b0);
                return;
            }
            g1Var = g1.l0;
        }
        p.o(g1Var);
    }
}
