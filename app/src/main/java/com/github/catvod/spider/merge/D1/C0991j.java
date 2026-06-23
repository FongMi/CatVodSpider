package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0991j extends EnumC0969B {
    C0991j() {
        super("InSelectInTable", 16, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        if (p.g() && C0906c.c(((N) p).e, C0968A.G)) {
            c0975b.r(this);
            c0975b.a0("select");
            c0975b.m0();
            return c0975b.e(p);
        }
        if (p.f()) {
            M m = (M) p;
            if (C0906c.c(m.e, C0968A.G)) {
                c0975b.r(this);
                if (!c0975b.G(m.e)) {
                    return false;
                }
                c0975b.a0("select");
                c0975b.m0();
                return c0975b.e(p);
            }
        }
        return c0975b.d0(p, EnumC0969B.q);
    }
}
