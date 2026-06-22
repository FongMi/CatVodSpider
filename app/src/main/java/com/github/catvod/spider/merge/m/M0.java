package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum M0 extends g1 {
    public M0() {
        super("DoctypeName", 52);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        StringBuilder sb;
        if (c0030a.u()) {
            p.m.b.append(c0030a.h());
            return;
        }
        char cE = c0030a.e();
        if (cE != 0) {
            if (cE != ' ') {
                C0033b0 c0033b0 = g1.a;
                if (cE != '>') {
                    if (cE == 65535) {
                        p.l(this);
                        p.m.f = true;
                    } else if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                        sb = p.m.b;
                    }
                }
                p.j();
                p.o(c0033b0);
                return;
            }
            p.o(g1.b0);
            return;
        }
        p.m(this);
        sb = p.m.b;
        cE = 65533;
        sb.append(cE);
    }
}
