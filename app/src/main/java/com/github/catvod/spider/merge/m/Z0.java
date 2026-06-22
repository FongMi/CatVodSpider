package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum Z0 extends g1 {
    public Z0() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cE = c0030a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        C0033b0 c0033b0 = g1.a;
        if (cE != '>') {
            if (cE != 65535) {
                p.m(this);
                p.o(g1.n0);
                return;
            } else {
                p.l(this);
                p.m.f = true;
            }
        }
        p.j();
        p.o(c0033b0);
    }
}
