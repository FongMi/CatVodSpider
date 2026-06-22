package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G0 extends AbstractC1106W implements InterfaceC1098N {
    private Object j;

    public static boolean p1(G0 g0, G0 g02) {
        Object obj = g0.j;
        Object obj2 = g02.j;
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean s1(C1104U c1104u) {
        return c1104u.H1("Continuation") && c1104u.K1() == 1;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Continuation";
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1182u
    public final n2 a(C1185v c1185v, n2 n2Var, Object[] objArr) {
        throw C1185v.F("Direct call is not supported");
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return C1127e0.V(this, c1185v, n2Var, objArr);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1("Continuation")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        if (iK1 != 1) {
            throw new IllegalArgumentException(String.valueOf(iK1));
        }
        throw C1185v.F("Direct call is not supported");
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        return !str.equals("constructor") ? 0 : 1;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        if (i != 1) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        j1("Continuation", i, "constructor", 0);
    }

    public final Object q1() {
        return this.j;
    }

    public final void r1(Object obj) {
        this.j = obj;
    }
}
