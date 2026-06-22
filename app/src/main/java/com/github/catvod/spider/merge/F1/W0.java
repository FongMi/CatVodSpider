package com.github.catvod.spider.merge.f1;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class W0 extends AbstractC1106W {
    private Object j;

    private W0() {
    }

    private W0(Object obj) {
        this.j = obj;
    }

    public static Object p1(n2 n2Var) {
        return p2.v0(p2.u0(n2Var), "Iterator");
    }

    static void q1(C1185v c1185v, p2 p2Var) {
        new W0().Y0(3, p2Var, false);
        S0.p1(p2Var);
        U0 u0 = new U0();
        u0.E(p2.p0(p2Var));
        u0.D(p2Var);
        p2.V(p2Var, "StopIteration", u0, 2);
        p2Var.I("Iterator", u0);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Iterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1("Iterator")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        boolean z = false;
        if (iK1 != 1) {
            AbstractC1106W.X0(n2Var2, W0.class, c1104u);
            W0 w0 = (W0) n2Var2;
            if (iK1 != 2) {
                if (iK1 == 3) {
                    return n2Var2;
                }
                throw new IllegalArgumentException(String.valueOf(iK1));
            }
            if (C1157l2.v(w0.j, c1185v).booleanValue()) {
                return C1157l2.t(w0.j, c1185v);
            }
            throw new C1155l0(p1(n2Var), null, 0);
        }
        if (objArr.length == 0 || objArr[0] == null || objArr[0] == G2.b) {
            throw C1157l2.C1("msg.no.properties", C1157l2.x1(objArr.length == 0 ? G2.b : objArr[0]));
        }
        n2 n2VarT1 = C1157l2.t1(c1185v, n2Var, objArr[0]);
        if (objArr.length > 1 && C1157l2.g1(objArr[1])) {
            z = true;
        }
        if (n2Var2 != null) {
            if (n2VarT1 instanceof L2) {
                Object objC = ((L2) n2VarT1).c();
                it = objC instanceof Iterator ? (Iterator) objC : null;
                if (objC instanceof Iterable) {
                    it = ((Iterable) objC).iterator();
                }
            }
            if (it != null) {
                n2 n2VarU0 = p2.u0(n2Var);
                return c1185v.s().c(c1185v, n2VarU0, new V0(n2VarU0), V0.class);
            }
            n2 n2VarN1 = C1157l2.n1(c1185v, n2Var, n2VarT1, z);
            if (n2VarN1 != null) {
                return n2VarN1;
            }
        }
        Object objU = C1157l2.u(n2VarT1, c1185v, n2Var, z ? 3 : 5);
        ((C1141h2) objU).h = true;
        W0 w02 = new W0(objU);
        w02.E(p2.k0(n2Var, "Iterator"));
        w02.D(n2Var);
        return w02;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "constructor":
                return 1;
            case "__iterator__":
                return 3;
            case "next":
                return 2;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        int i2 = 1;
        if (i == 1) {
            str = "constructor";
            i2 = 2;
        } else if (i == 2) {
            str = "next";
            i2 = 0;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.valueOf(i));
            }
            str = "__iterator__";
        }
        j1("Iterator", i, str, i2);
    }
}
