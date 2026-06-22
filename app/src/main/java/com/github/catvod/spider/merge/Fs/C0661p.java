package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0661p extends A {
    C0661p() {
        super("AfterAfterFrameset", 21, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        if (o.b()) {
            c0633b.F((I) o);
            return true;
        }
        if (o.c() || A.a(o) || (o.f() && ((M) o).c.equals("html"))) {
            return c0633b.X(o, A.i);
        }
        if (o.d()) {
            return true;
        }
        if (o.f() && ((M) o).c.equals("noframes")) {
            return c0633b.X(o, A.f);
        }
        c0633b.n(this);
        return false;
    }
}
