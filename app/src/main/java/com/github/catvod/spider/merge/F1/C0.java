package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0 extends AbstractC1088D {
    private int l;
    private n2 m;
    private int n;

    private C0() {
    }

    public C0(n2 n2Var, n2 n2Var2, int i) {
        super(n2Var, "ArrayIterator");
        this.n = 0;
        this.m = n2Var2;
        this.l = i;
    }

    static void t1(p2 p2Var) {
        AbstractC1088D.q1(p2Var, new C0(), "ArrayIterator");
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Array Iterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final String p1() {
        return "ArrayIterator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final boolean r1(C1185v c1185v) {
        return ((long) this.n) >= B0.B1(c1185v, this.m);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1088D
    protected final Object s1(C1185v c1185v, n2 n2Var) {
        if (this.l == 2) {
            int i = this.n;
            this.n = i + 1;
            return Integer.valueOf(i);
        }
        n2 n2Var2 = this.m;
        Object objW = n2Var2.w(this.n, n2Var2);
        if (objW == I2.c) {
            objW = G2.b;
        }
        if (this.l == 1) {
            objW = c1185v.x(n2Var, new Object[]{Integer.valueOf(this.n), objW});
        }
        this.n++;
        return objW;
    }
}
