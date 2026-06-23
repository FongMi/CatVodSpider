package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0844d extends B {
    C0844d() {
        super(ZrJ.d("302D082C3831102C25"), 10, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        boolean zF = q.f();
        String strD = ZrJ.d("1A223B39212A17");
        if (zF) {
            M m = (M) q;
            if (m.e.equals(strD)) {
                if (!c0840b.I(m.e)) {
                    c0840b.t(this);
                    return false;
                }
                c0840b.x(false);
                if (!c0840b.b(strD)) {
                    c0840b.t(this);
                }
                c0840b.c0(strD);
                c0840b.n();
                c0840b.u0(B.i);
                return true;
            }
        }
        if ((q.g() && com.github.catvod.spider.merge.XU.n.c(((N) q).e, A.y)) || (q.f() && ((M) q).e.equals(ZrJ.d("0D2229212D")))) {
            c0840b.t(this);
            if (c0840b.h(strD)) {
                return c0840b.g(q);
            }
            return true;
        }
        if (!q.f() || !com.github.catvod.spider.merge.XU.n.c(((M) q).e, A.J)) {
            return c0840b.f0(q, B.g);
        }
        c0840b.t(this);
        return false;
    }
}
