package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0860l extends B {
    C0860l() {
        super(ZrJ.d("38253F283A07162732"), 18, null);
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
        boolean zG = q.g();
        String strD = ZrJ.d("11372621");
        if (zG && ((N) q).e.equals(strD)) {
            return c0840b.f0(q, B.g);
        }
        if (q.f() && ((M) q).e.equals(strD)) {
            c0840b.getClass();
            if (c0840b.Y(strD)) {
                c0840b.c0(strD);
            }
            c0840b.u0(B.v);
            return true;
        }
        if (q.e()) {
            return true;
        }
        c0840b.t(this);
        c0840b.n0();
        return c0840b.g(q);
    }
}
