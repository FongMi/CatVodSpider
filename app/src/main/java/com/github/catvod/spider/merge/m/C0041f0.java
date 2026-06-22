package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0041f0 extends g1 {
    public C0041f0() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        if (c0030a.n()) {
            p.l(this);
            p.o(g1.a);
            return;
        }
        char cE = c0030a.e();
        C0039e0 c0039e0 = g1.v;
        if (cE != 0) {
            if (cE == '-') {
                p.e(cE);
                g1Var = g1.x;
            } else if (cE == '<') {
                g1Var = g1.y;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        cE = 65533;
        p.e(cE);
        p.o(c0039e0);
    }
}
