package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0164v extends A {
    C0164v() {
        super("AfterHead", 5, null);
    }

    private boolean e(O o, C0125b c0125b) {
        c0125b.f("body");
        c0125b.o(true);
        return c0125b.c(o);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        C0166w c0166w = A.i;
        if (A.a(o)) {
            c0125b.E((H) o);
        } else if (o.b()) {
            c0125b.F((I) o);
        } else if (o.c()) {
            c0125b.n(this);
        } else {
            if (o.f()) {
                M m = (M) o;
                String str = m.c;
                if (str.equals("html")) {
                    return c0125b.X(o, c0166w);
                }
                if (str.equals("body")) {
                    c0125b.D(m);
                    c0125b.o(false);
                    c0125b.j0(c0166w);
                } else if (str.equals("frameset")) {
                    c0125b.D(m);
                    c0125b.j0(A.u);
                } else if (com.github.catvod.spider.merge.C0.b0.b.b(str, C0172z.g)) {
                    c0125b.n(this);
                    com.github.catvod.spider.merge.C0.c0.l lVarU = c0125b.u();
                    c0125b.e.add(lVarU);
                    c0125b.X(o, A.f);
                    c0125b.c0(lVarU);
                } else if (str.equals("head")) {
                    c0125b.n(this);
                    return false;
                }
            } else if (o.e() && !com.github.catvod.spider.merge.C0.b0.b.b(((L) o).c, C0172z.d)) {
                c0125b.n(this);
                return false;
            }
            e(o, c0125b);
        }
        return true;
    }
}
