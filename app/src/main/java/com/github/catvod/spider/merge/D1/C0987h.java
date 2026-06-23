package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0987h extends EnumC0969B {
    C0987h() {
        super("InCell", 14, null);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        C0985g c0985g = EnumC0969B.o;
        C1018x c1018x = EnumC0969B.h;
        if (!p.f()) {
            if (!p.g() || !C0906c.c(((N) p).e, C0968A.y)) {
                return c0975b.d0(p, c1018x);
            }
            if (c0975b.G("td") || c0975b.G("th")) {
                c0975b.f(c0975b.G("td") ? "td" : "th");
                return c0975b.e(p);
            }
            c0975b.r(this);
            return false;
        }
        String str = ((M) p).e;
        if (!C0906c.c(str, C0968A.v)) {
            if (C0906c.c(str, C0968A.w)) {
                c0975b.r(this);
                return false;
            }
            if (!C0906c.c(str, C0968A.x)) {
                return c0975b.d0(p, c1018x);
            }
            if (c0975b.G(str)) {
                c0975b.f(c0975b.G("td") ? "td" : "th");
                return c0975b.e(p);
            }
            c0975b.r(this);
            return false;
        }
        if (!c0975b.G(str)) {
            c0975b.r(this);
            c0975b.s0(c0985g);
            return false;
        }
        c0975b.v(false);
        if (!c0975b.b(str)) {
            c0975b.r(this);
        }
        c0975b.a0(str);
        c0975b.l();
        c0975b.s0(c0985g);
        return true;
    }
}
