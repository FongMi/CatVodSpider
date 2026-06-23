package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0160t extends A {
    C0160t() {
        super("InHead", 3, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        A a;
        C0168x c0168x = A.j;
        if (A.a(o)) {
            c0125b.E((H) o);
            return true;
        }
        int iA = com.github.catvod.spider.merge.C0.l.a.a(o.a);
        if (iA == 0) {
            c0125b.n(this);
            return false;
        }
        if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals("html")) {
                return A.i.d(o, c0125b);
            }
            if (com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.a)) {
                com.github.catvod.spider.merge.C0.c0.l lVarG = c0125b.G(m);
                if (str.equals("base") && lVarG.o("href")) {
                    c0125b.Q(lVarG);
                }
            } else if (str.equals("meta")) {
                c0125b.G(m);
            } else if (str.equals("title")) {
                c0125b.c.u(h1.e);
                c0125b.P();
                c0125b.j0(c0168x);
                c0125b.D(m);
            } else if (com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.b)) {
                A.b(m, c0125b);
            } else if (str.equals("noscript")) {
                c0125b.D(m);
                a = A.g;
                c0125b.j0(a);
            } else {
                if (!str.equals("script")) {
                    if (str.equals("head")) {
                        c0125b.n(this);
                        return false;
                    }
                    c0125b.d("head");
                    return c0125b.c(o);
                }
                c0125b.c.u(h1.h);
                c0125b.P();
                c0125b.j0(c0168x);
                c0125b.D(m);
            }
        } else if (iA == 2) {
            String str2 = ((L) o).c;
            if (!str2.equals("head")) {
                if (com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.c)) {
                    c0125b.d("head");
                    return c0125b.c(o);
                }
                c0125b.n(this);
                return false;
            }
            c0125b.U();
            a = A.h;
            c0125b.j0(a);
        } else {
            if (iA != 3) {
                c0125b.d("head");
                return c0125b.c(o);
            }
            c0125b.F((I) o);
        }
        return true;
    }
}
