package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0868p extends B {
    C0868p() {
        super(ZrJ.d("38253F283A041F372E3F0A2A1D3A"), 21, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        if (q.c()) {
            c0840b.L((J) q);
            return true;
        }
        if (q.d() || (q.g() && ((N) q).e.equals(ZrJ.d("11372621")))) {
            return c0840b.f0(q, B.g);
        }
        if (B.a(q)) {
            c0840b.K((I) q);
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
