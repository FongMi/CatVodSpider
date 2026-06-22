package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0033b0 extends g1 {
    public C0033b0() {
        super("Data", 0);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char cL = c0030a.l();
        if (cL == 0) {
            p.m(this);
            p.e(c0030a.e());
            return;
        }
        if (cL == '&') {
            g1Var = g1.b;
        } else {
            if (cL != '<') {
                if (cL != 65535) {
                    p.g(c0030a.g());
                    return;
                } else {
                    p.f(new J());
                    return;
                }
            }
            g1Var = g1.h;
        }
        p.o(g1Var);
        p.a.a();
    }
}
