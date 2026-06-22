package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0047i0 extends g1 {
    public C0047i0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        if (!c0030a.t()) {
            p.g("</");
            p.o(g1.v);
            return;
        }
        p.c(false);
        M m = p.k;
        char cL = c0030a.l();
        m.getClass();
        m.k(String.valueOf(cL));
        p.h.append(c0030a.l());
        p.o(g1.A);
        p.a.a();
    }
}
