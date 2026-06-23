package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.b1.C0906c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0983f extends EnumC0969B {
    C0983f() {
        super("InTableBody", 12, null);
    }

    private boolean e(P p, C0975b c0975b) {
        if (!c0975b.G("tbody") && !c0975b.G("thead") && !c0975b.C("tfoot", null)) {
            c0975b.r(this);
            return false;
        }
        c0975b.n();
        c0975b.f(c0975b.a().f0());
        return c0975b.e(p);
    }

    @Override // com.github.catvod.spider.merge.d1.EnumC0969B
    final boolean d(P p, C0975b c0975b) {
        EnumC0969B enumC0969B = EnumC0969B.j;
        int iC = com.github.catvod.spider.merge.y.z.c(p.a);
        if (iC == 1) {
            N n = (N) p;
            String str = n.e;
            if (!str.equals("tr")) {
                if (!C0906c.c(str, C0968A.v)) {
                    return C0906c.c(str, C0968A.B) ? e(p, c0975b) : c0975b.d0(p, enumC0969B);
                }
                c0975b.r(this);
                c0975b.h("tr");
                return c0975b.e(n);
            }
            c0975b.n();
            c0975b.H(n);
            c0975b.s0(EnumC0969B.o);
        } else {
            if (iC != 2) {
                return c0975b.d0(p, enumC0969B);
            }
            String str2 = ((M) p).e;
            if (!C0906c.c(str2, C0968A.H)) {
                if (str2.equals("table")) {
                    return e(p, c0975b);
                }
                if (!C0906c.c(str2, C0968A.C)) {
                    return c0975b.d0(p, enumC0969B);
                }
                c0975b.r(this);
                return false;
            }
            if (!c0975b.G(str2)) {
                c0975b.r(this);
                return false;
            }
            c0975b.n();
            c0975b.Z();
            c0975b.s0(enumC0969B);
        }
        return true;
    }
}
