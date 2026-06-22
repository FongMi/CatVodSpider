package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0871q0 extends j1 {
    C0871q0() {
        super(ZrJ.d("2A20392438313D223F2C0C2A0C2127280D361A223B282C01183023"), 29, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        j1 j1Var;
        C0867o0 c0867o0 = j1.C;
        char cF = c0838a.f();
        if (cF != 0) {
            if (cF == '-') {
                t.j(cF);
                j1Var = j1.E;
            } else if (cF == '<') {
                t.j(cF);
                j1Var = j1.F;
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
        t.v(c0867o0);
    }
}
