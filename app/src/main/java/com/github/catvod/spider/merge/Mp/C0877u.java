package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.yZ.C1442g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0877u extends B {
    C0877u() {
        super(ZrJ.d("302D03282921"), 3, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        B b;
        C0885y c0885y = B.h;
        if (B.a(q)) {
            c0840b.K((I) q);
            return true;
        }
        int iA = C1442g.a(q.a);
        if (iA == 0) {
            c0840b.t(this);
            return false;
        }
        String strD = ZrJ.d("0D26263D24240D26");
        String strD2 = ZrJ.d("11262A29");
        if (iA == 1) {
            N n = (N) q;
            String str = n.e;
            if (str.equals(ZrJ.d("11372621"))) {
                return B.g.d(q, c0840b);
            }
            if (com.github.catvod.spider.merge.XU.n.c(str, A.a)) {
                com.github.catvod.spider.merge.UY.m mVarM = c0840b.M(n);
                if (str.equals(ZrJ.d("1B223828")) && mVarM.n(ZrJ.d("11312E2B"))) {
                    c0840b.V(mVarM);
                }
            } else if (str.equals(ZrJ.d("14263F2C"))) {
                c0840b.M(n);
            } else if (str.equals(ZrJ.d("0D2A3F212D"))) {
                c0840b.c.v(j1.c);
                c0840b.U();
                c0840b.u0(c0885y);
                c0840b.J(n);
            } else if (com.github.catvod.spider.merge.XU.n.c(str, A.b)) {
                B.b(n, c0840b);
            } else if (str.equals(ZrJ.d("172C382E3A2C0937"))) {
                c0840b.J(n);
                b = B.e;
                c0840b.u0(b);
            } else if (str.equals(ZrJ.d("0A2039243831"))) {
                c0840b.c.v(j1.f);
                c0840b.U();
                c0840b.u0(c0885y);
                c0840b.J(n);
            } else {
                if (str.equals(strD2)) {
                    c0840b.t(this);
                    return false;
                }
                if (!str.equals(strD)) {
                    c0840b.h(strD2);
                    return c0840b.g(q);
                }
                c0840b.J(n);
                c0840b.P();
                c0840b.u(false);
                C0858k c0858k = B.r;
                c0840b.u0(c0858k);
                c0840b.h0(c0858k);
            }
        } else if (iA == 2) {
            String str2 = ((M) q).e;
            if (str2.equals(strD2)) {
                c0840b.b0();
                b = B.f;
                c0840b.u0(b);
            } else {
                if (com.github.catvod.spider.merge.XU.n.c(str2, A.c)) {
                    c0840b.h(strD2);
                    return c0840b.g(q);
                }
                if (!str2.equals(strD)) {
                    c0840b.t(this);
                    return false;
                }
                if (c0840b.Y(str2)) {
                    c0840b.x(true);
                    if (!str2.equals(c0840b.a().i0())) {
                        c0840b.t(this);
                    }
                    c0840b.c0(str2);
                    c0840b.n();
                    c0840b.d0();
                    c0840b.o0();
                } else {
                    c0840b.t(this);
                }
            }
        } else {
            if (iA != 3) {
                c0840b.h(strD2);
                return c0840b.g(q);
            }
            c0840b.L((J) q);
        }
        return true;
    }
}
