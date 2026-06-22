package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.l1.AbstractC1298d;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class B0 extends AbstractC1106W implements List {
    private static final Long o = -1L;
    private static final Comparator<Object> p = new A0();
    private static final Comparator<Object> q = new C1198z0();
    private static int r = 10000;
    private long j;
    private int k;
    private transient int l;
    private Object[] m;
    private boolean n;

    public B0(long j) {
        this.k = 6;
        boolean z = j <= ((long) r);
        this.n = z;
        if (z) {
            int i = (int) j;
            Object[] objArr = new Object[i < 10 ? 10 : i];
            this.m = objArr;
            Arrays.fill(objArr, I2.c);
        }
        this.j = j;
    }

    public B0(Object[] objArr) {
        this.k = 6;
        this.n = true;
        this.m = objArr;
        this.j = objArr.length;
    }

    static long B1(C1185v c1185v, n2 n2Var) {
        if (n2Var instanceof K1) {
            return ((K1) n2Var).p1();
        }
        if (n2Var instanceof B0) {
            return ((B0) n2Var).j;
        }
        if (n2Var instanceof AbstractC1298d) {
            return ((Number) ((InterfaceC1161n) n2Var.l("length", n2Var)).b(c1185v, n2Var, n2Var, C1157l2.y)).longValue();
        }
        Object objT0 = p2.t0(n2Var, "length");
        if (objT0 == I2.c) {
            return 0L;
        }
        double dP1 = C1157l2.p1(objT0);
        if (dP1 > 9.007199254740991E15d) {
            return 9007199254740991L;
        }
        if (dP1 < 0.0d) {
            return 0L;
        }
        return (long) dP1;
    }

    private static Object C1(n2 n2Var, long j) {
        return j > 2147483647L ? p2.t0(n2Var, Long.toString(j)) : p2.r0(n2Var, (int) j);
    }

    private static Object D1(C1185v c1185v, Object[] objArr) {
        if (objArr.length == 0) {
            return new B0(0L);
        }
        c1185v.getClass();
        Object obj = objArr[0];
        if (objArr.length > 1 || !(obj instanceof Number)) {
            return new B0(objArr);
        }
        long jA1 = C1157l2.A1(C1157l2.p1(obj));
        if (jA1 == ((Number) obj).doubleValue()) {
            return new B0(jA1);
        }
        throw C1157l2.I0(C1157l2.P("msg.arraylength.bad", new Object[0]));
    }

    private static Object E1(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        n2 n2VarT1 = C1157l2.t1(c1185v, n2Var, n2Var2);
        long jB1 = B1(c1185v, n2VarT1);
        int i = 1;
        long jL1 = (long) C1157l2.l1(objArr.length >= 1 ? objArr[0] : G2.b);
        long jMax = jL1 < 0 ? Math.max(jL1 + jB1, 0L) : Math.min(jL1, jB1);
        long jL12 = (long) C1157l2.l1(objArr.length >= 2 ? objArr[1] : G2.b);
        long jMax2 = jL12 < 0 ? Math.max(jL12 + jB1, 0L) : Math.min(jL12, jB1);
        long jL13 = (objArr.length < 3 || G2.b(objArr[2])) ? jB1 : (long) C1157l2.l1(objArr[2]);
        long jMin = Math.min((jL13 < 0 ? Math.max(jL13 + jB1, 0L) : Math.min(jL13, jB1)) - jMax2, jB1 - jMax);
        if (jMax2 < jMax) {
            long j = jMax2 + jMin;
            if (jMax < j) {
                i = -1;
                jMax2 = j - 1;
                jMax = (jMax + jMin) - 1;
            }
        }
        if ((n2VarT1 instanceof B0) && jMin <= 2147483647L) {
            B0 b0 = (B0) n2VarT1;
            if (b0.n) {
                for (long j2 = 0; jMin > j2; j2 = 0) {
                    Object[] objArr2 = b0.m;
                    objArr2[(int) jMax] = objArr2[(int) jMax2];
                    long j3 = i;
                    jMax2 += j3;
                    jMax += j3;
                    jMin--;
                }
                return n2Var2;
            }
        }
        while (jMin > 0) {
            Object objC1 = C1(n2VarT1, jMax2);
            if (objC1 == I2.c || G2.b(objC1)) {
                v1(n2VarT1, jMax);
            } else {
                I1(n2VarT1, jMax, objC1);
            }
            long j4 = i;
            jMax2 += j4;
            jMax += j4;
            jMin--;
        }
        return n2Var2;
    }

    private static Object F1(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        n2 n2Var3;
        n2 n2VarT1 = C1157l2.t1(c1185v, n2Var, n2Var2);
        char c = 0;
        Object obj = objArr.length > 0 ? objArr[0] : G2.b;
        if (!(obj instanceof InterfaceC1098N)) {
            throw C1157l2.D0(obj, obj);
        }
        c1185v.getClass();
        InterfaceC1098N interfaceC1098N = (InterfaceC1098N) obj;
        n2 n2VarU0 = p2.u0(interfaceC1098N);
        n2 n2VarT12 = (objArr.length < 2 || objArr[1] == null || objArr[1] == G2.b) ? n2VarU0 : C1157l2.t1(c1185v, n2Var, objArr[1]);
        long jB1 = B1(c1185v, n2VarT1);
        n2 n2VarW = c1185v.w(n2Var, 0);
        long j = 0;
        long j2 = 0;
        while (j2 < jB1) {
            Object objC1 = C1(n2VarT1, j2);
            if (objC1 == I2.c) {
                n2Var3 = n2VarU0;
            } else {
                Object[] objArr2 = new Object[3];
                objArr2[c] = objC1;
                objArr2[1] = Long.valueOf(j2);
                objArr2[2] = n2VarT1;
                Object objB = interfaceC1098N.b(c1185v, n2VarU0, n2VarT12, objArr2);
                if (G1(objB)) {
                    n2 n2Var4 = (n2) objB;
                    long jB12 = B1(c1185v, n2Var4);
                    n2Var3 = n2VarU0;
                    long j3 = 0;
                    while (j3 < jB12) {
                        u1(c1185v, n2VarW, j, C1(n2Var4, j3));
                        j3++;
                        j++;
                    }
                } else {
                    n2Var3 = n2VarU0;
                    u1(c1185v, n2VarW, j, objB);
                    j++;
                }
            }
            j2++;
            n2VarU0 = n2Var3;
            c = 0;
        }
        J1(n2VarW, j);
        return n2VarW;
    }

    private static boolean G1(Object obj) {
        if (obj instanceof n2) {
            return "Array".equals(((n2) obj).F());
        }
        return false;
    }

    private static void I1(n2 n2Var, long j, Object obj) {
        if (j > 2147483647L) {
            p2.L0(n2Var, Long.toString(j), obj);
        } else {
            p2.K0(n2Var, (int) j, obj);
        }
    }

    private static Object J1(n2 n2Var, long j) {
        Number numberN1 = C1157l2.N1(j);
        p2.L0(n2Var, "length", numberN1);
        return numberN1;
    }

    static void K1() {
        r = 200000;
    }

    private static void L1(C1185v c1185v, n2 n2Var, long j, Object obj) {
        if (obj == I2.c) {
            v1(n2Var, j);
        } else {
            I1(n2Var, j, obj);
        }
    }

    private static long M1(double d) {
        if (Double.isNaN(d)) {
            return -1L;
        }
        long jA1 = C1157l2.A1(d);
        if (jA1 != d || jA1 == 4294967295L) {
            return -1L;
        }
        return jA1;
    }

    private static long N1(Object obj) {
        if (obj instanceof String) {
            return O1((String) obj);
        }
        if (obj instanceof Number) {
            return M1(((Number) obj).doubleValue());
        }
        return -1L;
    }

    private static long O1(String str) {
        long jM1 = M1(C1157l2.q1(str));
        if (Long.toString(jM1).equals(str)) {
            return jM1;
        }
        return -1L;
    }

    private static long P1(double d, long j) {
        if (d < 0.0d) {
            double d2 = j;
            Double.isNaN(d2);
            d += d2;
            if (d < 0.0d) {
                return 0L;
            }
        } else if (d > j) {
            return j;
        }
        return (long) d;
    }

    private static String Q1(C1185v c1185v, n2 n2Var, n2 n2Var2, boolean z, boolean z2) {
        String str;
        boolean zE;
        boolean z3;
        long j;
        boolean z4;
        String strX1;
        n2 n2VarT1 = C1157l2.t1(c1185v, n2Var, n2Var2);
        long jB1 = B1(c1185v, n2VarT1);
        StringBuilder sb = new StringBuilder(256);
        if (z) {
            sb.append('[');
            str = ", ";
        } else {
            str = ",";
        }
        U1 u1 = c1185v.g;
        if (u1 == null) {
            c1185v.g = new U1(31);
            zE = false;
            z3 = true;
        } else {
            zE = u1.e(n2VarT1);
            z3 = false;
        }
        if (zE) {
            j = 0;
            z4 = false;
        } else {
            try {
                c1185v.g.i(n2VarT1, 0);
                j = 0;
                boolean z5 = false;
                while (j < jB1) {
                    if (j > 0) {
                        sb.append(str);
                    }
                    Object objC1 = C1(n2VarT1, j);
                    if (objC1 == I2.c || objC1 == null || objC1 == G2.b) {
                        z5 = false;
                    } else {
                        if (z) {
                            strX1 = C1157l2.J1(c1185v, n2Var, objC1);
                        } else if (objC1 instanceof String) {
                            strX1 = (String) objC1;
                        } else {
                            if (z2) {
                                InterfaceC1161n interfaceC1161nV = C1157l2.V(objC1, "toLocaleString", c1185v, n2Var);
                                n2 n2Var3 = c1185v.v;
                                c1185v.v = null;
                                objC1 = interfaceC1161nV.b(c1185v, n2Var, n2Var3, C1157l2.y);
                            }
                            strX1 = C1157l2.x1(objC1);
                        }
                        sb.append(strX1);
                        z5 = true;
                    }
                    j++;
                }
                c1185v.g.j(n2VarT1);
                z4 = z5;
            } finally {
                if (z3) {
                    c1185v.g = null;
                }
            }
        }
        if (z) {
            if (z4 || j <= 0) {
                sb.append(']');
            } else {
                sb.append(", ]");
            }
        }
        return sb.toString();
    }

    static void q1(B0 b0, int i) {
        if (b0.l != i) {
            throw new ConcurrentModificationException();
        }
    }

    private static n2 s1(C1185v c1185v, n2 n2Var, n2 n2Var2, long j, boolean z) {
        n2 n2VarA;
        if (n2Var2 instanceof InterfaceC1098N) {
            try {
                n2VarA = ((InterfaceC1098N) n2Var2).a(c1185v, n2Var, (z || j > 0) ? new Object[]{Long.valueOf(j)} : C1157l2.y);
            } catch (C1089E e) {
                if (!"TypeError".equals(e.l())) {
                    throw e;
                }
                n2VarA = null;
            }
        } else {
            n2VarA = null;
        }
        if (n2VarA == null) {
            return c1185v.w(n2Var, j <= 2147483647L ? (int) j : 0);
        }
        return n2VarA;
    }

    private static void t1(n2 n2Var, long j, Object obj) {
        if (j > 2147483647L) {
            n2Var.v(Long.toString(j), n2Var, obj);
        } else {
            n2Var.t((int) j, n2Var, obj);
        }
    }

    private static void u1(C1185v c1185v, n2 n2Var, long j, Object obj) {
        if (j > 9.007199254740991E15d) {
            throw C1157l2.C1("msg.arraylength.too.big", String.valueOf(j));
        }
        t1(n2Var, j, obj);
    }

    private static void v1(n2 n2Var, long j) {
        int i = (int) j;
        if (i == j) {
            n2Var.p(i);
        } else {
            n2Var.delete(Long.toString(j));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long w1(com.github.catvod.spider.merge.f1.C1185v r17, com.github.catvod.spider.merge.f1.n2 r18, com.github.catvod.spider.merge.f1.n2 r19, java.lang.Object r20, long r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r4 = r1 instanceof com.github.catvod.spider.merge.f1.n2
            r5 = 1
            if (r4 == 0) goto L23
            r4 = r1
            com.github.catvod.spider.merge.f1.n2 r4 = (com.github.catvod.spider.merge.f1.n2) r4
            com.github.catvod.spider.merge.f1.x2 r6 = com.github.catvod.spider.merge.f1.x2.g
            java.lang.Object r4 = com.github.catvod.spider.merge.f1.p2.s0(r4, r6)
            com.github.catvod.spider.merge.f1.I2 r6 = com.github.catvod.spider.merge.f1.I2.c
            if (r4 == r6) goto L23
            boolean r6 = com.github.catvod.spider.merge.f1.G2.b(r4)
            if (r6 != 0) goto L23
            boolean r4 = com.github.catvod.spider.merge.f1.C1157l2.g1(r4)
            goto L3a
        L23:
            r17.getClass()
            java.lang.String r4 = "Array"
            r6 = r18
            com.github.catvod.spider.merge.f1.N r4 = com.github.catvod.spider.merge.f1.C1157l2.M(r6, r4)
            boolean r4 = com.github.catvod.spider.merge.f1.C1157l2.b0(r1, r4)
            if (r4 == 0) goto L36
            r4 = 1
            goto L3a
        L36:
            boolean r4 = G1(r20)
        L3a:
            r6 = 1
            if (r4 == 0) goto L9e
            com.github.catvod.spider.merge.f1.n2 r1 = (com.github.catvod.spider.merge.f1.n2) r1
            r4 = r17
            long r8 = B1(r4, r1)
            long r10 = r8 + r2
            double r12 = (double) r10
            r4 = 0
            r14 = 4845873199050653695(0x433fffffffffffff, double:9.007199254740991E15)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 > 0) goto L8f
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 > 0) goto L7a
            r5 = r0
            com.github.catvod.spider.merge.f1.B0 r5 = (com.github.catvod.spider.merge.f1.B0) r5
            boolean r12 = r5.n
            if (r12 == 0) goto L7a
            boolean r12 = r1 instanceof com.github.catvod.spider.merge.f1.B0
            if (r12 == 0) goto L7a
            r12 = r1
            com.github.catvod.spider.merge.f1.B0 r12 = (com.github.catvod.spider.merge.f1.B0) r12
            boolean r13 = r12.n
            if (r13 == 0) goto L7a
            int r0 = (int) r10
            r5.x1(r0)
            java.lang.Object[] r0 = r12.m
            java.lang.Object[] r1 = r5.m
            int r3 = (int) r2
            int r2 = (int) r8
            java.lang.System.arraycopy(r0, r4, r1, r3, r2)
            goto L8e
        L7a:
            r4 = 0
        L7c:
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 >= 0) goto L8e
            java.lang.Object r12 = C1(r1, r4)
            com.github.catvod.spider.merge.f1.I2 r13 = com.github.catvod.spider.merge.f1.I2.c
            if (r12 == r13) goto L8b
            t1(r0, r2, r12)
        L8b:
            long r4 = r4 + r6
            long r2 = r2 + r6
            goto L7c
        L8e:
            return r10
        L8f:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0[r4] = r1
            java.lang.String r1 = "msg.arraylength.too.big"
            com.github.catvod.spider.merge.f1.E r0 = com.github.catvod.spider.merge.f1.C1157l2.C1(r1, r0)
            throw r0
        L9e:
            t1(r0, r2, r1)
            long r0 = r2 + r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.B0.w1(com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object, long):long");
    }

    private boolean x1(int i) {
        Object[] objArr = this.m;
        if (i <= objArr.length) {
            return true;
        }
        if (i > 1431655764) {
            this.n = false;
            return false;
        }
        double length = objArr.length;
        Double.isNaN(length);
        int iMax = Math.max(i, (int) (length * 1.5d));
        Object[] objArr2 = new Object[iMax];
        Object[] objArr3 = this.m;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        Arrays.fill(objArr2, this.m.length, iMax, I2.c);
        this.m = objArr2;
        return true;
    }

    private static n2 y1(C1185v c1185v, n2 n2Var, n2 n2Var2, double d) {
        long j;
        long jB1 = B1(c1185v, n2Var2);
        n2 n2VarW = c1185v.w(n2Var, 0);
        long j2 = 0;
        long j3 = 0;
        while (j2 < jB1) {
            Object objC1 = C1(n2Var2, j2);
            if (objC1 == I2.c) {
                j = 1;
            } else if (d < 1.0d || !G1(objC1)) {
                j = 1;
                u1(c1185v, n2VarW, j3, objC1);
                j3++;
            } else {
                n2 n2VarY1 = y1(c1185v, n2Var, (n2) objC1, d - 1.0d);
                long jB12 = B1(c1185v, n2VarY1);
                long j4 = 0;
                while (j4 < jB12) {
                    u1(c1185v, n2VarW, j3, C1(n2VarY1, j4));
                    j4++;
                    j3++;
                }
                j = 1;
            }
            j2 += j;
        }
        J1(n2VarW, j3);
        return n2VarW;
    }

    private static Object z1(n2 n2Var, long j) {
        Object objC1 = C1(n2Var, j);
        return objC1 != I2.c ? objC1 : G2.b;
    }

    public final long A1() {
        return this.j;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void E(n2 n2Var) {
        super.E(n2Var);
        if (n2Var instanceof B0) {
            return;
        }
        this.n = false;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Array";
    }

    final void H1() {
        this.n = false;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    protected final void T(C1185v c1185v, Object obj, p2 p2Var, boolean z) {
        Object[] objArr;
        long jN1 = N1(obj);
        if (jN1 >= this.j) {
            this.j = 1 + jN1;
            this.l++;
        }
        if (jN1 != -1 && (objArr = this.m) != null) {
            this.m = null;
            this.n = false;
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] != I2.c) {
                    if (!B0()) {
                        O0(i);
                    }
                    t(i, this, objArr[i]);
                }
            }
        }
        super.T(c1185v, obj, p2Var, z);
        if ("length".equals(obj)) {
            this.k = h0("length");
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        T0(c1104u, "Array", -5, "join", 1);
        T0(c1104u, "Array", -6, "reverse", 0);
        T0(c1104u, "Array", -7, "sort", 1);
        T0(c1104u, "Array", -8, "push", 1);
        T0(c1104u, "Array", -9, "pop", 0);
        T0(c1104u, "Array", -10, "shift", 0);
        T0(c1104u, "Array", -11, "unshift", 1);
        T0(c1104u, "Array", -12, "splice", 2);
        T0(c1104u, "Array", -13, "concat", 1);
        T0(c1104u, "Array", -14, "slice", 2);
        T0(c1104u, "Array", -15, "indexOf", 1);
        T0(c1104u, "Array", -16, "lastIndexOf", 1);
        T0(c1104u, "Array", -17, "every", 1);
        T0(c1104u, "Array", -18, "filter", 1);
        T0(c1104u, "Array", -19, "forEach", 1);
        T0(c1104u, "Array", -20, "map", 1);
        T0(c1104u, "Array", -21, "some", 1);
        T0(c1104u, "Array", -22, "find", 1);
        T0(c1104u, "Array", -23, "findIndex", 1);
        T0(c1104u, "Array", -24, "reduce", 1);
        T0(c1104u, "Array", -25, "reduceRight", 1);
        T0(c1104u, "Array", -26, "isArray", 1);
        T0(c1104u, "Array", -27, "of", 0);
        T0(c1104u, "Array", -28, "from", 1);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int a1(String str) {
        if (str.equals("length")) {
            return (this.k << 16) | 1;
        }
        return 0;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int b1(w2 w2Var) {
        return x2.c.equals(w2Var) ? 28 : 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final java.lang.Object c(com.github.catvod.spider.merge.f1.C1104U r28, com.github.catvod.spider.merge.f1.C1185v r29, com.github.catvod.spider.merge.f1.n2 r30, com.github.catvod.spider.merge.f1.n2 r31, java.lang.Object[] r32) {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.B0.c(com.github.catvod.spider.merge.f1.U, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toLocaleString":
                return 3;
            case "toSource":
                return 4;
            case "toString":
                return 2;
            case "entries":
                return 29;
            case "constructor":
                return 1;
            case "concat":
                return 13;
            case "filter":
                return 18;
            case "reduce":
                return 24;
            case "splice":
                return 12;
            case "values":
                return 28;
            case "copyWithin":
                return 31;
            case "flatMap":
                return 34;
            case "forEach":
                return 19;
            case "lastIndexOf":
                return 16;
            case "unshift":
                return 11;
            case "at":
                return 32;
            case "map":
                return 20;
            case "pop":
                return 9;
            case "fill":
                return 26;
            case "find":
                return 22;
            case "flat":
                return 33;
            case "join":
                return 5;
            case "keys":
                return 27;
            case "push":
                return 8;
            case "some":
                return 21;
            case "sort":
                return 7;
            case "includes":
                return 30;
            case "every":
                return 17;
            case "shift":
                return 10;
            case "slice":
                return 14;
            case "findIndex":
                return 23;
            case "reduceRight":
                return 25;
            case "reverse":
                return 6;
            case "indexOf":
                return 15;
            default:
                return 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) > -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public final Object e(w2 w2Var, n2 n2Var) {
        return x2.c.equals(w2Var) ? l("values", n2Var) : super.e(w2Var, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final String e1(int i) {
        if (i == 1) {
            return "length";
        }
        super.e1(i);
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    public final int f0(int i) {
        Object[] objArr = this.m;
        if (objArr == null || i < 0 || i >= objArr.length || objArr[i] == I2.c) {
            return super.f0(i);
        }
        return 0;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final Object f1(int i) {
        if (i == 1) {
            return C1157l2.N1(this.j);
        }
        super.f1(i);
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int g1() {
        return 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        long j = i;
        if (j < 0 || j >= this.j) {
            throw new IndexOutOfBoundsException();
        }
        Object objC1 = C1(this, j);
        if (objC1 == I2.c || objC1 == G2.b) {
            return null;
        }
        return objC1 instanceof L2 ? ((L2) objC1).c() : objC1;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        switch (i) {
            case 1:
                str = "constructor";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 2:
                str2 = "toString";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 3:
                str2 = "toLocaleString";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 4:
                str2 = "toSource";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 5:
                str = "join";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 6:
                str2 = "reverse";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 7:
                str = "sort";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 8:
                str = "push";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 9:
                str2 = "pop";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 10:
                str2 = "shift";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 11:
                str = "unshift";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 12:
                str3 = "splice";
                str4 = str3;
                i2 = 2;
                k1("Array", i, str4, null, i2);
                return;
            case 13:
                str = "concat";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 14:
                str3 = "slice";
                str4 = str3;
                i2 = 2;
                k1("Array", i, str4, null, i2);
                return;
            case 15:
                str = "indexOf";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 16:
                str = "lastIndexOf";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 17:
                str = "every";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 18:
                str = "filter";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 19:
                str = "forEach";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 20:
                str = "map";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 21:
                str = "some";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 22:
                str = "find";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 23:
                str = "findIndex";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 24:
                str = "reduce";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 25:
                str = "reduceRight";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 26:
                str = "fill";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 27:
                str2 = "keys";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 28:
                str2 = "values";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 29:
                str2 = "entries";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 30:
                str = "includes";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 31:
                str3 = "copyWithin";
                str4 = str3;
                i2 = 2;
                k1("Array", i, str4, null, i2);
                return;
            case 32:
                str = "at";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            case 33:
                str2 = "flat";
                str4 = str2;
                i2 = 0;
                k1("Array", i, str4, null, i2);
                return;
            case 34:
                str = "flatMap";
                str4 = str;
                i2 = 1;
                k1("Array", i, str4, null, i2);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.j == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int size = size() - 1;
        if (obj == null) {
            while (size >= 0) {
                if (get(size) == null) {
                    return size;
                }
                size--;
            }
            return -1;
        }
        while (size >= 0) {
            if (obj.equals(get(size))) {
                return size;
            }
            size--;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(com.github.catvod.spider.merge.C.u.b("Index: ", i));
        }
        return new C1192x0(this, i, size);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object m(Class<?> cls) {
        if (cls == C1157l2.i) {
            C1185v.h();
        }
        return super.m(cls);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public final boolean n(w2 w2Var, n2 n2Var) {
        return x2.c.equals(w2Var) ? x("values", n2Var) : super.n(w2Var, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void n1(int i, int i2) {
        if (i == 1) {
            this.k = i2;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public final void o(w2 w2Var) {
        if (x2.c.equals(w2Var)) {
            delete("values");
        }
        super.o(w2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    public final Object[] o0(boolean z, boolean z2) {
        Object[] objArrO0 = super.o0(z, z2);
        Object[] objArr = this.m;
        if (objArr == null) {
            return objArrO0;
        }
        int length = objArr.length;
        long j = this.j;
        if (length > j) {
            length = (int) j;
        }
        if (length == 0) {
            return objArrO0;
        }
        int length2 = objArrO0.length;
        Object[] objArr2 = new Object[length + length2];
        int i = 0;
        for (int i2 = 0; i2 != length; i2++) {
            if (this.m[i2] != I2.c) {
                objArr2[i] = Integer.valueOf(i2);
                i++;
            }
        }
        if (i != length) {
            Object[] objArr3 = new Object[i + length2];
            System.arraycopy(objArr2, 0, objArr3, 0, i);
            objArr2 = objArr3;
        }
        System.arraycopy(objArrO0, 0, objArr2, i, length2);
        return objArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (x1((int) r1) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void o1(int r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 1
            if (r10 != r0) goto La8
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 == 0) goto La
            goto L9a
        La:
            double r10 = com.github.catvod.spider.merge.f1.C1157l2.p1(r11)
            long r1 = com.github.catvod.spider.merge.f1.C1157l2.A1(r10)
            double r3 = (double) r1
            r5 = 0
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 != 0) goto L9b
            boolean r10 = r9.n
            if (r10 == 0) goto L4c
            long r10 = r9.j
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 >= 0) goto L2c
            java.lang.Object[] r10 = r9.m
            int r11 = (int) r1
            int r3 = r10.length
            com.github.catvod.spider.merge.f1.I2 r4 = com.github.catvod.spider.merge.f1.I2.c
            java.util.Arrays.fill(r10, r11, r3, r4)
            goto L93
        L2c:
            r6 = 1431655764(0x55555554, double:7.073319297E-315)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 >= 0) goto L4a
            double r10 = (double) r10
            r6 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r6
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 >= 0) goto L4a
            int r10 = (int) r1
            boolean r10 = r9.x1(r10)
            if (r10 == 0) goto L4a
            goto L93
        L4a:
            r9.n = r5
        L4c:
            long r10 = r9.j
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L93
            long r10 = r10 - r1
            r3 = 4096(0x1000, double:2.0237E-320)
            int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r6 <= 0) goto L85
            java.lang.Object[] r10 = r9.o0(r5, r5)
            int r11 = r10.length
        L5e:
            if (r5 >= r11) goto L93
            r3 = r10[r5]
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L74
            java.lang.String r3 = (java.lang.String) r3
            long r6 = O1(r3)
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 < 0) goto L82
            r9.delete(r3)
            goto L82
        L74:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r6 = (long) r3
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 < 0) goto L82
            r9.p(r3)
        L82:
            int r5 = r5 + 1
            goto L5e
        L85:
            r10 = r1
        L86:
            long r3 = r9.j
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 >= 0) goto L93
            v1(r9, r10)
            r3 = 1
            long r10 = r10 + r3
            goto L86
        L93:
            r9.j = r1
            int r10 = r9.l
            int r10 = r10 + r0
            r9.l = r10
        L9a:
            return
        L9b:
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r11 = "msg.arraylength.bad"
            java.lang.String r10 = com.github.catvod.spider.merge.f1.C1157l2.P(r11, r10)
            com.github.catvod.spider.merge.f1.E r10 = com.github.catvod.spider.merge.f1.C1157l2.I0(r10)
            throw r10
        La8:
            super.o1(r10, r11)
            r10 = 0
            goto Lae
        Lad:
            throw r10
        Lae:
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.B0.o1(int, java.lang.Object):void");
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void p(int i) {
        Object[] objArr = this.m;
        if (objArr == null || i < 0 || i >= objArr.length || E0() || (!this.n && D0(i))) {
            super.p(i);
        } else {
            this.m[i] = I2.c;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public final void q(w2 w2Var, n2 n2Var, Object obj) {
        if (x2.c.equals(w2Var)) {
            super.v("values", n2Var, obj);
        }
        super.q(w2Var, n2Var, obj);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    protected final p2 q0(C1185v c1185v, Object obj) {
        if (this.m != null) {
            long jN1 = N1(obj);
            int i = (0 > jN1 || jN1 >= 2147483647L) ? -1 : (int) jN1;
            if (i >= 0) {
                Object[] objArr = this.m;
                if (i < objArr.length && objArr[i] != I2.c) {
                    Object obj2 = objArr[i];
                    n2 n2VarB = B();
                    if (n2VarB == null) {
                        n2VarB = this;
                    }
                    C1 c1 = new C1();
                    C1157l2.P0(c1, n2VarB, B2.Object);
                    c1.X("value", obj2, 0);
                    Boolean bool = Boolean.TRUE;
                    c1.X("writable", bool, 0);
                    c1.X("enumerable", bool, 0);
                    c1.X("configurable", bool, 0);
                    return c1;
                }
            }
        }
        return super.q0(c1185v, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.github.catvod.spider.merge.f1.p2, java.util.List, java.util.Collection
    public final int size() {
        long j = this.j;
        if (j <= 2147483647L) {
            return (int) j;
        }
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("list.length (");
        sbB.append(this.j);
        sbB.append(") exceeds Integer.MAX_VALUE");
        throw new IllegalStateException(sbB.toString());
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(com.github.catvod.spider.merge.C.u.b("fromIndex = ", i));
        }
        if (i2 > size()) {
            throw new IndexOutOfBoundsException(com.github.catvod.spider.merge.C.u.b("toIndex = ", i2));
        }
        if (i <= i2) {
            return new C1195y0(this, i, i2);
        }
        throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + ")");
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (n2Var == this && !E0() && this.m != null && i >= 0 && (this.n || !D0(i))) {
            if (!B0() && this.j <= i) {
                return;
            }
            Object[] objArr = this.m;
            if (i < objArr.length) {
                objArr[i] = obj;
                long j = i;
                if (this.j <= j) {
                    this.j = j + 1;
                    this.l++;
                    return;
                }
                return;
            }
            if (this.n) {
                double d = i;
                double length = objArr.length;
                Double.isNaN(length);
                Double.isNaN(length);
                if (d < length * 1.5d && x1(i + 1)) {
                    this.m[i] = obj;
                    this.j = ((long) i) + 1;
                    this.l++;
                    return;
                }
            }
            this.n = false;
        }
        super.t(i, n2Var, obj);
        if (n2Var == this && (this.k & 1) == 0) {
            long j2 = i;
            if (this.j <= j2) {
                this.j = j2 + 1;
                this.l++;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(C1157l2.y);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return objArr;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        super.v(str, n2Var, obj);
        if (n2Var == this) {
            long jO1 = O1(str);
            if (jO1 >= this.j) {
                this.j = jO1 + 1;
                this.l++;
                this.n = false;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        if (!this.n && D0(i)) {
            return super.w(i, n2Var);
        }
        Object[] objArr = this.m;
        return (objArr == null || i < 0 || i >= objArr.length) ? super.w(i, n2Var) : objArr[i];
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        if (!this.n && D0(i)) {
            return super.z(i, n2Var);
        }
        Object[] objArr = this.m;
        return (objArr == null || i < 0 || i >= objArr.length) ? super.z(i, n2Var) : objArr[i] != I2.c;
    }
}
