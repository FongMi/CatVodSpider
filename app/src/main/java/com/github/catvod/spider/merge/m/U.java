package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum U extends g1 {
    public U() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(P p, C0030a c0030a) {
        p.g("</");
        p.h(p.h);
        c0030a.z();
        p.o(g1.c);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        if (c0030a.t()) {
            String strH = c0030a.h();
            p.k.k(strH);
            p.h.append(strH);
            return;
        }
        char cE = c0030a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            if (p.n()) {
                g1Var = g1.H;
                p.o(g1Var);
                return;
            }
            e(p, c0030a);
        }
        if (cE == '/') {
            if (p.n()) {
                g1Var = g1.P;
                p.o(g1Var);
                return;
            }
            e(p, c0030a);
        }
        if (cE == '>' && p.n()) {
            p.k();
            g1Var = g1.a;
            p.o(g1Var);
            return;
        }
        e(p, c0030a);
    }
}
