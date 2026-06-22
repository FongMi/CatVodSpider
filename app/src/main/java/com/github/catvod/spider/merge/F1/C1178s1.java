package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1178s1 extends p2 {
    private static final Double i = Double.valueOf(32.0d);
    public static final /* synthetic */ int j = 0;

    private C1178s1() {
    }

    public static Object S0(Object[] objArr) {
        int i2 = 0;
        double dR1 = C1157l2.r1(objArr, 0);
        if (dR1 != 0.0d && !Double.isNaN(dR1) && !Double.isInfinite(dR1)) {
            long jA1 = C1157l2.A1(dR1);
            if (jA1 != 0) {
                if (((-65536) & jA1) != 0) {
                    jA1 >>>= 16;
                    i2 = 16;
                }
                if ((65280 & jA1) != 0) {
                    i2 += 8;
                    jA1 >>>= 8;
                }
                if ((240 & jA1) != 0) {
                    i2 += 4;
                    jA1 >>>= 4;
                }
                if ((12 & jA1) != 0) {
                    i2 += 2;
                    jA1 >>>= 2;
                }
                if ((2 & jA1) != 0) {
                    i2++;
                    jA1 >>>= 1;
                }
                if ((jA1 & 1) != 0) {
                    i2++;
                }
                return Double.valueOf(32 - i2);
            }
        }
        return i;
    }

    static void T0(n2 n2Var) {
        C1178s1 c1178s1 = new C1178s1();
        c1178s1.E(p2.p0(n2Var));
        c1178s1.D(n2Var);
        c1178s1.X("toSource", "Math", 7);
        c1178s1.U(n2Var, "abs", 1, C1166o1.c);
        c1178s1.U(n2Var, "acos", 1, C1172q1.d);
        c1178s1.U(n2Var, "acosh", 1, C1175r1.e);
        c1178s1.U(n2Var, "asin", 1, Y0.f);
        c1178s1.U(n2Var, "asinh", 1, X0.f);
        c1178s1.U(n2Var, "atan", 1, C1166o1.f);
        c1178s1.U(n2Var, "atanh", 1, C1172q1.f);
        c1178s1.U(n2Var, "atan2", 2, C1175r1.f);
        c1178s1.U(n2Var, "cbrt", 1, C1169p1.f);
        c1178s1.U(n2Var, "ceil", 1, C1132f1.g);
        c1178s1.U(n2Var, "clz32", 1, C1172q1.c);
        c1178s1.U(n2Var, "cos", 1, C1175r1.c);
        c1178s1.U(n2Var, "cosh", 1, C1169p1.c);
        c1178s1.U(n2Var, "exp", 1, C1132f1.d);
        c1178s1.U(n2Var, "expm1", 1, C1160m1.c);
        c1178s1.U(n2Var, "floor", 1, C1163n1.c);
        c1178s1.U(n2Var, "fround", 1, C1148j1.d);
        c1178s1.U(n2Var, "hypot", 2, Y0.d);
        c1178s1.U(n2Var, "imul", 2, X0.d);
        c1178s1.U(n2Var, "log", 1, C1166o1.d);
        c1178s1.U(n2Var, "log1p", 1, C1175r1.d);
        c1178s1.U(n2Var, "log10", 1, C1169p1.d);
        c1178s1.U(n2Var, "log2", 1, C1132f1.e);
        c1178s1.U(n2Var, "max", 2, C1160m1.d);
        c1178s1.U(n2Var, "min", 2, C1163n1.d);
        c1178s1.U(n2Var, "pow", 2, C1148j1.e);
        c1178s1.U(n2Var, "random", 0, Y0.e);
        c1178s1.U(n2Var, "round", 1, X0.e);
        c1178s1.U(n2Var, "sign", 1, C1166o1.e);
        c1178s1.U(n2Var, "sin", 1, C1172q1.e);
        c1178s1.U(n2Var, "sinh", 1, C1169p1.e);
        c1178s1.U(n2Var, "sqrt", 1, C1132f1.f);
        c1178s1.U(n2Var, "tan", 1, C1160m1.e);
        c1178s1.U(n2Var, "tanh", 1, C1163n1.e);
        c1178s1.U(n2Var, "trunc", 1, C1148j1.f);
        c1178s1.X("E", Double.valueOf(2.718281828459045d), 7);
        c1178s1.X("PI", Double.valueOf(3.141592653589793d), 7);
        c1178s1.X("LN10", Double.valueOf(2.302585092994046d), 7);
        c1178s1.X("LN2", Double.valueOf(0.6931471805599453d), 7);
        c1178s1.X("LOG2E", Double.valueOf(1.4426950408889634d), 7);
        c1178s1.X("LOG10E", Double.valueOf(0.4342944819032518d), 7);
        c1178s1.X("SQRT1_2", Double.valueOf(0.7071067811865476d), 7);
        c1178s1.X("SQRT2", Double.valueOf(1.4142135623730951d), 7);
        c1178s1.W(x2.d, "Math", 3);
        p2.V(n2Var, "Math", c1178s1, 2);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Math";
    }
}
