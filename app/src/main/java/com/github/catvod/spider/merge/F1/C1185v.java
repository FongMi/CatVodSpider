package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.h1.C1240g;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.l1.AbstractC1296b;
import com.github.catvod.spider.merge.l1.AbstractC1297c;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1185v implements Closeable {
    public static final Object[] x = C1157l2.y;
    private static Class<?> y = C1162n0.b("org.mozilla.javascript.optimizer.Codegen");
    private static Class<?> z = C1162n0.b("org.mozilla.javascript.Interpreter");
    private final C1188w b;
    n2 c;
    E0 d;
    AbstractC1297c e;
    C1150k f;
    U1 g;
    Object h;
    InterfaceC1117b2 i;
    private Locale j;
    private TimeZone k;
    boolean l;
    private int m;
    private int n;
    private com.github.catvod.spider.merge.Q0.a o;
    private int p;
    private Map<Object, Object> q;
    private final ArrayDeque<Runnable> r = new ArrayDeque<>();
    private final H2 s = new H2();
    Object t;
    S1 u;
    n2 v;
    boolean w;

    protected C1185v(C1188w c1188w) {
        this.b = c1188w;
        this.m = y != null ? 0 : -1;
        this.n = Integer.MAX_VALUE;
    }

    private com.github.catvod.spider.merge.h1.V B(String str, String str2, int i, C1173r c1173r, InterfaceC1094J interfaceC1094J, boolean z2) {
        Q1 q1;
        Y1 y1 = new Y1(c1173r, interfaceC1094J);
        if (z2) {
            y1.e = true;
        }
        if (u()) {
            y1.J0();
        }
        C1240g c1240gS0 = y1.s0(str, str2, i);
        if (!z2 || ((q1 = c1240gS0.d) != null && q1.b == 113)) {
            return new C1101Q(c1173r, interfaceC1094J).D(c1240gS0);
        }
        throw new IllegalArgumentException(C1290c.a("compileFunction only accepts source with single JS function: ", str));
    }

    public static C1096L F(String str) {
        int[] iArr = {0};
        return G(str, p(iArr), iArr[0]);
    }

    public static C1096L G(String str, String str2, int i) {
        if (i() != null) {
            return C1085A.c.c(str, str2, i, null, 0);
        }
        throw new C1096L(str, str2, i, null, 0);
    }

    static C1096L H(String str, Object... objArr) {
        return F(C1157l2.P(str, objArr));
    }

    public static void I(String str) {
        int[] iArr = {0};
        String strP = p(iArr);
        int i = iArr[0];
        if (!h().t(12)) {
            C1085A.c.a(str, strP, i, null, 0);
        } else {
            if (i() == null) {
                throw new C1096L(str, strP, i, null, 0);
            }
            C1085A.c.e(str, strP, i, null, 0);
        }
    }

    public static RuntimeException J(Throwable th) {
        while (th instanceof InvocationTargetException) {
            th = ((InvocationTargetException) th).getTargetException();
        }
        if ((th instanceof Error) && !h().t(13)) {
            throw ((Error) th);
        }
        if (th instanceof AbstractC1125d2) {
            throw ((AbstractC1125d2) th);
        }
        throw new K2(th);
    }

    static InterfaceC1095K d() {
        return (InterfaceC1095K) C1162n0.h(z);
    }

    public static C1185v e() {
        return f(C1188w.a());
    }

    static final C1185v f(C1188w c1188w) {
        J2 j2 = J2.a;
        j2.c();
        C1185v c1185vA = j2.a();
        if (c1185vA == null) {
            c1185vA = new C1185v(c1188w);
            if (c1185vA.p != 0) {
                throw new IllegalStateException("factory.makeContext() returned Context instance already associated with some thread");
            }
            C1162n0.e(0);
            j2.e();
        }
        c1185vA.p++;
        return c1185vA;
    }

    static C1185v h() {
        C1185v c1185vI = i();
        if (c1185vI != null) {
            return c1185vI;
        }
        throw new RuntimeException("No Context associated with current Thread");
    }

    public static C1185v i() {
        J2 j2 = J2.a;
        j2.c();
        return j2.a();
    }

    static String p(int[] iArr) {
        int lineNumber;
        InterfaceC1095K interfaceC1095KD;
        C1185v c1185vI = i();
        if (c1185vI == null) {
            return null;
        }
        if (c1185vI.t != null && (interfaceC1095KD = d()) != null) {
            return interfaceC1095KD.f(c1185vI, iArr);
        }
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            String fileName = stackTraceElement.getFileName();
            if (fileName != null && !fileName.endsWith(".java") && (lineNumber = stackTraceElement.getLineNumber()) >= 0) {
                iArr[0] = lineNumber;
                return fileName;
            }
        }
        return null;
    }

    public static Object v(Object obj, n2 n2Var, C1185v c1185v) {
        if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof n2)) {
            return obj;
        }
        if (obj instanceof Character) {
            return String.valueOf(((Character) obj).charValue());
        }
        if (c1185v == null) {
            c1185v = h();
        }
        return c1185v.s().c(c1185v, n2Var, obj, null);
    }

    public final n2 A(n2 n2Var, String str, Object[] objArr) {
        Class<?> cls = C1157l2.a;
        n2 n2VarU0 = p2.u0(n2Var);
        InterfaceC1098N interfaceC1098NM = C1157l2.M(n2VarU0, str);
        if (objArr == null) {
            objArr = C1157l2.y;
        }
        return interfaceC1098NM.a(this, n2VarU0, objArr);
    }

    public final void C() {
        Runnable runnablePoll;
        do {
            runnablePoll = this.r.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            }
        } while (runnablePoll != null);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized void D(Object obj) {
        Boolean bool = Boolean.TRUE;
        synchronized (this) {
            if (this.q == null) {
                this.q = new HashMap();
            }
            this.q.put(obj, bool);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    public final void E(Object obj) {
        Object r0 = this.q;
        if (r0 == 0) {
            return;
        }
        r0.remove(obj);
    }

    protected final Object a(n2 n2Var, String str, String str2, int i, boolean z2, InterfaceC1095K interfaceC1095K, InterfaceC1094J interfaceC1094J) {
        Class<?> cls;
        if (str2 == null) {
            str2 = "unnamed script";
        }
        String str3 = str2;
        if (!((n2Var == null) ^ z2)) {
            C1162n0.c();
            throw null;
        }
        C1173r c1173r = new C1173r();
        c1173r.c(this);
        if (interfaceC1094J == null) {
            interfaceC1094J = c1173r.a();
        }
        com.github.catvod.spider.merge.h1.V vB = B(str, str3, i, c1173r, interfaceC1094J, z2);
        if (interfaceC1095K == null) {
            interfaceC1095K = (this.m < 0 || (cls = y) == null) ? null : (InterfaceC1095K) C1162n0.h(cls);
            if (interfaceC1095K == null) {
                interfaceC1095K = d();
            }
        }
        Object objA = interfaceC1095K.a(c1173r, vB, vB.E0(), z2);
        return z2 ? interfaceC1095K.g(this, n2Var, objA) : interfaceC1095K.e(objA);
    }

    public final InterfaceC1129e2 b(String str) {
        return c(str, null, null, null, 1);
    }

    final InterfaceC1129e2 c(String str, InterfaceC1095K interfaceC1095K, InterfaceC1094J interfaceC1094J, String str2, int i) {
        try {
            return (InterfaceC1129e2) a(null, str, str2, i, false, interfaceC1095K, interfaceC1094J);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.p;
        if (i < 1) {
            C1162n0.c();
            throw null;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            J2 j2 = J2.a;
            j2.c();
            j2.e();
            this.b.getClass();
            C1162n0.e(0);
        }
    }

    public final Object g(n2 n2Var, String str, String str2) {
        InterfaceC1129e2 interfaceC1129e2C = c(str, null, null, str2, 1);
        if (interfaceC1129e2C != null) {
            return interfaceC1129e2C.d(this, n2Var);
        }
        return null;
    }

    public final AbstractC1296b j() {
        this.b.getClass();
        Class clsB = C1162n0.b("org.w3c.dom.Node");
        boolean z2 = true;
        if (clsB == null) {
            z2 = false;
        } else {
            try {
                clsB.getMethod("getUserData", String.class);
            } catch (NoSuchMethodException unused) {
                z2 = false;
            }
        }
        if (z2) {
            return AbstractC1296b.a();
        }
        return null;
    }

    public final C1188w k() {
        return this.b;
    }

    public final Locale l() {
        if (this.j == null) {
            this.j = Locale.getDefault();
        }
        return this.j;
    }

    public final int m() {
        return this.n;
    }

    public final int n() {
        return this.m;
    }

    final InterfaceC1117b2 o() {
        Class clsB;
        if (this.i == null && (clsB = C1162n0.b("org.mozilla.javascript.regexp.RegExpImpl")) != null) {
            this.i = (InterfaceC1117b2) C1162n0.h(clsB);
        }
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    public final Object q(Object obj) {
        Object r0 = this.q;
        if (r0 == 0) {
            return null;
        }
        return r0.get(obj);
    }

    public final TimeZone r() {
        if (this.k == null) {
            this.k = TimeZone.getDefault();
        }
        return this.k;
    }

    public final com.github.catvod.spider.merge.Q0.a s() {
        if (this.o == null) {
            this.o = new com.github.catvod.spider.merge.Q0.a();
        }
        return this.o;
    }

    public final boolean t(int i) {
        this.b.getClass();
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
                return false;
            case 3:
            case 5:
            case 6:
            case 14:
            case 15:
            case 20:
                return true;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
    }

    public final boolean u() {
        E0 e0;
        return this.w || ((e0 = this.d) != null && e0.l);
    }

    public final n2 w(n2 n2Var, int i) {
        B0 b0 = new B0(i);
        C1157l2.P0(b0, n2Var, B2.Array);
        return b0;
    }

    public final n2 x(n2 n2Var, Object[] objArr) {
        if (objArr.getClass().getComponentType() != C1157l2.j) {
            throw new IllegalArgumentException();
        }
        B0 b0 = new B0(objArr);
        C1157l2.P0(b0, n2Var, B2.Array);
        return b0;
    }

    public final n2 y(n2 n2Var) {
        C1 c1 = new C1();
        C1157l2.P0(c1, n2Var, B2.Object);
        return c1;
    }

    public final n2 z(n2 n2Var, String str) {
        return A(n2Var, str, C1157l2.y);
    }
}
