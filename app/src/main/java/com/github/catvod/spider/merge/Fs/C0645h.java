package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0645h extends A {
    C0645h() {
        super("InCell", 14, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        C0643g c0643g = A.p;
        C0674w c0674w = A.i;
        if (!o.e()) {
            if (!o.f() || !com.github.catvod.spider.merge.Dw.e.b(((M) o).c, C0680z.A)) {
                return c0633b.X(o, c0674w);
            }
            if (c0633b.B("td") || c0633b.B("th")) {
                c0633b.d(c0633b.B("td") ? "td" : "th");
                return c0633b.c(o);
            }
            c0633b.n(this);
            return false;
        }
        String str = ((L) o).c;
        if (com.github.catvod.spider.merge.Dw.e.b(str, C0680z.x)) {
            if (!c0633b.B(str)) {
                c0633b.n(this);
                c0633b.j0(c0643g);
                return false;
            }
            if (!c0633b.a().d0().equals(str)) {
                c0633b.n(this);
            }
            c0633b.V(str);
            c0633b.i();
            c0633b.j0(c0643g);
            return true;
        }
        if (com.github.catvod.spider.merge.Dw.e.b(str, C0680z.y)) {
            c0633b.n(this);
            return false;
        }
        if (!com.github.catvod.spider.merge.Dw.e.b(str, C0680z.z)) {
            return c0633b.X(o, c0674w);
        }
        if (c0633b.B(str)) {
            c0633b.d(c0633b.B("td") ? "td" : "th");
            return c0633b.c(o);
        }
        c0633b.n(this);
        return false;
    }
}
