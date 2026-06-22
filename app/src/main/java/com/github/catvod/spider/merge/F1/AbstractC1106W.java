package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.W, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1106W extends p2 implements InterfaceC1103T {
    private transient C1105V i;

    public AbstractC1106W() {
    }

    public AbstractC1106W(n2 n2Var, n2 n2Var2) {
        super(n2Var, n2Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> T X0(Object obj, Class<T> cls, C1104U c1104u) {
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (obj == 0) {
            throw C1157l2.C1("msg.incompat.call.details", c1104u.t1(), "null", cls.getName());
        }
        throw C1157l2.C1("msg.incompat.call.details", c1104u.t1(), obj.getClass().getName(), cls.getName());
    }

    private p2 d1(w2 w2Var) {
        int iD;
        n2 n2VarB = B();
        if (n2VarB == null) {
            n2VarB = this;
        }
        C1105V c1105v = this.i;
        if (c1105v == null || (iD = c1105v.d(w2Var)) == 0) {
            return null;
        }
        return p2.K(n2VarB, this.i.f(iD), this.i.g(iD));
    }

    private C1104U m1(Object obj, int i, String str, int i2, n2 n2Var) {
        C1185v.h();
        C1104U c1104u = new C1104U(this, obj, i, str, i2, n2Var);
        if (E0()) {
            c1104u.N0();
        }
        return c1104u;
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    public final void P0(String str, int i) {
        int iE;
        p2.P(i);
        int iA1 = a1(str);
        if (iA1 != 0) {
            int i2 = 65535 & iA1;
            if (i != (iA1 >>> 16)) {
                n1(i2, i);
                return;
            }
            return;
        }
        C1105V c1105v = this.i;
        if (c1105v == null || (iE = c1105v.e(str)) == 0) {
            super.P0(str, i);
        } else {
            this.i.n(iE, i);
        }
    }

    public final void S0(int i) {
        C1105V c1105v = new C1105V(this, i);
        synchronized (this) {
            if (this.i != null) {
                throw new IllegalStateException();
            }
            this.i = c1105v;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    protected void T(C1185v c1185v, Object obj, p2 p2Var, boolean z) {
        int iE;
        if (obj instanceof String) {
            String str = (String) obj;
            int iA1 = a1(str);
            if (iA1 != 0) {
                int i = 65535 & iA1;
                if (!p2.z0(p2Var)) {
                    O(p2Var);
                    N(str, q0(c1185v, obj), p2Var);
                    int i2 = iA1 >>> 16;
                    Object objT0 = p2.t0(p2Var, "value");
                    if (objT0 != I2.c && (((i2 & 1) == 0 || (i2 & 4) == 0) && !M0(objT0, f1(i)))) {
                        o1(i, objT0);
                    }
                    P0(str, H(i2, p2Var));
                    return;
                }
                p(i);
            }
            C1105V c1105v = this.i;
            if (c1105v != null && (iE = c1105v.e(str)) != 0) {
                if (!p2.z0(p2Var)) {
                    O(p2Var);
                    N(str, q0(c1185v, obj), p2Var);
                    int iG = this.i.g(iE);
                    Object objT02 = p2.t0(p2Var, "value");
                    if (objT02 != I2.c && (iG & 1) == 0 && !M0(objT02, this.i.f(iE))) {
                        this.i.m(iE, this, objT02);
                    }
                    this.i.n(iE, H(iG, p2Var));
                    if (super.x(str, this)) {
                        super.delete(str);
                        return;
                    }
                    return;
                }
                this.i.b(iE);
            }
        }
        super.T(c1185v, obj, p2Var, z);
    }

    protected final void T0(n2 n2Var, Object obj, int i, String str, int i2) {
        m1(obj, i, str, i2, p2.u0(n2Var)).D1(n2Var);
    }

    protected final Object U0() {
        return super.l("arguments", this);
    }

    protected final boolean V0() {
        return super.x("arguments", this);
    }

    protected final void W0(Object obj) {
        super.v("arguments", this, obj);
    }

    public final C1104U Y0(int i, n2 n2Var, boolean z) {
        if (n2Var != this && n2Var != null) {
            D(n2Var);
            E(p2.p0(n2Var));
        }
        S0(i);
        C1104U c1104uA = this.i.a();
        if (z) {
            N0();
        }
        Z0(c1104uA);
        if (z) {
            c1104uA.N0();
        }
        c1104uA.F1();
        return c1104uA;
    }

    protected void Z0(C1104U c1104u) {
    }

    protected int a1(String str) {
        return 0;
    }

    protected int b1(w2 w2Var) {
        return 0;
    }

    public Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        throw c1104u.L1();
    }

    protected int c1(String str) {
        throw new IllegalStateException(str);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void delete(String str) {
        int iE;
        int iA1 = a1(str);
        if (iA1 != 0 && !E0()) {
            if (((iA1 >>> 16) & 4) == 0) {
                o1(65535 & iA1, I2.c);
                return;
            } else {
                if (C1185v.h().u()) {
                    throw C1157l2.C1("msg.delete.property.with.configurable.false", str);
                }
                return;
            }
        }
        C1105V c1105v = this.i;
        if (c1105v == null || (iE = c1105v.e(str)) == 0) {
            super.delete(str);
        } else {
            if (E0()) {
                return;
            }
            this.i.b(iE);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public Object e(w2 w2Var, n2 n2Var) {
        int iD;
        Object objF;
        Object objE = super.e(w2Var, n2Var);
        I2 i2 = I2.c;
        if (objE != i2) {
            return objE;
        }
        C1105V c1105v = this.i;
        return (c1105v == null || (iD = c1105v.d(w2Var)) == 0 || (objF = this.i.f(iD)) == i2) ? i2 : objF;
    }

    protected String e1(int i) {
        throw new IllegalArgumentException(String.valueOf(i));
    }

    protected Object f1(int i) {
        throw new IllegalStateException(String.valueOf(i));
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    public final int g0(w2 w2Var) {
        int iD;
        C1105V c1105v = this.i;
        return (c1105v == null || (iD = c1105v.d(w2Var)) == 0) ? super.g0(w2Var) : this.i.g(iD);
    }

    protected int g1() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    public final int h0(String str) {
        int iE;
        int iA1 = a1(str);
        if (iA1 != 0) {
            return iA1 >>> 16;
        }
        C1105V c1105v = this.i;
        return (c1105v == null || (iE = c1105v.e(str)) == 0) ? super.h0(str) : this.i.g(iE);
    }

    protected void h1(int i) {
        throw new IllegalStateException(String.valueOf(i));
    }

    public final C1104U i1(Object obj, int i, w2 w2Var, String str, int i2) {
        C1104U c1104uM1 = m1(obj, i, str, i2, p2.u0(this));
        this.i.k(i, w2Var, c1104uM1, 2);
        return c1104uM1;
    }

    public final C1104U j1(Object obj, int i, String str, int i2) {
        return k1(obj, i, str, str, i2);
    }

    public final C1104U k1(Object obj, int i, String str, String str2, int i2) {
        C1104U c1104uM1 = m1(obj, i, str2 != null ? str2 : str, i2, p2.u0(this));
        this.i.l(i, str, c1104uM1);
        return c1104uM1;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object l(String str, n2 n2Var) {
        int iE;
        Object objF;
        Object objF1;
        Object objL = super.l(str, n2Var);
        I2 i2 = I2.c;
        if (objL != i2) {
            return objL;
        }
        int iA1 = a1(str);
        if (iA1 != 0 && (objF1 = f1(iA1 & 65535)) != i2) {
            return objF1;
        }
        C1105V c1105v = this.i;
        return (c1105v == null || (iE = c1105v.e(str)) == 0 || (objF = this.i.f(iE)) == i2) ? i2 : objF;
    }

    public final void l1(int i, Object obj) {
        this.i.k(i, x2.d, obj, 3);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public boolean n(w2 w2Var, n2 n2Var) {
        int iD;
        C1105V c1105v = this.i;
        return (c1105v == null || (iD = c1105v.d(w2Var)) == 0) ? super.n(w2Var, n2Var) : this.i.i(iD);
    }

    protected void n1(int i, int i2) {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("Changing attributes not supported for ");
        sbB.append(F());
        sbB.append(" ");
        sbB.append(e1(i));
        sbB.append(" property");
        throw C1157l2.j("InternalError", sbB.toString());
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public void o(w2 w2Var) {
        int iD;
        C1105V c1105v = this.i;
        if (c1105v == null || (iD = c1105v.d(w2Var)) == 0) {
            super.o(w2Var);
        } else {
            if (E0()) {
                return;
            }
            this.i.b(iD);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    Object[] o0(boolean z, boolean z2) {
        Object[] objArrO0 = super.o0(z, z2);
        C1105V c1105v = this.i;
        if (c1105v != null) {
            objArrO0 = c1105v.h(z, z2, objArrO0);
        }
        int iG1 = g1();
        if (iG1 == 0) {
            return objArrO0;
        }
        Object[] objArr = null;
        int i = 0;
        while (iG1 != 0) {
            String strE1 = e1(iG1);
            int iA1 = a1(strE1);
            if (iA1 != 0) {
                int i2 = iA1 >>> 16;
                if (((i2 & 4) != 0 || I2.c != f1(iG1)) && (z || (i2 & 2) == 0)) {
                    if (i == 0) {
                        objArr = new Object[iG1];
                    }
                    objArr[i] = strE1;
                    i++;
                }
            }
            iG1--;
        }
        if (i == 0) {
            return objArrO0;
        }
        if (objArrO0.length == 0 && objArr.length == i) {
            return objArr;
        }
        Object[] objArr2 = new Object[objArrO0.length + i];
        System.arraycopy(objArrO0, 0, objArr2, 0, objArrO0.length);
        System.arraycopy(objArr, 0, objArr2, objArrO0.length, i);
        return objArr2;
    }

    protected void o1(int i, Object obj) {
        throw new IllegalStateException(String.valueOf(i));
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public void q(w2 w2Var, n2 n2Var, Object obj) {
        int iD;
        C1105V c1105v = this.i;
        if (c1105v == null || (iD = c1105v.d(w2Var)) == 0) {
            super.q(w2Var, n2Var, obj);
        } else {
            if (n2Var == this && E0()) {
                throw C1185v.H("msg.modify.sealed", new Object[0]);
            }
            this.i.m(iD, n2Var, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    protected p2 q0(C1185v c1185v, Object obj) {
        int iE;
        p2 p2VarQ0 = super.q0(c1185v, obj);
        if (p2VarQ0 != null) {
            return p2VarQ0;
        }
        if (!(obj instanceof String)) {
            return C1157l2.j0(obj) ? obj instanceof x2 ? d1((x2) obj) : d1(((M1) obj).r1()) : p2VarQ0;
        }
        String str = (String) obj;
        n2 n2VarB = B();
        if (n2VarB == null) {
            n2VarB = this;
        }
        int iA1 = a1(str);
        if (iA1 != 0) {
            return p2.K(n2VarB, f1(65535 & iA1), iA1 >>> 16);
        }
        C1105V c1105v = this.i;
        if (c1105v == null || (iE = c1105v.e(str)) == 0) {
            return null;
        }
        return p2.K(n2VarB, this.i.f(iE), this.i.g(iE));
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public void v(String str, n2 n2Var, Object obj) {
        int iE;
        int iA1 = a1(str);
        if (iA1 != 0) {
            if (n2Var == this && E0()) {
                throw C1185v.H("msg.modify.sealed", str);
            }
            if (((iA1 >>> 16) & 1) == 0) {
                if (n2Var == this) {
                    o1(65535 & iA1, obj);
                    return;
                } else {
                    n2Var.v(str, n2Var, obj);
                    return;
                }
            }
            return;
        }
        C1105V c1105v = this.i;
        if (c1105v == null || (iE = c1105v.e(str)) == 0) {
            super.v(str, n2Var, obj);
        } else {
            if (n2Var == this && E0()) {
                throw C1185v.H("msg.modify.sealed", str);
            }
            this.i.m(iE, n2Var, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final boolean x(String str, n2 n2Var) {
        int iE;
        int iA1 = a1(str);
        if (iA1 == 0) {
            C1105V c1105v = this.i;
            return (c1105v == null || (iE = c1105v.e(str)) == 0) ? super.x(str, n2Var) : this.i.i(iE);
        }
        if (((iA1 >>> 16) & 4) != 0) {
            return true;
        }
        return I2.c != f1(65535 & iA1);
    }
}
