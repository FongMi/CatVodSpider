package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0243n extends B {
    C0243n() {
        super("InFrameset", 19, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.B
    final boolean d(Q q, C0219b c0219b) {
        N n;
        B b;
        if (B.a(q)) {
            c0219b.K((I) q);
        } else if (q.c()) {
            c0219b.L((J) q);
        } else {
            if (q.d()) {
                c0219b.t(this);
                return false;
            }
            if (q.g()) {
                n = (N) q;
                String str = n.e;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c0219b.J(n);
                        break;
                    case "html":
                        b = B.g;
                        break;
                    case "frame":
                        c0219b.M(n);
                        break;
                    case "noframes":
                        b = B.d;
                        break;
                    default:
                        c0219b.t(this);
                        break;
                }
                return false;
            }
            if (q.f() && ((M) q).e.equals("frameset")) {
                if (c0219b.b("html")) {
                    c0219b.t(this);
                    return false;
                }
                c0219b.b0();
                if (!c0219b.b("frameset")) {
                    c0219b.u0(B.u);
                }
            } else {
                if (!q.e()) {
                    c0219b.t(this);
                    return false;
                }
                if (!c0219b.b("html")) {
                    c0219b.t(this);
                }
            }
        }
        return true;
    }
}
