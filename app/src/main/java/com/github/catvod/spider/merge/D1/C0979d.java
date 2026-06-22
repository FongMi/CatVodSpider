package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0979d extends EnumC0969B {
    C0979d() {
        super("InCaption", 10, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        if (p.f()) {
            M m = (M) p;
            if (m.e.equals("caption")) {
                if (!c0975b.G(m.e)) {
                    c0975b.r(this);
                    return false;
                }
                c0975b.v(false);
                if (!c0975b.b("caption")) {
                    c0975b.r(this);
                }
                c0975b.a0("caption");
                c0975b.l();
                c0975b.s0(EnumC0969B.j);
                return true;
            }
        }
        if ((p.g() && C0906c.c(((N) p).e, C0968A.y)) || (p.f() && ((M) p).e.equals("table"))) {
            c0975b.r(this);
            if (c0975b.f("caption")) {
                return c0975b.e(p);
            }
            return true;
        }
        if (!p.f() || !C0906c.c(((M) p).e, C0968A.J)) {
            return c0975b.d0(p, EnumC0969B.h);
        }
        c0975b.r(this);
        return false;
    }
}
