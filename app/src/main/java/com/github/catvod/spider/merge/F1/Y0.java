package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class Y0 implements InterfaceC1161n {
    public static final /* synthetic */ Y0 c = new Y0(0);
    public static final /* synthetic */ Y0 d = new Y0(1);
    public static final /* synthetic */ Y0 e = new Y0(2);
    public static final /* synthetic */ Y0 f = new Y0(3);
    public final /* synthetic */ int b;

    public /* synthetic */ Y0(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        double dSqrt = Double.NaN;
        switch (this.b) {
            case 0:
                return C1112a1.S0(c1185v, n2Var, objArr);
            case 1:
                int i = C1178s1.j;
                double d2 = 0.0d;
                if (objArr == null) {
                    dSqrt = 0.0d;
                } else {
                    boolean z = false;
                    boolean z2 = false;
                    for (Object obj : objArr) {
                        double dP1 = C1157l2.p1(obj);
                        if (Double.isNaN(dP1)) {
                            z2 = true;
                        } else if (Double.isInfinite(dP1)) {
                            z = true;
                        } else {
                            d2 = (dP1 * dP1) + d2;
                        }
                    }
                    if (z) {
                        dSqrt = Double.POSITIVE_INFINITY;
                    } else if (!z2) {
                        dSqrt = Math.sqrt(d2);
                    }
                }
                return Double.valueOf(dSqrt);
            case 2:
                int i2 = C1178s1.j;
                return C1157l2.N1(Math.random());
            case 3:
                int i3 = C1178s1.j;
                double dR1 = C1157l2.r1(objArr, 0);
                if (!Double.isNaN(dR1) && -1.0d <= dR1 && dR1 <= 1.0d) {
                    dSqrt = Math.asin(dR1);
                }
                return C1157l2.N1(dSqrt);
            default:
                int i4 = I1.n;
                Object obj2 = objArr.length > 0 ? objArr[0] : G2.b;
                InterfaceC1161n interfaceC1161nV = C1157l2.V(C1157l2.t1(c1185v, n2Var, n2Var2), "then", c1185v, n2Var);
                n2 n2Var3 = c1185v.v;
                c1185v.v = null;
                return interfaceC1161nV.b(c1185v, n2Var, n2Var3, new Object[]{G2.b, obj2});
        }
    }
}
