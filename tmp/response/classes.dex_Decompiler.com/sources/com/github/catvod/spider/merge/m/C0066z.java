package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0066z extends B {
    C0066z() {
        super(oZP.d("3C0123200E3910"), 8, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        B b;
        B b2 = B.d;
        if (!q.b() || !com.github.catvod.spider.merge.K.b.c(c0019b.a().i0(), A.A)) {
            if (q.c()) {
                c0019b.L((J) q);
                return true;
            }
            if (q.d()) {
                c0019b.t(this);
                return false;
            }
            boolean zG = q.g();
            String strD = oZP.d("010A1A310034010A");
            String strD2 = oZP.d("010E152D09");
            if (!zG) {
                if (!q.f()) {
                    if (!q.e()) {
                        e(q, c0019b);
                        return true;
                    }
                    if (c0019b.b(oZP.d("1D1B1A2D"))) {
                        c0019b.t(this);
                    }
                    return true;
                }
                String str = ((M) q).e;
                if (str.equals(strD2)) {
                    if (!c0019b.I(str)) {
                        c0019b.t(this);
                        return false;
                    }
                    c0019b.c0(strD2);
                    c0019b.o0();
                } else {
                    if (com.github.catvod.spider.merge.K.b.c(str, A.z)) {
                        c0019b.t(this);
                        return false;
                    }
                    if (!str.equals(strD)) {
                        e(q, c0019b);
                        return true;
                    }
                    c0019b.f0(q, b2);
                }
                return true;
            }
            N n = (N) q;
            String str2 = n.e;
            if (str2.equals(oZP.d("160E0735053A1B"))) {
                c0019b.q();
                c0019b.P();
                c0019b.J(n);
                b = B.k;
            } else {
                String strD3 = oZP.d("16001B261E3A001F");
                if (str2.equals(strD3)) {
                    c0019b.q();
                    c0019b.J(n);
                    b = B.l;
                } else if (str2.equals(oZP.d("16001B"))) {
                    c0019b.q();
                    c0019b.j(strD3);
                } else if (com.github.catvod.spider.merge.K.b.c(str2, A.s)) {
                    c0019b.q();
                    c0019b.J(n);
                    b = B.m;
                } else {
                    if (!com.github.catvod.spider.merge.K.b.c(str2, A.t)) {
                        if (str2.equals(strD2)) {
                            c0019b.t(this);
                            if (!c0019b.I(str2)) {
                                return false;
                            }
                            c0019b.c0(str2);
                            if (c0019b.o0()) {
                                return c0019b.g(q);
                            }
                            c0019b.J(n);
                            return true;
                        }
                        if (com.github.catvod.spider.merge.K.b.c(str2, A.u)) {
                            return c0019b.f0(q, b2);
                        }
                        if (str2.equals(oZP.d("1C01073418"))) {
                            if (!n.u() || !n.n.l(oZP.d("01160724")).equalsIgnoreCase(oZP.d("1D061325093B"))) {
                                e(q, c0019b);
                                return true;
                            }
                            c0019b.M(n);
                        } else {
                            if (!str2.equals(oZP.d("1300052C"))) {
                                e(q, c0019b);
                                return true;
                            }
                            c0019b.t(this);
                            if (c0019b.z() != null || c0019b.Y(strD)) {
                                return false;
                            }
                            c0019b.N(n, false, false);
                        }
                        return true;
                    }
                    c0019b.q();
                    c0019b.j(oZP.d("010D182515"));
                }
            }
            c0019b.u0(b);
            return true;
        }
        c0019b.W();
        c0019b.U();
        c0019b.u0(B.j);
        return c0019b.g(q);
    }

    final void e(Q q, C0019b c0019b) {
        c0019b.t(this);
        c0019b.q0(true);
        c0019b.f0(q, B.g);
        c0019b.q0(false);
    }
}
