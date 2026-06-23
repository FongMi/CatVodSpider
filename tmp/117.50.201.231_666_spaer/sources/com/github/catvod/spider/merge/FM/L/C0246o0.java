package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0246o0 extends j1 {
    C0246o0() {
        super("ScriptDataDoubleEscaped", 28, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        j1 j1Var;
        char cU = c0217a.u();
        if (cU == 0) {
            t.r(this);
            c0217a.a();
            t.j((char) 65533);
            return;
        }
        if (cU == '-') {
            t.j(cU);
            j1Var = j1.D;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    t.l(c0217a.q('-', '<', 0));
                    return;
                } else {
                    t.q(this);
                    t.v(j1.a);
                    return;
                }
            }
            t.j(cU);
            j1Var = j1.F;
        }
        t.a(j1Var);
    }
}
