package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1181t1 extends AbstractC1106W {
    private double j;

    C1181t1(double d) {
        this.j = d;
    }

    private static boolean p1(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d) || Math.floor(d) != d) ? false : true;
    }

    private static boolean q1(Double d) {
        return (d.isInfinite() || d.isNaN() || Math.floor(d.doubleValue()) != d.doubleValue()) ? false : true;
    }

    static Object r1(Object obj) {
        Double dValueOf = Double.valueOf(C1157l2.p1(obj));
        return Boolean.valueOf((dValueOf.isInfinite() || dValueOf.isNaN()) ? false : true);
    }

    private static String s1(double d, Object[] objArr, int i, int i2, int i3, int i4) {
        int iA = 0;
        if (objArr.length != 0) {
            double dL1 = C1157l2.l1(objArr[0]);
            if (dL1 < i3 || dL1 > 100.0d) {
                throw C1157l2.I0(C1157l2.P("msg.bad.precision", C1157l2.x1(objArr[0])));
            }
            iA = com.github.catvod.spider.merge.Q0.a.a(dL1);
            i = i2;
        }
        StringBuilder sb = new StringBuilder();
        C1194y.b(sb, i, iA + i4, d);
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Number";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        c1104u.X("NaN", C1157l2.t, 7);
        c1104u.X("POSITIVE_INFINITY", C1157l2.N1(Double.POSITIVE_INFINITY), 7);
        c1104u.X("NEGATIVE_INFINITY", C1157l2.N1(Double.NEGATIVE_INFINITY), 7);
        c1104u.X("MAX_VALUE", C1157l2.N1(Double.MAX_VALUE), 7);
        c1104u.X("MIN_VALUE", C1157l2.N1(Double.MIN_VALUE), 7);
        c1104u.X("MAX_SAFE_INTEGER", C1157l2.N1(9.007199254740991E15d), 7);
        c1104u.X("MIN_SAFE_INTEGER", C1157l2.N1(-9.007199254740991E15d), 7);
        c1104u.X("EPSILON", C1157l2.N1(2.220446049250313E-16d), 7);
        T0(c1104u, "Number", -1, "isFinite", 1);
        T0(c1104u, "Number", -2, "isNaN", 1);
        T0(c1104u, "Number", -3, "isInteger", 1);
        T0(c1104u, "Number", -4, "isSafeInteger", 1);
        Object objT0 = p2.t0(p2.u0(c1104u), "parseFloat");
        if (objT0 instanceof C1104U) {
            ((C1104U) objT0).D1(c1104u);
        }
        Object objT02 = p2.t0(p2.u0(c1104u), "parseInt");
        if (objT02 instanceof C1104U) {
            ((C1104U) objT02).D1(c1104u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.github.catvod.spider.merge.f1.C1104U r12, com.github.catvod.spider.merge.f1.C1185v r13, com.github.catvod.spider.merge.f1.n2 r14, com.github.catvod.spider.merge.f1.n2 r15, java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1181t1.c(com.github.catvod.spider.merge.f1.U, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toLocaleString":
                return 3;
            case "toPrecision":
                return 8;
            case "toSource":
                return 4;
            case "toString":
                return 2;
            case "constructor":
                return 1;
            case "toFixed":
                return 6;
            case "valueOf":
                return 5;
            case "toExponential":
                return 7;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        String str2;
        int i2 = 1;
        switch (i) {
            case 1:
                str = "constructor";
                j1("Number", i, str, i2);
                return;
            case 2:
                str = "toString";
                j1("Number", i, str, i2);
                return;
            case 3:
                str = "toLocaleString";
                j1("Number", i, str, i2);
                return;
            case 4:
                str2 = "toSource";
                str = str2;
                i2 = 0;
                j1("Number", i, str, i2);
                return;
            case 5:
                str2 = "valueOf";
                str = str2;
                i2 = 0;
                j1("Number", i, str, i2);
                return;
            case 6:
                str = "toFixed";
                j1("Number", i, str, i2);
                return;
            case 7:
                str = "toExponential";
                j1("Number", i, str, i2);
                return;
            case 8:
                str = "toPrecision";
                j1("Number", i, str, i2);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    public final String toString() {
        return C1157l2.G0(this.j, 10);
    }
}
