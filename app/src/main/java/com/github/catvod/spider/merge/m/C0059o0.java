package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0059o0 extends g1 {
    public C0059o0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char cE = c0030a.e();
        C0053l0 c0053l0 = g1.C;
        if (cE != 0) {
            if (cE == '-') {
                p.e(cE);
                return;
            }
            if (cE == '<') {
                p.e(cE);
                g1Var = g1.F;
            } else if (cE == '>') {
                p.e(cE);
                g1Var = g1.f;
            } else if (cE == 65535) {
                p.l(this);
                g1Var = g1.a;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        cE = 65533;
        p.e(cE);
        p.o(c0053l0);
    }
}
