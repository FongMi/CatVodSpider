package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.h1.AbstractC1239f;
import com.github.catvod.spider.merge.h1.C1240g;
import com.github.catvod.spider.merge.h1.C1242i;
import com.github.catvod.spider.merge.h1.C1257y;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1170q extends AbstractC1102S {
    private C1173r a;
    private boolean b;
    private boolean c;
    private C1131f0 d;
    private com.github.catvod.spider.merge.h1.V e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int l;
    private int[] m;
    private int n;
    private long[] o;
    private int p;
    private int r;
    private U1 j = new U1(20);
    private U1 k = new U1(20);
    private S1 q = new S1();

    C1170q() {
    }

    private static int A(Q1 q1) {
        return ((Q1) q1.s(3)).o(2);
    }

    private int B(Q1 q1) {
        int i = q1.b;
        if (i != 135 && i != 73 && i != 169) {
            C1162n0.c();
            throw null;
        }
        int iP = q1.p(15, -1);
        if (iP != -1) {
            return iP;
        }
        int i2 = this.n;
        int[] iArr = this.m;
        if (iArr == null || i2 == iArr.length) {
            if (iArr == null) {
                this.m = new int[32];
            } else {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                this.m = iArr2;
            }
        }
        this.n = i2 + 1;
        this.m[i2] = -1;
        int i3 = q1.b;
        if (i3 == 135 || i3 == 73 || i3 == 169) {
            q1.E(15, i2);
            return i2;
        }
        C1162n0.c();
        throw null;
    }

    private byte[] C(int i) {
        byte[] bArr = this.d.l;
        int length = bArr.length;
        int i2 = this.f;
        int i3 = i + i2;
        if (i3 <= length) {
            C1162n0.c();
            throw null;
        }
        int i4 = length * 2;
        if (i3 <= i4) {
            i3 = i4;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.d.l = bArr2;
        return bArr2;
    }

    private void D(int i) {
        int i2 = this.f;
        if (i2 >= i + 3) {
            E(i, i2);
        } else {
            C1162n0.c();
            throw null;
        }
    }

    private void E(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0 && i3 <= 2) {
            C1162n0.c();
            throw null;
        }
        int i4 = i + 1;
        if (i3 != ((short) i3)) {
            C1131f0 c1131f0 = this.d;
            if (c1131f0.D == null) {
                c1131f0.D = new E2(4);
            }
            this.d.D.e(i4, i2);
            i3 = 0;
        }
        byte[] bArr = this.d.l;
        bArr[i4] = (byte) (i3 >> 8);
        bArr[i4 + 1] = (byte) i3;
    }

    private void F(int i) {
        int i2 = this.g + i;
        if (i > 0) {
            C1131f0 c1131f0 = this.d;
            if (i2 > c1131f0.p) {
                c1131f0.p = i2;
            }
        }
        this.g = i2;
    }

    private void G(Q1 q1) {
        int iQ = q1.q();
        if (iQ == this.h || iQ < 0) {
            return;
        }
        C1131f0 c1131f0 = this.d;
        if (c1131f0.E < 0) {
            c1131f0.E = iQ;
        }
        this.h = iQ;
        l(-26);
        s(iQ & 65535);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H(com.github.catvod.spider.merge.f1.Q1 r17, int r18) {
        /*
            Method dump skipped, instruction units count: 1566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1170q.H(com.github.catvod.spider.merge.f1.Q1, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178 A[LOOP:0: B:81:0x0176->B:82:0x0178, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I(com.github.catvod.spider.merge.f1.Q1 r17, int r18) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1170q.I(com.github.catvod.spider.merge.f1.Q1, int):void");
    }

    private void i(int i, int i2, int i3, boolean z, int i4, int i5) {
        int i6 = this.r;
        C1131f0 c1131f0 = this.d;
        int[] iArr = c1131f0.m;
        if (iArr == null) {
            if (i6 != 0) {
                C1162n0.c();
                throw null;
            }
            iArr = new int[12];
            c1131f0.m = iArr;
        } else if (iArr.length == i6) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i6);
            this.d.m = iArr2;
            iArr = iArr2;
        }
        iArr[i6 + 0] = i;
        iArr[i6 + 1] = i2;
        iArr[i6 + 2] = i3;
        iArr[i6 + 3] = z ? 1 : 0;
        iArr[i6 + 4] = i4;
        iArr[i6 + 5] = i5;
        this.r = i6 + 6;
    }

    private void j(Q1 q1, int i) {
        int iB = B(q1);
        if (iB >= this.n) {
            C1162n0.c();
            throw null;
        }
        int i2 = this.m[iB];
        if (i2 != -1) {
            int i3 = this.f;
            if (i3 <= i2) {
                C1162n0.c();
                throw null;
            }
            k(i);
            E(i3, i2);
            return;
        }
        int i4 = this.f;
        k(i);
        int i5 = this.p;
        long[] jArr = this.o;
        if (jArr == null || i5 == jArr.length) {
            if (jArr == null) {
                this.o = new long[40];
            } else {
                long[] jArr2 = new long[jArr.length * 2];
                System.arraycopy(jArr, 0, jArr2, 0, i5);
                this.o = jArr2;
            }
        }
        this.p = i5 + 1;
        this.o[i5] = (((long) iB) << 32) | ((long) i4);
    }

    private void k(int i) {
        byte[] bArrC = this.d.l;
        int i2 = this.f;
        if (i2 + 3 > bArrC.length) {
            bArrC = C(3);
        }
        bArrC[i2] = (byte) i;
        this.f = i2 + 1 + 2;
    }

    private void l(int i) {
        if (AbstractC1102S.h(i)) {
            t(i & 255);
        } else {
            C1162n0.c();
            throw null;
        }
    }

    private void m(int i, int i2) {
        n(i2);
        if (AbstractC1102S.h(i)) {
            l(i);
        } else {
            r(i);
        }
    }

    private void n(int i) {
        if (i < 0) {
            C1162n0.c();
            throw null;
        }
        if (i < 6) {
            l((-32) - i);
            return;
        }
        if (i <= 255) {
            l(-38);
            t(i);
        } else if (i <= 65535) {
            l(-39);
            s(i);
        } else {
            l(-40);
            o(i);
        }
    }

    private void o(int i) {
        byte[] bArrC = this.d.l;
        int i2 = this.f;
        int i3 = i2 + 4;
        if (i3 > bArrC.length) {
            bArrC = C(4);
        }
        bArrC[i2] = (byte) (i >>> 24);
        bArrC[i2 + 1] = (byte) (i >>> 16);
        bArrC[i2 + 2] = (byte) (i >>> 8);
        bArrC[i2 + 3] = (byte) i;
        this.f = i3;
    }

    private void p(int i, String str) {
        q(str);
        if (AbstractC1102S.h(i)) {
            l(i);
        } else {
            r(i);
        }
    }

    private void q(String str) {
        int iD = this.j.d(str);
        if (iD == -1) {
            iD = this.j.k();
            this.j.i(str, iD);
        }
        if (iD < 4) {
            l((-41) - iD);
            return;
        }
        if (iD <= 255) {
            l(-45);
            t(iD);
        } else if (iD <= 65535) {
            l(-46);
            s(iD);
        } else {
            l(-47);
            o(iD);
        }
    }

    private void r(int i) {
        if (2 <= i && i <= 83) {
            t(i);
        } else {
            C1162n0.c();
            throw null;
        }
    }

    private void s(int i) {
        if (((-65536) & i) != 0) {
            C1162n0.c();
            throw null;
        }
        byte[] bArrC = this.d.l;
        int i2 = this.f;
        int i3 = i2 + 2;
        if (i3 > bArrC.length) {
            bArrC = C(2);
        }
        bArrC[i2] = (byte) (i >>> 8);
        bArrC[i2 + 1] = (byte) i;
        this.f = i3;
    }

    private void t(int i) {
        if ((i & (-256)) != 0) {
            C1162n0.c();
            throw null;
        }
        byte[] bArrC = this.d.l;
        int i2 = this.f;
        if (i2 == bArrC.length) {
            bArrC = C(1);
        }
        bArrC[i2] = (byte) i;
        this.f = i2 + 1;
    }

    private void u(int i, int i2) {
        if (i != -7) {
            if (i == 160) {
                if (i2 >= 128) {
                    m(-60, i2);
                    return;
                } else {
                    l(-61);
                    t(i2);
                    return;
                }
            }
            if (i != 55 && i != 56) {
                C1162n0.c();
                throw null;
            }
            if (i2 < 128) {
                l(i == 55 ? -48 : -49);
                t(i2);
                return;
            }
        }
        m(i, i2);
    }

    private static RuntimeException v(Q1 q1) {
        throw new RuntimeException(q1.toString());
    }

    private void x() {
        this.b = true;
        C1257y c1257y = (C1257y) this.e;
        this.d.e = c1257y.h1();
        this.d.d = c1257y.o1();
        if (c1257y.g1() != null) {
            this.d.b = c1257y.getName();
        }
        if (c1257y.n1()) {
            l(-62);
            s(c1257y.D0() & 65535);
        }
        if (c1257y.W0()) {
            this.d.A = true;
        }
        if (c1257y.l1()) {
            this.d.B = true;
        }
        C1131f0 c1131f0 = this.d;
        boolean z = c1257y.T() instanceof com.github.catvod.spider.merge.h1.i0;
        c1131f0.getClass();
        y(c1257y.e);
    }

    private void y(Q1 q1) {
        z();
        int iP0 = this.e.P0();
        if (iP0 != 0) {
            InterfaceC1117b2 interfaceC1117b2F = C1157l2.f(C1185v.h());
            Object[] objArr = new Object[iP0];
            for (int i = 0; i != iP0; i++) {
                this.e.R0(i);
                this.e.Q0(i);
                objArr[i] = interfaceC1117b2F.c();
            }
            this.d.j = objArr;
        }
        int iT0 = this.e.T0();
        if (iT0 != 0) {
            Object[] objArr2 = new Object[iT0];
            for (int i2 = 0; i2 != iT0; i2++) {
                List<com.github.catvod.spider.merge.h1.b0> listU0 = this.e.U0(i2);
                String[] strArr = new String[listU0.size() * 2];
                int i3 = 0;
                for (com.github.catvod.spider.merge.h1.b0 b0Var : listU0) {
                    int i4 = i3 + 1;
                    strArr[i3] = b0Var.getValue();
                    i3 = i4 + 1;
                    strArr[i4] = b0Var.d0();
                }
                objArr2[i2] = strArr;
            }
            this.d.k = objArr2;
        }
        I(q1, 0);
        for (int i5 = 0; i5 < this.p; i5++) {
            long j = this.o[i5];
            int i6 = (int) j;
            int i7 = this.m[(int) (j >> 32)];
            if (i7 == -1) {
                C1162n0.c();
                throw null;
            }
            E(i6, i7);
        }
        this.p = 0;
        if (this.d.e == 0) {
            r(65);
        }
        byte[] bArr = this.d.l;
        int length = bArr.length;
        int i8 = this.f;
        if (length != i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 0, bArr2, 0, i8);
            this.d.l = bArr2;
        }
        if (this.j.k() == 0) {
            this.d.f = null;
        } else {
            this.d.f = new String[this.j.k()];
            U1 u1 = this.j;
            u1.getClass();
            T1 t1 = new T1(u1);
            u1.f(t1);
            t1.e();
            while (!t1.a()) {
                String str = (String) t1.b();
                int iC = t1.c();
                String[] strArr2 = this.d.f;
                if (strArr2[iC] != null) {
                    C1162n0.c();
                    throw null;
                }
                strArr2[iC] = str;
                t1.e();
            }
        }
        int i9 = this.i;
        if (i9 == 0) {
            this.d.g = null;
        } else {
            double[] dArr = this.d.g;
            if (dArr.length != i9) {
                double[] dArr2 = new double[i9];
                System.arraycopy(dArr, 0, dArr2, 0, i9);
                this.d.g = dArr2;
            }
        }
        if (this.k.k() == 0) {
            this.d.h = null;
        } else {
            this.d.h = new BigInteger[this.k.k()];
            U1 u12 = this.k;
            u12.getClass();
            T1 t12 = new T1(u12);
            u12.f(t12);
            t12.e();
            while (!t12.a()) {
                BigInteger bigInteger = (BigInteger) t12.b();
                int iC2 = t12.c();
                BigInteger[] bigIntegerArr = this.d.h;
                if (bigIntegerArr[iC2] != null) {
                    C1162n0.c();
                    throw null;
                }
                bigIntegerArr[iC2] = bigInteger;
                t12.e();
            }
        }
        int i10 = this.r;
        if (i10 != 0) {
            int[] iArr = this.d.m;
            if (iArr.length != i10) {
                int[] iArr2 = new int[i10];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                this.d.m = iArr2;
            }
        }
        this.d.n = this.e.M0();
        C1131f0 c1131f0 = this.d;
        c1131f0.q = c1131f0.n + c1131f0.o + c1131f0.p;
        c1131f0.r = this.e.N0();
        this.d.s = this.e.L0();
        this.d.t = this.e.O0();
        this.d.u = this.e.V0();
        this.d.x = this.e.G0();
        this.d.y = this.e.F0();
        if (this.q.h() != 0) {
            this.d.C = this.q.i();
        }
    }

    private void z() {
        int iH0 = this.e.H0();
        if (iH0 == 0) {
            return;
        }
        C1131f0[] c1131f0Arr = new C1131f0[iH0];
        for (int i = 0; i != iH0; i++) {
            C1257y c1257yI0 = this.e.I0(i);
            C1170q c1170q = new C1170q();
            c1170q.a = this.a;
            c1170q.e = c1257yI0;
            c1170q.d = new C1131f0(this.d);
            c1170q.x();
            c1131f0Arr[i] = c1170q.d;
            AbstractC1239f abstractC1239fT = c1257yI0.T();
            if (!(abstractC1239fT instanceof C1240g) && !(abstractC1239fT instanceof com.github.catvod.spider.merge.h1.U) && !(abstractC1239fT instanceof C1242i)) {
                c1170q.d.H = true;
            }
        }
        this.d.i = c1131f0Arr;
    }

    public final C1131f0 w(C1173r c1173r, com.github.catvod.spider.merge.h1.V v, String str, boolean z) {
        this.a = c1173r;
        new R1().c(v, false, c1173r);
        if (z) {
            v = v.I0(0);
        }
        this.e = v;
        this.d = new C1131f0(0, v.S0(), str, this.e.W0());
        if (z) {
            x();
        } else {
            y(this.e);
        }
        return this.d;
    }
}
