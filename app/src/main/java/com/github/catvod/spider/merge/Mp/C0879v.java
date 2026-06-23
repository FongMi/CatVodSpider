package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0879v extends B {
    C0879v() {
        super(ZrJ.d("302D03282921372C382E3A2C0937"), 4, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        I i;
        C0877u c0877u = B.d;
        if (q.d()) {
            c0840b.t(this);
        } else {
            if (q.g() && ((N) q).e.equals(ZrJ.d("11372621"))) {
                return c0840b.f0(q, B.g);
            }
            if (!q.f() || !((M) q).e.equals(ZrJ.d("172C382E3A2C0937"))) {
                if (B.a(q) || q.c() || (q.g() && com.github.catvod.spider.merge.XU.n.c(((N) q).e, A.f))) {
                    return c0840b.f0(q, c0877u);
                }
                if (q.f() && ((M) q).e.equals(ZrJ.d("1B31"))) {
                    c0840b.t(this);
                    i = new I();
                } else {
                    if ((q.g() && com.github.catvod.spider.merge.XU.n.c(((N) q).e, A.I)) || q.f()) {
                        c0840b.t(this);
                        return false;
                    }
                    c0840b.t(this);
                    i = new I();
                }
                i.k(q.toString());
                c0840b.K(i);
                return true;
            }
            c0840b.b0();
            c0840b.u0(c0877u);
        }
        return true;
    }
}
