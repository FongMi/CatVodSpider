package com.github.catvod.spider.merge.f1;

import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class P0 extends AbstractC1106W {
    private AbstractC1125d2 j;
    private Object k;

    P0() {
    }

    private static Object q1(n2 n2Var) {
        Object objT0 = p2.t0(n2Var, "name");
        I2 i2 = I2.c;
        String strX1 = (objT0 == i2 || G2.b(objT0)) ? "Error" : C1157l2.x1(objT0);
        Object objT02 = p2.t0(n2Var, "message");
        String strX12 = (objT02 == i2 || G2.b(objT02)) ? "" : C1157l2.x1(objT02);
        return strX1.isEmpty() ? strX12 : strX12.isEmpty() ? strX1 : com.github.catvod.spider.merge.I.t0.a(strX1, ": ", strX12);
    }

    static P0 r1(n2 n2Var, C1104U c1104u, Object[] objArr) {
        n2 n2Var2 = (n2) c1104u.l("prototype", c1104u);
        P0 p0 = new P0();
        p0.E(n2Var2);
        p0.D(n2Var);
        int length = objArr.length;
        if (length >= 1) {
            if (!G2.b(objArr[0])) {
                p2.L0(p0, "message", C1157l2.x1(objArr[0]));
                p0.P0("message", 2);
            }
            if (length >= 2) {
                p2.L0(p0, "fileName", objArr[1]);
                if (length >= 3) {
                    p2.L0(p0, "lineNumber", Integer.valueOf(C1157l2.i1(objArr[2])));
                }
            }
        }
        return p0;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Error";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        T0(c1104u, "Error", -1, "captureStackTrace", 2);
        this.j = new C1096L("");
        final O0 o0 = new O0(null);
        I("_ErrorPrototypeProps", o0);
        c1104u.Y("stackTraceLimit", new Supplier() { // from class: com.github.catvod.spider.merge.f1.M0
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = o0.b;
                return i >= 0 ? Integer.valueOf(i) : Double.valueOf(Double.POSITIVE_INFINITY);
            }
        }, new Consumer() { // from class: com.github.catvod.spider.merge.f1.J0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                O0 o02 = o0;
                o02.getClass();
                Object[] objArr = C1185v.x;
                double dP1 = C1157l2.p1(obj);
                o02.b = (Double.isNaN(dP1) || Double.isInfinite(dP1)) ? -1 : (int) dP1;
            }
        }, 0);
        c1104u.Y("prepareStackTrace", new Supplier() { // from class: com.github.catvod.spider.merge.f1.L0
            @Override // java.util.function.Supplier
            public final Object get() {
                InterfaceC1098N interfaceC1098N = o0.c;
                return interfaceC1098N == null ? G2.b : interfaceC1098N;
            }
        }, new Consumer() { // from class: com.github.catvod.spider.merge.f1.I0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC1098N interfaceC1098N;
                O0 o02 = o0;
                o02.getClass();
                if (obj == null || G2.b(obj)) {
                    interfaceC1098N = null;
                } else if (!(obj instanceof InterfaceC1098N)) {
                    return;
                } else {
                    interfaceC1098N = (InterfaceC1098N) obj;
                }
                o02.c = interfaceC1098N;
            }
        }, 0);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        Object objL;
        int iI1;
        if (!c1104u.H1("Error")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        if (iK1 == -1) {
            p2 p2Var = (p2) C1157l2.t1(c1185v, n2Var, objArr[0]);
            n2 n2Var3 = objArr.length > 1 ? (InterfaceC1098N) C1157l2.u1(c1185v, objArr[1], n2Var) : null;
            P0 p0 = (P0) c1185v.z(n2Var2, "Error");
            p0.t1(new C1096L("[object Object]"));
            if (n2Var3 != null && (objL = n2Var3.l("name", n2Var3)) != null && !G2.b(objL)) {
                p0.I("_stackHide", C1157l2.x1(objL));
            }
            p2Var.X("stack", p0.get("stack"), 2);
            return G2.b;
        }
        if (iK1 == 1) {
            P0 p0R1 = r1(n2Var, c1104u, objArr);
            p0R1.t1(new C1096L(""));
            return p0R1;
        }
        if (iK1 == 2) {
            return q1(n2Var2);
        }
        if (iK1 != 3) {
            throw new IllegalArgumentException(String.valueOf(iK1));
        }
        Object objT0 = p2.t0(n2Var2, "name");
        Object objT02 = p2.t0(n2Var2, "message");
        Object objT03 = p2.t0(n2Var2, "fileName");
        Object objT04 = p2.t0(n2Var2, "lineNumber");
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("(new ");
        I2 i2 = I2.c;
        if (objT0 == i2) {
            objT0 = G2.b;
        }
        sbB.append(C1157l2.x1(objT0));
        sbB.append("(");
        if (objT02 != i2 || objT03 != i2 || objT04 != i2) {
            if (objT02 == i2) {
                objT02 = "";
            }
            sbB.append(C1157l2.J1(c1185v, n2Var, objT02));
            if (objT03 != i2 || objT04 != i2) {
                sbB.append(", ");
                sbB.append(C1157l2.J1(c1185v, n2Var, objT03 != i2 ? objT03 : ""));
                if (objT04 != i2 && (iI1 = C1157l2.i1(objT04)) != 0) {
                    sbB.append(", ");
                    sbB.append(C1157l2.w1(iI1));
                }
            }
        }
        sbB.append("))");
        return sbB.toString();
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toSource":
                return 3;
            case "toString":
                return 2;
            case "constructor":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        int i2 = 0;
        if (i == 1) {
            str = "constructor";
            i2 = 1;
        } else if (i == 2) {
            str = "toString";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.valueOf(i));
            }
            str = "toSource";
        }
        j1("Error", i, str, i2);
    }

    public final Object p1() {
        Object objB;
        Object obj = this.k;
        if (obj != null) {
            return obj;
        }
        if (this.j == null) {
            return I2.c;
        }
        int i = -1;
        InterfaceC1098N interfaceC1098N = null;
        O0 o0 = (O0) ((P0) C()).d0("_ErrorPrototypeProps");
        if (o0 != null) {
            i = o0.b;
            interfaceC1098N = o0.c;
        }
        m2[] m2VarArrD = this.j.d(i, (String) d0("_stackHide"));
        if (interfaceC1098N == null) {
            objB = AbstractC1125d2.b(m2VarArrD, this.j.a());
        } else {
            C1185v c1185vI = C1185v.i();
            Object[] objArr = new Object[m2VarArrD.length];
            for (int i2 = 0; i2 < m2VarArrD.length; i2++) {
                F0 f0 = (F0) c1185vI.z(this, "CallSite");
                f0.q1(m2VarArrD[i2]);
                objArr[i2] = f0;
            }
            objB = interfaceC1098N.b(c1185vI, interfaceC1098N, this, new Object[]{this, c1185vI.x(this, objArr)});
        }
        this.k = objB;
        return objB;
    }

    public final void s1(Object obj) {
        this.j = null;
        this.k = obj;
    }

    public final void t1(AbstractC1125d2 abstractC1125d2) {
        if (this.j == null) {
            Y("stack", new Supplier() { // from class: com.github.catvod.spider.merge.f1.N0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.a.p1();
                }
            }, new Consumer() { // from class: com.github.catvod.spider.merge.f1.K0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.s1(obj);
                }
            }, 2);
        }
        this.j = abstractC1125d2;
    }

    public final String toString() {
        Object objQ1 = q1(this);
        return objQ1 instanceof String ? (String) objQ1 : super.toString();
    }
}
