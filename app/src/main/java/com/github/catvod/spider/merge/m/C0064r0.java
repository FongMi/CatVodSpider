package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0064r0 extends g1 {
    public C0064r0() {
        super("BeforeAttributeName", 33);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cE = c0030a.e();
        C0066s0 c0066s0 = g1.I;
        if (cE == 0) {
            c0030a.z();
            p.m(this);
            p.k.o();
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE != '\"' && cE != '\'') {
                if (cE == '/') {
                    p.o(g1.P);
                    return;
                }
                C0033b0 c0033b0 = g1.a;
                if (cE != 65535) {
                    if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                        return;
                    }
                    switch (cE) {
                        case '<':
                            c0030a.z();
                            p.m(this);
                            p.k();
                            break;
                        case '=':
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
            p.m(this);
            p.k.o();
            M m = p.k;
            m.f = true;
            String str = m.e;
            StringBuilder sb = m.d;
            if (str != null) {
                sb.append(str);
                m.e = null;
            }
            sb.append(cE);
        }
        p.o(c0066s0);
    }
}
