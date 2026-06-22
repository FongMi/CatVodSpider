package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1088D extends AbstractC1106W {
    protected boolean j = false;
    private String k;

    protected AbstractC1088D() {
    }

    protected AbstractC1088D(n2 n2Var, String str) {
        this.k = str;
        n2 n2VarU0 = p2.u0(n2Var);
        D(n2VarU0);
        E((AbstractC1106W) p2.v0(n2VarU0, str));
    }

    protected static void q1(p2 p2Var, AbstractC1106W abstractC1106W, String str) {
        abstractC1106W.D(p2Var);
        abstractC1106W.E(p2.p0(p2Var));
        abstractC1106W.S0(3);
        p2Var.I(str, abstractC1106W);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int b1(w2 w2Var) {
        if (x2.c.equals(w2Var)) {
            return 2;
        }
        return x2.d.equals(w2Var) ? 3 : 0;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1(p1())) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        AbstractC1106W.X0(n2Var2, AbstractC1088D.class, c1104u);
        AbstractC1088D abstractC1088D = (AbstractC1088D) n2Var2;
        if (iK1 != 1) {
            if (iK1 == 2) {
                return abstractC1088D;
            }
            throw new IllegalArgumentException(String.valueOf(iK1));
        }
        abstractC1088D.getClass();
        Object objS1 = G2.b;
        boolean z = abstractC1088D.r1(c1185v) || abstractC1088D.j;
        if (z) {
            abstractC1088D.j = true;
        } else {
            objS1 = abstractC1088D.s1(c1185v, n2Var);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        n2 n2VarY = c1185v.y(n2Var);
        p2.L0(n2VarY, "value", objS1);
        p2.L0(n2VarY, "done", boolValueOf);
        return n2VarY;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        return "next".equals(str) ? 1 : 0;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        if (i == 1) {
            j1(p1(), i, "next", 0);
        } else if (i == 2) {
            i1(p1(), i, x2.c, "[Symbol.iterator]", 3);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.valueOf(i));
            }
            l1(3, F());
        }
    }

    protected String p1() {
        return this.k;
    }

    protected abstract boolean r1(C1185v c1185v);

    protected abstract Object s1(C1185v c1185v, n2 n2Var);
}
