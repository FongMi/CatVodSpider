package com.github.catvod.spider.merge.f1;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1156l1 implements n2, y2, L2, Serializable {
    public static final /* synthetic */ int i = 0;
    protected n2 b;
    protected n2 c;
    protected transient Object d;
    protected transient Class<?> e;
    protected transient C1147j0 f;
    private transient Map<String, C1097M> g;
    protected transient boolean h;

    static {
        Class<?>[] clsArr = new Class[2];
        Class clsB = C1162n0.b("org.mozilla.javascript.JavaAdapter");
        if (clsB != null) {
            try {
                clsArr[0] = C1157l2.j;
                clsArr[1] = C1162n0.b("java.io.ObjectOutputStream");
                clsB.getMethod("writeAdapterObject", clsArr);
                clsArr[0] = C1157l2.r;
                clsArr[1] = C1162n0.b("java.io.ObjectInputStream");
                clsB.getMethod("readAdapterObject", clsArr);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    public C1156l1() {
    }

    public C1156l1(n2 n2Var, Object obj, Class<?> cls) {
        this.c = n2Var;
        this.d = obj;
        this.e = cls;
        this.h = false;
        C1147j0 c1147j0K = C1147j0.k(this.c, obj != null ? obj.getClass() : cls, this.e, this.h);
        this.f = c1147j0K;
        this.g = (HashMap) c1147j0K.f(this, this.d);
    }

    private static Object d(Class<?> cls, Object obj) {
        Class<?> cls2 = obj.getClass();
        if (cls == Character.TYPE || cls == C1157l2.c) {
            return cls2 == C1157l2.c ? obj : Character.valueOf((char) s(obj, r1, 0.0d, 65535.0d));
        }
        if (cls == C1157l2.j || cls == C1157l2.e || cls == Double.TYPE) {
            return cls2 == C1157l2.e ? obj : Double.valueOf(r(obj));
        }
        Class<?> cls3 = C1157l2.n;
        if (cls == cls3) {
            return cls2 == cls3 ? obj : C1157l2.e1(obj);
        }
        Class<?> cls4 = C1157l2.f;
        if (cls == cls4 || cls == Float.TYPE) {
            if (cls2 == cls4) {
                return obj;
            }
            double dR = r(obj);
            if (Double.isInfinite(dR) || Double.isNaN(dR) || dR == 0.0d) {
                return Float.valueOf((float) dR);
            }
            double dAbs = Math.abs(dR);
            if (dAbs < 1.401298464324817E-45d) {
                return Float.valueOf(dR > 0.0d ? 0.0f : -0.0f);
            }
            if (dAbs > 3.4028234663852886E38d) {
                return Float.valueOf(dR > 0.0d ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY);
            }
            return Float.valueOf((float) dR);
        }
        Class<?> cls5 = C1157l2.g;
        if (cls == cls5 || cls == Integer.TYPE) {
            return cls2 == cls5 ? obj : Integer.valueOf((int) s(obj, cls5, -2.147483648E9d, 2.147483647E9d));
        }
        Class<?> cls6 = C1157l2.h;
        if (cls == cls6 || cls == Long.TYPE) {
            if (cls2 == cls6) {
                return obj;
            }
            return Long.valueOf(s(obj, cls6, Double.longBitsToDouble(-4332462841530417152L), Double.longBitsToDouble(4890909195324358655L)));
        }
        Class<?> cls7 = C1157l2.k;
        if (cls == cls7 || cls == Short.TYPE) {
            return cls2 == cls7 ? obj : Short.valueOf((short) s(obj, cls7, -32768.0d, 32767.0d));
        }
        Class<?> cls8 = C1157l2.b;
        return (cls == cls8 || cls == Byte.TYPE) ? cls2 == cls8 ? obj : Byte.valueOf((byte) s(obj, cls8, -128.0d, 127.0d)) : Double.valueOf(r(obj));
    }

    static Object f(Class<?> cls, Object obj) {
        if (obj != null && obj.getClass() == cls) {
            return obj;
        }
        int i2 = i(obj);
        switch (i2) {
            case 0:
                if (cls == C1157l2.l || cls == C1157l2.j) {
                    return "undefined";
                }
                k("undefined", cls);
                throw null;
            case 1:
                if (!cls.isPrimitive()) {
                    return null;
                }
                k(obj, cls);
                throw null;
            case 2:
                if (cls == Boolean.TYPE || cls == C1157l2.a || cls == C1157l2.j) {
                    return obj;
                }
                if (cls == C1157l2.l) {
                    return obj.toString();
                }
                k(obj, cls);
                throw null;
            case 3:
            case 9:
                if (cls == C1157l2.l) {
                    return C1157l2.x1(obj);
                }
                if (cls == C1157l2.j) {
                    C1185v c1185vI = C1185v.i();
                    if (c1185vI != null && c1185vI.t(18) && Math.round(r(obj)) == r(obj)) {
                        return d(Long.TYPE, obj);
                    }
                    return d(i2 == 9 ? BigInteger.class : Double.TYPE, obj);
                }
                if ((cls.isPrimitive() && cls != Boolean.TYPE) || C1157l2.i.isAssignableFrom(cls)) {
                    return d(cls, obj);
                }
                k(obj, cls);
                throw null;
            case 4:
                if (cls == C1157l2.l || cls.isInstance(obj)) {
                    return obj.toString();
                }
                if (cls == Character.TYPE || cls == C1157l2.c) {
                    CharSequence charSequence = (CharSequence) obj;
                    return charSequence.length() == 1 ? Character.valueOf(charSequence.charAt(0)) : d(cls, obj);
                }
                if ((cls.isPrimitive() && cls != Boolean.TYPE) || C1157l2.i.isAssignableFrom(cls)) {
                    return d(cls, obj);
                }
                k(obj, cls);
                throw null;
            case 5:
                if (obj instanceof L2) {
                    obj = ((L2) obj).c();
                }
                if (cls == C1157l2.d || cls == C1157l2.j) {
                    return obj;
                }
                if (cls == C1157l2.l) {
                    return obj.toString();
                }
                k(obj, cls);
                throw null;
            case 6:
            case 7:
                if (obj instanceof L2) {
                    obj = ((L2) obj).c();
                }
                if (cls.isPrimitive()) {
                    if (cls != Boolean.TYPE) {
                        return d(cls, obj);
                    }
                    k(obj, cls);
                    throw null;
                }
                if (cls == C1157l2.l) {
                    return obj.toString();
                }
                if (cls.isInstance(obj)) {
                    return obj;
                }
                k(obj, cls);
                throw null;
            case 8:
                if (cls == C1157l2.l) {
                    return C1157l2.x1(obj);
                }
                if (cls.isPrimitive()) {
                    if (cls != Boolean.TYPE) {
                        return d(cls, obj);
                    }
                    k(obj, cls);
                    throw null;
                }
                if (cls.isInstance(obj)) {
                    return obj;
                }
                if (cls == C1157l2.m && (obj instanceof H0)) {
                    return new Date((long) ((H0) obj).N1());
                }
                if (cls.isArray() && (obj instanceof B0)) {
                    B0 b0 = (B0) obj;
                    long jA1 = b0.A1();
                    Class<?> componentType = cls.getComponentType();
                    Object objNewInstance = Array.newInstance(componentType, (int) jA1);
                    for (int i3 = 0; i3 < jA1; i3++) {
                        try {
                            Array.set(objNewInstance, i3, f(componentType, b0.w(i3, b0)));
                        } catch (C1096L unused) {
                            k(obj, cls);
                            throw null;
                        }
                    }
                    return objNewInstance;
                }
                if (obj instanceof L2) {
                    Object objC = ((L2) obj).c();
                    if (cls.isInstance(objC)) {
                        return objC;
                    }
                    k(objC, cls);
                    throw null;
                }
                if (!cls.isInterface() || (!(obj instanceof C1) && (!(obj instanceof InterfaceC1161n) || !(obj instanceof p2)))) {
                    k(obj, cls);
                    throw null;
                }
                p2 p2Var = (p2) obj;
                C1159m0 c1159m0 = new C1159m0(cls);
                Object objD0 = p2Var.d0(c1159m0);
                return objD0 != null ? objD0 : p2Var.I(c1159m0, C1107X.a(C1185v.h(), cls, p2Var));
            default:
                return obj;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0107 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int h(java.lang.Object r7, java.lang.Class<?> r8) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1156l1.h(java.lang.Object, java.lang.Class):int");
    }

    private static int i(Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj == G2.b) {
            return 0;
        }
        if (obj instanceof CharSequence) {
            return 4;
        }
        if (obj instanceof BigInteger) {
            return 9;
        }
        if (obj instanceof Number) {
            return 3;
        }
        if (obj instanceof Boolean) {
            return 2;
        }
        if (obj instanceof n2) {
            if (obj instanceof C1116b1) {
                return 7;
            }
            return obj instanceof L2 ? 6 : 8;
        }
        if (obj instanceof Class) {
            return 5;
        }
        return obj.getClass().isArray() ? 7 : 6;
    }

    static int j(Class<?> cls) {
        if (cls == Double.TYPE) {
            return 1;
        }
        if (cls == Float.TYPE) {
            return 2;
        }
        if (cls == Long.TYPE) {
            return 3;
        }
        if (cls == Integer.TYPE) {
            return 4;
        }
        if (cls == Short.TYPE) {
            return 5;
        }
        if (cls == Character.TYPE) {
            return 6;
        }
        if (cls == Byte.TYPE) {
            return 7;
        }
        return cls == Boolean.TYPE ? 99 : 8;
    }

    static void k(Object obj, Class<?> cls) {
        throw C1185v.H("msg.conversion.not.allowed", String.valueOf(obj), C1147j0.i(cls));
    }

    private static double r(Object obj) {
        Method method;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            return C1157l2.q1((String) obj);
        }
        if (obj instanceof n2) {
            return obj instanceof L2 ? r(((L2) obj).c()) : C1157l2.p1(obj);
        }
        try {
            method = obj.getClass().getMethod("doubleValue", null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method == null) {
            return C1157l2.q1(obj.toString());
        }
        try {
            return ((Number) method.invoke(obj, null)).doubleValue();
        } catch (IllegalAccessException unused2) {
            k(obj, Double.TYPE);
            throw null;
        } catch (InvocationTargetException unused3) {
            k(obj, Double.TYPE);
            throw null;
        }
    }

    private static long s(Object obj, Class<?> cls, double d, double d2) {
        double dR = r(obj);
        if (Double.isInfinite(dR) || Double.isNaN(dR)) {
            k(C1157l2.x1(obj), cls);
            throw null;
        }
        double dFloor = dR > 0.0d ? Math.floor(dR) : Math.ceil(dR);
        if (dFloor >= d && dFloor <= d2) {
            return (long) dFloor;
        }
        k(C1157l2.x1(obj), cls);
        throw null;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final n2 B() {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public n2 C() {
        n2 n2Var = this.b;
        return (n2Var == null && (this.d instanceof String)) ? D2.r1(p2.u0(this.c), B2.String) : n2Var;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void D(n2 n2Var) {
        this.c = n2Var;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void E(n2 n2Var) {
        this.b = n2Var;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public String F() {
        return "JavaObject";
    }

    public Object c() {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public final void delete(String str) {
    }

    public Object e(w2 w2Var, n2 n2Var) {
        return (x2.c.equals(w2Var) && (this.d instanceof Iterable)) ? C1148j1.c : I2.c;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            Object obj2 = ((C1156l1) obj).d;
            Object obj3 = this.d;
            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public boolean g(n2 n2Var) {
        return false;
    }

    public int hashCode() {
        Object obj = this.d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.f1.M>] */
    @Override // com.github.catvod.spider.merge.f1.n2
    public Object l(String str, n2 n2Var) {
        Object obj;
        Object r3 = this.g;
        return (r3 == 0 || (obj = r3.get(str)) == null) ? this.f.e(this, str, this.d) : obj;
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public Object m(Class<?> cls) {
        String str;
        if (cls == null) {
            Object obj = this.d;
            if (obj instanceof Boolean) {
                cls = C1157l2.a;
            }
            if (obj instanceof Number) {
                cls = C1157l2.i;
            }
        }
        if (cls != null && cls != C1157l2.l) {
            if (cls == C1157l2.a) {
                str = "booleanValue";
            } else {
                if (cls != C1157l2.i) {
                    throw C1185v.H("msg.default.value", new Object[0]);
                }
                str = "doubleValue";
            }
            Object objL = l(str, this);
            if (objL instanceof InterfaceC1098N) {
                InterfaceC1098N interfaceC1098N = (InterfaceC1098N) objL;
                return interfaceC1098N.b(C1185v.h(), interfaceC1098N.B(), this, C1157l2.y);
            }
            if (cls == C1157l2.i) {
                Object obj2 = this.d;
                if (obj2 instanceof Boolean) {
                    return ((Boolean) obj2).booleanValue() ? C1157l2.N1(1.0d) : C1157l2.v;
                }
            }
        }
        return this.d.toString();
    }

    public boolean n(w2 w2Var, n2 n2Var) {
        return x2.c.equals(w2Var) && (this.d instanceof Iterable);
    }

    public void o(w2 w2Var) {
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void p(int i2) {
    }

    @Override // com.github.catvod.spider.merge.f1.y2
    public final void q(w2 w2Var, n2 n2Var, Object obj) {
        String string = w2Var.toString();
        if (this.b == null || this.f.h(string)) {
            this.f.l(this, string, this.d, obj);
            return;
        }
        n2 n2Var2 = this.b;
        if (n2Var2 instanceof y2) {
            ((y2) n2Var2).q(w2Var, n2Var2, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void t(int i2, n2 n2Var, Object obj) {
        throw this.f.n(Integer.toString(i2));
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public Object[] u() {
        return this.f.g();
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public void v(String str, n2 n2Var, Object obj) {
        if (this.b == null || this.f.h(str)) {
            this.f.l(this, str, this.d, obj);
        } else {
            n2 n2Var2 = this.b;
            n2Var2.v(str, n2Var2, obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public Object w(int i2, n2 n2Var) {
        throw this.f.n(Integer.toString(i2));
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public boolean x(String str, n2 n2Var) {
        return this.f.h(str);
    }

    @Override // com.github.catvod.spider.merge.f1.n2
    public boolean z(int i2, n2 n2Var) {
        return false;
    }
}
