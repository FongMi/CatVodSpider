package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0052s extends B {
    C0052s() {
        super(oZP.d("370A112E1E303D1B1A2D"), 1, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        C0054t c0054t = B.c;
        if (q.d()) {
            c0019b.t(this);
            return false;
        }
        if (q.c()) {
            c0019b.L((J) q);
            return true;
        }
        if (B.a(q)) {
            c0019b.K((I) q);
            return true;
        }
        if (q.g()) {
            N n = (N) q;
            if (n.e.equals(oZP.d("1D1B1A2D"))) {
                c0019b.J(n);
                c0019b.u0(c0054t);
                return true;
            }
        }
        if (!(q.f() && com.github.catvod.spider.merge.K.b.c(((M) q).e, A.e)) && q.f()) {
            c0019b.t(this);
            return false;
        }
        c0019b.R();
        c0019b.u0(c0054t);
        return c0019b.g(q);
    }
}
