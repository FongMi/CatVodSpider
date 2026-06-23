package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1016w extends EnumC0969B {
    C1016w() {
        super("AfterHead", 5, null);
    }

    private boolean e(P p, C0975b c0975b) {
        c0975b.h("body");
        c0975b.s(true);
        return c0975b.e(p);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        C1012u c1012u = EnumC0969B.e;
        C1018x c1018x = EnumC0969B.h;
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
            return true;
        }
        if (p.g()) {
            N n = (N) p;
            String str = n.e;
            if (str.equals("html")) {
                return c0975b.d0(p, c1018x);
            }
            if (str.equals("body")) {
                c0975b.H(n);
                c0975b.s(false);
                c0975b.s0(c1018x);
                return true;
            }
            if (str.equals("frameset")) {
                c0975b.H(n);
                c0975b.s0(EnumC0969B.u);
                return true;
            }
            if (C0906c.c(str, C0968A.g)) {
                c0975b.r(this);
                com.github.catvod.spider.merge.c1.m mVarZ = c0975b.z();
                c0975b.e.add(mVarZ);
                c0975b.d0(p, c1012u);
                c0975b.j0(mVarZ);
                return true;
            }
            if (str.equals("head")) {
                c0975b.r(this);
                return false;
            }
        } else if (p.f()) {
            String str2 = ((M) p).e;
            if (!C0906c.c(str2, C0968A.d)) {
                if (str2.equals("template")) {
                    c0975b.d0(p, c1012u);
                    return true;
                }
                c0975b.r(this);
                return false;
            }
        }
        e(p, c0975b);
        return true;
    }
}
