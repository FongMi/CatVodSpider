package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0856j extends B {
    C0856j() {
        super(ZrJ.d("302D182824201A3702231C241B2F2E"), 16, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        boolean zG = q.g();
        String strD = ZrJ.d("0A2627282B31");
        if (zG && com.github.catvod.spider.merge.XU.n.c(((N) q).e, A.G)) {
            c0840b.t(this);
            c0840b.c0(strD);
            c0840b.o0();
            return c0840b.g(q);
        }
        if (q.f()) {
            M m = (M) q;
            if (com.github.catvod.spider.merge.XU.n.c(m.e, A.G)) {
                c0840b.t(this);
                if (!c0840b.I(m.e)) {
                    return false;
                }
                c0840b.c0(strD);
                c0840b.o0();
                return c0840b.g(q);
            }
        }
        return c0840b.f0(q, B.p);
    }
}
