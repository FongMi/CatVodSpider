package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0862m extends B {
    C0862m() {
        super(ZrJ.d("302D2239212415"), 0, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        C0873s c0873s = B.b;
        if (B.a(q)) {
            return true;
        }
        if (q.c()) {
            c0840b.L((J) q);
        } else {
            if (!q.d()) {
                c0840b.u0(c0873s);
                return c0840b.g(q);
            }
            K k = (K) q;
            com.github.catvod.spider.merge.UY.i iVar = new com.github.catvod.spider.merge.UY.i(c0840b.h.d(k.k()), k.f.toString(), k.g.toString());
            iVar.L(k.e);
            c0840b.d.L(iVar);
            if (k.h) {
                c0840b.d.D0();
            }
            c0840b.u0(c0873s);
        }
        return true;
    }
}
