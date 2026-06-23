package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0135g extends A {
    C0135g() {
        super("InRow", 13, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        C0133f c0133f = A.o;
        C0170y c0170y = A.k;
        if (o.f()) {
            M m = (M) o;
            String str = m.c;
            if (str.equals("template")) {
                c0125b.D(m);
            } else {
                if (!com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.x)) {
                    if (com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.F)) {
                        return c0125b.d("tr") ? c0125b.c(o) : false;
                    }
                    return c0125b.X(o, c0170y);
                }
                c0125b.m();
                c0125b.D(m);
                c0125b.j0(A.q);
                c0125b.J();
            }
        } else {
            if (!o.e()) {
                return c0125b.X(o, c0170y);
            }
            String str2 = ((L) o).c;
            if (str2.equals("tr")) {
                if (!c0125b.B(str2)) {
                    c0125b.n(this);
                    return false;
                }
            } else {
                if (str2.equals("table")) {
                    if (c0125b.d("tr")) {
                        return c0125b.c(o);
                    }
                    return false;
                }
                if (!com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.u)) {
                    if (!com.github.catvod.spider.merge.C0.b0.b.b(str2, C0172z.G)) {
                        return c0125b.X(o, c0170y);
                    }
                    c0125b.n(this);
                    return false;
                }
                if (!c0125b.B(str2) || !c0125b.B("tr")) {
                    c0125b.n(this);
                    return false;
                }
            }
            c0125b.m();
            c0125b.U();
            c0125b.j0(c0133f);
        }
        return true;
    }
}
