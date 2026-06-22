package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0047p extends B {
    C0047p() {
        super(oZP.d("340903241E14131B12332E3A1116"), 21, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        if (q.c()) {
            c0019b.L((J) q);
            return true;
        }
        if (q.d() || (q.g() && ((N) q).e.equals(oZP.d("1D1B1A2D")))) {
            return c0019b.f0(q, B.g);
        }
        if (B.a(q)) {
            c0019b.K((I) q);
            return true;
        }
        if (q.e()) {
            return true;
        }
        c0019b.t(this);
        c0019b.n0();
        return c0019b.g(q);
    }
}
