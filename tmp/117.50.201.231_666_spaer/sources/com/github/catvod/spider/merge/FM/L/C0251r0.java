package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0251r0 extends j1 {
    C0251r0() {
        super("ScriptDataDoubleEscapedDashDash", 30, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        C0246o0 c0246o0 = j1.C;
        char cF = c0217a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.j(cF);
                return;
            }
            if (cF == '<') {
                t.j(cF);
                j1Var = j1.F;
            } else if (cF == '>') {
                t.j(cF);
                j1Var = j1.f;
            } else if (cF == 65535) {
                t.q(this);
                j1Var = j1.a;
            }
            t.v(j1Var);
            return;
        }
        t.r(this);
        cF = 65533;
        t.j(cF);
        t.v(c0246o0);
    }
}
