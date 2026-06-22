package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N1 implements n2, y2, InterfaceC1103T, Serializable {
    protected n2 b;
    protected n2 c;

    private N1() {
    }

    protected N1(n2 n2Var, n2 n2Var2) {
        this.c = n2Var;
        this.b = n2Var2;
    }

    static void d(n2 n2Var) {
        N1 n1 = new N1();
        n1.c = n2Var;
        n1.b = p2.p0(n2Var);
        C1104U c1104u = new C1104U(n1, "With", 1, "With", 0, n2Var);
        c1104u.J1(n1);
        c1104u.F1();
    }

    static boolean f(Object obj) {
        if (!(obj instanceof C1104U)) {
            return false;
        }
        C1104U c1104u = (C1104U) obj;
        return c1104u.H1("With") && c1104u.K1() == 1;
    }

    static Object h(C1185v c1185v, n2 n2Var, Object[] objArr) {
        Class<?> cls = C1157l2.a;
        c1185v.getClass();
        C1185v.I(C1157l2.P("msg.deprec.ctor", "With"));
        n2 n2VarU0 = p2.u0(n2Var);
        N1 n1 = new N1();
        n1.b = objArr.length == 0 ? p2.p0(n2VarU0) : C1157l2.t1(c1185v, n2VarU0, objArr[0]);
        n1.c = n2VarU0;
        return n1;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final n2 B() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final n2 C() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void D(n2 n2Var) {
        this.c = n2Var;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void E(n2 n2Var) {
        this.b = n2Var;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "With";
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (c1104u.H1("With") && c1104u.K1() == 1) {
            throw C1185v.H("msg.cant.call.indirect", "With");
        }
        throw c1104u.L1();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void delete(String str) {
        this.b.delete(str);
    }

    @Override // com.github.catvod.spider.merge.f1.y2
    public final Object e(w2 w2Var, n2 n2Var) {
        if (n2Var == this) {
            n2Var = this.b;
        }
        n2 n2Var2 = this.b;
        return n2Var2 instanceof y2 ? ((y2) n2Var2).e(w2Var, n2Var) : I2.c;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final boolean g(n2 n2Var) {
        return this.b.g(n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object l(String str, n2 n2Var) {
        if (n2Var == this) {
            n2Var = this.b;
        }
        return this.b.l(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object m(Class<?> cls) {
        return this.b.m(cls);
    }

    @Override // com.github.catvod.spider.merge.f1.y2
    public final boolean n(w2 w2Var, n2 n2Var) {
        n2 n2Var2 = this.b;
        if (n2Var2 instanceof y2) {
            return ((y2) n2Var2).n(w2Var, n2Var2);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.f1.y2
    public final void o(w2 w2Var) {
        n2 n2Var = this.b;
        if (n2Var instanceof y2) {
            ((y2) n2Var).o(w2Var);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void p(int i) {
        this.b.p(i);
    }

    @Override // com.github.catvod.spider.merge.f1.y2
    public final void q(w2 w2Var, n2 n2Var, Object obj) {
        if (n2Var == this) {
            n2Var = this.b;
        }
        n2 n2Var2 = this.b;
        if (n2Var2 instanceof y2) {
            ((y2) n2Var2).q(w2Var, n2Var, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (n2Var == this) {
            n2Var = this.b;
        }
        this.b.t(i, n2Var, obj);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object[] u() {
        return this.b.u();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        if (n2Var == this) {
            n2Var = this.b;
        }
        this.b.v(str, n2Var, obj);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        if (n2Var == this) {
            n2Var = this.b;
        }
        return this.b.w(i, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final boolean x(String str, n2 n2Var) {
        n2 n2Var2 = this.b;
        return n2Var2.x(str, n2Var2);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        n2 n2Var2 = this.b;
        return n2Var2.z(i, n2Var2);
    }
}
