package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0143k extends A {
    C0143k() {
        super("AfterBody", 17, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        C0166w c0166w = A.i;
        if (A.a(o)) {
            c0125b.E((H) o);
        } else if (o.b()) {
            c0125b.F((I) o);
        } else {
            if (o.c()) {
                c0125b.n(this);
                return false;
            }
            if (o.f() && ((M) o).c.equals("html")) {
                return c0125b.X(o, c0166w);
            }
            if (o.e() && ((L) o).c.equals("html")) {
                c0125b.getClass();
                c0125b.j0(A.w);
            } else if (!o.d()) {
                c0125b.n(this);
                c0125b.j0(c0166w);
                return c0125b.c(o);
            }
        }
        return true;
    }
}
