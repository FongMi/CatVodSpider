package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C1160m1 implements InterfaceC1161n {
    public static final /* synthetic */ C1160m1 c = new C1160m1(0);
    public static final /* synthetic */ C1160m1 d = new C1160m1(1);
    public static final /* synthetic */ C1160m1 e = new C1160m1(2);
    public final /* synthetic */ int b;

    public /* synthetic */ C1160m1(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        switch (this.b) {
            case 0:
                int i = C1178s1.j;
                return C1157l2.N1(Math.expm1(C1157l2.r1(objArr, 0)));
            case 1:
                int i2 = C1178s1.j;
                double dMax = Double.NEGATIVE_INFINITY;
                for (int i3 = 0; i3 != objArr.length; i3++) {
                    dMax = Math.max(dMax, C1157l2.p1(objArr[i3]));
                }
                return C1157l2.N1(dMax);
            case 2:
                int i4 = C1178s1.j;
                return C1157l2.N1(Math.tan(C1157l2.r1(objArr, 0)));
            default:
                return I1.U0(c1185v, n2Var, n2Var2, objArr);
        }
    }
}
