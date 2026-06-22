package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C1012u extends EnumC0969B {
    C1012u() {
        super("InHead", 3, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        EnumC0969B enumC0969B;
        C1020y c1020y = EnumC0969B.i;
        if (EnumC0969B.a(p)) {
            c0975b.I((I) p);
            return true;
        }
        int iC = com.github.catvod.spider.merge.y.z.c(p.a);
        if (iC == 0) {
            c0975b.r(this);
            return false;
        }
        if (iC == 1) {
            N n = (N) p;
            String str = n.e;
            if (str.equals("html")) {
                return EnumC0969B.h.d(p, c0975b);
            }
            if (C0906c.c(str, C0968A.a)) {
                com.github.catvod.spider.merge.c1.m mVarK = c0975b.K(n);
                if (str.equals("base") && mVarK.n("href")) {
                    c0975b.T(mVarK);
                }
            } else if (str.equals("meta")) {
                c0975b.K(n);
            } else if (str.equals("title")) {
                c0975b.c.v(i1.d);
                c0975b.S();
                c0975b.s0(c1020y);
                c0975b.H(n);
            } else if (C0906c.c(str, C0968A.b)) {
                EnumC0969B.b(n, c0975b);
            } else if (str.equals("noscript")) {
                c0975b.H(n);
                enumC0969B = EnumC0969B.f;
                c0975b.s0(enumC0969B);
            } else if (str.equals("script")) {
                c0975b.c.v(i1.g);
                c0975b.S();
                c0975b.s0(c1020y);
                c0975b.H(n);
            } else {
                if (str.equals("head")) {
                    c0975b.r(this);
                    return false;
                }
                if (!str.equals("template")) {
                    c0975b.f("head");
                    return c0975b.e(p);
                }
                c0975b.H(n);
                c0975b.N();
                c0975b.s(false);
                C0993k c0993k = EnumC0969B.s;
                c0975b.s0(c0993k);
                c0975b.f0(c0993k);
            }
        } else if (iC == 2) {
            String str2 = ((M) p).e;
            if (str2.equals("head")) {
                c0975b.Z();
                enumC0969B = EnumC0969B.g;
                c0975b.s0(enumC0969B);
            } else {
                if (C0906c.c(str2, C0968A.c)) {
                    c0975b.f("head");
                    return c0975b.e(p);
                }
                if (!str2.equals("template")) {
                    c0975b.r(this);
                    return false;
                }
                if (c0975b.W(str2)) {
                    c0975b.v(true);
                    if (!str2.equals(c0975b.a().f0())) {
                        c0975b.r(this);
                    }
                    c0975b.a0(str2);
                    c0975b.l();
                    c0975b.b0();
                    c0975b.m0();
                } else {
                    c0975b.r(this);
                }
            }
        } else {
            if (iC != 3) {
                c0975b.f("head");
                return c0975b.e(p);
            }
            c0975b.J((J) p);
        }
        return true;
    }
}
