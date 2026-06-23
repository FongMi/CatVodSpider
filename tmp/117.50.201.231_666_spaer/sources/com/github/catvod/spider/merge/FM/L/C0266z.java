package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0266z extends B {
    C0266z() {
        super("InTable", 8, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        B b;
        C0256u c0256u = B.d;
        if (!q.b() || !com.github.catvod.spider.merge.FM.J.b.c(c0219b.a().i0(), A.A)) {
            if (q.c()) {
                c0219b.L((J) q);
                return true;
            }
            if (q.d()) {
                c0219b.t(this);
                return false;
            }
            if (!q.g()) {
                if (!q.f()) {
                    if (!q.e()) {
                        e(q, c0219b);
                        return true;
                    }
                    if (c0219b.b("html")) {
                        c0219b.t(this);
                    }
                    return true;
                }
                String str = ((M) q).e;
                if (str.equals("table")) {
                    if (!c0219b.I(str)) {
                        c0219b.t(this);
                        return false;
                    }
                    c0219b.c0("table");
                    c0219b.o0();
                } else {
                    if (com.github.catvod.spider.merge.FM.J.b.c(str, A.z)) {
                        c0219b.t(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        e(q, c0219b);
                        return true;
                    }
                    c0219b.f0(q, c0256u);
                }
                return true;
            }
            N n = (N) q;
            String str2 = n.e;
            if (str2.equals("caption")) {
                c0219b.q();
                c0219b.P();
                c0219b.J(n);
                b = B.k;
            } else if (str2.equals("colgroup")) {
                c0219b.q();
                c0219b.J(n);
                b = B.l;
            } else if (str2.equals("col")) {
                c0219b.q();
                c0219b.j("colgroup");
            } else if (com.github.catvod.spider.merge.FM.J.b.c(str2, A.s)) {
                c0219b.q();
                c0219b.J(n);
                b = B.m;
            } else {
                if (!com.github.catvod.spider.merge.FM.J.b.c(str2, A.t)) {
                    if (str2.equals("table")) {
                        c0219b.t(this);
                        if (!c0219b.I(str2)) {
                            return false;
                        }
                        c0219b.c0(str2);
                        if (c0219b.o0()) {
                            return c0219b.g(q);
                        }
                        c0219b.J(n);
                        return true;
                    }
                    if (com.github.catvod.spider.merge.FM.J.b.c(str2, A.u)) {
                        return c0219b.f0(q, c0256u);
                    }
                    if (str2.equals("input")) {
                        if (!n.u() || !n.n.l("type").equalsIgnoreCase("hidden")) {
                            e(q, c0219b);
                            return true;
                        }
                        c0219b.M(n);
                    } else {
                        if (!str2.equals("form")) {
                            e(q, c0219b);
                            return true;
                        }
                        c0219b.t(this);
                        if (c0219b.z() != null || c0219b.Y("template")) {
                            return false;
                        }
                        c0219b.N(n, false, false);
                    }
                    return true;
                }
                c0219b.q();
                c0219b.j("tbody");
            }
            c0219b.u0(b);
            return true;
        }
        c0219b.W();
        c0219b.U();
        c0219b.u0(B.j);
        return c0219b.g(q);
    }

    final void e(Q q, C0219b c0219b) {
        c0219b.t(this);
        c0219b.q0(true);
        c0219b.f0(q, B.g);
        c0219b.q0(false);
    }
}
