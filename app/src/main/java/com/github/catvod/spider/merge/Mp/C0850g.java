package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0850g extends B {
    C0850g() {
        super(ZrJ.d("302D19223F"), 13, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        B b = B.m;
        B b2 = B.i;
        boolean zG = q.g();
        String strD = ZrJ.d("0D31");
        if (zG) {
            N n = (N) q;
            String str = n.e;
            if (com.github.catvod.spider.merge.XU.n.c(str, A.v)) {
                c0840b.r();
                c0840b.J(n);
                c0840b.u0(B.o);
                c0840b.P();
                return true;
            }
            if (!com.github.catvod.spider.merge.XU.n.c(str, A.D)) {
                return c0840b.f0(q, b2);
            }
            if (c0840b.h(strD)) {
                return c0840b.g(q);
            }
            return false;
        }
        if (!q.f()) {
            return c0840b.f0(q, b2);
        }
        String str2 = ((M) q).e;
        if (str2.equals(strD)) {
            if (!c0840b.I(str2)) {
                c0840b.t(this);
                return false;
            }
        } else {
            if (str2.equals(ZrJ.d("0D2229212D"))) {
                if (c0840b.h(strD)) {
                    return c0840b.g(q);
                }
                return false;
            }
            if (!com.github.catvod.spider.merge.XU.n.c(str2, A.s)) {
                if (!com.github.catvod.spider.merge.XU.n.c(str2, A.E)) {
                    return c0840b.f0(q, b2);
                }
                c0840b.t(this);
                return false;
            }
            if (!c0840b.I(str2) || !c0840b.I(strD)) {
                c0840b.t(this);
                return false;
            }
        }
        c0840b.r();
        c0840b.b0();
        c0840b.u0(b);
        return true;
    }
}
