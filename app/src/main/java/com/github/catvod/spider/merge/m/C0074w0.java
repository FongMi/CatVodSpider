package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0074w0 extends g1 {
    public C0074w0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        M m;
        g1 g1Var;
        String strF = c0030a.f(true);
        if (strF.length() > 0) {
            p.k.i(strF);
        } else {
            p.k.j = true;
        }
        char cE = c0030a.e();
        if (cE != 0) {
            if (cE == 65535) {
                p.l(this);
                g1Var = g1.a;
            } else {
                if (cE == '&') {
                    int[] iArrB = p.b('\'', true);
                    M m2 = p.k;
                    if (iArrB != null) {
                        m2.j(iArrB);
                        return;
                    } else {
                        m2.h('&');
                        return;
                    }
                }
                if (cE != '\'') {
                    m = p.k;
                } else {
                    g1Var = g1.O;
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
