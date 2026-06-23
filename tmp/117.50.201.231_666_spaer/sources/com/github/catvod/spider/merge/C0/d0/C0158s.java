package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0158s extends A {
    C0158s() {
        super("BeforeHead", 2, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        if (A.a(o)) {
            c0125b.E((H) o);
        } else {
            if (!o.b()) {
                if (o.c()) {
                    c0125b.n(this);
                    return false;
                }
                if (o.f() && ((M) o).c.equals("html")) {
                    return A.i.d(o, c0125b);
                }
                if (o.f()) {
                    M m = (M) o;
                    if (m.c.equals("head")) {
                        c0125b.h0(c0125b.D(m));
                        c0125b.j0(A.f);
                    }
                }
                if (o.e() && com.github.catvod.spider.merge.C0.b0.b.b(((L) o).c, C0172z.e)) {
                    c0125b.f("head");
                    return c0125b.c(o);
                }
                if (o.e()) {
                    c0125b.n(this);
                    return false;
                }
                c0125b.f("head");
                return c0125b.c(o);
            }
            c0125b.F((I) o);
        }
        return true;
    }
}
