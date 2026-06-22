package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0653l extends A {
    C0653l() {
        super("InFrameset", 18, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.A
    final boolean d(O o, C0633b c0633b) {
        M m;
        A a;
        if (A.a(o)) {
            c0633b.E((H) o);
        } else if (o.b()) {
            c0633b.F((I) o);
        } else {
            if (o.c()) {
                c0633b.n(this);
                return false;
            }
            if (o.f()) {
                m = (M) o;
                String str = m.c;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c0633b.D(m);
                        break;
                    case "html":
                        a = A.i;
                        break;
                    case "frame":
                        c0633b.G(m);
                        break;
                    case "noframes":
                        a = A.f;
                        break;
                    default:
                        c0633b.n(this);
                        break;
                }
                return false;
            }
            if (o.e() && ((L) o).c.equals("frameset")) {
                if (c0633b.a().d0().equals("html")) {
                    c0633b.n(this);
                    return false;
                }
                c0633b.U();
                if (!c0633b.a().d0().equals("frameset")) {
                    c0633b.j0(A.v);
                }
            } else {
                if (!o.d()) {
                    c0633b.n(this);
                    return false;
                }
                if (!c0633b.a().d0().equals("html")) {
                    c0633b.n(this);
                }
            }
        }
        return true;
    }
}
