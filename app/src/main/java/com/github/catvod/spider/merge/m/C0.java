package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0 extends g1 {
    public C0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        if (c0030a.p("--")) {
            p.n.f();
            g1Var = g1.S;
        } else if (c0030a.q("DOCTYPE")) {
            g1Var = g1.Y;
        } else if (c0030a.p("[CDATA[")) {
            p.d();
            g1Var = g1.o0;
        } else {
            p.m(this);
            p.n.f();
            g1Var = g1.Q;
        }
        p.o(g1Var);
    }
}
