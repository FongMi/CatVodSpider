package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0678y extends A {
    C0678y() {
        super("InTable", 8, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        A a;
        if (o.a()) {
            c0633b.R();
            c0633b.P();
            c0633b.j0(A.l);
            return c0633b.c(o);
        }
        if (o.b()) {
            c0633b.F((I) o);
            return true;
        }
        if (o.c()) {
            c0633b.n(this);
            return false;
        }
        if (!o.f()) {
            if (!o.e()) {
                if (!o.d()) {
                    return e(o, c0633b);
                }
                if (c0633b.a().d0().equals("html")) {
                    c0633b.n(this);
                }
                return true;
            }
            String str = ((L) o).c;
            if (!str.equals("table")) {
                if (!com.github.catvod.spider.merge.Dw.e.b(str, C0680z.B)) {
                    return e(o, c0633b);
                }
                c0633b.n(this);
                return false;
            }
            if (!c0633b.B(str)) {
                c0633b.n(this);
                return false;
            }
            c0633b.V("table");
            c0633b.e0();
            return true;
        }
        M m = (M) o;
        String str2 = m.c;
        if (str2.equals("caption")) {
            c0633b.l();
            c0633b.J();
            c0633b.D(m);
            a = A.m;
        } else if (str2.equals("colgroup")) {
            c0633b.l();
            c0633b.D(m);
            a = A.n;
        } else {
            if (str2.equals("col")) {
                c0633b.f("colgroup");
                return c0633b.c(o);
            }
            if (!com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.u)) {
                if (com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.v)) {
                    c0633b.f("tbody");
                    return c0633b.c(o);
                }
                if (str2.equals("table")) {
                    c0633b.n(this);
                    if (c0633b.d("table")) {
                        return c0633b.c(o);
                    }
                } else {
                    if (com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.w)) {
                        return c0633b.X(o, A.f);
                    }
                    if (str2.equals("input")) {
                        if (!m.r() || !m.j.j("type").equalsIgnoreCase("hidden")) {
                            return e(o, c0633b);
                        }
                        c0633b.G(m);
                    } else {
                        if (!str2.equals("form")) {
                            return e(o, c0633b);
                        }
                        c0633b.n(this);
                        if (c0633b.s() != null) {
                            return false;
                        }
                        c0633b.H(m, false);
                    }
                }
                return true;
            }
            c0633b.l();
            c0633b.D(m);
            a = A.o;
        }
        c0633b.j0(a);
        return true;
    }

    final boolean e(O o, C0633b c0633b) {
        C0674w c0674w = A.i;
        c0633b.n(this);
        if (!com.github.catvod.spider.merge.Dw.e.b(c0633b.a().d0(), C0680z.C)) {
            return c0633b.X(o, c0674w);
        }
        c0633b.g0(true);
        boolean zX = c0633b.X(o, c0674w);
        c0633b.g0(false);
        return zX;
    }
}
