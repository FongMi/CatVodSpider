package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0852h extends B {
    C0852h() {
        super(ZrJ.d("302D08282429"), 14, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        C0850g c0850g = B.n;
        C0883x c0883x = B.g;
        boolean zF = q.f();
        String strD = ZrJ.d("0D2B");
        String strD2 = ZrJ.d("0D27");
        if (!zF) {
            if (!q.g() || !com.github.catvod.spider.merge.XU.n.c(((N) q).e, A.y)) {
                return c0840b.f0(q, c0883x);
            }
            if (!c0840b.I(strD2) && !c0840b.I(strD)) {
                c0840b.t(this);
                return false;
            }
            if (c0840b.I(strD2)) {
                strD = strD2;
            }
            c0840b.h(strD);
            return c0840b.g(q);
        }
        String str = ((M) q).e;
        if (com.github.catvod.spider.merge.XU.n.c(str, A.v)) {
            if (!c0840b.I(str)) {
                c0840b.t(this);
                c0840b.u0(c0850g);
                return false;
            }
            c0840b.x(false);
            if (!c0840b.b(str)) {
                c0840b.t(this);
            }
            c0840b.c0(str);
            c0840b.n();
            c0840b.u0(c0850g);
            return true;
        }
        if (com.github.catvod.spider.merge.XU.n.c(str, A.w)) {
            c0840b.t(this);
            return false;
        }
        if (!com.github.catvod.spider.merge.XU.n.c(str, A.x)) {
            return c0840b.f0(q, c0883x);
        }
        if (!c0840b.I(str)) {
            c0840b.t(this);
            return false;
        }
        if (c0840b.I(strD2)) {
            strD = strD2;
        }
        c0840b.h(strD);
        return c0840b.g(q);
    }
}
