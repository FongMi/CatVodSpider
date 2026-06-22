package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum Q extends g1 {
    public Q() {
        super("TagName", 9);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char c;
        c0030a.b();
        int i = c0030a.e;
        int i2 = c0030a.c;
        char[] cArr = c0030a.a;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '<' && c != '>') {
            i3++;
        }
        c0030a.e = i3;
        p.k.k(i3 > i ? C0030a.c(c0030a.a, c0030a.h, i, i3 - i) : "");
        char cE = c0030a.e();
        if (cE == 0) {
            p.k.k(g1.r0);
            return;
        }
        if (cE == ' ') {
            g1Var = g1.H;
        } else {
            if (cE != '/') {
                C0033b0 c0033b0 = g1.a;
                if (cE != '<') {
                    if (cE != '>') {
                        if (cE != 65535) {
                            if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                                M m = p.k;
                                m.getClass();
                                m.k(String.valueOf(cE));
                                return;
                            }
                            g1Var = g1.H;
                        } else {
                            p.l(this);
                        }
                    }
                    p.o(c0033b0);
                    return;
                }
                c0030a.z();
                p.m(this);
                p.k();
                p.o(c0033b0);
                return;
            }
            g1Var = g1.P;
        }
        p.o(g1Var);
    }
}
