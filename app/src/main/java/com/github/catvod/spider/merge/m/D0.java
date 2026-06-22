package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum D0 extends g1 {
    public D0() {
        super("CommentStart", 44);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cE = c0030a.e();
        F0 f0 = g1.U;
        if (cE != 0) {
            if (cE == '-') {
                p.o(g1.T);
                return;
            }
            C0033b0 c0033b0 = g1.a;
            if (cE == '>') {
                p.m(this);
            } else if (cE != 65535) {
                c0030a.z();
            } else {
                p.l(this);
            }
            p.i();
            p.o(c0033b0);
            return;
        }
        p.m(this);
        p.n.h((char) 65533);
        p.o(f0);
    }
}
