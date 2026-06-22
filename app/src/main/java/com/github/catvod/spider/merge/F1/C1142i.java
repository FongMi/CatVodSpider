package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1142i extends AbstractC1106W {
    private Object j;
    private Object k;
    private Object l;
    private int m = 2;
    private int n = 2;
    private int o = 2;
    private E0 p;
    private Object[] q;

    public C1142i(E0 e0) {
        this.p = e0;
        n2 n2VarB = e0.B();
        D(n2VarB);
        E(p2.p0(n2VarB));
        Object[] objArr = e0.k;
        this.q = objArr;
        this.l = Integer.valueOf(objArr.length);
        Q0 q0 = e0.j;
        this.k = q0;
        int iE1 = q0.E1();
        this.j = (iE1 > 130 || iE1 == 0) ? I2.c : null;
        W(x2.c, D2.r1(p2.u0(n2VarB), B2.Array).l("values", n2VarB), 2);
    }

    private Object p1(int i) {
        if (i >= 0) {
            Object[] objArr = this.q;
            if (objArr.length > i) {
                return objArr[i];
            }
        }
        return I2.c;
    }

    private void r1(int i) {
        synchronized (this) {
            Object[] objArr = this.q;
            Object obj = objArr[i];
            I2 i2 = I2.c;
            if (obj != i2) {
                if (objArr == this.p.k) {
                    this.q = (Object[]) objArr.clone();
                }
                this.q[i] = i2;
            }
        }
    }

    private void s1(int i, Object obj) {
        if (t1(i)) {
            String strI1 = this.p.j.I1(i);
            n2 n2Var = this.p;
            n2Var.v(strI1, n2Var, obj);
        }
        synchronized (this) {
            Object[] objArr = this.q;
            if (objArr == this.p.k) {
                this.q = (Object[]) objArr.clone();
            }
            this.q[i] = obj;
        }
    }

    private boolean t1(int i) {
        Q0 q0;
        int iG1;
        if (C1185v.h().u() || i >= (iG1 = (q0 = this.p.j).G1())) {
            return false;
        }
        if (i < iG1 - 1) {
            String strI1 = q0.I1(i);
            for (int i2 = i + 1; i2 < iG1; i2++) {
                if (strI1.equals(q0.I1(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Arguments";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    protected final void T(C1185v c1185v, Object obj, p2 p2Var, boolean z) {
        super.T(c1185v, obj, p2Var, z);
        if (C1157l2.j0(obj)) {
            return;
        }
        double dP1 = C1157l2.p1(obj);
        int i = (int) dP1;
        if (dP1 != i) {
            return;
        }
        Object objP1 = p1(i);
        I2 i2 = I2.c;
        if (objP1 == i2) {
            return;
        }
        if (p2.z0(p2Var)) {
            r1(i);
            return;
        }
        Object objT0 = p2.t0(p2Var, "value");
        if (objT0 == i2) {
            return;
        }
        s1(i, objT0);
        if (p2.C0(p2.t0(p2Var, "writable"))) {
            r1(i);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int a1(String str) {
        int i;
        int i2;
        str.getClass();
        switch (str) {
            case "callee":
                i = 1;
                break;
            case "caller":
                i = 3;
                break;
            case "length":
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        if ((C1185v.h().u() && (i == 1 || i == 3)) || i == 0) {
            return 0;
        }
        if (i == 1) {
            i2 = this.n;
        } else if (i == 2) {
            i2 = this.o;
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            i2 = this.m;
        }
        return (i2 << 16) | i;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final String e1(int i) {
        if (i == 1) {
            return "callee";
        }
        if (i == 2) {
            return "length";
        }
        if (i != 3) {
            return null;
        }
        return "caller";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final Object f1(int i) {
        n2 n2Var;
        if (i == 1) {
            return this.k;
        }
        if (i == 2) {
            return this.l;
        }
        if (i != 3) {
            super.f1(i);
            throw null;
        }
        Object obj = this.j;
        if (obj == I2.d) {
            return null;
        }
        return (obj != null || (n2Var = this.p.n) == null) ? obj : n2Var.l("arguments", n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int g1() {
        return 3;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void n1(int i, int i2) {
        if (i == 1) {
            this.n = i2;
            return;
        }
        if (i == 2) {
            this.o = i2;
        } else if (i == 3) {
            this.m = i2;
        } else {
            super.n1(i, i2);
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    final Object[] o0(boolean z, boolean z2) {
        int iIntValue;
        Object[] objArrO0 = super.o0(z, z2);
        Object[] objArr = this.q;
        if (objArr.length == 0) {
            return objArrO0;
        }
        int length = objArr.length;
        boolean[] zArr = new boolean[length];
        int length2 = objArr.length;
        for (int i = 0; i != objArrO0.length; i++) {
            Object obj = objArrO0[i];
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue < this.q.length && !zArr[iIntValue]) {
                zArr[iIntValue] = true;
                length2--;
            }
        }
        if (!z) {
            for (int i2 = 0; i2 < length; i2++) {
                if (!zArr[i2] && super.z(i2, this)) {
                    zArr[i2] = true;
                    length2--;
                }
            }
        }
        if (length2 == 0) {
            return objArrO0;
        }
        Object[] objArr2 = new Object[objArrO0.length + length2];
        System.arraycopy(objArrO0, 0, objArr2, length2, objArrO0.length);
        int i3 = 0;
        for (int i4 = 0; i4 != this.q.length; i4++) {
            if (!zArr[i4]) {
                objArr2[i3] = Integer.valueOf(i4);
                i3++;
            }
        }
        if (i3 == length2) {
            return objArr2;
        }
        C1162n0.c();
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void o1(int i, Object obj) {
        if (i == 1) {
            this.k = obj;
            return;
        }
        if (i == 2) {
            this.l = obj;
        } else {
            if (i != 3) {
                super.o1(i, obj);
                throw null;
            }
            if (obj == null) {
                obj = I2.d;
            }
            this.j = obj;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void p(int i) {
        if (i >= 0 && i < this.q.length) {
            r1(i);
        }
        super.p(i);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2
    protected final p2 q0(C1185v c1185v, Object obj) {
        Object objP1;
        if (C1157l2.j0(obj) || (obj instanceof n2)) {
            return super.q0(c1185v, obj);
        }
        double dP1 = C1157l2.p1(obj);
        int i = (int) dP1;
        if (dP1 == i && (objP1 = p1(i)) != I2.c) {
            if (t1(i)) {
                String strI1 = this.p.j.I1(i);
                n2 n2Var = this.p;
                objP1 = n2Var.l(strI1, n2Var);
            }
            if (super.z(i, this)) {
                p2 p2VarQ0 = super.q0(c1185v, obj);
                p2VarQ0.v("value", p2VarQ0, objP1);
                return p2VarQ0;
            }
            n2 n2VarB = B();
            if (n2VarB == null) {
                n2VarB = this;
            }
            return p2.K(n2VarB, objP1, 0);
        }
        return super.q0(c1185v, obj);
    }

    final void q1() {
        if (C1185v.h().u()) {
            R0("caller", 0, new C1138h("caller"), true);
            R0("caller", 0, new C1138h("caller"), false);
            R0("callee", 0, new C1138h("callee"), true);
            R0("callee", 0, new C1138h("callee"), false);
            P0("caller", 6);
            P0("callee", 6);
            this.j = null;
            this.k = null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (p1(i) == I2.c) {
            super.t(i, n2Var, obj);
        } else {
            s1(i, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        super.v(str, n2Var, obj);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        Object objP1 = p1(i);
        if (objP1 == I2.c) {
            return super.w(i, n2Var);
        }
        if (!t1(i)) {
            return objP1;
        }
        String strI1 = this.p.j.I1(i);
        n2 n2Var2 = this.p;
        return n2Var2.l(strI1, n2Var2);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        if (p1(i) != I2.c) {
            return true;
        }
        return super.z(i, n2Var);
    }
}
