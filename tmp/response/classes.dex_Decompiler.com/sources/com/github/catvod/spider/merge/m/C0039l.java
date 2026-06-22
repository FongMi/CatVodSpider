package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0039l extends B {
    C0039l() {
        super(oZP.d("340903241E171A0B0E"), 18, null);
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
        boolean zG = q.g();
        String strD = oZP.d("1D1B1A2D");
        if (zG && ((N) q).e.equals(strD)) {
            return c0019b.f0(q, B.g);
        }
        if (q.f() && ((M) q).e.equals(strD)) {
            c0019b.getClass();
            if (c0019b.Y(strD)) {
                c0019b.c0(strD);
            }
            c0019b.u0(B.v);
            return true;
        }
        if (q.e()) {
            return true;
        }
        c0019b.t(this);
        c0019b.n0();
        return c0019b.g(q);
    }
}
