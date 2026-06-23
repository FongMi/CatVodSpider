package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0873s extends B {
    C0873s() {
        super(ZrJ.d("3B262D223A2031372621"), 1, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        C0875t c0875t = B.c;
        if (q.d()) {
            c0840b.t(this);
            return false;
        }
        if (q.c()) {
            c0840b.L((J) q);
            return true;
        }
        if (B.a(q)) {
            c0840b.K((I) q);
            return true;
        }
        if (q.g()) {
            N n = (N) q;
            if (n.e.equals(ZrJ.d("11372621"))) {
                c0840b.J(n);
                c0840b.u0(c0875t);
                return true;
            }
        }
        if (!(q.f() && com.github.catvod.spider.merge.XU.n.c(((M) q).e, A.e)) && q.f()) {
            c0840b.t(this);
            return false;
        }
        c0840b.R();
        c0840b.u0(c0875t);
        return c0840b.g(q);
    }
}
