package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum a1 extends g1 {
    public a1() {
        super("BogusDoctype", 65);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cE = c0030a.e();
        C0033b0 c0033b0 = g1.a;
        if (cE == '>' || cE == 65535) {
            p.j();
            p.o(c0033b0);
        }
    }
}
