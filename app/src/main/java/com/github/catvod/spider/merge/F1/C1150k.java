package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1150k extends AbstractC1106W implements InterfaceC1098N {
    public static final /* synthetic */ int s = 0;
    private Object j;
    private Object k;
    private String l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public C1150k() {
        this.k = I2.c;
        this.l = null;
        this.m = false;
        this.n = 6;
        this.o = 6;
        this.p = 7;
        this.q = 3;
        this.r = 7;
    }

    public C1150k(n2 n2Var, n2 n2Var2) {
        super(n2Var, n2Var2);
        this.k = I2.c;
        this.l = null;
        this.m = false;
        this.n = 6;
        this.o = 6;
        this.p = 7;
        this.q = 3;
        this.r = 7;
    }

    public C1150k(boolean z) {
        this.k = I2.c;
        this.l = null;
        this.n = 6;
        this.o = 6;
        this.p = 7;
        this.q = 3;
        this.r = 7;
        this.m = true;
    }

    static void w1(C1185v c1185v, n2 n2Var) {
        C1150k c1150k = new C1150k();
        c1150k.n = 7;
        c1150k.Y0(6, n2Var, false);
    }

    static Object x1(n2 n2Var) {
        C1150k c1150k = new C1150k(true);
        c1150k.n = 5;
        c1150k.Y0(6, n2Var, false);
        return p2.t0(n2Var, "__GeneratorFunction");
    }

    static boolean y1(C1104U c1104u) {
        if (!c1104u.H1("Function")) {
            return false;
        }
        int iK1 = c1104u.K1();
        return iK1 == 4 || iK1 == 5;
    }

    private static C1150k z1(n2 n2Var, C1104U c1104u) {
        if (n2Var == null) {
            throw C1157l2.D0(null, null);
        }
        Object objM = n2Var.m(C1157l2.p);
        if (objM instanceof C1086B) {
            objM = ((C1086B) objM).b;
        }
        AbstractC1106W.X0(objM, C1150k.class, c1104u);
        return (C1150k) objM;
    }

    public final void A1(Object obj) {
        if ((this.n & 1) != 0) {
            throw new IllegalStateException();
        }
        if (obj == null) {
            obj = I2.d;
        }
        this.j = obj;
        this.n = 7;
    }

    public final void B1() {
        this.q = 3;
        this.r = 3;
        this.p = 3;
    }

    protected final synchronized Object C1() {
        Object obj = this.j;
        if (obj != null) {
            return obj;
        }
        C1 c1 = new C1();
        c1.D(B());
        this.j = c1;
        n2 n2VarP0 = p2.p0(this);
        if (n2VarP0 != c1) {
            c1.E(n2VarP0);
        }
        c1.X("constructor", this, 2);
        return c1;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public String F() {
        return this.m ? "__GeneratorFunction" : "Function";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        c1104u.E(this);
    }

    public n2 a(C1185v c1185v, n2 n2Var, Object[] objArr) {
        n2 n2VarB;
        n2 n2VarS1;
        n2 n2VarP1 = p1();
        if (n2VarP1 != null) {
            Object objB = b(c1185v, n2Var, n2VarP1, objArr);
            return objB instanceof n2 ? (n2) objB : n2VarP1;
        }
        Object objB2 = b(c1185v, n2Var, null, objArr);
        if (!(objB2 instanceof n2)) {
            StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("Bad implementation of call as constructor, name=");
            sbB.append(t1());
            sbB.append(" in ");
            sbB.append(getClass().getName());
            throw new IllegalStateException(sbB.toString());
        }
        n2 n2Var2 = (n2) objB2;
        if (n2Var2.C() == null && n2Var2 != (n2VarS1 = s1())) {
            n2Var2.E(n2VarS1);
        }
        if (n2Var2.B() != null || n2Var2 == (n2VarB = B())) {
            return n2Var2;
        }
        n2Var2.D(n2VarB);
        return n2Var2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected int a1(String str) {
        boolean z;
        str.getClass();
        z = true;
        switch (str) {
            case "arguments":
                return (this.o << 16) | 5;
            case "length":
                int i = this.r;
                if (i >= 0) {
                    return (i << 16) | 1;
                }
                return 0;
            case "prototype":
                if (this.j == null && !(this instanceof Q0)) {
                    z = false;
                }
                if (z) {
                    return (this.n << 16) | 4;
                }
                return 0;
            case "name":
                int i2 = this.q;
                if (i2 >= 0) {
                    return (i2 << 16) | 3;
                }
                return 0;
            case "arity":
                int i3 = this.p;
                if (i3 >= 0) {
                    return (i3 << 16) | 2;
                }
                return 0;
            default:
                return 0;
        }
    }

    public Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return G2.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(com.github.catvod.spider.merge.f1.C1104U r12, com.github.catvod.spider.merge.f1.C1185v r13, com.github.catvod.spider.merge.f1.n2 r14, com.github.catvod.spider.merge.f1.n2 r15, java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1150k.c(com.github.catvod.spider.merge.f1.U, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected int c1(String str) {
        str.getClass();
        switch (str) {
            case "toSource":
                return 3;
            case "toString":
                return 2;
            case "constructor":
                return 1;
            case "bind":
                return 6;
            case "call":
                return 5;
            case "apply":
                return 4;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final String e1(int i) {
        if (i == 1) {
            return "length";
        }
        if (i == 2) {
            return "arity";
        }
        if (i == 3) {
            return "name";
        }
        if (i == 4) {
            return "prototype";
        }
        if (i == 5) {
            return "arguments";
        }
        super.e1(i);
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected Object f1(int i) {
        if (i == 1) {
            return this.r >= 0 ? Integer.valueOf(u1()) : I2.c;
        }
        if (i == 2) {
            return this.p >= 0 ? Integer.valueOf(r1()) : I2.c;
        }
        if (i == 3) {
            if (this.q < 0) {
                return I2.c;
            }
            String str = this.l;
            return str != null ? str : t1();
        }
        if (i == 4) {
            return v1();
        }
        if (i != 5) {
            super.f1(i);
            throw null;
        }
        Object objU0 = V0() ? U0() : this.k;
        if (objU0 != I2.c) {
            return objU0;
        }
        E0 e0 = C1185v.h().d;
        while (true) {
            if (e0 == null) {
                e0 = null;
                break;
            }
            if (e0.j == this) {
                break;
            }
            e0 = e0.n;
        }
        return e0 != null ? e0.l("arguments", e0) : null;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public boolean g(n2 n2Var) {
        Object objT0 = p2.t0(this, "prototype");
        if (!(objT0 instanceof n2)) {
            throw C1157l2.C1("msg.instanceof.bad.prototype", t1());
        }
        n2 n2Var2 = (n2) objT0;
        Class<?> cls = C1157l2.a;
        do {
            n2Var = n2Var.C();
            if (n2Var == null) {
                return false;
            }
        } while (!n2Var.equals(n2Var2));
        return true;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int g1() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected void h1(int i) {
        String str;
        int i2 = 1;
        switch (i) {
            case 1:
                str = "constructor";
                break;
            case 2:
                i2 = 0;
                str = "toString";
                break;
            case 3:
                str = "toSource";
                break;
            case 4:
                i2 = 2;
                str = "apply";
                break;
            case 5:
                str = "call";
                break;
            case 6:
                str = "bind";
                break;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
        j1("Function", i, str, i2);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void n1(int i, int i2) {
        if (i == 1) {
            this.r = i2;
            return;
        }
        if (i == 2) {
            this.p = i2;
            return;
        }
        if (i == 3) {
            this.q = i2;
            return;
        }
        if (i == 4) {
            this.n = i2;
        } else if (i == 5) {
            this.o = i2;
        } else {
            super.n1(i, i2);
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected void o1(int i, Object obj) {
        if (i == 1) {
            if (obj == I2.c) {
                this.r = -1;
                return;
            }
            return;
        }
        if (i == 2) {
            if (obj == I2.c) {
                this.p = -1;
                return;
            }
            return;
        }
        if (i == 3) {
            if (obj != I2.c) {
                this.l = obj instanceof CharSequence ? C1157l2.x1(obj) : "";
                return;
            } else {
                this.q = -1;
                this.l = null;
                return;
            }
        }
        if (i == 4) {
            if ((this.n & 1) == 0) {
                if (obj == null) {
                    obj = I2.d;
                }
                this.j = obj;
                return;
            }
            return;
        }
        if (i != 5) {
            super.o1(i, obj);
            throw null;
        }
        if (obj == I2.c) {
            C1162n0.c();
            throw null;
        }
        if (V0()) {
            W0(obj);
        } else if ((this.o & 1) == 0) {
            this.k = obj;
        }
    }

    public n2 p1() {
        C1 c1 = new C1();
        c1.E(s1());
        c1.D(B());
        return c1;
    }

    String q1(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        boolean z = (i2 & 1) != 0;
        if (!z) {
            sb.append("function ");
            sb.append(t1());
            sb.append("() {\n\t");
        }
        sb.append("[native code, arity=");
        sb.append(r1());
        sb.append("]\n");
        if (!z) {
            sb.append("}\n");
        }
        return sb.toString();
    }

    public int r1() {
        return 0;
    }

    protected final n2 s1() {
        Object objV1 = v1();
        return objV1 instanceof n2 ? (n2) objV1 : p2.p0(this);
    }

    public String t1() {
        return "";
    }

    public int u1() {
        return 0;
    }

    protected final Object v1() {
        Object obj = this.j;
        if (obj == null) {
            return this instanceof Q0 ? C1() : G2.b;
        }
        if (obj == I2.d) {
            return null;
        }
        return obj;
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    public final String w0() {
        return "function";
    }
}
