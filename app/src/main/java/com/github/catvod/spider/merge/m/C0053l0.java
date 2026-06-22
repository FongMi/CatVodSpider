package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0053l0 extends g1 {
    public C0053l0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char cL = c0030a.l();
        if (cL == 0) {
            p.m(this);
            c0030a.a();
            p.e((char) 65533);
            return;
        }
        if (cL == '-') {
            p.e(cL);
            g1Var = g1.D;
        } else {
            if (cL != '<') {
                if (cL != 65535) {
                    p.g(c0030a.j('-', '<', 0));
                    return;
                } else {
                    p.l(this);
                    p.o(g1.a);
                    return;
                }
            }
            p.e(cL);
            g1Var = g1.F;
        }
        p.o(g1Var);
        p.a.a();
    }
}
