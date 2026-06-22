package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum Z extends g1 {
    public Z() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        C0031a0 c0031a0 = g1.s;
        c1 c1Var = g1.f;
        if (c0030a.t()) {
            p.c(false);
            p.o(c0031a0);
        } else {
            p.g("</");
            p.o(c1Var);
        }
    }
}
