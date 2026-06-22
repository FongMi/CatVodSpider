package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum f1 extends g1 {
    public f1() {
        super("EndTagOpen", 8);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        boolean zN = c0030a.n();
        C0033b0 c0033b0 = g1.a;
        if (zN) {
            p.l(this);
            p.g("</");
            p.o(c0033b0);
        } else if (c0030a.t()) {
            p.c(false);
            p.o(g1.j);
        } else if (c0030a.r('>')) {
            p.m(this);
            p.o(c0033b0);
            p.a.a();
        } else {
            p.m(this);
            p.n.f();
            p.n.h('/');
            p.o(g1.Q);
        }
    }
}
