package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1158m extends C1150k {
    private final InterfaceC1161n t;
    private final n2 u;
    private final Object[] v;
    private final int w;

    public C1158m(C1185v c1185v, n2 n2Var, InterfaceC1161n interfaceC1161n, n2 n2Var2, Object[] objArr) {
        this.t = interfaceC1161n;
        this.u = n2Var2;
        this.v = objArr;
        if (interfaceC1161n instanceof C1150k) {
            this.w = Math.max(0, ((C1150k) interfaceC1161n).u1() - objArr.length);
        } else {
            this.w = 0;
        }
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

    static boolean D1(C1158m c1158m, C1158m c1158m2, C1093I c1093i) {
        return c1093i.b(c1158m.u, c1158m2.u) && c1093i.b(c1158m.t, c1158m2.t) && c1093i.b(c1158m.v, c1158m2.v);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1182u
    public final n2 a(C1185v c1185v, n2 n2Var, Object[] objArr) {
        InterfaceC1161n interfaceC1161n = this.t;
        if (!(interfaceC1161n instanceof InterfaceC1098N)) {
            throw C1157l2.C1("msg.not.ctor", new Object[0]);
        }
        Object[] objArr2 = this.v;
        Object[] objArr3 = new Object[objArr2.length + objArr.length];
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        return ((InterfaceC1098N) interfaceC1161n).a(c1185v, n2Var, objArr3);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        n2 n2VarU0 = this.u;
        if (n2VarU0 == null) {
            Class<?> cls = C1157l2.a;
            if (c1185v.c != null) {
                n2VarU0 = C1157l2.X(c1185v);
            }
        }
        if (n2VarU0 == null) {
            n2VarU0 = p2.u0(n2Var);
        }
        InterfaceC1161n interfaceC1161n = this.t;
        Object[] objArr2 = this.v;
        Object[] objArr3 = new Object[objArr2.length + objArr.length];
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        return interfaceC1161n.b(c1185v, n2Var, n2VarU0, objArr3);
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
    public final String t1() {
        if (!(this.t instanceof C1150k)) {
            return "";
        }
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("bound ");
        sbB.append(((C1150k) this.t).t1());
        return sbB.toString();
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int u1() {
        return this.w;
    }
}
