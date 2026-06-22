package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.i1.InterfaceC1262a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1093I {
    private static final ThreadLocal<C1093I> c = new ThreadLocal<>();
    private static final Set<Class<?>> d = Collections.unmodifiableSet(new HashSet(Arrays.asList(Boolean.class, Byte.class, Character.class, Double.class, Float.class, Integer.class, Long.class, Short.class)));
    private final Map<Object, Object> a = new IdentityHashMap();
    private final Map<Object, Object> b = new IdentityHashMap();

    C1093I() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if ((r4 instanceof java.lang.String) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int a(java.lang.Object r3, java.lang.Object r4) {
        /*
            boolean r0 = r3 instanceof java.lang.Integer
            r1 = -1
            if (r0 == 0) goto L1b
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L12
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r3.compareTo(r4)
            goto L56
        L12:
            boolean r3 = r4 instanceof java.lang.String
            if (r3 != 0) goto L56
            boolean r3 = r4 instanceof com.github.catvod.spider.merge.f1.w2
            if (r3 == 0) goto L57
            goto L56
        L1b:
            boolean r0 = r3 instanceof java.lang.String
            r2 = 1
            if (r0 == 0) goto L38
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L2d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
        L28:
            int r1 = r3.compareTo(r4)
            goto L56
        L2d:
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 == 0) goto L33
        L31:
            r1 = 1
            goto L56
        L33:
            boolean r3 = r4 instanceof com.github.catvod.spider.merge.f1.w2
            if (r3 == 0) goto L57
            goto L56
        L38:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.f1.w2
            if (r0 == 0) goto L57
            boolean r0 = r4 instanceof com.github.catvod.spider.merge.f1.w2
            if (r0 == 0) goto L4d
            com.github.catvod.spider.merge.f1.w2 r3 = (com.github.catvod.spider.merge.f1.w2) r3
            java.lang.String r3 = e(r3)
            com.github.catvod.spider.merge.f1.w2 r4 = (com.github.catvod.spider.merge.f1.w2) r4
            java.lang.String r4 = e(r4)
            goto L28
        L4d:
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 != 0) goto L31
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L57
            goto L31
        L56:
            return r1
        L57:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            goto L5e
        L5d:
            throw r3
        L5e:
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1093I.a(java.lang.Object, java.lang.Object):int");
    }

    private boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (!b(objArr[i], objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    private static Object[] d(n2 n2Var) {
        Object[] objArrO0 = n2Var instanceof p2 ? ((p2) n2Var).o0(true, true) : n2Var instanceof InterfaceC1262a ? ((InterfaceC1262a) n2Var).s() : n2Var.u();
        Arrays.sort(objArrO0, new Comparator() { // from class: com.github.catvod.spider.merge.f1.H
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1093I.a(obj, obj2);
            }
        });
        return objArrO0;
    }

    private static String e(w2 w2Var) {
        x2 x2VarR1;
        if (w2Var instanceof x2) {
            x2VarR1 = (x2) w2Var;
        } else {
            if (!(w2Var instanceof M1)) {
                throw new ClassCastException();
            }
            x2VarR1 = ((M1) w2Var).r1();
        }
        return x2VarR1.a();
    }

    private static Object f(n2 n2Var, Object obj) {
        if (obj instanceof w2) {
            return p2.s0(n2Var, (w2) obj);
        }
        if (obj instanceof Integer) {
            return p2.r0(n2Var, ((Integer) obj).intValue());
        }
        if (obj instanceof String) {
            return p2.t0(n2Var, (String) obj);
        }
        throw new ClassCastException();
    }

    static <T> T g(Function<C1093I, T> function) {
        ThreadLocal<C1093I> threadLocal = c;
        C1093I c1093i = threadLocal.get();
        if (c1093i != null) {
            return function.apply(c1093i);
        }
        C1093I c1093i2 = new C1093I();
        threadLocal.set(c1093i2);
        try {
            T tApply = function.apply(c1093i2);
            threadLocal.set(null);
            return tApply;
        } catch (Throwable th) {
            c.set(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036f  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.IdentityHashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.IdentityHashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.IdentityHashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.IdentityHashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.IdentityHashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.IdentityHashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.IdentityHashMap, java.util.Map<java.lang.Object, java.lang.Object>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean b(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1093I.b(java.lang.Object, java.lang.Object):boolean");
    }
}
