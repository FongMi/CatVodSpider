package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0170y extends A {
    C0170y() {
        super("InTable", 8, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        A a;
        if (o.a()) {
            c0125b.R();
            c0125b.P();
            c0125b.j0(A.l);
            return c0125b.c(o);
        }
        if (o.b()) {
            c0125b.F((I) o);
            return true;
        }
        if (o.c()) {
            c0125b.n(this);
            return false;
        }
        if (!o.f()) {
            if (!o.e()) {
                if (!o.d()) {
                    return e(o, c0125b);
                }
                if (c0125b.a().d0().equals("html")) {
                    c0125b.n(this);
                }
                return true;
            }
            String str = ((L) o).c;
            if (!str.equals("table")) {
                if (!com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.B)) {
                    return e(o, c0125b);
                }
                c0125b.n(this);
                return false;
            }
            if (!c0125b.B(str)) {
                c0125b.n(this);
                return false;
            }
            c0125b.V("table");
            c0125b.e0();
            return true;
        }
        M m = (M) o;
        String str2 = m.c;
        if (str2.equals("caption")) {
            c0125b.l();
            c0125b.J();
            c0125b.D(m);
            a = A.m;
        } else if (str2.equals("colgroup")) {
            c0125b.l();
            c0125b.D(m);
            a = A.n;
        } else {
            if (str2.equals("col")) {
                c0125b.f("colgroup");
                return c0125b.c(o);
            }
            if (!com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.u)) {
                if (com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.v)) {
                    c0125b.f("tbody");
                    return c0125b.c(o);
                }
                if (str2.equals("table")) {
                    c0125b.n(this);
                    if (c0125b.d("table")) {
                        return c0125b.c(o);
                    }
                } else {
                    if (com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.w)) {
                        return c0125b.X(o, A.f);
                    }
                    if (str2.equals("input")) {
                        if (!m.r() || !m.j.j("type").equalsIgnoreCase("hidden")) {
                            return e(o, c0125b);
                        }
                        c0125b.G(m);
                    } else {
                        if (!str2.equals("form")) {
                            return e(o, c0125b);
                        }
                        c0125b.n(this);
                        if (c0125b.s() != null) {
                            return false;
                        }
                        c0125b.H(m, false);
                    }
                }
                return true;
            }
            c0125b.l();
            c0125b.D(m);
            a = A.o;
        }
        c0125b.j0(a);
        return true;
    }

    final boolean e(O o, C0125b c0125b) {
        C0166w c0166w = A.i;
        c0125b.n(this);
        if (!com.github.catvod.spider.merge.C0.b0.b.b(c0125b.a().d0(), C0172z.C)) {
            return c0125b.X(o, c0166w);
        }
        c0125b.g0(true);
        boolean zX = c0125b.X(o, c0166w);
        c0125b.g0(false);
        return zX;
    }
}
