package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0659o extends A {
    C0659o() {
        super("AfterAfterBody", 20, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        C0674w c0674w = A.i;
        if (o.b()) {
            c0633b.F((I) o);
            return true;
        }
        if (o.c() || (o.f() && ((M) o).c.equals("html"))) {
            return c0633b.X(o, c0674w);
        }
        if (A.a(o)) {
            com.github.catvod.spider.merge.Em.l lVarV = c0633b.V("html");
            c0633b.E((H) o);
            c0633b.e.add(lVarV);
            c0633b.e.add(lVarV.k0("body"));
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
