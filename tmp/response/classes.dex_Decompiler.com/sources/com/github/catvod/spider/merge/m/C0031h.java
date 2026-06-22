package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0031h extends B {
    C0031h() {
        super(oZP.d("3C0134240039"), 14, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        C0029g c0029g = B.n;
        C0062x c0062x = B.g;
        boolean zF = q.f();
        String strD = oZP.d("0107");
        String strD2 = oZP.d("010B");
        if (!zF) {
            if (!q.g() || !com.github.catvod.spider.merge.K.b.c(((N) q).e, A.y)) {
                return c0019b.f0(q, c0062x);
            }
            if (!c0019b.I(strD2) && !c0019b.I(strD)) {
                c0019b.t(this);
                return false;
            }
            if (c0019b.I(strD2)) {
                strD = strD2;
            }
            c0019b.h(strD);
            return c0019b.g(q);
        }
        String str = ((M) q).e;
        if (com.github.catvod.spider.merge.K.b.c(str, A.v)) {
            if (!c0019b.I(str)) {
                c0019b.t(this);
                c0019b.u0(c0029g);
                return false;
            }
            c0019b.x(false);
            if (!c0019b.b(str)) {
                c0019b.t(this);
            }
            c0019b.c0(str);
            c0019b.n();
            c0019b.u0(c0029g);
            return true;
        }
        if (com.github.catvod.spider.merge.K.b.c(str, A.w)) {
            c0019b.t(this);
            return false;
        }
        if (!com.github.catvod.spider.merge.K.b.c(str, A.x)) {
            return c0019b.f0(q, c0062x);
        }
        if (!c0019b.I(str)) {
            c0019b.t(this);
            return false;
        }
        if (c0019b.I(strD2)) {
            strD = strD2;
        }
        c0019b.h(strD);
        return c0019b.g(q);
    }
}
