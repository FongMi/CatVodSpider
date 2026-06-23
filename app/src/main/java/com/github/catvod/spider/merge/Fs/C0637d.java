package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0637d extends A {
    C0637d() {
        super("InCaption", 10, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        if (o.e()) {
            L l = (L) o;
            if (l.c.equals("caption")) {
                if (!c0633b.B(l.c)) {
                    c0633b.n(this);
                    return false;
                }
                if (!c0633b.a().d0().equals("caption")) {
                    c0633b.n(this);
                }
                c0633b.V("caption");
                c0633b.i();
                c0633b.j0(A.k);
                return true;
            }
        }
        if ((o.f() && com.github.catvod.spider.merge.Dw.e.b(((M) o).c, C0680z.A)) || (o.e() && ((L) o).c.equals("table"))) {
            c0633b.n(this);
            if (c0633b.d("caption")) {
                return c0633b.c(o);
            }
            return true;
        }
        if (!o.e() || !com.github.catvod.spider.merge.Dw.e.b(((L) o).c, C0680z.L)) {
            return c0633b.X(o, A.i);
        }
        c0633b.n(this);
        return false;
    }
}
