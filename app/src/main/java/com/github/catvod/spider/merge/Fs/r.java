package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum r extends A {
    r() {
        super("BeforeHtml", 1, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        C0666s c0666s = A.e;
        if (o.c()) {
            c0633b.n(this);
            return false;
        }
        if (o.b()) {
            c0633b.F((I) o);
            return true;
        }
        if (A.a(o)) {
            c0633b.E((H) o);
            return true;
        }
        if (o.f()) {
            M m = (M) o;
            if (m.c.equals("html")) {
                c0633b.D(m);
                c0633b.j0(c0666s);
                return true;
            }
        }
        if (!(o.e() && com.github.catvod.spider.merge.Dw.e.b(((L) o).c, C0680z.e)) && o.e()) {
            c0633b.n(this);
            return false;
        }
        c0633b.L("html");
        c0633b.j0(c0666s);
        return c0633b.c(o);
    }
}
