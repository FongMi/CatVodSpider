package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum r extends A {
    r() {
        super("BeforeHtml", 1, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        C0158s c0158s = A.e;
        if (o.c()) {
            c0125b.n(this);
            return false;
        }
        if (o.b()) {
            c0125b.F((I) o);
        } else {
            if (!A.a(o)) {
                if (o.f()) {
                    M m = (M) o;
                    if (m.c.equals("html")) {
                        c0125b.D(m);
                        c0125b.j0(c0158s);
                    }
                }
                if (!(o.e() && com.github.catvod.spider.merge.C0.b0.b.b(((L) o).c, C0172z.e)) && o.e()) {
                    c0125b.n(this);
                    return false;
                }
                c0125b.L("html");
                c0125b.j0(c0158s);
                return c0125b.c(o);
            }
            c0125b.E((H) o);
        }
        return true;
    }
}
