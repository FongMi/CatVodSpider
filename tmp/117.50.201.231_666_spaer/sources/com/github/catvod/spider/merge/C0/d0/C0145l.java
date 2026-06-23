package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.d0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0145l extends A {
    C0145l() {
        super("InFrameset", 18, null);
    }

    @Override // com.github.catvod.spider.merge.C0.d0.A
    final boolean d(O o, C0125b c0125b) {
        M m;
        A a;
        if (A.a(o)) {
            c0125b.E((H) o);
        } else if (o.b()) {
            c0125b.F((I) o);
        } else {
            if (o.c()) {
                c0125b.n(this);
                return false;
            }
            if (o.f()) {
                m = (M) o;
                String str = m.c;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c0125b.D(m);
                        break;
                    case "html":
                        a = A.i;
                        break;
                    case "frame":
                        c0125b.G(m);
                        break;
                    case "noframes":
                        a = A.f;
                        break;
                    default:
                        c0125b.n(this);
                        return false;
                }
                return c0125b.X(m, a);
            }
            if (o.e() && ((L) o).c.equals("frameset")) {
                if (c0125b.a().d0().equals("html")) {
                    c0125b.n(this);
                    return false;
                }
                c0125b.U();
                if (!c0125b.a().d0().equals("frameset")) {
                    c0125b.j0(A.v);
                }
            } else {
                if (!o.d()) {
                    c0125b.n(this);
                    return false;
                }
                if (!c0125b.a().d0().equals("html")) {
                    c0125b.n(this);
                }
            }
        }
        return true;
    }
}
