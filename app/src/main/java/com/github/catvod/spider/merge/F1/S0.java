package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S0 extends AbstractC1106W {
    private Q0 j;
    private Object k;
    private String l;
    private int m;
    private boolean n = true;
    private boolean o;

    private S0() {
    }

    public S0(n2 n2Var, Q0 q0, Object obj) {
        this.j = q0;
        this.k = obj;
        n2 n2VarU0 = p2.u0(n2Var);
        D(n2VarU0);
        E((S0) p2.v0(n2VarU0, "Generator"));
    }

    static S0 p1(p2 p2Var) {
        S0 s0 = new S0();
        s0.D(p2Var);
        s0.E(p2.p0(p2Var));
        s0.S0(5);
        p2Var.I("Generator", s0);
        return s0;
    }

    private Object q1(C1185v c1185v, n2 n2Var, int i, Object obj) {
        if (this.k == null) {
            if (i == 2) {
                return G2.b;
            }
            if (i != 1) {
                obj = W0.p1(n2Var);
            }
            throw new C1155l0(obj, this.l, this.m);
        }
        try {
            try {
                synchronized (this) {
                    if (this.o) {
                        throw C1157l2.C1("msg.already.exec.gen", new Object[0]);
                    }
                    this.o = true;
                }
                Object objJ1 = this.j.J1(c1185v, n2Var, i, this.k, obj);
                synchronized (this) {
                    this.o = false;
                }
                if (i == 2) {
                    this.k = null;
                }
                return objJ1;
            } catch (R0 unused) {
                G2 g2 = G2.b;
                synchronized (this) {
                    this.o = false;
                    if (i == 2) {
                        this.k = null;
                    }
                    return g2;
                }
            } catch (AbstractC1125d2 e) {
                this.m = e.g();
                this.l = e.h();
                this.k = null;
                throw e;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.o = false;
                if (i == 2) {
                    this.k = null;
                }
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Generator";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1("Generator")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        AbstractC1106W.X0(n2Var2, S0.class, c1104u);
        S0 s0 = (S0) n2Var2;
        if (iK1 == 1) {
            return s0.q1(c1185v, n2Var, 2, new R0());
        }
        if (iK1 == 2) {
            s0.n = false;
            return s0.q1(c1185v, n2Var, 0, G2.b);
        }
        if (iK1 != 3) {
            if (iK1 == 4) {
                return s0.q1(c1185v, n2Var, 1, objArr.length > 0 ? objArr[0] : G2.b);
            }
            if (iK1 == 5) {
                return n2Var2;
            }
            throw new IllegalArgumentException(String.valueOf(iK1));
        }
        Object obj = objArr.length > 0 ? objArr[0] : G2.b;
        if (!s0.n || obj.equals(G2.b)) {
            return s0.q1(c1185v, n2Var, 0, obj);
        }
        throw C1157l2.C1("msg.send.newborn", new Object[0]);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "__iterator__":
                return 5;
            case "next":
                return 2;
            case "send":
                return 3;
            case "close":
                return 1;
            case "throw":
                return 4;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        String str2;
        int i2 = 1;
        if (i == 1) {
            str = "close";
        } else if (i != 2) {
            if (i == 3) {
                str2 = "send";
            } else if (i == 4) {
                str2 = "throw";
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(String.valueOf(i));
                }
                str = "__iterator__";
            }
            str = str2;
            i2 = 0;
        } else {
            str = "next";
        }
        j1("Generator", i, str, i2);
    }
}
