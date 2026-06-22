package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C1132f1 implements InterfaceC1161n {
    public static final /* synthetic */ C1132f1 c = new C1132f1(0);
    public static final /* synthetic */ C1132f1 d = new C1132f1(1);
    public static final /* synthetic */ C1132f1 e = new C1132f1(2);
    public static final /* synthetic */ C1132f1 f = new C1132f1(3);
    public static final /* synthetic */ C1132f1 g = new C1132f1(4);
    public final /* synthetic */ int b;

    public /* synthetic */ C1132f1(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        double dExp = 0.0d;
        switch (this.b) {
            case 0:
                return C1140h1.y(n2Var, n2Var2);
            case 1:
                int i = C1178s1.j;
                double dR1 = C1157l2.r1(objArr, 0);
                if (dR1 == Double.POSITIVE_INFINITY) {
                    dExp = dR1;
                } else if (dR1 != Double.NEGATIVE_INFINITY) {
                    dExp = Math.exp(dR1);
                }
                return C1157l2.N1(dExp);
            case 2:
                int i2 = C1178s1.j;
                double dR12 = C1157l2.r1(objArr, 0);
                return C1157l2.N1(dR12 < 0.0d ? Double.NaN : Math.log(dR12) * 1.4426950408889634d);
            case 3:
                int i3 = C1178s1.j;
                return C1157l2.N1(Math.sqrt(C1157l2.r1(objArr, 0)));
            case 4:
                int i4 = C1178s1.j;
                return C1157l2.N1(Math.ceil(C1157l2.r1(objArr, 0)));
            default:
                return I1.V0(c1185v, n2Var, n2Var2, objArr);
        }
    }
}
