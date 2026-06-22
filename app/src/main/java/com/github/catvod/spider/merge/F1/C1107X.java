package com.github.catvod.spider.merge.f1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.X, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1107X {
    private final Object a = J2.a.b();

    private C1107X(C1188w c1188w, Class<?> cls) {
    }

    static Object a(C1185v c1185v, Class<?> cls, p2 p2Var) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException();
        }
        C1167p c1167p = (C1167p) p2.v0(C1157l2.X(c1185v), "ClassCache");
        if (c1167p == null) {
            throw new RuntimeException("Can't find top level scope for ClassCache.get");
        }
        C1107X c1107x = (C1107X) c1167p.e(cls);
        C1188w c1188wK = c1185v.k();
        if (c1107x == null) {
            if (p2Var instanceof InterfaceC1161n) {
                Method[] methods = cls.getMethods();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (Method method : methods) {
                    if ((method.getName().equals("equals") || method.getName().equals("hashCode") || method.getName().equals("toString")) ? false : Modifier.isAbstract(method.getModifiers())) {
                        hashSet.add(method.getName());
                        if (hashSet.size() > 1) {
                            break;
                        }
                    } else {
                        hashSet2.add(method.getName());
                    }
                }
                if (!(hashSet.size() == 1 || (hashSet.isEmpty() && hashSet2.size() == 1))) {
                    if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                        throw C1185v.H("msg.no.empty.interface.conversion", cls.getName());
                    }
                    throw C1185v.H("msg.no.function.interface.conversion", cls.getName());
                }
            }
            c1167p.b(cls, new C1107X(c1188wK, cls));
        }
        return J2.a.d();
    }
}
