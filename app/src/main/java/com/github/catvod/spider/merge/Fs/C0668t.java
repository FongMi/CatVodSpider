package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0668t extends A {
    C0668t() {
        super("InHead", 3, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        A a;
        C0676x c0676x = A.j;
        if (A.a(o)) {
            c0633b.E((H) o);
            return true;
        }
        int iA = com.github.catvod.spider.merge.Dw.h.a(o.a);
        if (iA == 0) {
            c0633b.n(this);
            return false;
        }
        if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals("html")) {
                return A.i.d(o, c0633b);
            }
            if (com.github.catvod.spider.merge.Dw.e.b(str, C0680z.a)) {
                com.github.catvod.spider.merge.Em.l lVarG = c0633b.G(m);
                if (str.equals("base") && lVarG.o("href")) {
                    c0633b.Q(lVarG);
                }
            } else if (str.equals("meta")) {
                c0633b.G(m);
            } else if (str.equals("title")) {
                c0633b.c.u(h1.e);
                c0633b.P();
                c0633b.j0(c0676x);
                c0633b.D(m);
            } else if (com.github.catvod.spider.merge.Dw.e.b(str, C0680z.b)) {
                A.b(m, c0633b);
            } else if (str.equals("noscript")) {
                c0633b.D(m);
                a = A.g;
                c0633b.j0(a);
            } else {
                if (!str.equals("script")) {
                    if (str.equals("head")) {
                        c0633b.n(this);
                        return false;
                    }
                    c0633b.d("head");
                    return c0633b.c(o);
                }
                c0633b.c.u(h1.h);
                c0633b.P();
                c0633b.j0(c0676x);
                c0633b.D(m);
            }
        } else if (iA == 2) {
            String str2 = ((L) o).c;
            if (!str2.equals("head")) {
                if (com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.c)) {
                    c0633b.d("head");
                    return c0633b.c(o);
                }
                c0633b.n(this);
                return false;
            }
            c0633b.U();
            a = A.h;
            c0633b.j0(a);
        } else {
            if (iA != 3) {
                c0633b.d("head");
                return c0633b.c(o);
            }
            c0633b.F((I) o);
        }
        return true;
    }
}
