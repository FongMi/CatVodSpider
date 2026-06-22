package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0023d extends B {
    C0023d() {
        super(oZP.d("3C0134201C211C0019"), 10, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        boolean zF = q.f();
        String strD = oZP.d("160E0735053A1B");
        if (zF) {
            M m = (M) q;
            if (m.e.equals(strD)) {
                if (!c0019b.I(m.e)) {
                    c0019b.t(this);
                    return false;
                }
                c0019b.x(false);
                if (!c0019b.b(strD)) {
                    c0019b.t(this);
                }
                c0019b.c0(strD);
                c0019b.n();
                c0019b.u0(B.i);
                return true;
            }
        }
        if ((q.g() && com.github.catvod.spider.merge.K.b.c(((N) q).e, A.y)) || (q.f() && ((M) q).e.equals(oZP.d("010E152D09")))) {
            c0019b.t(this);
            if (c0019b.h(strD)) {
                return c0019b.g(q);
            }
            return true;
        }
        if (!q.f() || !com.github.catvod.spider.merge.K.b.c(((M) q).e, A.J)) {
            return c0019b.f0(q, B.g);
        }
        c0019b.t(this);
        return false;
    }
}
