package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0263g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0027f extends B {
    C0027f() {
        super(oZP.d("3C0123200E39102D182515"), 12, null);
    }

    private boolean e(Q q, C0019b c0019b) {
        if (!c0019b.I(oZP.d("010D182515")) && !c0019b.I(oZP.d("0107122008")) && !c0019b.E(oZP.d("0109182E18"), null)) {
            c0019b.t(this);
            return false;
        }
        c0019b.p();
        c0019b.h(c0019b.a().i0());
        return c0019b.g(q);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        B b = B.i;
        int iA = C0263g.a(q.a);
        if (iA == 1) {
            N n = (N) q;
            String str = n.e;
            String strD = oZP.d("011D");
            if (!str.equals(strD)) {
                if (!com.github.catvod.spider.merge.K.b.c(str, A.v)) {
                    return com.github.catvod.spider.merge.K.b.c(str, A.B) ? e(q, c0019b) : c0019b.f0(q, b);
                }
                c0019b.t(this);
                c0019b.j(strD);
                return c0019b.g(n);
            }
            c0019b.p();
            c0019b.J(n);
            c0019b.u0(B.n);
        } else {
            if (iA != 2) {
                return c0019b.f0(q, b);
            }
            String str2 = ((M) q).e;
            if (!com.github.catvod.spider.merge.K.b.c(str2, A.H)) {
                if (str2.equals(oZP.d("010E152D09"))) {
                    return e(q, c0019b);
                }
                if (!com.github.catvod.spider.merge.K.b.c(str2, A.C)) {
                    return c0019b.f0(q, b);
                }
                c0019b.t(this);
                return false;
            }
            if (!c0019b.I(str2)) {
                c0019b.t(this);
                return false;
            }
            c0019b.p();
            c0019b.b0();
            c0019b.u0(b);
        }
        return true;
    }
}
