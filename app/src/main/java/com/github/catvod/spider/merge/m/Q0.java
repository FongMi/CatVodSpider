package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum Q0 extends g1 {
    public Q0() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        StringBuilder sb;
        char cE = c0030a.e();
        if (cE != 0) {
            if (cE == '\"') {
                p.o(g1.g0);
                return;
            }
            C0033b0 c0033b0 = g1.a;
            if (cE == '>') {
                p.m(this);
            } else if (cE != 65535) {
                sb = p.m.d;
            } else {
                p.l(this);
            }
            p.m.f = true;
            p.j();
            p.o(c0033b0);
            return;
        }
        p.m(this);
        sb = p.m.d;
        cE = 65533;
        sb.append(cE);
    }
}
