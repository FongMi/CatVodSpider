package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum B0 extends g1 {
    public B0() {
        super("BogusComment", 42);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        p.n.i(c0030a.i('>'));
        char cL = c0030a.l();
        if (cL == '>' || cL == 65535) {
            c0030a.e();
            p.i();
            p.o(g1.a);
        }
    }
}
