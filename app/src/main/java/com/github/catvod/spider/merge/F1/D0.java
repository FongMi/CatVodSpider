package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class D0 extends AbstractC1106W {
    private boolean j;

    D0(boolean z) {
        this.j = z;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Boolean";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1("Boolean")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        if (iK1 == 1) {
            boolean zG1 = false;
            if (objArr.length != 0) {
                if (objArr[0] instanceof p2) {
                    ((p2) objArr[0]).getClass();
                }
                zG1 = C1157l2.g1(objArr[0]);
            }
            if (n2Var2 == null) {
                return new D0(zG1);
            }
            Class<?> cls = C1157l2.a;
            return Boolean.valueOf(zG1);
        }
        AbstractC1106W.X0(n2Var2, D0.class, c1104u);
        boolean z = ((D0) n2Var2).j;
        if (iK1 == 2) {
            return z ? "true" : "false";
        }
        if (iK1 == 3) {
            return z ? "(new Boolean(true))" : "(new Boolean(false))";
        }
        if (iK1 != 4) {
            throw new IllegalArgumentException(String.valueOf(iK1));
        }
        Class<?> cls2 = C1157l2.a;
        return Boolean.valueOf(z);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toSource":
                return 3;
            case "toString":
                return 2;
            case "constructor":
                return 1;
            case "valueOf":
                return 4;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        int i2 = 0;
        if (i == 1) {
            str = "constructor";
            i2 = 1;
        } else if (i == 2) {
            str = "toString";
        } else if (i == 3) {
            str = "toSource";
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(String.valueOf(i));
            }
            str = "valueOf";
        }
        j1("Boolean", i, str, i2);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final Object m(Class<?> cls) {
        return cls == C1157l2.a ? Boolean.valueOf(this.j) : super.m(cls);
    }
}
