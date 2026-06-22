package com.github.catvod.spider.merge.f1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class M1 extends AbstractC1106W implements w2 {
    private static final Object l = new Object();
    private static final Object m = new Object();
    private final x2 j;
    private final M1 k;

    private M1() {
        this.j = new x2("");
        this.k = null;
    }

    public M1(M1 m1) {
        this.j = m1.j;
        this.k = m1.k;
    }

    M1(x2 x2Var) {
        this.j = x2Var;
        this.k = this;
    }

    public static M1 p1(C1185v c1185v, n2 n2Var, Object[] objArr) {
        Object obj = m;
        c1185v.D(obj);
        try {
            M1 m1 = (M1) c1185v.A(n2Var, "Symbol", objArr);
            c1185v.E(obj);
            return m1;
        } catch (Throwable th) {
            c1185v.E(m);
            throw th;
        }
    }

    private Map<String, M1> q1() {
        p2 p2Var = (p2) p2.u0(this);
        Object obj = l;
        Map<String, M1> map = (Map) p2Var.d0(obj);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        p2Var.I(obj, map2);
        return map2;
    }

    private static M1 s1(C1185v c1185v, n2 n2Var, Object obj) {
        try {
            return (M1) C1157l2.t1(c1185v, n2Var, obj);
        } catch (ClassCastException unused) {
            throw C1157l2.C1("msg.invalid.type", obj.getClass().getName());
        }
    }

    private static boolean t1() {
        C1185v c1185vI = C1185v.i();
        return c1185vI != null && c1185vI.u();
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Symbol";
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void Z0(C1104U c1104u) {
        T0(c1104u, "Symbol", -1, "for", 1);
        T0(c1104u, "Symbol", -2, "keyFor", 1);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int b1(w2 w2Var) {
        if (x2.d.equals(w2Var)) {
            return 3;
        }
        return x2.i.equals(w2Var) ? 5 : 0;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (!c1104u.H1("Symbol")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        if (iK1 == -2) {
            Object obj = objArr.length > 0 ? objArr[0] : G2.b;
            if (!(obj instanceof M1)) {
                Class<?> cls = C1157l2.a;
                int[] iArr = {0};
                String strP = C1185v.p(iArr);
                throw new C1155l0(c1185v.A(n2Var, "TypeError", new Object[]{"Not a Symbol", strP, Integer.valueOf(iArr[0])}), strP, iArr[0]);
            }
            M1 m1 = (M1) obj;
            for (Map.Entry<String, M1> entry : q1().entrySet()) {
                if (entry.getValue().j == m1.j) {
                    return entry.getKey();
                }
            }
            return G2.b;
        }
        if (iK1 == -1) {
            String strX1 = C1157l2.x1(objArr.length > 0 ? objArr[0] : G2.b);
            Map<String, M1> mapQ1 = q1();
            M1 m12 = mapQ1.get(strX1);
            if (m12 != null) {
                return m12;
            }
            M1 m1P1 = p1(c1185v, n2Var, new Object[]{strX1});
            mapQ1.put(strX1, m1P1);
            return m1P1;
        }
        if (iK1 == 1) {
            if (n2Var2 != null) {
                return p1(c1185v, n2Var, objArr);
            }
            if (c1185v.q(m) != null) {
                return objArr.length > 1 ? new M1((x2) objArr[1]) : new M1(new x2((objArr.length <= 0 || G2.b.equals(objArr[0])) ? "" : C1157l2.x1(objArr[0])));
            }
            throw C1157l2.C1("msg.no.symbol.new", new Object[0]);
        }
        if (iK1 == 2) {
            return s1(c1185v, n2Var, n2Var2).toString();
        }
        if (iK1 == 4 || iK1 == 5) {
            return s1(c1185v, n2Var, n2Var2).k;
        }
        throw c1104u.L1();
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
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

    public final boolean equals(Object obj) {
        return this.j.equals(obj);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        if (i == 1) {
            str = "constructor";
        } else if (i == 2) {
            str = "toString";
        } else if (i == 3) {
            l1(i, "Symbol");
            return;
        } else {
            if (i != 4) {
                if (i == 5) {
                    i1("Symbol", i, x2.i, "Symbol.toPrimitive", 1);
                    return;
                } else {
                    super.h1(i);
                    throw null;
                }
            }
            str = "valueOf";
        }
        j1("Symbol", i, str, 0);
    }

    public final int hashCode() {
        x2 x2Var = this.j;
        x2Var.getClass();
        return System.identityHashCode(x2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.y2
    public final void q(w2 w2Var, n2 n2Var, Object obj) {
        if (!u1()) {
            super.q(w2Var, n2Var, obj);
        } else if (t1()) {
            throw C1157l2.C1("msg.no.assign.symbol.strict", new Object[0]);
        }
    }

    final x2 r1() {
        return this.j;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void t(int i, n2 n2Var, Object obj) {
        if (!u1()) {
            super.t(i, n2Var, obj);
        } else if (t1()) {
            throw C1157l2.C1("msg.no.assign.symbol.strict", new Object[0]);
        }
    }

    public final String toString() {
        return this.j.toString();
    }

    public final boolean u1() {
        return this.k == this;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final void v(String str, n2 n2Var, Object obj) {
        if (!u1()) {
            super.v(str, n2Var, obj);
        } else if (t1()) {
            throw C1157l2.C1("msg.no.assign.symbol.strict", new Object[0]);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.p2
    public final String w0() {
        return u1() ? "symbol" : "object";
    }
}
