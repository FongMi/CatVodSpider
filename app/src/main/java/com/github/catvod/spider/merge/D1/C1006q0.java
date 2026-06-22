package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C1006q0 extends i1 {
    C1006q0() {
        super("ScriptDataDoubleEscapedDashDash", 30, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        C1000n0 c1000n0 = i1.D;
        char cF = c0973a.f();
        if (cF != 0) {
            if (cF == '-') {
                s.j(cF);
                return;
            }
            if (cF == '<') {
                s.j(cF);
                i1Var = i1.G;
            } else if (cF == '>') {
                s.j(cF);
                i1Var = i1.g;
            } else if (cF == 65535) {
                s.q(this);
                i1Var = i1.b;
            }
            s.v(i1Var);
            return;
        }
        s.r(this);
        cF = 65533;
        s.j(cF);
        s.v(c1000n0);
    }
}
