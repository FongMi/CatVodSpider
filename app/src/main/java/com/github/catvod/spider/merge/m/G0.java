package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum G0 extends g1 {
    public G0() {
        super("CommentEndDash", 47);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        g1 g1Var;
        char cE = c0030a.e();
        F0 f0 = g1.U;
        if (cE != 0) {
            if (cE == '-') {
                g1Var = g1.W;
            } else if (cE != 65535) {
                H h = p.n;
                h.h('-');
                h.h(cE);
            } else {
                p.l(this);
                p.i();
                g1Var = g1.a;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        H h2 = p.n;
        h2.h('-');
        h2.h((char) 65533);
        p.o(f0);
    }
}
