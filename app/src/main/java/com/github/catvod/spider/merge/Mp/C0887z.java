package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0887z extends B {
    C0887z() {
        super(ZrJ.d("302D1F2C2A291C"), 8, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        B b;
        B b2 = B.d;
        if (!q.b() || !com.github.catvod.spider.merge.XU.n.c(c0840b.a().i0(), A.A)) {
            if (q.c()) {
                c0840b.L((J) q);
                return true;
            }
            if (q.d()) {
                c0840b.t(this);
                return false;
            }
            boolean zG = q.g();
            String strD = ZrJ.d("0D26263D24240D26");
            String strD2 = ZrJ.d("0D2229212D");
            if (!zG) {
                if (!q.f()) {
                    if (!q.e()) {
                        e(q, c0840b);
                        return true;
                    }
                    if (c0840b.b(ZrJ.d("11372621"))) {
                        c0840b.t(this);
                    }
                    return true;
                }
                String str = ((M) q).e;
                if (str.equals(strD2)) {
                    if (!c0840b.I(str)) {
                        c0840b.t(this);
                        return false;
                    }
                    c0840b.c0(strD2);
                    c0840b.o0();
                } else {
                    if (com.github.catvod.spider.merge.XU.n.c(str, A.z)) {
                        c0840b.t(this);
                        return false;
                    }
                    if (!str.equals(strD)) {
                        e(q, c0840b);
                        return true;
                    }
                    c0840b.f0(q, b2);
                }
                return true;
            }
            N n = (N) q;
            String str2 = n.e;
            if (str2.equals(ZrJ.d("1A223B39212A17"))) {
                c0840b.q();
                c0840b.P();
                c0840b.J(n);
                b = B.k;
            } else {
                String strD3 = ZrJ.d("1A2C272A3A2A0C33");
                if (str2.equals(strD3)) {
                    c0840b.q();
                    c0840b.J(n);
                    b = B.l;
                } else if (str2.equals(ZrJ.d("1A2C27"))) {
                    c0840b.q();
                    c0840b.j(strD3);
                } else if (com.github.catvod.spider.merge.XU.n.c(str2, A.s)) {
                    c0840b.q();
                    c0840b.J(n);
                    b = B.m;
                } else {
                    if (!com.github.catvod.spider.merge.XU.n.c(str2, A.t)) {
                        if (str2.equals(strD2)) {
                            c0840b.t(this);
                            if (!c0840b.I(str2)) {
                                return false;
                            }
                            c0840b.c0(str2);
                            if (c0840b.o0()) {
                                return c0840b.g(q);
                            }
                            c0840b.J(n);
                            return true;
                        }
                        if (com.github.catvod.spider.merge.XU.n.c(str2, A.u)) {
                            return c0840b.f0(q, b2);
                        }
                        if (str2.equals(ZrJ.d("102D3B383C"))) {
                            if (!n.u() || !n.n.l(ZrJ.d("0D3A3B28")).equalsIgnoreCase(ZrJ.d("112A2F292D2B"))) {
                                e(q, c0840b);
                                return true;
                            }
                            c0840b.M(n);
                        } else {
                            if (!str2.equals(ZrJ.d("1F2C3920"))) {
                                e(q, c0840b);
                                return true;
                            }
                            c0840b.t(this);
                            if (c0840b.z() != null || c0840b.Y(strD)) {
                                return false;
                            }
                            c0840b.N(n, false, false);
                        }
                        return true;
                    }
                    c0840b.q();
                    c0840b.j(ZrJ.d("0D21242931"));
                }
            }
            c0840b.u0(b);
            return true;
        }
        c0840b.W();
        c0840b.U();
        c0840b.u0(B.j);
        return c0840b.g(q);
    }

    final void e(Q q, C0840b c0840b) {
        c0840b.t(this);
        c0840b.q0(true);
        c0840b.f0(q, B.g);
        c0840b.q0(false);
    }
}
