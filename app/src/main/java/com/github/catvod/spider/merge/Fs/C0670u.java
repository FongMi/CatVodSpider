package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0670u extends A {
    C0670u() {
        super("InHeadNoscript", 4, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        H h;
        C0668t c0668t = A.f;
        if (o.c()) {
            c0633b.n(this);
        } else {
            if (o.f() && ((M) o).c.equals("html")) {
                return c0633b.X(o, A.i);
            }
            if (!o.e() || !((L) o).c.equals("noscript")) {
                if (A.a(o) || o.b() || (o.f() && com.github.catvod.spider.merge.Dw.e.b(((M) o).c, C0680z.f))) {
                    return c0633b.X(o, c0668t);
                }
                if (o.e() && ((L) o).c.equals("br")) {
                    c0633b.n(this);
                    h = new H();
                } else {
                    if ((o.f() && com.github.catvod.spider.merge.Dw.e.b(((M) o).c, C0680z.K)) || o.e()) {
                        c0633b.n(this);
                        return false;
                    }
                    c0633b.n(this);
                    h = new H();
                }
                h.i(o.toString());
                c0633b.E(h);
                return true;
            }
            c0633b.U();
            c0633b.j0(c0668t);
        }
        return true;
    }
}
