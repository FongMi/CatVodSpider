package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0133f extends A {
    C0133f() {
        super("InTableBody", 12, null);
    }

    private boolean e(O o, C0125b c0125b) {
        if (!c0125b.B("tbody") && !c0125b.B("thead") && !c0125b.x("tfoot", null)) {
            c0125b.n(this);
            return false;
        }
        c0125b.k();
        c0125b.d(c0125b.a().d0());
        return c0125b.c(o);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        A a = A.k;
        int iA = com.github.catvod.spider.merge.C0.l.a.a(o.a);
        if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals("template")) {
                c0125b.D(m);
            } else {
                if (!str.equals("tr")) {
                    if (!com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.x)) {
                        return com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.D) ? e(o, c0125b) : c0125b.X(o, a);
                    }
                    c0125b.n(this);
                    c0125b.f("tr");
                    return c0125b.c(m);
                }
                c0125b.k();
                c0125b.D(m);
                c0125b.j0(A.p);
            }
        } else {
            if (iA != 2) {
                return c0125b.X(o, a);
            }
            String str2 = ((L) o).c;
            if (!com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.J)) {
                if (str2.equals("table")) {
                    return e(o, c0125b);
                }
                if (!com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.E)) {
                    return c0125b.X(o, a);
                }
                c0125b.n(this);
                return false;
            }
            if (!c0125b.B(str2)) {
                c0125b.n(this);
                return false;
            }
            c0125b.k();
            c0125b.U();
            c0125b.j0(a);
        }
        return true;
    }
}
