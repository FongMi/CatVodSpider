package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1014v extends EnumC0969B {
    C1014v() {
        super("InHeadNoscript", 4, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        I i;
        C1012u c1012u = EnumC0969B.e;
        if (p.d()) {
            c0975b.r(this);
        } else {
            if (p.g() && ((N) p).e.equals("html")) {
                return c0975b.d0(p, EnumC0969B.h);
            }
            if (!p.f() || !((M) p).e.equals("noscript")) {
                if (EnumC0969B.a(p) || p.c() || (p.g() && C0906c.c(((N) p).e, C0968A.f))) {
                    return c0975b.d0(p, c1012u);
                }
                if (p.f() && ((M) p).e.equals("br")) {
                    c0975b.r(this);
                    i = new I();
                } else {
                    if ((p.g() && C0906c.c(((N) p).e, C0968A.I)) || p.f()) {
                        c0975b.r(this);
                        return false;
                    }
                    c0975b.r(this);
                    i = new I();
                }
                i.k(p.toString());
                c0975b.I(i);
                return true;
            }
            c0975b.Z();
            c0975b.s0(c1012u);
        }
        return true;
    }
}
