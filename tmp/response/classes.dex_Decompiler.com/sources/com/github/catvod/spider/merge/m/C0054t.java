package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0054t extends B {
    C0054t() {
        super(oZP.d("370A112E1E303D0A1625"), 2, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        if (B.a(q)) {
            c0019b.K((I) q);
            return true;
        }
        if (q.c()) {
            c0019b.L((J) q);
            return true;
        }
        if (q.d()) {
            c0019b.t(this);
            return false;
        }
        if (q.g() && ((N) q).e.equals(oZP.d("1D1B1A2D"))) {
            return B.g.d(q, c0019b);
        }
        boolean zG = q.g();
        String strD = oZP.d("1D0A1625");
        if (zG) {
            N n = (N) q;
            if (n.e.equals(strD)) {
                c0019b.r0(c0019b.J(n));
                c0019b.u0(B.d);
                return true;
            }
        }
        if (q.f() && com.github.catvod.spider.merge.K.b.c(((M) q).e, A.e)) {
            c0019b.j(strD);
            return c0019b.g(q);
        }
        if (q.f()) {
            c0019b.t(this);
            return false;
        }
        c0019b.j(strD);
        return c0019b.g(q);
    }
}
