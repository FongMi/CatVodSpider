package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0651k extends A {
    C0651k() {
        super("AfterBody", 17, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        C0674w c0674w = A.i;
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
            return c0633b.X(o, c0674w);
        }
        if (o.e() && ((L) o).c.equals("html")) {
            c0633b.getClass();
            c0633b.j0(A.w);
            return true;
        }
        if (o.d()) {
            return true;
        }
        c0633b.n(this);
        c0633b.j0(c0674w);
        return c0633b.c(o);
    }
}
