package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class J1 extends C1150k {
    private InterfaceC1129e2 t;

    private J1(InterfaceC1129e2 interfaceC1129e2) {
        this.t = interfaceC1129e2;
    }

    private static InterfaceC1129e2 D1(C1185v c1185v, String str) {
        int[] iArr = {0};
        String strP = C1185v.p(iArr);
        if (strP == null) {
            iArr[0] = 1;
            strP = "<Script object>";
        }
        c1185v.getClass();
        return c1185v.c(str, null, C1085A.f(), strP, iArr[0]);
    }

    static void E1(n2 n2Var) {
        new J1(null).Y0(4, n2Var, false);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Script";
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1182u
    public final n2 a(C1185v c1185v, n2 n2Var, Object[] objArr) {
        throw C1185v.H("msg.script.is.not.constructor", new Object[0]);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        InterfaceC1129e2 interfaceC1129e2 = this.t;
        return interfaceC1129e2 != null ? interfaceC1129e2.d(c1185v, n2Var) : G2.b;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1("Script")) {
            return super.c(c1104u, c1185v, n2Var, n2Var2, objArr);
        }
        int iK1 = c1104u.K1();
        if (iK1 == 1) {
            J1 j1 = new J1(D1(c1185v, objArr.length != 0 ? C1157l2.x1(objArr[0]) : ""));
            n2 n2VarU0 = p2.u0(n2Var);
            j1.D(n2VarU0);
            j1.E(p2.k0(n2VarU0, "Script"));
            return j1;
        }
        if (iK1 == 2) {
            AbstractC1106W.X0(n2Var2, J1.class, c1104u);
            Object obj = ((J1) n2Var2).t;
            if (obj == null) {
                return "";
            }
            c1185v.getClass();
            return ((Q0) obj).q1(0, 0);
        }
        if (iK1 != 3) {
            if (iK1 != 4) {
                throw new IllegalArgumentException(String.valueOf(iK1));
            }
            throw C1185v.H("msg.cant.call.indirect", "exec");
        }
        AbstractC1106W.X0(n2Var2, J1.class, c1104u);
        J1 j12 = (J1) n2Var2;
        j12.t = D1(c1185v, C1157l2.y1(objArr));
        return j12;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toString":
                return 2;
            case "constructor":
                return 1;
            case "exec":
                return 4;
            case "compile":
                return 3;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        String str2;
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                str2 = "toString";
            } else if (i == 3) {
                str = "compile";
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(String.valueOf(i));
                }
                str2 = "exec";
            }
            j1("Script", i, str2, i2);
        }
        str = "constructor";
        str2 = str;
        i2 = 1;
        j1("Script", i, str2, i2);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    final String q1(int i, int i2) {
        Object obj = this.t;
        return obj instanceof Q0 ? ((Q0) obj).q1(i, i2) : super.q1(i, i2);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int r1() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int u1() {
        return 0;
    }
}
