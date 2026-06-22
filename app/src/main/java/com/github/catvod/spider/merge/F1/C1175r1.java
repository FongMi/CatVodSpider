package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C1175r1 implements InterfaceC1161n {
    public static final /* synthetic */ C1175r1 c = new C1175r1(0);
    public static final /* synthetic */ C1175r1 d = new C1175r1(1);
    public static final /* synthetic */ C1175r1 e = new C1175r1(2);
    public static final /* synthetic */ C1175r1 f = new C1175r1(3);
    public static final /* synthetic */ C1175r1 g = new C1175r1(5);
    public final /* synthetic */ int b;

    public /* synthetic */ C1175r1(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        switch (this.b) {
            case 0:
                int i = C1178s1.j;
                double dR1 = C1157l2.r1(objArr, 0);
                return C1157l2.N1(Double.isInfinite(dR1) ? Double.NaN : Math.cos(dR1));
            case 1:
                int i2 = C1178s1.j;
                return C1157l2.N1(Math.log1p(C1157l2.r1(objArr, 0)));
            case 2:
                int i3 = C1178s1.j;
                double dR12 = C1157l2.r1(objArr, 0);
                return !Double.isNaN(dR12) ? Double.valueOf(Math.log(Math.sqrt((dR12 * dR12) - 1.0d) + dR12)) : C1157l2.t;
            case 3:
                int i4 = C1178s1.j;
                return C1157l2.N1(Math.atan2(C1157l2.r1(objArr, 0), C1157l2.r1(objArr, 1)));
            case 4:
                return I1.T0(c1185v, n2Var, n2Var2, objArr);
            default:
                return n2Var2;
        }
    }
}
