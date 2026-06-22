package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0058v extends B {
    C0058v() {
        super(oZP.d("3C013F240D313B0004221E3C051B"), 4, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        I i;
        C0056u c0056u = B.d;
        if (q.d()) {
            c0019b.t(this);
        } else {
            if (q.g() && ((N) q).e.equals(oZP.d("1D1B1A2D"))) {
                return c0019b.f0(q, B.g);
            }
            if (!q.f() || !((M) q).e.equals(oZP.d("1B0004221E3C051B"))) {
                if (B.a(q) || q.c() || (q.g() && com.github.catvod.spider.merge.K.b.c(((N) q).e, A.f))) {
                    return c0019b.f0(q, c0056u);
                }
                if (q.f() && ((M) q).e.equals(oZP.d("171D"))) {
                    c0019b.t(this);
                    i = new I();
                } else {
                    if ((q.g() && com.github.catvod.spider.merge.K.b.c(((N) q).e, A.I)) || q.f()) {
                        c0019b.t(this);
                        return false;
                    }
                    c0019b.t(this);
                    i = new I();
                }
                i.k(q.toString());
                c0019b.K(i);
                return true;
            }
            c0019b.b0();
            c0019b.u0(c0056u);
        }
        return true;
    }
}
