package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum K0 extends g1 {
    public K0() {
        super("Doctype", 50);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cE = c0030a.e();
        L0 l0 = g1.Z;
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            p.o(l0);
            return;
        }
        if (cE != '>') {
            if (cE != 65535) {
                p.m(this);
                p.o(l0);
                return;
            }
            p.l(this);
        }
        p.m(this);
        p.m.f();
        p.m.f = true;
        p.j();
        p.o(g1.a);
    }
}
