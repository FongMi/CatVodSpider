package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1104U extends C1150k {
    private final InterfaceC1103T t;
    private final Object u;
    private final int v;
    private int w;
    private boolean x;
    private String y;

    public C1104U(InterfaceC1103T interfaceC1103T, Object obj, int i, String str, int i2, n2 n2Var) {
        super(n2Var, null);
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.t = interfaceC1103T;
        this.u = obj;
        this.v = i;
        this.w = i2;
        this.y = str;
    }

    static boolean E1(C1104U c1104u, C1104U c1104u2, C1093I c1093i) {
        return c1104u.v == c1104u2.v && c1104u.H1(c1104u2.u) && c1093i.b(c1104u.t, c1104u2.t);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final n2 C() {
        n2 n2VarC = super.C();
        if (n2VarC != null) {
            return n2VarC;
        }
        n2 n2VarM0 = p2.m0(B());
        E(n2VarM0);
        return n2VarM0;
    }

    public final void D1(n2 n2Var) {
        p2.V(n2Var, this.y, this, 2);
    }

    public final void F1() {
        D1(B());
    }

    public final Object G1() {
        return this.u;
    }

    public final boolean H1(Object obj) {
        return obj == null ? this.u == null : obj.equals(this.u);
    }

    public final void I1(String str, n2 n2Var) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.y = str;
        D(n2Var);
    }

    public final void J1(n2 n2Var) {
        this.x = true;
        A1(n2Var);
    }

    public final int K1() {
        return this.v;
    }

    public final RuntimeException L1() {
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("BAD FUNCTION ID=");
        sbB.append(this.v);
        sbB.append(" MASTER=");
        sbB.append(this.t);
        return new IllegalArgumentException(sbB.toString());
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return this.t.c(this, c1185v, n2Var, n2Var2, objArr);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final n2 p1() {
        if (this.x) {
            return null;
        }
        throw C1157l2.C1("msg.not.ctor", this.y);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    final String q1(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        boolean z = (i2 & 1) != 0;
        if (!z) {
            sb.append("function ");
            sb.append(t1());
            sb.append("() { ");
        }
        sb.append("[native code for ");
        InterfaceC1103T interfaceC1103T = this.t;
        if (interfaceC1103T instanceof n2) {
            sb.append(((n2) interfaceC1103T).F());
            sb.append('.');
        }
        sb.append(t1());
        sb.append(", arity=");
        sb.append(this.w);
        sb.append(z ? "]\n" : "] }\n");
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int r1() {
        return this.w;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final String t1() {
        String str = this.y;
        return str == null ? "" : str;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int u1() {
        return this.w;
    }
}
