package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0162u extends A {
    C0162u() {
        super("InHeadNoscript", 4, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        H h;
        C0160t c0160t = A.f;
        if (o.c()) {
            c0125b.n(this);
        } else {
            if (o.f() && ((M) o).c.equals("html")) {
                return c0125b.X(o, A.i);
            }
            if (!o.e() || !((L) o).c.equals("noscript")) {
                if (A.a(o) || o.b() || (o.f() && com.github.catvod.spider.merge.C0.b0.b.b(((M) o).c, C0172z.f))) {
                    return c0125b.X(o, c0160t);
                }
                if (o.e() && ((L) o).c.equals("br")) {
                    c0125b.n(this);
                    h = new H();
                } else {
                    if ((o.f() && com.github.catvod.spider.merge.C0.b0.b.b(((M) o).c, C0172z.K)) || o.e()) {
                        c0125b.n(this);
                        return false;
                    }
                    c0125b.n(this);
                    h = new H();
                }
                h.i(o.toString());
                c0125b.E(h);
                return true;
            }
            c0125b.U();
            c0125b.j0(c0160t);
        }
        return true;
    }
}
