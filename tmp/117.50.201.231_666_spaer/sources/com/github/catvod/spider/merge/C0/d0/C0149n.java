package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0149n extends A {
    C0149n() {
        super("AfterFrameset", 19, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        A a;
        if (A.a(o)) {
            c0125b.E((H) o);
        } else {
            if (!o.b()) {
                if (o.c()) {
                    c0125b.n(this);
                    return false;
                }
                if (o.f() && ((M) o).c.equals("html")) {
                    a = A.i;
                } else if (o.e() && ((L) o).c.equals("html")) {
                    c0125b.j0(A.x);
                } else if (o.f() && ((M) o).c.equals("noframes")) {
                    a = A.f;
                } else if (!o.d()) {
                    c0125b.n(this);
                    return false;
                }
                return c0125b.X(o, a);
            }
            c0125b.F((I) o);
        }
        return true;
    }
}
