package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.yZ.C1442g;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0848f extends B {
    C0848f() {
        super(ZrJ.d("302D1F2C2A291C01242931"), 12, null);
    }

    private boolean e(Q q, C0840b c0840b) {
        if (!c0840b.I(ZrJ.d("0D21242931")) && !c0840b.I(ZrJ.d("0D2B2E2C2C")) && !c0840b.E(ZrJ.d("0D2524223C"), null)) {
            c0840b.t(this);
            return false;
        }
        c0840b.p();
        c0840b.h(c0840b.a().i0());
        return c0840b.g(q);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        B b = B.i;
        int iA = C1442g.a(q.a);
        if (iA == 1) {
            N n = (N) q;
            String str = n.e;
            String strD = ZrJ.d("0D31");
            if (!str.equals(strD)) {
                if (!com.github.catvod.spider.merge.XU.n.c(str, A.v)) {
                    return com.github.catvod.spider.merge.XU.n.c(str, A.B) ? e(q, c0840b) : c0840b.f0(q, b);
                }
                c0840b.t(this);
                c0840b.j(strD);
                return c0840b.g(n);
            }
            c0840b.p();
            c0840b.J(n);
            c0840b.u0(B.n);
        } else {
            if (iA != 2) {
                return c0840b.f0(q, b);
            }
            String str2 = ((M) q).e;
            if (!com.github.catvod.spider.merge.XU.n.c(str2, A.H)) {
                if (str2.equals(ZrJ.d("0D2229212D"))) {
                    return e(q, c0840b);
                }
                if (!com.github.catvod.spider.merge.XU.n.c(str2, A.C)) {
                    return c0840b.f0(q, b);
                }
                c0840b.t(this);
                return false;
            }
            if (!c0840b.I(str2)) {
                c0840b.t(this);
                return false;
            }
            c0840b.p();
            c0840b.b0();
            c0840b.u0(b);
        }
        return true;
    }
}
