package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0875t extends B {
    C0875t() {
        super(ZrJ.d("3B262D223A2031262A29"), 2, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
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
            return false;
        }
        if (q.g() && ((N) q).e.equals(ZrJ.d("11372621"))) {
            return B.g.d(q, c0840b);
        }
        boolean zG = q.g();
        String strD = ZrJ.d("11262A29");
        if (zG) {
            N n = (N) q;
            if (n.e.equals(strD)) {
                c0840b.r0(c0840b.J(n));
                c0840b.u0(B.d);
                return true;
            }
        }
        if (q.f() && com.github.catvod.spider.merge.XU.n.c(((M) q).e, A.e)) {
            c0840b.j(strD);
            return c0840b.g(q);
        }
        if (q.f()) {
            c0840b.t(this);
            return false;
        }
        c0840b.j(strD);
        return c0840b.g(q);
    }
}
