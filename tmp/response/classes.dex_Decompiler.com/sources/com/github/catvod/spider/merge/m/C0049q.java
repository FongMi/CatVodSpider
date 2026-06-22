package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0049q extends B {
    C0049q() {
        super(oZP.d("340903241E14131B12332A27140212320921"), 22, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        if (q.c()) {
            c0019b.L((J) q);
            return true;
        }
        if (q.d() || B.a(q) || (q.g() && ((N) q).e.equals(oZP.d("1D1B1A2D")))) {
            return c0019b.f0(q, B.g);
        }
        if (q.e()) {
            return true;
        }
        if (q.g() && ((N) q).e.equals(oZP.d("1B0011330D38101C"))) {
            return c0019b.f0(q, B.d);
        }
        c0019b.t(this);
        return false;
    }
}
