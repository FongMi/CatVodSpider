package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C1010t extends EnumC0969B {
    C1010t() {
        super("BeforeHead", 2, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
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
            return EnumC0969B.h.d(p, c0975b);
        }
        if (p.g()) {
            N n = (N) p;
            if (n.e.equals("head")) {
                c0975b.p0(c0975b.H(n));
                c0975b.s0(EnumC0969B.e);
                return true;
            }
        }
        if (p.f() && C0906c.c(((M) p).e, C0968A.e)) {
            c0975b.h("head");
            return c0975b.e(p);
        }
        if (p.f()) {
            c0975b.r(this);
            return false;
        }
        c0975b.h("head");
        return c0975b.e(p);
    }
}
