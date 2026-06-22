package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C1008s extends EnumC0969B {
    C1008s() {
        super("BeforeHtml", 1, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        C1010t c1010t = EnumC0969B.d;
        if (p.d()) {
            c0975b.r(this);
            return false;
        }
        if (p.c()) {
            c0975b.J((J) p);
            return true;
        }
        if (EnumC0969B.a(p)) {
            c0975b.I((I) p);
            return true;
        }
        if (p.g()) {
            N n = (N) p;
            if (n.e.equals("html")) {
                c0975b.H(n);
                c0975b.s0(c1010t);
                return true;
            }
        }
        if (!(p.f() && C0906c.c(((M) p).e, C0968A.e)) && p.f()) {
            c0975b.r(this);
            return false;
        }
        c0975b.P();
        c0975b.s0(c1010t);
        return c0975b.e(p);
    }
}
