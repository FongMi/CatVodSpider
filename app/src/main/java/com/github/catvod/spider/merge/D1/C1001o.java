package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C1001o extends EnumC0969B {
    C1001o() {
        super("AfterFrameset", 20, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        EnumC0969B enumC0969B;
        if (EnumC0969B.a(p)) {
            c0975b.I((I) p);
            return true;
        }
        if (p.c()) {
            c0975b.J((J) p);
            return true;
        }
        if (p.d()) {
            c0975b.r(this);
            return false;
        }
        if (p.g() && ((N) p).e.equals("html")) {
            enumC0969B = EnumC0969B.h;
        } else {
            if (p.f() && ((M) p).e.equals("html")) {
                c0975b.s0(EnumC0969B.x);
                return true;
            }
            if (!p.g() || !((N) p).e.equals("noframes")) {
                if (p.e()) {
                    return true;
                }
                c0975b.r(this);
                return false;
            }
            enumC0969B = EnumC0969B.e;
        }
        return c0975b.d0(p, enumC0969B);
    }
}
