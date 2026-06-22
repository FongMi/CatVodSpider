package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum Y extends g1 {
    public Y() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char cE = c0030a.e();
        if (cE == '!') {
            p.g("<!");
            g1Var = g1.t;
        } else if (cE != '/') {
            p.g("<");
            if (cE != 65535) {
                c0030a.z();
                g1Var = g1.f;
            } else {
                p.l(this);
                g1Var = g1.a;
            }
        } else {
            p.d();
            g1Var = g1.r;
        }
        p.o(g1Var);
    }
}
