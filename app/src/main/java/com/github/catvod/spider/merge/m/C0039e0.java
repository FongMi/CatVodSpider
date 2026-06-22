package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0039e0 extends g1 {
    public C0039e0() {
        super("ScriptDataEscaped", 21);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        if (c0030a.n()) {
            p.l(this);
            p.o(g1.a);
            return;
        }
        char cL = c0030a.l();
        if (cL == 0) {
            p.m(this);
            c0030a.a();
            p.e((char) 65533);
            return;
        }
        if (cL == '-') {
            p.e('-');
            p.o(g1.w);
        } else {
            if (cL != '<') {
                p.g(c0030a.j('-', '<', 0));
                return;
            }
            p.o(g1.y);
        }
        p.a.a();
    }
}
