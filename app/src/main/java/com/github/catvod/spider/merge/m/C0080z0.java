package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0080z0 extends g1 {
    public C0080z0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        char cE = c0030a.e();
        C0064r0 c0064r0 = g1.H;
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE == '/') {
                p.o(g1.P);
                return;
            }
            C0033b0 c0033b0 = g1.a;
            if (cE == '>') {
                p.k();
            } else if (cE != 65535) {
                c0030a.z();
                p.m(this);
            } else {
                p.l(this);
            }
            p.o(c0033b0);
            return;
        }
        p.o(c0064r0);
    }
}
