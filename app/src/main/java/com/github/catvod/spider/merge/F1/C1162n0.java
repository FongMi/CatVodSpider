package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.l.C1290c;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1162n0 {
    public static void a(C1185v c1185v, n2 n2Var, AbstractC1106W abstractC1106W) {
        p2 p2Var = (p2) c1185v.y(n2Var);
        p2.L0(p2Var, "enumerable", Boolean.FALSE);
        p2.L0(p2Var, "configurable", Boolean.TRUE);
        p2.L0(p2Var, "get", new C1165o0(n2Var, "get [Symbol.species]", 0, C1175r1.g));
        abstractC1106W.T(c1185v, x2.e, p2Var, false);
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | IllegalArgumentException | LinkageError | SecurityException unused) {
            return null;
        }
    }

    public static RuntimeException c() {
        IllegalStateException illegalStateException = new IllegalStateException("FAILED ASSERTION");
        illegalStateException.printStackTrace(System.err);
        throw illegalStateException;
    }

    public static RuntimeException d(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(C1290c.a("FAILED ASSERTION: ", str));
        illegalStateException.printStackTrace(System.err);
        throw illegalStateException;
    }

    public static Object e(int i) {
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(java.lang.Object[] r5, int r6, int r7, java.util.Comparator r8, int r9) {
        /*
            if (r6 >= r7) goto Lb0
            if (r9 == 0) goto L8f
            int r0 = r7 - r6
            r1 = 16
            if (r0 > r1) goto Lc
            goto L8f
        Lc:
            int r0 = r0 / 2
            int r0 = r0 + r6
            r1 = r5[r6]
            r2 = r5[r0]
            int r1 = r8.compare(r1, r2)
            if (r1 <= 0) goto L1b
            r1 = r0
            goto L1c
        L1b:
            r1 = r6
        L1c:
            r2 = r5[r1]
            r3 = r5[r7]
            int r2 = r8.compare(r2, r3)
            if (r2 <= 0) goto L27
            r1 = r7
        L27:
            if (r1 != r6) goto L34
            r1 = r5[r0]
            r2 = r5[r7]
            int r1 = r8.compare(r1, r2)
            if (r1 >= 0) goto L41
            goto L4e
        L34:
            if (r1 != r0) goto L43
            r0 = r5[r6]
            r1 = r5[r7]
            int r0 = r8.compare(r0, r1)
            if (r0 >= 0) goto L41
            goto L4d
        L41:
            r0 = r7
            goto L4e
        L43:
            r1 = r5[r6]
            r2 = r5[r0]
            int r1 = r8.compare(r1, r2)
            if (r1 >= 0) goto L4e
        L4d:
            r0 = r6
        L4e:
            r1 = r5[r0]
            r2 = r5[r6]
            r5[r0] = r2
            r5[r6] = r1
            int r0 = r7 + 1
            r2 = r6
        L59:
            int r2 = r2 + 1
            r3 = r5[r2]
            int r3 = r8.compare(r3, r1)
            if (r3 >= 0) goto L65
            if (r2 != r7) goto L59
        L65:
            int r0 = r0 + (-1)
            r3 = r5[r0]
            int r3 = r8.compare(r3, r1)
            if (r3 < 0) goto L71
            if (r0 != r6) goto L65
        L71:
            if (r2 < r0) goto L86
            r1 = r5[r6]
            r2 = r5[r0]
            r5[r6] = r2
            r5[r0] = r1
            int r9 = r9 + (-1)
            f(r5, r6, r0, r8, r9)
            int r0 = r0 + 1
            f(r5, r0, r7, r8, r9)
            goto Lb0
        L86:
            r3 = r5[r2]
            r4 = r5[r0]
            r5[r2] = r4
            r5[r0] = r3
            goto L59
        L8f:
            r9 = r6
        L90:
            if (r9 > r7) goto Lb0
            r0 = r5[r9]
            int r1 = r9 + (-1)
        L96:
            if (r1 < r6) goto La9
            r2 = r5[r1]
            int r2 = r8.compare(r2, r0)
            if (r2 <= 0) goto La9
            int r2 = r1 + 1
            r3 = r5[r1]
            r5[r2] = r3
            int r1 = r1 + (-1)
            goto L96
        La9:
            int r1 = r1 + 1
            r5[r1] = r0
            int r9 = r9 + 1
            goto L90
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1162n0.f(java.lang.Object[], int, int, java.util.Comparator, int):void");
    }

    public static final void g(Object[] objArr, Comparator comparator) {
        f(objArr, 0, objArr.length - 1, comparator, ((int) (Math.log10(objArr.length) / Math.log10(2.0d))) * 2);
    }

    static Object h(Class cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object i(Object obj, C1104U c1104u) {
        if (obj == null || G2.b(obj)) {
            throw C1157l2.C1("msg.called.null.or.undefined", c1104u.G1(), c1104u.t1());
        }
        return obj;
    }

    public static int j(int i, int i2) {
        int i3;
        if (i <= 57) {
            i3 = i - 48;
            if (i3 < 0) {
                return -1;
            }
        } else if (i <= 70) {
            if (65 > i) {
                return -1;
            }
            i3 = i - 55;
        } else {
            if (i > 102 || 97 > i) {
                return -1;
            }
            i3 = i - 87;
        }
        return i3 | (i2 << 4);
    }
}
