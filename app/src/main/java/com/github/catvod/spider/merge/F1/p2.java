package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.i1.InterfaceC1262a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class p2 implements n2, y2, Serializable, InterfaceC1262a, InterfaceC1179t {
    private static final Comparator<Object> h;
    private n2 b;
    private n2 c;
    private transient u2 d;
    private volatile Map<Object, Object> e;
    private boolean f;
    private boolean g;

    static {
        try {
            p2.class.getMethod("l0", new Class[0]);
            h = new o2();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public p2() {
        this.f = true;
        this.g = false;
        this.d = Q();
    }

    public p2(n2 n2Var, n2 n2Var2) {
        this.f = true;
        this.g = false;
        if (n2Var == null) {
            throw new IllegalArgumentException();
        }
        this.c = n2Var;
        this.b = n2Var2;
        this.d = Q();
    }

    protected static boolean A0(p2 p2Var) {
        return y0(p2Var, "value") || y0(p2Var, "writable");
    }

    protected static boolean C0(Object obj) {
        return !F0(obj);
    }

    protected static boolean F0(Object obj) {
        return obj != I2.c && C1157l2.g1(obj);
    }

    private boolean H0(String str, n2 n2Var, Object obj, int i) {
        s2 s2VarR;
        if (!this.f && C1185v.h().u()) {
            throw C1157l2.C1("msg.not.extensible", new Object[0]);
        }
        if (this != n2Var) {
            s2VarR = this.d.r(str, 0);
            if (s2VarR == null) {
                return false;
            }
        } else {
            if (this.f) {
                M(str, 0);
                s2 s2VarI = this.d.i(str, 0, 13);
                int iA = s2VarI.a();
                if ((iA & 1) == 0) {
                    throw C1185v.H("msg.var.redecl", str);
                }
                if ((iA & 8) != 0) {
                    s2VarI.e = obj;
                    if (i != 8) {
                        s2VarI.h(iA & (-9));
                    }
                }
                return true;
            }
            s2VarR = this.d.r(str, 0);
            if (s2VarR == null) {
                return true;
            }
        }
        C1185v c1185vI = C1185v.i();
        return s2VarR.i(obj, this, n2Var, c1185vI != null ? c1185vI.u() : false);
    }

    private boolean I0(Object obj, int i, n2 n2Var, Object obj2) {
        C1185v c1185vI = C1185v.i();
        return J0(obj, i, n2Var, obj2, c1185vI == null ? false : c1185vI.u());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0146  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Member, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.reflect.AccessibleObject] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.reflect.AccessibleObject] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Method[]] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.github.catvod.spider.merge.f1.k, com.github.catvod.spider.merge.f1.p2] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.reflect.Constructor[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.github.catvod.spider.merge.f1.O, com.github.catvod.spider.merge.f1.k, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.p2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [com.github.catvod.spider.merge.f1.n2] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.github.catvod.spider.merge.f1.n2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.reflect.Method] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.github.catvod.spider.merge.f1.C1150k J(com.github.catvod.spider.merge.f1.n2 r21, java.lang.Class r22, boolean r23) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.p2.J(com.github.catvod.spider.merge.f1.n2, java.lang.Class, boolean):com.github.catvod.spider.merge.f1.k");
    }

    protected static p2 K(n2 n2Var, Object obj, int i) {
        C1 c1 = new C1();
        C1157l2.P0(c1, n2Var, B2.Object);
        c1.X("value", obj, 0);
        c1.Q0(i, true);
        return c1;
    }

    public static void K0(n2 n2Var, int i, Object obj) {
        n2 n2VarI0 = i0(n2Var, i);
        if (n2VarI0 == null) {
            n2VarI0 = n2Var;
        }
        n2VarI0.t(i, n2Var, obj);
    }

    public static Object L(C1185v c1185v, n2 n2Var, Object[] objArr) {
        Object objT0 = t0(n2Var, "toJSON");
        if (!(objT0 instanceof InterfaceC1098N)) {
            throw C1157l2.D0(n2Var, "toJSON");
        }
        InterfaceC1098N interfaceC1098N = (InterfaceC1098N) objT0;
        n2 n2VarU0 = u0(n2Var);
        if (c1185v != null) {
            return interfaceC1098N.b(c1185v, n2VarU0, n2Var, objArr);
        }
        try {
            return interfaceC1098N.b(C1185v.f(C1188w.a()), n2VarU0, n2Var, objArr);
        } finally {
        }
    }

    public static void L0(n2 n2Var, String str, Object obj) {
        n2 n2VarJ0 = j0(n2Var, str);
        if (n2VarJ0 == null) {
            n2VarJ0 = n2Var;
        }
        n2VarJ0.v(str, n2Var, obj);
    }

    private void M(Object obj, int i) {
        if (this.g) {
            throw C1185v.H("msg.modify.sealed", obj != null ? obj.toString() : Integer.toString(i));
        }
    }

    static void P(int i) {
        if ((i & (-16)) != 0) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    private static u2 Q() {
        C1185v c1185vI = C1185v.i();
        return (c1185vI == null || !c1185vI.t(17)) ? new u2(0) : new z2(0);
    }

    public static void V(n2 n2Var, String str, Object obj, int i) {
        if (n2Var instanceof p2) {
            ((p2) n2Var).X(str, obj, i);
        } else {
            n2Var.v(str, n2Var, obj);
        }
    }

    protected static n2 Z(Object obj) {
        if (obj instanceof n2) {
            return (n2) obj;
        }
        throw C1157l2.C1("msg.arg.not.object", C1157l2.E1(obj));
    }

    protected static p2 a0(Object obj) {
        if (obj instanceof p2) {
            return (p2) obj;
        }
        if (obj instanceof C1086B) {
            return (p2) ((C1086B) obj).b;
        }
        throw C1157l2.C1("msg.arg.not.object", C1157l2.E1(obj));
    }

    protected static y2 b0(Object obj) {
        if (obj instanceof y2) {
            return (y2) obj;
        }
        throw C1157l2.C1("msg.object.not.symbolscriptable", C1157l2.E1(obj));
    }

    private s2 e0(String str, int i) {
        s2 s2VarR = this.d.r(str, i);
        if (s2VarR != null) {
            return s2VarR;
        }
        if (str == null) {
            str = Integer.toString(i);
        }
        throw C1185v.H("msg.prop.not.found", str);
    }

    static n2 i0(n2 n2Var, int i) {
        n2 n2VarC = n2Var;
        while (!n2VarC.z(i, n2Var) && (n2VarC = n2VarC.C()) != null) {
        }
        return n2VarC;
    }

    static n2 j0(n2 n2Var, String str) {
        n2 n2VarC = n2Var;
        while (!n2VarC.x(str, n2Var) && (n2VarC = n2VarC.C()) != null) {
        }
        return n2VarC;
    }

    public static n2 k0(n2 n2Var, String str) {
        Object objL;
        Object objT0 = t0(u0(n2Var), str);
        if (!(objT0 instanceof C1150k)) {
            if (objT0 instanceof n2) {
                n2 n2Var2 = (n2) objT0;
                objL = n2Var2.l("prototype", n2Var2);
            }
            return null;
        }
        objL = ((C1150k) objT0).v1();
        if (objL instanceof n2) {
            return (n2) objL;
        }
        return null;
    }

    public static n2 m0(n2 n2Var) {
        return D2.r1(u0(n2Var), B2.Function);
    }

    public static n2 p0(n2 n2Var) {
        return D2.r1(u0(n2Var), B2.Object);
    }

    public static Object r0(n2 n2Var, int i) {
        Object objW;
        n2 n2VarC = n2Var;
        do {
            objW = n2VarC.w(i, n2Var);
            if (objW != I2.c) {
                break;
            }
            n2VarC = n2VarC.C();
        } while (n2VarC != null);
        return objW;
    }

    public static Object s0(n2 n2Var, w2 w2Var) {
        Object objE;
        n2 n2VarC = n2Var;
        do {
            objE = b0(n2VarC).e(w2Var, n2Var);
            if (objE != I2.c) {
                break;
            }
            n2VarC = n2VarC.C();
        } while (n2VarC != null);
        return objE;
    }

    public static Object t0(n2 n2Var, String str) {
        Object objL;
        n2 n2VarC = n2Var;
        do {
            objL = n2VarC.l(str, n2Var);
            if (objL != I2.c) {
                break;
            }
            n2VarC = n2VarC.C();
        } while (n2VarC != null);
        return objL;
    }

    public static n2 u0(n2 n2Var) {
        while (true) {
            n2 n2VarB = n2Var.B();
            if (n2VarB == null) {
                return n2Var;
            }
            n2Var = n2VarB;
        }
    }

    public static Object v0(n2 n2Var, Object obj) {
        Object objD0;
        n2 n2VarU0 = u0(n2Var);
        do {
            if ((n2VarU0 instanceof p2) && (objD0 = ((p2) n2VarU0).d0(obj)) != null) {
                return objD0;
            }
            n2VarU0 = n2VarU0.C();
        } while (n2VarU0 != null);
        return null;
    }

    public static boolean x0(n2 n2Var, w2 w2Var) {
        n2 n2VarC = n2Var;
        while (!b0(n2VarC).n(w2Var, n2Var) && (n2VarC = n2VarC.C()) != null) {
        }
        return n2VarC != null;
    }

    public static boolean y0(n2 n2Var, String str) {
        return j0(n2Var, str) != null;
    }

    protected static boolean z0(p2 p2Var) {
        return y0(p2Var, "get") || y0(p2Var, "set");
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final n2 B() {
        return this.c;
    }

    public final boolean B0() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public n2 C() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void D(n2 n2Var) {
        this.c = n2Var;
    }

    protected final boolean D0(int i) {
        s2 s2VarR = this.d.r(null, i);
        return s2VarR != null && s2VarR.f();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void E(n2 n2Var) {
        this.b = n2Var;
    }

    public final boolean E0() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public abstract String F();

    final void G(String str, C1174r0 c1174r0) {
        C1177s0 c1177s0;
        M(str, 0);
        s2 s2VarI = this.d.i(str, 0, 0);
        if (s2VarI instanceof C1177s0) {
            c1177s0 = (C1177s0) s2VarI;
        } else {
            C1177s0 c1177s02 = new C1177s0(s2VarI);
            this.d.y(s2VarI, c1177s02);
            c1177s0 = c1177s02;
        }
        c1177s0.h(2);
        c1177s0.e = c1174r0;
    }

    public final void G0() {
        this.f = false;
    }

    protected final int H(int i, p2 p2Var) {
        Object objT0 = t0(p2Var, "enumerable");
        I2 i2 = I2.c;
        if (objT0 != i2) {
            i = C1157l2.g1(objT0) ? i & (-3) : i | 2;
        }
        Object objT02 = t0(p2Var, "writable");
        if (objT02 != i2) {
            i = C1157l2.g1(objT02) ? i & (-2) : i | 1;
        }
        Object objT03 = t0(p2Var, "configurable");
        return objT03 != i2 ? C1157l2.g1(objT03) ? i & (-5) : i | 4 : i;
    }

    public final synchronized Object I(Object obj, Object obj2) {
        try {
            if (obj2 == null) {
                throw new IllegalArgumentException();
            }
            Map map = this.e;
            if (map == null) {
                map = new HashMap();
                this.e = map;
            }
            synchronized (map) {
                Object obj3 = map.get(obj);
                if (obj3 == null) {
                    map.put(obj, obj2);
                } else {
                    obj2 = obj3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return obj2;
    }

    final boolean J0(Object obj, int i, n2 n2Var, Object obj2, boolean z) {
        s2 s2VarI;
        if (this != n2Var) {
            s2VarI = this.d.r(obj, i);
            if (!this.f && ((s2VarI == null || (!(s2VarI instanceof C1134g) && (s2VarI.a() & 1) != 0)) && z)) {
                throw C1157l2.C1("msg.not.extensible", new Object[0]);
            }
            if (s2VarI == null) {
                return false;
            }
        } else if (this.f) {
            if (this.g) {
                M(obj, i);
            }
            s2VarI = this.d.i(obj, i, 0);
        } else {
            s2VarI = this.d.r(obj, i);
            if ((s2VarI == null || !((s2VarI instanceof C1134g) || (s2VarI.a() & 1) == 0)) && z) {
                throw C1157l2.C1("msg.not.extensible", new Object[0]);
            }
            if (s2VarI == null) {
                return true;
            }
        }
        return s2VarI.i(obj2, this, n2Var, z);
    }

    protected final boolean M0(Object obj, Object obj2) {
        I2 i2 = I2.c;
        if (obj == i2) {
            return true;
        }
        if (obj2 == i2) {
            obj2 = G2.b;
        }
        if ((obj2 instanceof Number) && (obj instanceof Number)) {
            double dDoubleValue = ((Number) obj2).doubleValue();
            double dDoubleValue2 = ((Number) obj).doubleValue();
            if (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2)) {
                return true;
            }
            if (dDoubleValue == 0.0d && Double.doubleToLongBits(dDoubleValue) != Double.doubleToLongBits(dDoubleValue2)) {
                return false;
            }
        }
        return C1157l2.W0(obj2, obj);
    }

    protected final void N(Object obj, p2 p2Var, p2 p2Var2) {
        if (p2Var == null) {
            if (!this.f) {
                throw C1157l2.C1("msg.not.extensible", new Object[0]);
            }
            return;
        }
        if (C0(p2Var.l("configurable", p2Var))) {
            if (F0(t0(p2Var2, "configurable"))) {
                throw C1157l2.C1("msg.change.configurable.false.to.true", obj);
            }
            if (F0(p2Var.l("enumerable", p2Var)) != F0(t0(p2Var2, "enumerable"))) {
                throw C1157l2.C1("msg.change.enumerable.with.configurable.false", obj);
            }
            boolean zA0 = A0(p2Var2);
            boolean zZ0 = z0(p2Var2);
            if (zA0 || zZ0) {
                if (zA0 && A0(p2Var)) {
                    if (C0(p2Var.l("writable", p2Var))) {
                        if (F0(t0(p2Var2, "writable"))) {
                            throw C1157l2.C1("msg.change.writable.false.to.true.with.configurable.false", obj);
                        }
                        if (!M0(t0(p2Var2, "value"), p2Var.l("value", p2Var))) {
                            throw C1157l2.C1("msg.change.value.with.writable.false", obj);
                        }
                        return;
                    }
                    return;
                }
                if (!zZ0 || !z0(p2Var)) {
                    if (!A0(p2Var)) {
                        throw C1157l2.C1("msg.change.property.accessor.to.data.with.configurable.false", obj);
                    }
                    throw C1157l2.C1("msg.change.property.data.to.accessor.with.configurable.false", obj);
                }
                if (!M0(t0(p2Var2, "set"), p2Var.l("set", p2Var))) {
                    throw C1157l2.C1("msg.change.setter.with.configurable.false", obj);
                }
                if (!M0(t0(p2Var2, "get"), p2Var.l("get", p2Var))) {
                    throw C1157l2.C1("msg.change.getter.with.configurable.false", obj);
                }
            }
        }
    }

    public final void N0() {
        if (this.g) {
            return;
        }
        long jC = this.d.c();
        try {
            for (s2 s2Var : this.d) {
                Object obj = s2Var.e;
                if (obj instanceof C1174r0) {
                    C1174r0 c1174r0 = (C1174r0) obj;
                    try {
                        c1174r0.d();
                        s2Var.e = c1174r0.c();
                    } catch (Throwable th) {
                        s2Var.e = c1174r0.c();
                        throw th;
                    }
                }
            }
            this.g = true;
        } finally {
            this.d.d(jC);
        }
    }

    protected final void O(p2 p2Var) {
        Object objT0 = t0(p2Var, "get");
        I2 i2 = I2.c;
        if (objT0 != i2 && objT0 != G2.b && !(objT0 instanceof InterfaceC1161n)) {
            throw C1157l2.D0(objT0, objT0);
        }
        Object objT02 = t0(p2Var, "set");
        if (objT02 != i2 && objT02 != G2.b && !(objT02 instanceof InterfaceC1161n)) {
            throw C1157l2.D0(objT02, objT02);
        }
        if (A0(p2Var) && z0(p2Var)) {
            throw C1157l2.C1("msg.both.data.and.accessor.desc", new Object[0]);
        }
    }

    public final void O0(int i) {
        M(null, i);
        this.d.i(null, i, 0).h(0);
    }

    public void P0(String str, int i) {
        M(str, 0);
        this.d.i(str, 0, 0).h(i);
    }

    protected final void Q0(int i, boolean z) {
        if (z) {
            X("writable", Boolean.valueOf((i & 1) == 0), 0);
        }
        X("enumerable", Boolean.valueOf((i & 2) == 0), 0);
        X("configurable", Boolean.valueOf((i & 4) == 0), 0);
    }

    public final void R(C1185v c1185v, p2 p2Var) {
        Object[] objArrO0 = p2Var.o0(false, true);
        p2[] p2VarArr = new p2[objArrO0.length];
        int length = objArrO0.length;
        for (int i = 0; i < length; i++) {
            p2 p2VarA0 = a0(C1157l2.R(p2Var, objArrO0[i], c1185v));
            O(p2VarA0);
            p2VarArr[i] = p2VarA0;
        }
        int length2 = objArrO0.length;
        for (int i2 = 0; i2 < length2; i2++) {
            S(c1185v, objArrO0[i2], p2VarArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R0(java.lang.String r4, int r5, com.github.catvod.spider.merge.f1.InterfaceC1161n r6, boolean r7) {
        /*
            r3 = this;
            if (r4 == 0) goto Lb
            if (r5 != 0) goto L5
            goto Lb
        L5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
        Lb:
            r3.M(r4, r5)
            boolean r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L29
            com.github.catvod.spider.merge.f1.u2 r0 = r3.d
            com.github.catvod.spider.merge.f1.s2 r5 = r0.i(r4, r5, r1)
            boolean r0 = r5 instanceof com.github.catvod.spider.merge.f1.C1134g
            if (r0 == 0) goto L1e
            goto L33
        L1e:
            com.github.catvod.spider.merge.f1.g r0 = new com.github.catvod.spider.merge.f1.g
            r0.<init>(r5)
            com.github.catvod.spider.merge.f1.u2 r2 = r3.d
            r2.y(r5, r0)
            goto L36
        L29:
            com.github.catvod.spider.merge.f1.u2 r0 = r3.d
            com.github.catvod.spider.merge.f1.s2 r5 = r0.r(r4, r5)
            boolean r0 = r5 instanceof com.github.catvod.spider.merge.f1.C1134g
            if (r0 == 0) goto L66
        L33:
            r0 = r5
            com.github.catvod.spider.merge.f1.g r0 = (com.github.catvod.spider.merge.f1.C1134g) r0
        L36:
            int r5 = r0.a()
            r2 = 1
            r5 = r5 & r2
            if (r5 != 0) goto L5b
            r4 = 0
            boolean r5 = r6 instanceof com.github.catvod.spider.merge.f1.InterfaceC1098N
            if (r7 == 0) goto L4d
            if (r5 == 0) goto L4a
            com.github.catvod.spider.merge.f1.b r4 = new com.github.catvod.spider.merge.f1.b
            r4.<init>(r6)
        L4a:
            r0.i = r4
            goto L56
        L4d:
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.f1.a r4 = new com.github.catvod.spider.merge.f1.a
            r4.<init>(r6)
        L54:
            r0.h = r4
        L56:
            com.github.catvod.spider.merge.f1.G2 r4 = com.github.catvod.spider.merge.f1.G2.b
            r0.e = r4
            return
        L5b:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            java.lang.String r4 = "msg.modify.readonly"
            com.github.catvod.spider.merge.f1.L r4 = com.github.catvod.spider.merge.f1.C1185v.H(r4, r5)
            throw r4
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.p2.R0(java.lang.String, int, com.github.catvod.spider.merge.f1.n, boolean):void");
    }

    public final void S(C1185v c1185v, Object obj, p2 p2Var) {
        O(p2Var);
        T(c1185v, obj, p2Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        if (r5 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void T(com.github.catvod.spider.merge.f1.C1185v r7, java.lang.Object r8, com.github.catvod.spider.merge.f1.p2 r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.github.catvod.spider.merge.f1.w2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L8
            r3 = r8
            goto L14
        L8:
            com.github.catvod.spider.merge.f1.k2 r0 = com.github.catvod.spider.merge.f1.C1157l2.z1(r8)
            java.lang.String r3 = r0.a
            if (r3 != 0) goto L14
            int r0 = r0.b
            r3 = r2
            goto L15
        L14:
            r0 = 0
        L15:
            com.github.catvod.spider.merge.f1.u2 r4 = r6.d
            com.github.catvod.spider.merge.f1.s2 r4 = r4.r(r3, r0)
            if (r4 != 0) goto L1f
            r5 = 1
            goto L20
        L1f:
            r5 = 0
        L20:
            if (r10 == 0) goto L2c
            if (r4 != 0) goto L25
            goto L29
        L25:
            com.github.catvod.spider.merge.f1.p2 r2 = r4.c(r7, r6)
        L29:
            r6.N(r8, r2, r9)
        L2c:
            boolean r7 = z0(r9)
            if (r4 != 0) goto L3a
            com.github.catvod.spider.merge.f1.u2 r8 = r6.d
            com.github.catvod.spider.merge.f1.s2 r4 = r8.i(r3, r0, r1)
            r8 = 7
            goto L3e
        L3a:
            int r8 = r4.a()
        L3e:
            int r8 = r6.H(r8, r9)
            if (r7 == 0) goto L79
            boolean r7 = r4 instanceof com.github.catvod.spider.merge.f1.C1134g
            if (r7 == 0) goto L4b
            com.github.catvod.spider.merge.f1.g r4 = (com.github.catvod.spider.merge.f1.C1134g) r4
            goto L56
        L4b:
            com.github.catvod.spider.merge.f1.g r7 = new com.github.catvod.spider.merge.f1.g
            r7.<init>(r4)
            com.github.catvod.spider.merge.f1.u2 r10 = r6.d
            r10.y(r4, r7)
            r4 = r7
        L56:
            java.lang.String r7 = "get"
            java.lang.Object r7 = t0(r9, r7)
            com.github.catvod.spider.merge.f1.I2 r10 = com.github.catvod.spider.merge.f1.I2.c
            if (r7 == r10) goto L67
            com.github.catvod.spider.merge.f1.a r0 = new com.github.catvod.spider.merge.f1.a
            r0.<init>(r7)
            r4.h = r0
        L67:
            java.lang.String r7 = "set"
            java.lang.Object r7 = t0(r9, r7)
            if (r7 == r10) goto L76
            com.github.catvod.spider.merge.f1.b r9 = new com.github.catvod.spider.merge.f1.b
            r9.<init>(r7)
            r4.i = r9
        L76:
            com.github.catvod.spider.merge.f1.G2 r7 = com.github.catvod.spider.merge.f1.G2.b
            goto L9e
        L79:
            boolean r7 = r4.g()
            if (r7 != 0) goto L90
            boolean r7 = A0(r9)
            if (r7 == 0) goto L90
            com.github.catvod.spider.merge.f1.s2 r7 = new com.github.catvod.spider.merge.f1.s2
            r7.<init>(r4)
            com.github.catvod.spider.merge.f1.u2 r10 = r6.d
            r10.y(r4, r7)
            r4 = r7
        L90:
            java.lang.String r7 = "value"
            java.lang.Object r7 = t0(r9, r7)
            com.github.catvod.spider.merge.f1.I2 r9 = com.github.catvod.spider.merge.f1.I2.c
            if (r7 == r9) goto L9b
            goto L9e
        L9b:
            if (r5 == 0) goto La0
            goto L76
        L9e:
            r4.e = r7
        La0:
            r4.h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.p2.T(com.github.catvod.spider.merge.f1.v, java.lang.Object, com.github.catvod.spider.merge.f1.p2, boolean):void");
    }

    protected final void U(n2 n2Var, String str, int i, InterfaceC1161n interfaceC1161n) {
        C1165o0 c1165o0 = new C1165o0(n2Var, str, i, interfaceC1161n);
        c1165o0.B1();
        X(str, c1165o0, 2);
    }

    public final void W(w2 w2Var, Object obj, int i) {
        M(w2Var, 0);
        q(w2Var, this, obj);
        M(w2Var, 0);
        this.d.i(w2Var, 0, 0).h(i);
    }

    public final void X(String str, Object obj, int i) {
        M(str, 0);
        v(str, this, obj);
        P0(str, i);
    }

    public final void Y(String str, Supplier<Object> supplier, Consumer<Object> consumer, int i) {
        C1168p0 c1168p0;
        s2 s2VarI = this.d.i(str, 0, i);
        if (s2VarI instanceof C1168p0) {
            c1168p0 = (C1168p0) s2VarI;
        } else {
            C1168p0 c1168p02 = new C1168p0(s2VarI);
            this.d.y(s2VarI, c1168p02);
            c1168p0 = c1168p02;
        }
        c1168p0.h = supplier;
        c1168p0.i = consumer;
        P0(str, i);
    }

    protected final Object c0(Object obj) {
        return this == obj ? Boolean.TRUE : I2.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    public final Object d0(Object obj) {
        ?? r0 = this.e;
        if (r0 == 0) {
            return null;
        }
        return r0.get(obj);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void delete(String str) {
        M(str, 0);
        this.d.f(str, 0);
    }

    public Object e(w2 w2Var, n2 n2Var) {
        s2 s2VarR = this.d.r(w2Var, 0);
        return s2VarR == null ? I2.c : s2VarR.e(n2Var);
    }

    public int f0(int i) {
        return e0(null, i).a();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public boolean g(n2 n2Var) {
        Class<?> cls = C1157l2.a;
        do {
            n2Var = n2Var.C();
            if (n2Var == null) {
                return false;
            }
        } while (!n2Var.equals(this));
        return true;
    }

    public int g0(w2 w2Var) {
        s2 s2VarR = this.d.r(w2Var, 0);
        if (s2VarR != null) {
            return s2VarR.a();
        }
        throw C1185v.H("msg.prop.not.found", w2Var);
    }

    public final Object get(Object obj) {
        Object objL = obj instanceof String ? l((String) obj, this) : obj instanceof w2 ? e((w2) obj, this) : obj instanceof Number ? w(((Number) obj).intValue(), this) : null;
        if (objL == I2.c || objL == G2.b) {
            return null;
        }
        return objL instanceof L2 ? ((L2) objL).c() : objL;
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1179t
    public final boolean h(String str) {
        s2 s2VarR = this.d.r(str, 0);
        return s2VarR != null && (s2VarR.a() & 5) == 5;
    }

    public int h0(String str) {
        return e0(str, 0).a();
    }

    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1179t
    public final void j(String str, n2 n2Var, Object obj) {
        if (H0(str, n2Var, obj, 1)) {
            return;
        }
        if (n2Var == this) {
            C1162n0.c();
            throw null;
        }
        if (n2Var instanceof InterfaceC1179t) {
            ((InterfaceC1179t) n2Var).j(str, n2Var, obj);
        } else {
            n2Var.v(str, n2Var, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.InterfaceC1179t
    public final void k(String str, n2 n2Var) {
        if (H0(str, n2Var, G2.b, 8)) {
            return;
        }
        if (n2Var == this) {
            C1162n0.c();
            throw null;
        }
        if (n2Var instanceof InterfaceC1179t) {
            ((InterfaceC1179t) n2Var).k(str, n2Var);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public Object l(String str, n2 n2Var) {
        s2 s2VarR = this.d.r(str, 0);
        return s2VarR == null ? I2.c : s2VarR.e(n2Var);
    }

    public final Object l0() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public Object m(Class<?> cls) {
        Object objB;
        C1185v c1185vH = null;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= 2) {
                throw C1157l2.C1("msg.default.value", cls == null ? "undefined" : cls.getName());
            }
            if (cls != C1157l2.l ? i != 1 : i != 0) {
                z = false;
            }
            Object objT0 = t0(this, z ? "toString" : "valueOf");
            if (objT0 instanceof InterfaceC1098N) {
                InterfaceC1098N interfaceC1098N = (InterfaceC1098N) objT0;
                if (c1185vH == null) {
                    c1185vH = C1185v.h();
                }
                objB = interfaceC1098N.b(c1185vH, interfaceC1098N.B(), this, C1157l2.y);
                if (objB != null) {
                    if (!(objB instanceof n2) || cls == C1157l2.r || cls == C1157l2.p) {
                        break;
                    }
                    if (z && (objB instanceof L2)) {
                        objB = ((L2) objB).c();
                        if (objB instanceof String) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return objB;
    }

    public boolean n(w2 w2Var, n2 n2Var) {
        return this.d.r(w2Var, 0) != null;
    }

    public final Object n0(String str, int i, n2 n2Var, boolean z) {
        if (str != null && i != 0) {
            throw new IllegalArgumentException(str);
        }
        s2 s2VarR = this.d.r(str, i);
        if (s2VarR == null) {
            return null;
        }
        InterfaceC1098N interfaceC1098ND = z ? s2VarR.d(str, n2Var) : s2VarR.b(str, n2Var);
        return interfaceC1098ND == null ? G2.b : interfaceC1098ND;
    }

    public void o(w2 w2Var) {
        M(w2Var, 0);
        this.d.f(w2Var, 0);
    }

    Object[] o0(boolean z, boolean z2) {
        Object[] objArr = C1157l2.y;
        if (this.d.isEmpty()) {
            return objArr;
        }
        long jC = this.d.c();
        try {
            int i = 0;
            for (s2 s2Var : this.d) {
                if (z || (s2Var.a() & 2) == 0) {
                    if (z2 || !(s2Var.b instanceof w2)) {
                        if (i == 0) {
                            Object[] objArr2 = new Object[this.d.b() + 0];
                            if (objArr != null) {
                                System.arraycopy(objArr, 0, objArr2, 0, 0);
                            }
                            objArr = objArr2;
                        }
                        int i2 = i + 1;
                        Object objValueOf = s2Var.b;
                        if (objValueOf == null) {
                            objValueOf = Integer.valueOf(s2Var.c);
                        }
                        objArr[i] = objValueOf;
                        i = i2;
                    }
                }
            }
            this.d.d(jC);
            if (i != objArr.length + 0) {
                Object[] objArr3 = new Object[i];
                System.arraycopy(objArr, 0, objArr3, 0, i);
                objArr = objArr3;
            }
            C1185v c1185vI = C1185v.i();
            if (c1185vI != null && c1185vI.t(16)) {
                Arrays.sort(objArr, h);
            }
            return objArr;
        } catch (Throwable th) {
            this.d.d(jC);
            throw th;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void p(int i) {
        M(null, i);
        this.d.f(null, i);
    }

    public void q(w2 w2Var, n2 n2Var, Object obj) {
        if (I0(w2Var, 0, n2Var, obj)) {
            return;
        }
        if (n2Var != this) {
            b0(n2Var).q(w2Var, n2Var, obj);
        } else {
            C1162n0.c();
            throw null;
        }
    }

    protected p2 q0(C1185v c1185v, Object obj) {
        s2 s2VarR;
        if (obj instanceof w2) {
            s2VarR = this.d.r(obj, 0);
        } else {
            C1153k2 c1153k2Z1 = C1157l2.z1(obj);
            String str = c1153k2Z1.a;
            s2VarR = str == null ? this.d.r(null, c1153k2Z1.b) : this.d.r(str, 0);
        }
        if (s2VarR == null) {
            return null;
        }
        return s2VarR.c(c1185v, this);
    }

    @Override // com.github.catvod.spider.merge.i1.InterfaceC1262a
    public final Object[] s() {
        return o0(true, false);
    }

    public int size() {
        return this.d.size();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void t(int i, n2 n2Var, Object obj) {
        if (I0(null, i, n2Var, obj)) {
            return;
        }
        if (n2Var != this) {
            n2Var.t(i, n2Var, obj);
        } else {
            C1162n0.c();
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final Object[] u() {
        return o0(false, false);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void v(String str, n2 n2Var, Object obj) {
        if (I0(str, 0, n2Var, obj)) {
            return;
        }
        if (n2Var != this) {
            n2Var.v(str, n2Var, obj);
        } else {
            C1162n0.c();
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public Object w(int i, n2 n2Var) {
        s2 s2VarR = this.d.r(null, i);
        return s2VarR == null ? I2.c : s2VarR.e(n2Var);
    }

    public String w0() {
        return "object";
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public boolean x(String str, n2 n2Var) {
        return this.d.r(str, 0) != null;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public boolean z(int i, n2 n2Var) {
        return this.d.r(null, i) != null;
    }
}
