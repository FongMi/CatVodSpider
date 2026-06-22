package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0041m extends B {
    C0041m() {
        super(oZP.d("3C011E35053419"), 0, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        C0052s c0052s = B.b;
        if (B.a(q)) {
            return true;
        }
        if (q.c()) {
            c0019b.L((J) q);
        } else {
            if (!q.d()) {
                c0019b.u0(c0052s);
                return c0019b.g(q);
            }
            K k = (K) q;
            com.github.catvod.spider.merge.L.i iVar = new com.github.catvod.spider.merge.L.i(c0019b.h.d(k.k()), k.f.toString(), k.g.toString());
            iVar.L(k.e);
            c0019b.d.L(iVar);
            if (k.h) {
                c0019b.d.D0();
            }
            c0019b.u0(c0052s);
        }
        return true;
    }
}
