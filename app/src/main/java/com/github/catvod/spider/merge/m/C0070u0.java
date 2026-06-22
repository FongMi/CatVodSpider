package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0070u0 extends g1 {
    public C0070u0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        M m;
        g1 g1Var;
        char cE = c0030a.e();
        C0078y0 c0078y0 = g1.N;
        if (cE != 0) {
            if (cE != ' ') {
                if (cE != '\"') {
                    if (cE != '`') {
                        C0033b0 c0033b0 = g1.a;
                        if (cE != 65535) {
                            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                                return;
                            }
                            if (cE != '&') {
                                if (cE != '\'') {
                                    switch (cE) {
                                        case '>':
                                            p.m(this);
                                            break;
                                    }
                                    return;
                                }
                                g1Var = g1.M;
                            }
                            c0030a.z();
                            p.o(c0078y0);
                        }
                        p.l(this);
                        p.k();
                        p.o(c0033b0);
                        return;
                    }
                    p.m(this);
                    m = p.k;
                } else {
                    g1Var = g1.L;
                }
                p.o(g1Var);
                return;
            }
            return;
        }
        p.m(this);
        m = p.k;
        cE = 65533;
        m.h(cE);
        p.o(c0078y0);
    }
}
