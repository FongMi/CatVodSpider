package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0604e implements X {
    private static volatile Class a;
    private static volatile boolean b;
    private static volatile Method c;
    private static volatile Method d;
    public static C0604e e = new C0604e();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        C1415d c1415d;
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        if (interfaces.length == 1 && interfaces[0].isAnnotation()) {
            Class<?> cls = interfaces[0];
            if (a == null && !b) {
                try {
                    a = Class.forName("sun.reflect.annotation.AnnotationType");
                } finally {
                }
            }
            if (a == null) {
                throw new C1415d("not support Type Annotation.");
            }
            if (c == null && !b) {
                try {
                    c = a.getMethod("getInstance", Class.class);
                } finally {
                }
            }
            if (d == null && !b) {
                try {
                    d = a.getMethod("members", new Class[0]);
                } finally {
                }
            }
            if (c == null || b) {
                throw new C1415d("not support Type Annotation.");
            }
            try {
                Object[] objArr = {cls};
                Object objInvoke = null;
                try {
                    Map map = (Map) d.invoke(c.invoke(null, objArr), new Object[0]);
                    C1416e c1416e = new C1416e(map.size(), false);
                    for (Map.Entry entry : map.entrySet()) {
                        try {
                            objInvoke = ((Method) entry.getValue()).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                        c1416e.put((String) entry.getKey(), AbstractC1412a.j(objInvoke));
                    }
                    l.u(c1416e);
                } finally {
                }
            } finally {
            }
        }
    }
}
