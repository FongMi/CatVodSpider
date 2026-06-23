package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0881w extends B {
    C0881w() {
        super(ZrJ.d("38253F283A0D1C222F"), 5, null);
    }

    private boolean e(Q q, C0840b c0840b) {
        c0840b.j(ZrJ.d("1B2C2F34"));
        c0840b.u(true);
        return c0840b.g(q);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        C0877u c0877u = B.d;
        C0883x c0883x = B.g;
        if (B.a(q)) {
            c0840b.K((I) q);
            return true;
        }
        if (q.c()) {
            c0840b.L((J) q);
            return true;
        }
        if (q.d()) {
            c0840b.t(this);
            return true;
        }
        if (q.g()) {
            N n = (N) q;
            String str = n.e;
            if (str.equals(ZrJ.d("11372621"))) {
                return c0840b.f0(q, c0883x);
            }
            if (str.equals(ZrJ.d("1B2C2F34"))) {
                c0840b.J(n);
                c0840b.u(false);
                c0840b.u0(c0883x);
                return true;
            }
            if (str.equals(ZrJ.d("1F312A202D361C37"))) {
                c0840b.J(n);
                c0840b.u0(B.t);
                return true;
            }
            if (com.github.catvod.spider.merge.XU.n.c(str, A.g)) {
                c0840b.t(this);
                com.github.catvod.spider.merge.UY.m mVarB = c0840b.B();
                c0840b.e.add(mVarB);
                c0840b.f0(q, c0877u);
                c0840b.l0(mVarB);
                return true;
            }
            if (str.equals(ZrJ.d("11262A29"))) {
                c0840b.t(this);
                return false;
            }
        } else if (q.f()) {
            String str2 = ((M) q).e;
            if (!com.github.catvod.spider.merge.XU.n.c(str2, A.d)) {
                if (str2.equals(ZrJ.d("0D26263D24240D26"))) {
                    c0840b.f0(q, c0877u);
                    return true;
                }
                c0840b.t(this);
                return false;
            }
        }
        e(q, c0840b);
        return true;
    }
}
