package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.Y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1108Y extends Q0 implements InterfaceC1129e2 {
    C1131f0 t;
    Object u;

    private C1108Y(C1108Y c1108y, int i) {
        this.t = c1108y.t.i[i];
        this.u = c1108y.u;
    }

    private C1108Y(C1131f0 c1131f0) {
        this.t = c1131f0;
        C1185v.h();
        this.u = null;
    }

    static C1108Y K1(C1185v c1185v, n2 n2Var, C1108Y c1108y, int i) {
        C1108Y c1108y2 = new C1108Y(c1108y, i);
        C1157l2.S0(c1108y2, n2Var, c1108y2.t.B);
        return c1108y2;
    }

    static C1108Y L1(C1185v c1185v, n2 n2Var, C1131f0 c1131f0) {
        C1108Y c1108y = new C1108Y(c1131f0);
        C1157l2.S0(c1108y, n2Var, c1108y.t.B);
        return c1108y;
    }

    static C1108Y M1(C1131f0 c1131f0) {
        return new C1108Y(c1131f0);
    }

    @Override // com.github.catvod.spider.merge.f1.Q0
    public final String D1() {
        return C1127e0.I(this.t);
    }

    @Override // com.github.catvod.spider.merge.f1.Q0
    protected final int E1() {
        return this.t.z;
    }

    @Override // com.github.catvod.spider.merge.f1.Q0
    protected final int F1() {
        return this.t.r.length;
    }

    @Override // com.github.catvod.spider.merge.f1.Q0
    protected final int G1() {
        C1131f0 c1131f0 = this.t;
        boolean z = c1131f0.u;
        int i = c1131f0.t;
        return z ? i - 1 : i;
    }

    @Override // com.github.catvod.spider.merge.f1.Q0
    protected final boolean H1(int i) {
        return this.t.s[i];
    }

    @Override // com.github.catvod.spider.merge.f1.Q0
    protected final String I1(int i) {
        return this.t.r[i];
    }

    @Override // com.github.catvod.spider.merge.f1.Q0
    public final Object J1(C1185v c1185v, n2 n2Var, int i, Object obj, Object obj2) {
        return C1127e0.W(c1185v, i, obj, obj2);
    }

    final boolean N1(String str) {
        int i = 0;
        while (true) {
            C1131f0[] c1131f0Arr = this.t.i;
            if (i >= (c1131f0Arr == null ? 0 : c1131f0Arr.length)) {
                return true;
            }
            C1131f0 c1131f0 = c1131f0Arr[i];
            if (!c1131f0.H && str.equals(c1131f0.b)) {
                return false;
            }
            i++;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        Class<?> cls = C1157l2.a;
        return !(c1185v.c != null) ? C1157l2.p(this, c1185v, n2Var, n2Var2, objArr, this.t.A) : C1127e0.S(this, c1185v, n2Var, n2Var2, objArr);
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1129e2
    public final Object d(C1185v c1185v, n2 n2Var) {
        C1131f0 c1131f0 = this.t;
        if (!(c1131f0.e == 0)) {
            throw new IllegalStateException();
        }
        Class<?> cls = C1157l2.a;
        Object objP = !(c1185v.c != null) ? C1157l2.p(this, c1185v, n2Var, n2Var, C1157l2.y, c1131f0.A) : C1127e0.S(this, c1185v, n2Var, n2Var, C1157l2.y);
        c1185v.C();
        return objP;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final String t1() {
        String str = this.t.b;
        return str == null ? "" : str;
    }
}
