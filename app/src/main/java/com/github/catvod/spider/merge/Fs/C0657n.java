package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0657n extends A {
    C0657n() {
        super("AfterFrameset", 19, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        A a;
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
            return false;
        }
        if (o.f() && ((M) o).c.equals("html")) {
            a = A.i;
        } else {
            if (o.e() && ((L) o).c.equals("html")) {
                c0633b.j0(A.x);
                return true;
            }
            if (!o.f() || !((M) o).c.equals("noframes")) {
                if (o.d()) {
                    return true;
                }
                c0633b.n(this);
                return false;
            }
            a = A.f;
        }
        return c0633b.X(o, a);
    }
}
