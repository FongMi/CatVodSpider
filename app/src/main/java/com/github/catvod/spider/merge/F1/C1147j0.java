package com.github.catvod.spider.merge.f1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessControlContext;
import java.security.AllPermission;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C1147j0 {
    private static final boolean g;
    private static final AllPermission h;
    private Class<?> a;
    private Map<String, Object> b;
    private Map<String, C1097M> c;
    private Map<String, Object> d;
    private Map<String, C1097M> e;
    C1144i1 f;

    static {
        boolean z = false;
        try {
            Class.class.getMethod("getModule", new Class[0]);
            z = true;
        } catch (NoSuchMethodException unused) {
        }
        g = z;
        h = new AllPermission();
    }

    C1147j0(n2 n2Var, Class<?> cls, boolean z) {
        C1185v c1185vF = C1185v.f(C1188w.a());
        try {
            synchronized (c1185vF) {
            }
            this.b = new HashMap();
            this.d = new HashMap();
            this.a = cls;
            m(c1185vF, n2Var, z, c1185vF.t(13));
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    c1185vF.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void a(Class<?> cls, Map<C1143i0, Method> map, boolean z, boolean z2) {
        if (Modifier.isPublic(cls.getModifiers()) || z2) {
            try {
                if (!z && !z2) {
                    b(cls, map);
                    return;
                }
                while (cls != null) {
                    try {
                        for (Method method : cls.getDeclaredMethods()) {
                            int modifiers = method.getModifiers();
                            if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || z2) {
                                C1143i0 c1143i0 = new C1143i0(method);
                                if (!map.containsKey(c1143i0)) {
                                    if (z2 && !method.isAccessible()) {
                                        method.setAccessible(true);
                                    }
                                    map.put(c1143i0, method);
                                }
                            }
                        }
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            a(cls2, map, z, z2);
                        }
                        cls = cls.getSuperclass();
                    } catch (SecurityException unused) {
                        for (Method method2 : cls.getMethods()) {
                            C1143i0 c1143i02 = new C1143i0(method2);
                            if (!map.containsKey(c1143i02)) {
                                map.put(c1143i02, method2);
                            }
                        }
                        return;
                    }
                }
                return;
            } catch (SecurityException unused2) {
                StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("Could not discover accessible methods of class ");
                sbB.append(cls.getName());
                sbB.append(" due to lack of privileges, attemping superclasses/interfaces.");
                C1185v.I(sbB.toString());
            }
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            a(cls3, map, z, z2);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            a(superclass, map, z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    private C1186v0 c(String str) {
        int iIndexOf = str.indexOf(40);
        if (iIndexOf < 0) {
            return null;
        }
        Map<String, Object> map = this.b;
        String strSubstring = str.substring(0, iIndexOf);
        Object obj = map.get(strSubstring);
        if (obj == null) {
            obj = this.d.get(strSubstring);
        }
        C1186v0[] c1186v0Arr = obj instanceof C1144i1 ? ((C1144i1) obj).t : null;
        if (c1186v0Arr != null) {
            for (C1186v0 c1186v0 : c1186v0Arr) {
                String strJ = j(c1186v0.c);
                if (strJ.length() + iIndexOf == str.length() && str.regionMatches(iIndexOf, strJ, 0, strJ.length())) {
                    return c1186v0;
                }
            }
        }
        return null;
    }

    private static C1186v0 d(boolean z, Map<String, Object> map, String str, String str2) {
        String strConcat = str.concat(str2);
        if (map.containsKey(strConcat)) {
            Object obj = map.get(strConcat);
            if (obj instanceof C1144i1) {
                for (C1186v0 c1186v0 : ((C1144i1) obj).t) {
                    if (c1186v0.c.length == 0 && (!z || c1186v0.g())) {
                        if (c1186v0.h().getReturnType() != Void.TYPE) {
                            return c1186v0;
                        }
                    }
                }
            }
        }
        return null;
    }

    static String i(Class<?> cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        int i = 0;
        do {
            i++;
            cls = cls.getComponentType();
        } while (cls.isArray());
        String name = cls.getName();
        if (i == 1) {
            return name.concat("[]");
        }
        StringBuilder sb = new StringBuilder((i * 2) + name.length());
        sb.append(name);
        while (i != 0) {
            i--;
            sb.append("[]");
        }
        return sb.toString();
    }

    static String j(Class<?>[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (int i = 0; i != length; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(i(clsArr[i]));
        }
        sb.append(')');
        return sb.toString();
    }

    static C1147j0 k(n2 n2Var, Class<?> cls, Class<?> cls2, boolean z) {
        Object securityContext;
        C1167p c1167p = (C1167p) p2.v0(n2Var, "ClassCache");
        if (c1167p == null) {
            throw new RuntimeException("Can't find top level scope for ClassCache.get");
        }
        Map<C1164o, C1147j0> mapD = c1167p.d();
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityContext = securityManager.getSecurityContext();
            if (securityContext instanceof AccessControlContext) {
                try {
                    ((AccessControlContext) securityContext).checkPermission(h);
                    securityContext = null;
                } catch (SecurityException unused) {
                }
            }
        } else {
            securityContext = null;
        }
        Class<?> cls3 = cls;
        while (true) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mapD;
            C1147j0 c1147j0 = (C1147j0) concurrentHashMap.get(new C1164o(cls3, securityContext));
            if (c1147j0 != null) {
                if (cls3 != cls) {
                    concurrentHashMap.put(new C1164o(cls, securityContext), c1147j0);
                }
                return c1147j0;
            }
            try {
                n2 n2VarC = c1167p.c();
                C1147j0 c1151k0 = g ? new C1151k0(n2VarC, cls3, z) : new C1147j0(n2VarC, cls3, z);
                concurrentHashMap.put(new C1164o(cls3, securityContext), c1151k0);
                if (cls3 != cls) {
                    concurrentHashMap.put(new C1164o(cls, securityContext), c1151k0);
                }
                return c1151k0;
            } catch (SecurityException e) {
                if (cls2 == null || !cls2.isInterface()) {
                    Class<? super Object> superclass = cls3.getSuperclass();
                    if (superclass != null) {
                        cls3 = superclass;
                    } else {
                        if (!cls3.isInterface()) {
                            throw e;
                        }
                        cls3 = C1157l2.j;
                    }
                } else {
                    cls3 = cls2;
                    cls2 = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x02d2, code lost:
    
        r15 = 2;
        r14 = r14 + 1;
        r5 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m(com.github.catvod.spider.merge.f1.C1185v r18, com.github.catvod.spider.merge.f1.n2 r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1147j0.m(com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, boolean, boolean):void");
    }

    void b(Class<?> cls, Map<C1143i0, Method> map) {
        for (Method method : cls.getMethods()) {
            C1143i0 c1143i0 = new C1143i0(method);
            if (!map.containsKey(c1143i0)) {
                map.put(c1143i0, method);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    final Object e(n2 n2Var, String str, Object obj) {
        Object objC;
        Class<?> type;
        Object obj2;
        n2 c1144i1;
        Object obj3 = this.b.get(str);
        Object obj4 = obj3;
        if (obj3 == null) {
            obj4 = this.d.get(str);
        }
        if (obj4 == null) {
            Map<String, Object> map = this.b;
            C1186v0 c1186v0C = c(str);
            if (c1186v0C != null) {
                n2 n2VarM0 = p2.m0(n2Var);
                if (c1186v0C.d()) {
                    c1144i1 = new C1124d1(c1186v0C);
                } else {
                    Object obj5 = map.get(c1186v0C.b());
                    boolean z = obj5 instanceof C1144i1;
                    obj2 = obj5;
                    if (z) {
                        int length = ((C1144i1) obj5).t.length;
                        obj2 = obj5;
                        if (length > 1) {
                            c1144i1 = new C1144i1(c1186v0C, str);
                        }
                    }
                    obj4 = obj2;
                }
                c1144i1.E(n2VarM0);
                map.put(str, c1144i1);
                obj2 = c1144i1;
                obj4 = obj2;
            } else {
                obj4 = null;
            }
            if (obj4 == null) {
                return I2.c;
            }
        }
        if (obj4 instanceof n2) {
            return obj4;
        }
        C1185v c1185vH = C1185v.h();
        try {
            if (obj4 instanceof C1154l) {
                C1154l c1154l = (C1154l) obj4;
                C1186v0 c1186v0 = c1154l.a;
                if (c1186v0 == null) {
                    return I2.c;
                }
                objC = c1186v0.c(obj, C1185v.x);
                type = c1154l.a.h().getReturnType();
            } else {
                Field field = (Field) obj4;
                objC = field.get(obj);
                type = field.getType();
            }
            return c1185vH.s().c(c1185vH, p2.u0(n2Var), objC, type);
        } catch (Exception e) {
            C1185v.J(e);
            throw null;
        }
    }

    final Map f(n2 n2Var, Object obj) {
        Map<String, C1097M> map = this.c;
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap(map.size());
        for (C1097M c1097m : map.values()) {
            C1097M c1097m2 = new C1097M(n2Var, c1097m.t, c1097m.w);
            c1097m2.x = obj;
            map2.put(c1097m.w.getName(), c1097m2);
        }
        return map2;
    }

    final Object[] g() {
        return this.b.keySet().toArray(new Object[0]);
    }

    final boolean h(String str) {
        return (this.b.get(str) == null && c(str) == null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    final void l(n2 n2Var, String str, Object obj, Object obj2) {
        Map<String, Object> map = this.b;
        Object obj3 = map.get(str);
        if (obj3 == null) {
            obj3 = this.d.get(str);
        }
        if (obj3 == null) {
            throw n(str);
        }
        if (obj3 instanceof C1097M) {
            obj3 = ((C1097M) map.get(str)).w;
        }
        if (!(obj3 instanceof C1154l)) {
            if (!(obj3 instanceof Field)) {
                throw C1185v.H(obj3 == null ? "msg.java.internal.private" : "msg.java.method.assign", str);
            }
            Field field = (Field) obj3;
            Class<?> type = field.getType();
            Object[] objArr = C1185v.x;
            try {
                field.set(obj, C1156l1.f(type, obj2));
                return;
            } catch (IllegalAccessException e) {
                if ((field.getModifiers() & 16) != 0) {
                    return;
                }
                C1185v.J(e);
                throw null;
            } catch (IllegalArgumentException unused) {
                throw C1185v.H("msg.java.internal.field.type", obj2.getClass().getName(), field, obj.getClass().getName());
            }
        }
        C1154l c1154l = (C1154l) obj3;
        C1186v0 c1186v0 = c1154l.b;
        if (c1186v0 == null) {
            throw n(str);
        }
        C1144i1 c1144i1 = c1154l.c;
        if (c1144i1 != null && obj2 != null) {
            c1144i1.b(C1185v.h(), p2.u0(n2Var), n2Var, new Object[]{obj2});
            return;
        }
        Class<?> cls = c1186v0.c[0];
        Object[] objArr2 = C1185v.x;
        try {
            c1154l.b.c(obj, new Object[]{C1156l1.f(cls, obj2)});
        } catch (Exception e2) {
            C1185v.J(e2);
            throw null;
        }
    }

    final RuntimeException n(String str) {
        return C1185v.H("msg.java.member.not.found", this.a.getName(), str);
    }
}
