package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum C0043n extends B {
    C0043n() {
        super(oZP.d("3C0131330D38101C1235"), 19, null);
    }

    @Override // com.github.catvod.spider.merge.M.B
    final boolean d(Q q, C0019b c0019b) {
        B b;
        if (B.a(q)) {
            c0019b.K((I) q);
        } else if (q.c()) {
            c0019b.L((J) q);
        } else {
            if (q.d()) {
                c0019b.t(this);
                return false;
            }
            boolean zG = q.g();
            String strD = oZP.d("131D162C0926101B");
            String strD2 = oZP.d("1D1B1A2D");
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
                        if (str.equals(oZP.d("131D162C09"))) {
                            b2 = 2;
                        }
                        break;
                    case 1192721831:
                        if (str.equals(oZP.d("1B0011330D38101C"))) {
                            b2 = 3;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        c0019b.J(n);
                        break;
                    case 1:
                        b = B.g;
                        break;
                    case 2:
                        c0019b.M(n);
                        break;
                    case 3:
                        b = B.d;
                        break;
                    default:
                        c0019b.t(this);
                        break;
                }
                return false;
            }
            if (q.f() && ((M) q).e.equals(strD)) {
                if (c0019b.b(strD2)) {
                    c0019b.t(this);
                    return false;
                }
                c0019b.b0();
                if (!c0019b.b(strD)) {
                    c0019b.u0(B.u);
                }
            } else {
                if (!q.e()) {
                    c0019b.t(this);
                    return false;
                }
                if (!c0019b.b(strD2)) {
                    c0019b.t(this);
                }
            }
        }
        return true;
    }
}
