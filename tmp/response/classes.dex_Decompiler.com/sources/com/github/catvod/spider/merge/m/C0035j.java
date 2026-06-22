package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0035j extends B {
    C0035j() {
        super(oZP.d("3C0124240030161B3E2F3834170312"), 16, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        boolean zG = q.g();
        String strD = oZP.d("060A1B240F21");
        if (zG && com.github.catvod.spider.merge.K.b.c(((N) q).e, A.G)) {
            c0019b.t(this);
            c0019b.c0(strD);
            c0019b.o0();
            return c0019b.g(q);
        }
        if (q.f()) {
            M m = (M) q;
            if (com.github.catvod.spider.merge.K.b.c(m.e, A.G)) {
                c0019b.t(this);
                if (!c0019b.I(m.e)) {
                    return false;
                }
                c0019b.c0(strD);
                c0019b.o0();
                return c0019b.g(q);
            }
        }
        return c0019b.f0(q, B.p);
    }
}
