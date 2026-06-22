package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0045o extends B {
    C0045o() {
        super(oZP.d("340903241E13070E1A241F3001"), 20, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        B b;
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
            b = B.g;
        } else {
            if (q.f() && ((M) q).e.equals(strD)) {
                c0019b.u0(B.w);
                return true;
            }
            if (!q.g() || !((N) q).e.equals(oZP.d("1B0011330D38101C"))) {
                if (q.e()) {
                    return true;
                }
                c0019b.t(this);
                return false;
            }
            b = B.d;
        }
        return c0019b.f0(q, b);
    }
}
