package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C1166o1 implements InterfaceC1161n {
    public static final /* synthetic */ C1166o1 c = new C1166o1(0);
    public static final /* synthetic */ C1166o1 d = new C1166o1(1);
    public static final /* synthetic */ C1166o1 e = new C1166o1(2);
    public static final /* synthetic */ C1166o1 f = new C1166o1(3);
    public final /* synthetic */ int b;

    public /* synthetic */ C1166o1(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        switch (this.b) {
            case 0:
                int i = C1178s1.j;
                double dR1 = C1157l2.r1(objArr, 0);
                return C1157l2.N1(dR1 != 0.0d ? dR1 < 0.0d ? -dR1 : dR1 : 0.0d);
            case 1:
                int i2 = C1178s1.j;
                double dR12 = C1157l2.r1(objArr, 0);
                return C1157l2.N1(dR12 < 0.0d ? Double.NaN : Math.log(dR12));
            case 2:
                int i3 = C1178s1.j;
                double dR13 = C1157l2.r1(objArr, 0);
                return !Double.isNaN(dR13) ? dR13 == 0.0d ? 1.0d / dR13 > 0.0d ? C1157l2.v : C1157l2.w : Double.valueOf(Math.signum(dR13)) : C1157l2.t;
            default:
                int i4 = C1178s1.j;
                return C1157l2.N1(Math.atan(C1157l2.r1(objArr, 0)));
        }
    }
}
