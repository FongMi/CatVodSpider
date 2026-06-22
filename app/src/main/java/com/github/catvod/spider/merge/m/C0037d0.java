package com.github.catvod.spider.merge.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum C0037d0 extends g1 {
    public C0037d0() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        if (!c0030a.r('-')) {
            p.o(g1.f);
            return;
        }
        p.e('-');
        p.o(g1.x);
        p.a.a();
    }
}
