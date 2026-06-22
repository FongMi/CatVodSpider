package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0263g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0056u extends B {
    C0056u() {
        super(oZP.d("3C013F240D31"), 3, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        B b;
        C0064y c0064y = B.h;
        if (B.a(q)) {
            c0019b.K((I) q);
            return true;
        }
        int iA = C0263g.a(q.a);
        if (iA == 0) {
            c0019b.t(this);
            return false;
        }
        String strD = oZP.d("010A1A310034010A");
        String strD2 = oZP.d("1D0A1625");
        if (iA == 1) {
            N n = (N) q;
            String str = n.e;
            if (str.equals(oZP.d("1D1B1A2D"))) {
                return B.g.d(q, c0019b);
            }
            if (com.github.catvod.spider.merge.K.b.c(str, A.a)) {
                com.github.catvod.spider.merge.L.m mVarM = c0019b.M(n);
                if (str.equals(oZP.d("170E0424")) && mVarM.n(oZP.d("1D1D1227"))) {
                    c0019b.V(mVarM);
                }
            } else if (str.equals(oZP.d("180A0320"))) {
                c0019b.M(n);
            } else if (str.equals(oZP.d("0106032D09"))) {
                c0019b.c.v(j1.c);
                c0019b.U();
                c0019b.u0(c0064y);
                c0019b.J(n);
            } else if (com.github.catvod.spider.merge.K.b.c(str, A.b)) {
                B.b(n, c0019b);
            } else if (str.equals(oZP.d("1B0004221E3C051B"))) {
                c0019b.J(n);
                b = B.e;
                c0019b.u0(b);
            } else if (str.equals(oZP.d("060C05281C21"))) {
                c0019b.c.v(j1.f);
                c0019b.U();
                c0019b.u0(c0064y);
                c0019b.J(n);
            } else {
                if (str.equals(strD2)) {
                    c0019b.t(this);
                    return false;
                }
                if (!str.equals(strD)) {
                    c0019b.h(strD2);
                    return c0019b.g(q);
                }
                c0019b.J(n);
                c0019b.P();
                c0019b.u(false);
                C0037k c0037k = B.r;
                c0019b.u0(c0037k);
                c0019b.h0(c0037k);
            }
        } else if (iA == 2) {
            String str2 = ((M) q).e;
            if (str2.equals(strD2)) {
                c0019b.b0();
                b = B.f;
                c0019b.u0(b);
            } else {
                if (com.github.catvod.spider.merge.K.b.c(str2, A.c)) {
                    c0019b.h(strD2);
                    return c0019b.g(q);
                }
                if (!str2.equals(strD)) {
                    c0019b.t(this);
                    return false;
                }
                if (c0019b.Y(str2)) {
                    c0019b.x(true);
                    if (!str2.equals(c0019b.a().i0())) {
                        c0019b.t(this);
                    }
                    c0019b.c0(str2);
                    c0019b.n();
                    c0019b.d0();
                    c0019b.o0();
                } else {
                    c0019b.t(this);
                }
            }
        } else {
            if (iA != 3) {
                c0019b.h(strD2);
                return c0019b.g(q);
            }
            c0019b.L((J) q);
        }
        return true;
    }
}
