package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0064y extends B {
    C0064y() {
        super(oZP.d("210A0F35"), 7, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        if (q.b()) {
            c0019b.K((I) q);
            return true;
        }
        if (q.e()) {
            c0019b.t(this);
            c0019b.b0();
            c0019b.u0(c0019b.a0());
            return c0019b.g(q);
        }
        if (!q.f()) {
            return true;
        }
        c0019b.b0();
        c0019b.u0(c0019b.a0());
        return true;
    }
}
