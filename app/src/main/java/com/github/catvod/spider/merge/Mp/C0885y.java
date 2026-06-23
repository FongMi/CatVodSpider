package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0885y extends B {
    C0885y() {
        super(ZrJ.d("2D263339"), 7, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        if (q.b()) {
            c0840b.K((I) q);
            return true;
        }
        if (q.e()) {
            c0840b.t(this);
            c0840b.b0();
            c0840b.u0(c0840b.a0());
            return c0840b.g(q);
        }
        if (!q.f()) {
            return true;
        }
        c0840b.b0();
        c0840b.u0(c0840b.a0());
        return true;
    }
}
