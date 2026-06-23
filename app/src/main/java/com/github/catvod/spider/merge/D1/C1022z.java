package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1022z extends EnumC0969B {
    C1022z() {
        super("InTable", 8, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        EnumC0969B enumC0969B;
        C1012u c1012u = EnumC0969B.e;
        if (!p.b() || !C0906c.c(c0975b.a().f0(), C0968A.A)) {
            if (p.c()) {
                c0975b.J((J) p);
                return true;
            }
            if (p.d()) {
                c0975b.r(this);
                return false;
            }
            if (!p.g()) {
                if (!p.f()) {
                    if (!p.e()) {
                        e(p, c0975b);
                        return true;
                    }
                    if (c0975b.b("html")) {
                        c0975b.r(this);
                    }
                    return true;
                }
                String str = ((M) p).e;
                if (str.equals("table")) {
                    if (!c0975b.G(str)) {
                        c0975b.r(this);
                        return false;
                    }
                    c0975b.a0("table");
                    c0975b.m0();
                } else {
                    if (C0906c.c(str, C0968A.z)) {
                        c0975b.r(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        e(p, c0975b);
                        return true;
                    }
                    c0975b.d0(p, c1012u);
                }
                return true;
            }
            N n = (N) p;
            String str2 = n.e;
            if (str2.equals("caption")) {
                c0975b.o();
                c0975b.N();
                c0975b.H(n);
                enumC0969B = EnumC0969B.l;
            } else if (str2.equals("colgroup")) {
                c0975b.o();
                c0975b.H(n);
                enumC0969B = EnumC0969B.m;
            } else if (str2.equals("col")) {
                c0975b.o();
                c0975b.h("colgroup");
            } else if (C0906c.c(str2, C0968A.s)) {
                c0975b.o();
                c0975b.H(n);
                enumC0969B = EnumC0969B.n;
            } else {
                if (!C0906c.c(str2, C0968A.t)) {
                    if (str2.equals("table")) {
                        c0975b.r(this);
                        if (!c0975b.G(str2)) {
                            return false;
                        }
                        c0975b.a0(str2);
                        if (c0975b.m0()) {
                            return c0975b.e(p);
                        }
                        c0975b.H(n);
                        return true;
                    }
                    if (C0906c.c(str2, C0968A.u)) {
                        return c0975b.d0(p, c1012u);
                    }
                    if (str2.equals("input")) {
                        if (!n.u() || !n.n.n("type").equalsIgnoreCase("hidden")) {
                            e(p, c0975b);
                            return true;
                        }
                        c0975b.K(n);
                    } else {
                        if (!str2.equals("form")) {
                            e(p, c0975b);
                            return true;
                        }
                        c0975b.r(this);
                        if (c0975b.x() != null || c0975b.W("template")) {
                            return false;
                        }
                        c0975b.L(n, false, false);
                    }
                    return true;
                }
                c0975b.o();
                c0975b.h("tbody");
            }
            c0975b.s0(enumC0969B);
            return true;
        }
        c0975b.U();
        c0975b.S();
        c0975b.s0(EnumC0969B.k);
        return c0975b.e(p);
    }

    final void e(P p, C0975b c0975b) {
        c0975b.r(this);
        c0975b.o0(true);
        c0975b.d0(p, EnumC0969B.h);
        c0975b.o0(false);
    }
}
