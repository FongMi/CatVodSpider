package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0153p extends A {
    C0153p() {
        super("AfterAfterFrameset", 21, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        if (o.b()) {
            c0125b.F((I) o);
        } else {
            if (o.c() || A.a(o) || (o.f() && ((M) o).c.equals("html"))) {
                return c0125b.X(o, A.i);
            }
            if (!o.d()) {
                if (o.f() && ((M) o).c.equals("noframes")) {
                    return c0125b.X(o, A.f);
                }
                c0125b.n(this);
                return false;
            }
        }
        return true;
    }
}
