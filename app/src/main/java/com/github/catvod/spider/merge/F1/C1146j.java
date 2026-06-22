package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1146j extends C1150k {
    private final InterfaceC1161n t;
    private final n2 u;

    public C1146j(C1185v c1185v, n2 n2Var, InterfaceC1161n interfaceC1161n, n2 n2Var2) {
        this.t = interfaceC1161n;
        this.u = n2Var2;
        C1157l2.S0(this, n2Var, false);
        Object objD1 = C1157l2.D1(c1185v);
        C1 c1 = new C1();
        C1157l2.P0(c1, n2Var, B2.Object);
        c1.v("get", c1, objD1);
        c1.v("set", c1, objD1);
        Object obj = Boolean.FALSE;
        c1.v("enumerable", c1, obj);
        c1.v("configurable", c1, obj);
        c1.G0();
        T(c1185v, "caller", c1, false);
        T(c1185v, "arguments", c1, false);
    }

    static boolean D1(C1146j c1146j, C1146j c1146j2, C1093I c1093i) {
        return c1093i.b(c1146j.u, c1146j2.u) && c1093i.b(c1146j.t, c1146j2.t);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1182u
    public final n2 a(C1185v c1185v, n2 n2Var, Object[] objArr) {
        throw C1157l2.C1("msg.not.ctor", q1(0, 0));
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        n2 n2VarX = this.u;
        if (n2VarX == null) {
            n2VarX = C1157l2.X(c1185v);
        }
        return this.t.b(c1185v, n2Var, n2VarX, objArr);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final boolean g(n2 n2Var) {
        InterfaceC1161n interfaceC1161n = this.t;
        if (interfaceC1161n instanceof InterfaceC1098N) {
            return ((InterfaceC1098N) interfaceC1161n).g(n2Var);
        }
        throw C1157l2.C1("msg.not.ctor", new Object[0]);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    final String q1(int i, int i2) {
        InterfaceC1161n interfaceC1161n = this.t;
        return interfaceC1161n instanceof C1150k ? ((C1150k) interfaceC1161n).q1(i, i2) : super.q1(i, i2);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int r1() {
        return u1();
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int u1() {
        InterfaceC1161n interfaceC1161n = this.t;
        if (interfaceC1161n instanceof C1150k) {
            return ((C1150k) interfaceC1161n).u1();
        }
        return 0;
    }
}
