package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum A0 extends g1 {
    public A0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cE = c0030a.e();
        C0033b0 c0033b0 = g1.a;
        if (cE == '>') {
            p.k.k = true;
            p.k();
        } else {
            if (cE != 65535) {
                c0030a.z();
                p.m(this);
                p.o(g1.H);
                return;
            }
            p.l(this);
        }
        p.o(c0033b0);
    }
}
