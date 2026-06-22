package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum W extends g1 {
    public W() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        X x = g1.p;
        T0 t0 = g1.e;
        if (c0030a.t()) {
            p.c(false);
            p.o(x);
        } else {
            p.g("</");
            p.o(t0);
        }
    }
}
