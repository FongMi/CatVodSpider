package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0985g extends EnumC0969B {
    C0985g() {
        super("InRow", 13, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        C0983f c0983f = EnumC0969B.n;
        C1022z c1022z = EnumC0969B.j;
        if (p.g()) {
            N n = (N) p;
            String str = n.e;
            if (C0906c.c(str, C0968A.v)) {
                c0975b.p();
                c0975b.H(n);
                c0975b.s0(EnumC0969B.p);
                c0975b.N();
                return true;
            }
            if (!C0906c.c(str, C0968A.D)) {
                return c0975b.d0(p, c1022z);
            }
            if (c0975b.f("tr")) {
                return c0975b.e(p);
            }
            return false;
        }
        if (!p.f()) {
            return c0975b.d0(p, c1022z);
        }
        String str2 = ((M) p).e;
        if (str2.equals("tr")) {
            if (!c0975b.G(str2)) {
                c0975b.r(this);
                return false;
            }
        } else {
            if (str2.equals("table")) {
                if (c0975b.f("tr")) {
                    return c0975b.e(p);
                }
                return false;
            }
            if (!C0906c.c(str2, C0968A.s)) {
                if (!C0906c.c(str2, C0968A.E)) {
                    return c0975b.d0(p, c1022z);
                }
                c0975b.r(this);
                return false;
            }
            if (!c0975b.G(str2) || !c0975b.G("tr")) {
                c0975b.r(this);
                return false;
            }
        }
        c0975b.p();
        c0975b.Z();
        c0975b.s0(c0983f);
        return true;
    }
}
