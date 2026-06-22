package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum F0 extends g1 {
    public F0() {
        super("Comment", 46);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cL = c0030a.l();
        if (cL == 0) {
            p.m(this);
            c0030a.a();
            p.n.h((char) 65533);
        } else if (cL == '-') {
            p.o(g1.V);
            p.a.a();
        } else {
            if (cL != 65535) {
                p.n.i(c0030a.j('-', 0));
                return;
            }
            p.l(this);
            p.i();
            p.o(g1.a);
        }
    }
}
