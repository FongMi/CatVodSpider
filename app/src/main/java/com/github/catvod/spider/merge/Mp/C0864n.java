package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0864n extends B {
    C0864n() {
        super(ZrJ.d("302D0D3F29281C302E39"), 19, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        B b;
        if (B.a(q)) {
            c0840b.K((I) q);
        } else if (q.c()) {
            c0840b.L((J) q);
        } else {
            if (q.d()) {
                c0840b.t(this);
                return false;
            }
            boolean zG = q.g();
            String strD = ZrJ.d("1F312A202D361C37");
            String strD2 = ZrJ.d("11372621");
            if (zG) {
                N n = (N) q;
                String str = n.e;
                str.getClass();
                byte b2 = -1;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals(strD)) {
                            b2 = 0;
                        }
                        break;
                    case 3213227:
                        if (str.equals(strD2)) {
                            b2 = 1;
                        }
                        break;
                    case 97692013:
                        if (str.equals(ZrJ.d("1F312A202D"))) {
                            b2 = 2;
                        }
                        break;
                    case 1192721831:
                        if (str.equals(ZrJ.d("172C2D3F29281C30"))) {
                            b2 = 3;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        c0840b.J(n);
                        break;
                    case 1:
                        b = B.g;
                        break;
                    case 2:
                        c0840b.M(n);
                        break;
                    case 3:
                        b = B.d;
                        break;
                    default:
                        c0840b.t(this);
                        break;
                }
                return false;
            }
            if (q.f() && ((M) q).e.equals(strD)) {
                if (c0840b.b(strD2)) {
                    c0840b.t(this);
                    return false;
                }
                c0840b.b0();
                if (!c0840b.b(strD)) {
                    c0840b.u0(B.u);
                }
            } else {
                if (!q.e()) {
                    c0840b.t(this);
                    return false;
                }
                if (!c0840b.b(strD2)) {
                    c0840b.t(this);
                }
            }
        }
        return true;
    }
}
