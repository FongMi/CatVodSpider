package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0999n extends EnumC0969B {
    C0999n() {
        super("InFrameset", 19, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        N n;
        EnumC0969B enumC0969B;
        if (EnumC0969B.a(p)) {
            c0975b.I((I) p);
        } else if (p.c()) {
            c0975b.J((J) p);
        } else {
            if (p.d()) {
                c0975b.r(this);
                return false;
            }
            if (p.g()) {
                n = (N) p;
                String str = n.e;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c0975b.H(n);
                        break;
                    case "html":
                        enumC0969B = EnumC0969B.h;
                        break;
                    case "frame":
                        c0975b.K(n);
                        break;
                    case "noframes":
                        enumC0969B = EnumC0969B.e;
                        break;
                    default:
                        c0975b.r(this);
                        break;
                }
                return false;
            }
            if (p.f() && ((M) p).e.equals("frameset")) {
                if (c0975b.b("html")) {
                    c0975b.r(this);
                    return false;
                }
                c0975b.Z();
                if (!c0975b.b("frameset")) {
                    c0975b.s0(EnumC0969B.v);
                }
            } else {
                if (!p.e()) {
                    c0975b.r(this);
                    return false;
                }
                if (!c0975b.b("html")) {
                    c0975b.r(this);
                }
            }
        }
        return true;
    }
}
