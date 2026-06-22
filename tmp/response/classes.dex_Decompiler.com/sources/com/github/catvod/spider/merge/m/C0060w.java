package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0060w extends B {
    C0060w() {
        super(oZP.d("340903241E1D100E13"), 5, null);
    }

    private boolean e(Q q, C0019b c0019b) {
        c0019b.j(oZP.d("17001338"));
        c0019b.u(true);
        return c0019b.g(q);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        C0056u c0056u = B.d;
        C0062x c0062x = B.g;
        if (B.a(q)) {
            c0019b.K((I) q);
            return true;
        }
        if (q.c()) {
            c0019b.L((J) q);
            return true;
        }
        if (q.d()) {
            c0019b.t(this);
            return true;
        }
        if (q.g()) {
            N n = (N) q;
            String str = n.e;
            if (str.equals(oZP.d("1D1B1A2D"))) {
                return c0019b.f0(q, c0062x);
            }
            if (str.equals(oZP.d("17001338"))) {
                c0019b.J(n);
                c0019b.u(false);
                c0019b.u0(c0062x);
                return true;
            }
            if (str.equals(oZP.d("131D162C0926101B"))) {
                c0019b.J(n);
                c0019b.u0(B.t);
                return true;
            }
            if (com.github.catvod.spider.merge.K.b.c(str, A.g)) {
                c0019b.t(this);
                com.github.catvod.spider.merge.L.m mVarB = c0019b.B();
                c0019b.e.add(mVarB);
                c0019b.f0(q, c0056u);
                c0019b.l0(mVarB);
                return true;
            }
            if (str.equals(oZP.d("1D0A1625"))) {
                c0019b.t(this);
                return false;
            }
        } else if (q.f()) {
            String str2 = ((M) q).e;
            if (!com.github.catvod.spider.merge.K.b.c(str2, A.d)) {
                if (str2.equals(oZP.d("010A1A310034010A"))) {
                    c0019b.f0(q, c0056u);
                    return true;
                }
                c0019b.t(this);
                return false;
            }
        }
        e(q, c0019b);
        return true;
    }
}
