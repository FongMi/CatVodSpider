package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum e1 extends g1 {
    public e1() {
        super("TagOpen", 7);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        g1 g1Var2;
        char cL = c0030a.l();
        if (cL == '!') {
            g1Var = g1.R;
        } else {
            if (cL != '/') {
                if (cL == '?') {
                    p.n.f();
                    p.o(g1.Q);
                    return;
                }
                if (c0030a.t()) {
                    p.c(true);
                    g1Var2 = g1.j;
                } else {
                    p.m(this);
                    p.e('<');
                    g1Var2 = g1.a;
                }
                p.o(g1Var2);
                return;
            }
            g1Var = g1.i;
        }
        p.o(g1Var);
        p.a.a();
    }
}
