package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C1000n0 extends i1 {
    C1000n0() {
        super("ScriptDataDoubleEscaped", 28, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        i1 i1Var;
        char cU = c0973a.u();
        if (cU == 0) {
            s.r(this);
            c0973a.a();
            s.j((char) 65533);
            return;
        }
        if (cU == '-') {
            s.j(cU);
            i1Var = i1.E;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    s.l(c0973a.q('-', '<', 0));
                    return;
                } else {
                    s.q(this);
                    s.v(i1.b);
                    return;
                }
            }
            s.j(cU);
            i1Var = i1.G;
        }
        s.a(i1Var);
    }
}
