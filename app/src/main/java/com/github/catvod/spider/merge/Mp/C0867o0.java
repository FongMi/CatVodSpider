package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0867o0 extends j1 {
    C0867o0() {
        super(ZrJ.d("2A20392438313D223F2C0C2A0C2127280D361A223B282C"), 28, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        char cU = c0838a.u();
        if (cU == 0) {
            t.r(this);
            c0838a.a();
            t.j((char) 65533);
            return;
        }
        if (cU == '-') {
            t.j(cU);
            j1Var = j1.D;
        } else {
            if (cU != '<') {
                if (cU != 65535) {
                    t.l(c0838a.q('-', '<', 0));
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
