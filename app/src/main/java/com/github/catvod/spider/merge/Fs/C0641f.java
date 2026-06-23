package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0641f extends A {
    C0641f() {
        super("InTableBody", 12, null);
    }

    private boolean e(O o, C0633b c0633b) {
        if (!c0633b.B("tbody") && !c0633b.B("thead") && !c0633b.x("tfoot", null)) {
            c0633b.n(this);
            return false;
        }
        c0633b.k();
        c0633b.d(c0633b.a().d0());
        return c0633b.c(o);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        A a = A.k;
        int iA = com.github.catvod.spider.merge.Dw.h.a(o.a);
        if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals("template")) {
                c0633b.D(m);
            } else {
                if (!str.equals("tr")) {
                    if (!com.github.catvod.spider.merge.Dw.e.b(str, C0680z.x)) {
                        return com.github.catvod.spider.merge.Dw.e.b(str, C0680z.D) ? e(o, c0633b) : c0633b.X(o, a);
                    }
                    c0633b.n(this);
                    c0633b.f("tr");
                    return c0633b.c(m);
                }
                c0633b.k();
                c0633b.D(m);
                c0633b.j0(A.p);
            }
        } else {
            if (iA != 2) {
                return c0633b.X(o, a);
            }
            String str2 = ((L) o).c;
            if (!com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.J)) {
                if (str2.equals("table")) {
                    return e(o, c0633b);
                }
                if (!com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.E)) {
                    return c0633b.X(o, a);
                }
                c0633b.n(this);
                return false;
            }
            if (!c0633b.B(str2)) {
                c0633b.n(this);
                return false;
            }
            c0633b.k();
            c0633b.U();
            c0633b.j0(a);
        }
        return true;
    }
}
