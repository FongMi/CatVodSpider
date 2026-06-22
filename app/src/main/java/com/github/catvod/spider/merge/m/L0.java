package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum L0 extends g1 {
    public L0() {
        super("BeforeDoctypeName", 51);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        boolean zT = c0030a.t();
        M0 m0 = g1.a0;
        if (zT) {
            p.m.f();
            p.o(m0);
            return;
        }
        char cE = c0030a.e();
        if (cE == 0) {
            p.m(this);
            p.m.f();
            p.m.b.append((char) 65533);
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE == 65535) {
                p.l(this);
                p.m.f();
                p.m.f = true;
                p.j();
                p.o(g1.a);
                return;
            }
            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                return;
            }
            p.m.f();
            p.m.b.append(cE);
        }
        p.o(m0);
    }
}
