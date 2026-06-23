package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0666s extends A {
    C0666s() {
        super("BeforeHead", 2, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        if (A.a(o)) {
            c0633b.E((H) o);
            return true;
        }
        if (o.b()) {
            c0633b.F((I) o);
            return true;
        }
        if (o.c()) {
            c0633b.n(this);
            return false;
        }
        if (o.f() && ((M) o).c.equals("html")) {
            return A.i.d(o, c0633b);
        }
        if (o.f()) {
            M m = (M) o;
            if (m.c.equals("head")) {
                c0633b.h0(c0633b.D(m));
                c0633b.j0(A.f);
                return true;
            }
        }
        if (o.e() && com.github.catvod.spider.merge.Dw.e.b(((L) o).c, C0680z.e)) {
            c0633b.f("head");
            return c0633b.c(o);
        }
        if (o.e()) {
            c0633b.n(this);
            return false;
        }
        c0633b.f("head");
        return c0633b.c(o);
    }
}
