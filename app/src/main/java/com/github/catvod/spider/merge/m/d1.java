package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum d1 extends g1 {
    public d1() {
        super("PLAINTEXT", 6);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cL = c0030a.l();
        if (cL == 0) {
            p.m(this);
            c0030a.a();
            p.e((char) 65533);
        } else if (cL != 65535) {
            p.g(c0030a.i((char) 0));
        } else {
            p.f(new J());
        }
    }
}
