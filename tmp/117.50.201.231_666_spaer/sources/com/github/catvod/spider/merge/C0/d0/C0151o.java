package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0151o extends A {
    C0151o() {
        super("AfterAfterBody", 20, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        C0166w c0166w = A.i;
        if (o.b()) {
            c0125b.F((I) o);
        } else {
            if (o.c() || (o.f() && ((M) o).c.equals("html"))) {
                return c0125b.X(o, c0166w);
            }
            if (A.a(o)) {
                com.github.catvod.spider.merge.C0.c0.l lVarV = c0125b.V("html");
                c0125b.E((H) o);
                c0125b.e.add(lVarV);
                c0125b.e.add(lVarV.k0("body"));
            } else if (!o.d()) {
                c0125b.n(this);
                c0125b.j0(c0166w);
                return c0125b.c(o);
            }
        }
        return true;
    }
}
