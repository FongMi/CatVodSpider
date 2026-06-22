package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0051r0 extends j1 {
    C0051r0() {
        super(oZP.d("260C05281C21310E0320283A000D1B242926160E07240811141C1F050D261D"), 30, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        j1 j1Var;
        C0046o0 c0046o0 = j1.C;
        char cF = c0017a.f();
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
        t.v(c0046o0);
    }
}
