package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0045h0 extends g1 {
    public C0045h0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        if (c0030a.t()) {
            p.d();
            p.h.append(c0030a.l());
            p.g("<");
            p.e(c0030a.l());
            g1Var = g1.B;
        } else if (!c0030a.r('/')) {
            p.e('<');
            p.o(g1.v);
            return;
        } else {
            p.d();
            g1Var = g1.z;
        }
        p.o(g1Var);
        p.a.a();
    }
}
