package com.github.catvod.spider.merge.f1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1099O extends C1150k {
    private static boolean A;
    C1186v0 t;
    private String u;
    private transient byte[] v;
    private int w;
    private transient boolean x;
    private transient int y;
    private boolean z;

    public C1099O(String str, Member member, n2 n2Var) {
        int i;
        if (member instanceof Constructor) {
            this.t = new C1186v0((Constructor<?>) member);
            this.z = true;
        } else {
            C1186v0 c1186v0 = new C1186v0((Method) member);
            this.t = c1186v0;
            this.z = c1186v0.g();
        }
        String strB = this.t.b();
        this.u = str;
        Class<?>[] clsArr = this.t.c;
        int length = clsArr.length;
        if (length == 4 && (clsArr[1].isArray() || clsArr[2].isArray())) {
            if (clsArr[1].isArray()) {
                if (!this.z || clsArr[0] != C1157l2.o || clsArr[1].getComponentType() != C1157l2.j || clsArr[2] != C1157l2.p || clsArr[3] != Boolean.TYPE) {
                    throw C1185v.H("msg.varargs.ctor", strB);
                }
                i = -2;
            } else {
                if (!this.z || clsArr[0] != C1157l2.o || clsArr[1] != C1157l2.r || clsArr[2].getComponentType() != C1157l2.j || clsArr[3] != C1157l2.p) {
                    throw C1185v.H("msg.varargs.fun", strB);
                }
                i = -1;
            }
            this.w = i;
        } else {
            this.w = length;
            if (length > 0) {
                this.v = new byte[length];
                for (int i2 = 0; i2 != length; i2++) {
                    int iF1 = F1(clsArr[i2]);
                    if (iF1 == 0) {
                        throw C1185v.H("msg.bad.parms", clsArr[i2].getName(), strB);
                    }
                    this.v[i2] = (byte) iF1;
                }
            }
        }
        if (this.t.e()) {
            Class<?> returnType = this.t.h().getReturnType();
            if (returnType == Void.TYPE) {
                this.x = true;
            } else {
                this.y = F1(returnType);
            }
        } else {
            Class<?> clsA = this.t.a();
            if (!C1157l2.r.isAssignableFrom(clsA)) {
                throw C1185v.H("msg.bad.ctor.return", clsA.getName());
            }
        }
        C1185v.i();
        C1157l2.S0(this, n2Var, false);
    }

    public static Object D1(C1185v c1185v, n2 n2Var, Object obj, int i) {
        switch (i) {
            case 1:
                return obj instanceof String ? obj : C1157l2.x1(obj);
            case 2:
                return obj instanceof Integer ? obj : Integer.valueOf(C1157l2.i1(obj));
            case 3:
                return obj instanceof Boolean ? obj : C1157l2.g1(obj) ? Boolean.TRUE : Boolean.FALSE;
            case 4:
                return obj instanceof Double ? obj : Double.valueOf(C1157l2.p1(obj));
            case 5:
                return C1157l2.u1(c1185v, obj, n2Var);
            case 6:
                return obj instanceof C1176s ? obj.toString() : obj;
            default:
                throw new IllegalArgumentException();
        }
    }

    static Method[] E1(Class<?> cls) {
        try {
        } catch (SecurityException unused) {
            A = true;
        }
        Method[] declaredMethods = !A ? cls.getDeclaredMethods() : null;
        if (declaredMethods == null) {
            declaredMethods = cls.getMethods();
        }
        int i = 0;
        for (int i2 = 0; i2 < declaredMethods.length; i2++) {
            if (!A ? Modifier.isPublic(declaredMethods[i2].getModifiers()) : declaredMethods[i2].getDeclaringClass() == cls) {
                i++;
            } else {
                declaredMethods[i2] = null;
            }
        }
        Method[] methodArr = new Method[i];
        int i3 = 0;
        for (Method method : declaredMethods) {
            if (method != null) {
                methodArr[i3] = method;
                i3++;
            }
        }
        return methodArr;
    }

    public static int F1(Class<?> cls) {
        if (cls == C1157l2.l) {
            return 1;
        }
        if (cls == C1157l2.g || cls == Integer.TYPE) {
            return 2;
        }
        if (cls == C1157l2.a || cls == Boolean.TYPE) {
            return 3;
        }
        if (cls == C1157l2.e || cls == Double.TYPE) {
            return 4;
        }
        if (C1157l2.r.isAssignableFrom(cls)) {
            return 5;
        }
        return cls == C1157l2.j ? 6 : 0;
    }

    final boolean G1() {
        return this.w == -2;
    }

    final boolean H1() {
        return this.w == -1;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        Object[] objArr2;
        Object objI;
        boolean zIsInstance;
        n2 n2VarB;
        int length = objArr.length;
        boolean z = true;
        if (this.w < 0) {
            for (int i = 0; i < length; i++) {
                if (objArr[i] instanceof C1176s) {
                    objArr[i] = objArr[i].toString();
                }
            }
            if (this.w == -1) {
                objI = this.t.c(null, new Object[]{c1185v, n2Var2, objArr, this});
            } else {
                Object[] objArr3 = {c1185v, objArr, this, n2Var2 == null ? Boolean.TRUE : Boolean.FALSE};
                objI = this.t.d() ? this.t.i(objArr3) : this.t.c(null, objArr3);
                z = false;
            }
        } else {
            if (!this.z) {
                Class<?> clsA = this.t.a();
                if (n2Var2 instanceof C1086B) {
                    n2Var2 = ((C1086B) n2Var2).b;
                }
                if (!clsA.isInstance(n2Var2)) {
                    if (n2Var2 == n2Var && n2Var != (n2VarB = B())) {
                        zIsInstance = clsA.isInstance(n2VarB);
                        if (zIsInstance) {
                            n2Var2 = n2VarB;
                        }
                    } else {
                        zIsInstance = false;
                    }
                    if (!zIsInstance) {
                        throw C1157l2.C1("msg.incompat.call", this.u);
                    }
                }
            }
            int i2 = this.w;
            if (i2 == length) {
                objArr2 = objArr;
                for (int i3 = 0; i3 != this.w; i3++) {
                    Object obj = objArr[i3];
                    Object objD1 = D1(c1185v, n2Var, obj, this.v[i3]);
                    if (obj != objD1) {
                        if (objArr2 == objArr) {
                            objArr2 = (Object[]) objArr.clone();
                        }
                        objArr2[i3] = objD1;
                    }
                }
            } else if (i2 == 0) {
                objArr2 = C1157l2.y;
            } else {
                objArr2 = new Object[i2];
                int i4 = 0;
                while (i4 != this.w) {
                    objArr2[i4] = D1(c1185v, n2Var, i4 < length ? objArr[i4] : G2.b, this.v[i4]);
                    i4++;
                }
            }
            if (this.t.e()) {
                objI = this.t.c(n2Var2, objArr2);
            } else {
                objI = this.t.i(objArr2);
                z = false;
            }
        }
        return z ? this.x ? G2.b : this.y == 0 ? c1185v.s().c(c1185v, n2Var, objI, null) : objI : objI;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final n2 p1() {
        if (this.t.d() || this.w == -2) {
            return null;
        }
        try {
            n2 n2Var = (n2) this.t.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            n2Var.E(s1());
            n2Var.D(B());
            return n2Var;
        } catch (Exception e) {
            C1185v.J(e);
            throw null;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int r1() {
        int i = this.w;
        if (i < 0) {
            return 1;
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final String t1() {
        String str = this.u;
        return str == null ? "" : str;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final int u1() {
        int i = this.w;
        if (i < 0) {
            return 1;
        }
        return i;
    }
}
