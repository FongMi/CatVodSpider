package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C1169p1 implements InterfaceC1161n {
    public static final /* synthetic */ C1169p1 c = new C1169p1(0);
    public static final /* synthetic */ C1169p1 d = new C1169p1(1);
    public static final /* synthetic */ C1169p1 e = new C1169p1(2);
    public static final /* synthetic */ C1169p1 f = new C1169p1(3);
    public final /* synthetic */ int b;

    public /* synthetic */ C1169p1(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        switch (this.b) {
            case 0:
                int i = C1178s1.j;
                return C1157l2.N1(Math.cosh(C1157l2.r1(objArr, 0)));
            case 1:
                int i2 = C1178s1.j;
                return C1157l2.N1(Math.log10(C1157l2.r1(objArr, 0)));
            case 2:
                int i3 = C1178s1.j;
                return C1157l2.N1(Math.sinh(C1157l2.r1(objArr, 0)));
            case 3:
                int i4 = C1178s1.j;
                return C1157l2.N1(Math.cbrt(C1157l2.r1(objArr, 0)));
            default:
                int i5 = I1.n;
                if (!C1157l2.f0(n2Var2)) {
                    throw C1157l2.C1("msg.arg.not.object", C1157l2.E1(n2Var2));
                }
                Object obj = objArr.length > 0 ? objArr[0] : G2.b;
                E1 e1 = new E1(c1185v, n2Var, n2Var2);
                e1.e.b(c1185v, n2Var, G2.d, new Object[]{obj});
                return e1.a;
        }
    }
}
