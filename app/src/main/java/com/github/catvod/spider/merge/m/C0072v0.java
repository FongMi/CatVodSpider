package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0072v0 extends g1 {
    public C0072v0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        M m;
        g1 g1Var;
        String strF = c0030a.f(false);
        if (strF.length() > 0) {
            p.k.i(strF);
        } else {
            p.k.j = true;
        }
        char cE = c0030a.e();
        if (cE != 0) {
            if (cE == '\"') {
                g1Var = g1.O;
            } else {
                if (cE == '&') {
                    int[] iArrB = p.b('\"', true);
                    M m2 = p.k;
                    if (iArrB != null) {
                        m2.j(iArrB);
                        return;
                    } else {
                        m2.h('&');
                        return;
                    }
                }
                if (cE != 65535) {
                    m = p.k;
                } else {
                    p.l(this);
                    g1Var = g1.a;
                }
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        m = p.k;
        cE = 65533;
        m.h(cE);
    }
}
