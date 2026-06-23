package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0234i0 extends j1 {
    C0234i0() {
        super("ScriptDataEscapedDash", 22, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        C0232h0 c0232h0 = j1.v;
        if (c0217a.w()) {
            t.q(this);
            t.v(j1.a);
            return;
        }
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.j(cF);
                j1Var = j1.x;
            } else if (cF == '<') {
                j1Var = j1.y;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        cF = 65533;
        t.j(cF);
        t.v(c0232h0);
    }
}
