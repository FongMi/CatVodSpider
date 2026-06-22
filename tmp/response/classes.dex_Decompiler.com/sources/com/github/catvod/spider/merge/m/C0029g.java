package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0029g extends B {
    C0029g() {
        super(oZP.d("3C01252E1B"), 13, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        B b = B.m;
        B b2 = B.i;
        boolean zG = q.g();
        String strD = oZP.d("011D");
        if (zG) {
            N n = (N) q;
            String str = n.e;
            if (com.github.catvod.spider.merge.K.b.c(str, A.v)) {
                c0019b.r();
                c0019b.J(n);
                c0019b.u0(B.o);
                c0019b.P();
                return true;
            }
            if (!com.github.catvod.spider.merge.K.b.c(str, A.D)) {
                return c0019b.f0(q, b2);
            }
            if (c0019b.h(strD)) {
                return c0019b.g(q);
            }
            return false;
        }
        if (!q.f()) {
            return c0019b.f0(q, b2);
        }
        String str2 = ((M) q).e;
        if (str2.equals(strD)) {
            if (!c0019b.I(str2)) {
                c0019b.t(this);
                return false;
            }
        } else {
            if (str2.equals(oZP.d("010E152D09"))) {
                if (c0019b.h(strD)) {
                    return c0019b.g(q);
                }
                return false;
            }
            if (!com.github.catvod.spider.merge.K.b.c(str2, A.s)) {
                if (!com.github.catvod.spider.merge.K.b.c(str2, A.E)) {
                    return c0019b.f0(q, b2);
                }
                c0019b.t(this);
                return false;
            }
            if (!c0019b.I(str2) || !c0019b.I(strD)) {
                c0019b.t(this);
                return false;
            }
        }
        c0019b.r();
        c0019b.b0();
        c0019b.u0(b);
        return true;
    }
}
