package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0068t0 extends g1 {
    public C0068t0() {
        super("AfterAttributeName", 35);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char cE = c0030a.e();
        C0066s0 c0066s0 = g1.I;
        if (cE == 0) {
            p.m(this);
            M m = p.k;
            m.f = true;
            String str = m.e;
            StringBuilder sb = m.d;
            if (str != null) {
                sb.append(str);
                m.e = null;
            }
            sb.append((char) 65533);
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE != '\"' && cE != '\'') {
                if (cE != '/') {
                    C0033b0 c0033b0 = g1.a;
                    if (cE != 65535) {
                        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                            return;
                        }
                        switch (cE) {
                            case '<':
                                break;
                            case '=':
                                g1Var = g1.K;
                                break;
                            case '>':
                                p.k();
                                break;
                            default:
                                p.k.o();
                                c0030a.z();
                                p.o(c0066s0);
                                break;
                        }
                        return;
                    }
                    p.l(this);
                    p.o(c0033b0);
                    return;
                }
                g1Var = g1.P;
                p.o(g1Var);
                return;
            }
            p.m(this);
            p.k.o();
            M m2 = p.k;
            m2.f = true;
            String str2 = m2.e;
            StringBuilder sb2 = m2.d;
            if (str2 != null) {
                sb2.append(str2);
                m2.e = null;
            }
            sb2.append(cE);
        }
        p.o(c0066s0);
    }
}
