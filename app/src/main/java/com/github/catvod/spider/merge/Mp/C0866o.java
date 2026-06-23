package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0866o extends B {
    C0866o() {
        super(ZrJ.d("38253F283A030B2226283B200D"), 20, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        B b;
        if (B.a(q)) {
            c0840b.K((I) q);
            return true;
        }
        if (q.c()) {
            c0840b.L((J) q);
            return true;
        }
        if (q.d()) {
            c0840b.t(this);
            return false;
        }
        boolean zG = q.g();
        String strD = ZrJ.d("11372621");
        if (zG && ((N) q).e.equals(strD)) {
            b = B.g;
        } else {
            if (q.f() && ((M) q).e.equals(strD)) {
                c0840b.u0(B.w);
                return true;
            }
            if (!q.g() || !((N) q).e.equals(ZrJ.d("172C2D3F29281C30"))) {
                if (q.e()) {
                    return true;
                }
                c0840b.t(this);
                return false;
            }
            b = B.d;
        }
        return c0840b.f0(q, b);
    }
}
