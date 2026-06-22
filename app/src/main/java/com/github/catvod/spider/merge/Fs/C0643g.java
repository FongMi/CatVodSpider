package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0643g extends A {
    C0643g() {
        super("InRow", 13, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        C0641f c0641f = A.o;
        C0678y c0678y = A.k;
        if (o.f()) {
            M m = (M) o;
            String str = m.c;
            if (str.equals("template")) {
                c0633b.D(m);
                return true;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(str, C0680z.x)) {
                c0633b.m();
                c0633b.D(m);
                c0633b.j0(A.q);
                c0633b.J();
                return true;
            }
            if (!com.github.catvod.spider.merge.Dw.e.b(str, C0680z.F)) {
                return c0633b.X(o, c0678y);
            }
            if (c0633b.d("tr")) {
                return c0633b.c(o);
            }
            return false;
        }
        if (!o.e()) {
            return c0633b.X(o, c0678y);
        }
        String str2 = ((L) o).c;
        if (str2.equals("tr")) {
            if (!c0633b.B(str2)) {
                c0633b.n(this);
                return false;
            }
        } else {
            if (str2.equals("table")) {
                if (c0633b.d("tr")) {
                    return c0633b.c(o);
                }
                return false;
            }
            if (!com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.u)) {
                if (!com.github.catvod.spider.merge.Dw.e.b(str2, C0680z.G)) {
                    return c0633b.X(o, c0678y);
                }
                c0633b.n(this);
                return false;
            }
            if (!c0633b.B(str2) || !c0633b.B("tr")) {
                c0633b.n(this);
                return false;
            }
        }
        c0633b.m();
        c0633b.U();
        c0633b.j0(c0641f);
        return true;
    }
}
