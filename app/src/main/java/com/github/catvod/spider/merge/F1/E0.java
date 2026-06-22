package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class E0 extends AbstractC1106W {
    Q0 j;
    Object[] k;
    boolean l;
    private C1142i m;
    transient E0 n;

    E0() {
    }

    E0(Q0 q0, C1185v c1185v, n2 n2Var, Object[] objArr, boolean z, boolean z2, boolean z3) {
        Object[] objArr2;
        this.j = q0;
        D(n2Var);
        this.k = objArr == null ? C1157l2.y : objArr;
        this.l = z2;
        int iF1 = q0.F1();
        int iG1 = q0.G1();
        if (iF1 != 0) {
            int i = 0;
            if (z3) {
                if (objArr.length >= iG1) {
                    objArr2 = new Object[objArr.length - iG1];
                    System.arraycopy(objArr, iG1, objArr2, 0, objArr.length - iG1);
                } else {
                    objArr2 = C1157l2.y;
                }
                while (i < iG1) {
                    X(q0.I1(i), i < objArr.length ? objArr[i] : G2.b, 4);
                    i++;
                }
                X(q0.I1(iG1), c1185v.x(n2Var, objArr2), 4);
            } else {
                while (i < iG1) {
                    X(q0.I1(i), i < objArr.length ? objArr[i] : G2.b, 4);
                    i++;
                }
            }
        }
        if (!x("arguments", this) && !z) {
            C1142i c1142i = new C1142i(this);
            this.m = c1142i;
            X("arguments", c1142i, 4);
        }
        if (iF1 != 0) {
            while (iG1 < iF1) {
                String strI1 = q0.I1(iG1);
                if (!x(strI1, this)) {
                    if (q0.H1(iG1)) {
                        X(strI1, G2.b, 13);
                    } else if (!(q0 instanceof C1108Y) || ((C1108Y) q0).N1(strI1)) {
                        X(strI1, G2.b, 4);
                    }
                }
                iG1++;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Call";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1("Call")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        if (iK1 != 1) {
            throw new IllegalArgumentException(String.valueOf(iK1));
        }
        if (n2Var2 != null) {
            throw C1185v.H("msg.only.from.new", "Call");
        }
        Class<?> cls = C1157l2.a;
        c1185v.getClass();
        C1185v.I(C1157l2.P("msg.deprec.ctor", "Call"));
        E0 e0 = new E0();
        e0.E(p2.p0(n2Var));
        return e0;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        return str.equals("constructor") ? 1 : 0;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        if (i != 1) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        j1("Call", i, "constructor", 1);
    }

    public final void p1() {
        C1142i c1142i = this.m;
        if (c1142i != null) {
            c1142i.q1();
        }
    }
}
