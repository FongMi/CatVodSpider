package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1086B implements InterfaceC1098N, y2 {
    protected n2 b = null;

    @Override // com.github.catvod.spider.merge.f1.n2
    public final n2 B() {
        return this.b.B();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final n2 C() {
        return this.b.C();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void D(n2 n2Var) {
        this.b.D(n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void E(n2 n2Var) {
        this.b.E(n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return this.b.F();
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1182u
    public final n2 a(C1185v c1185v, n2 n2Var, Object[] objArr) {
        n2 n2Var2 = this.b;
        if (n2Var2 != null) {
            return ((InterfaceC1098N) n2Var2).a(c1185v, n2Var, objArr);
        }
        try {
            C1086B c1086b = (C1086B) C1086B.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            c1086b.b = objArr.length == 0 ? c1185v.y(n2Var) : C1157l2.t1(c1185v, n2Var, objArr[0]);
            return c1086b;
        } catch (Exception e) {
            C1185v.J(e);
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return ((InterfaceC1098N) this.b).b(c1185v, n2Var, n2Var2, objArr);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void delete(String str) {
        this.b.delete(str);
    }

    @Override // com.github.catvod.spider.merge.f1.y2
    public final Object e(w2 w2Var, n2 n2Var) {
        n2 n2Var2 = this.b;
        return n2Var2 instanceof y2 ? ((y2) n2Var2).e(w2Var, n2Var) : I2.c;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final boolean g(n2 n2Var) {
        return this.b.g(n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object l(String str, n2 n2Var) {
        return this.b.l(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object m(Class<?> cls) {
        return (cls == null || cls == C1157l2.r || cls == C1157l2.p) ? this : this.b.m(cls);
    }

    @Override // com.github.catvod.spider.merge.f1.y2
    public final boolean n(w2 w2Var, n2 n2Var) {
        n2 n2Var2 = this.b;
        if (n2Var2 instanceof y2) {
            return ((y2) n2Var2).n(w2Var, n2Var);
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
        n2 n2Var2 = this.b;
        if (n2Var2 instanceof y2) {
            ((y2) n2Var2).q(w2Var, n2Var, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        this.b.t(i, n2Var, obj);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object[] u() {
        return this.b.u();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        this.b.v(str, n2Var, obj);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object w(int i, n2 n2Var) {
        return this.b.w(i, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final boolean x(String str, n2 n2Var) {
        return this.b.x(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final boolean z(int i, n2 n2Var) {
        return this.b.z(i, n2Var);
    }
}
