package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0672v extends A {
    C0672v() {
        super("AfterHead", 5, null);
    }

    private boolean e(O o, C0633b c0633b) {
        c0633b.f("body");
        c0633b.o(true);
        return c0633b.c(o);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        C0674w c0674w = A.i;
        if (A.a(o)) {
            c0633b.E((H) o);
            return true;
        }
        if (o.b()) {
            c0633b.F((I) o);
            return true;
        }
        if (o.c()) {
            c0633b.n(this);
            return true;
        }
        if (o.f()) {
            M m = (M) o;
            String str = m.c;
            if (str.equals("html")) {
                return c0633b.X(o, c0674w);
            }
            if (str.equals("body")) {
                c0633b.D(m);
                c0633b.o(false);
                c0633b.j0(c0674w);
                return true;
            }
            if (str.equals("frameset")) {
                c0633b.D(m);
                c0633b.j0(A.u);
                return true;
            }
            if (com.github.catvod.spider.merge.Dw.e.b(str, C0680z.g)) {
                c0633b.n(this);
                com.github.catvod.spider.merge.Em.l lVarU = c0633b.u();
                c0633b.e.add(lVarU);
                c0633b.X(o, A.f);
                c0633b.c0(lVarU);
                return true;
            }
            if (str.equals("head")) {
                c0633b.n(this);
                return false;
            }
        } else if (o.e() && !com.github.catvod.spider.merge.Dw.e.b(((L) o).c, C0680z.d)) {
            c0633b.n(this);
            return false;
        }
        e(o, c0633b);
        return true;
    }
}
