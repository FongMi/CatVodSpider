package com.github.catvod.spider.merge.f1;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1186v0 implements Serializable {
    private transient Member b;
    transient Class<?>[] c;
    transient boolean d;
    transient InterfaceC1098N e;
    transient InterfaceC1098N f;
    transient Object g;

    C1186v0(Constructor<?> constructor) {
        this.b = constructor;
        this.c = constructor.getParameterTypes();
        this.d = constructor.isVarArgs();
    }

    private static Method j(Method method, Class<?>[] clsArr) {
        int modifiers = method.getModifiers();
        if (!Modifier.isPublic(modifiers) || Modifier.isStatic(modifiers)) {
            return null;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return null;
        }
        String name = method.getName();
        Class<?>[] interfaces = declaringClass.getInterfaces();
        int length = interfaces.length;
        for (int i = 0; i != length; i++) {
            Class<?> cls = interfaces[i];
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    return cls.getMethod(name, clsArr);
                } catch (NoSuchMethodException | SecurityException unused) {
                    continue;
                }
            }
        }
        while (true) {
            declaringClass = declaringClass.getSuperclass();
            if (declaringClass == null) {
                return null;
            }
            if (Modifier.isPublic(declaringClass.getModifiers())) {
                try {
                    Method method2 = declaringClass.getMethod(name, clsArr);
                    int modifiers2 = method2.getModifiers();
                    if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2)) {
                        return method2;
                    }
                } catch (NoSuchMethodException | SecurityException unused2) {
                }
            }
        }
    }

    final Class<?> a() {
        return this.b.getDeclaringClass();
    }

    final String b() {
        return this.b.getName();
    }

    final Object c(Object obj, Object[] objArr) {
        Method method = (Method) this.b;
        if (obj instanceof C1086B) {
            obj = ((C1086B) obj).b;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof C1086B) {
                objArr[i] = ((C1086B) objArr[i]).b;
            }
        }
        try {
            try {
                return method.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                Method methodJ = j(method, this.c);
                if (methodJ != null) {
                    this.b = methodJ;
                    method = methodJ;
                } else if (!J2.a.f()) {
                    C1185v.J(e);
                    throw null;
                }
                return method.invoke(obj, objArr);
            }
        } catch (InvocationTargetException e2) {
            e = e2;
            do {
                e = ((InvocationTargetException) e).getTargetException();
            } while (e instanceof InvocationTargetException);
            if (e instanceof C1191x) {
                throw ((C1191x) e);
            }
            C1185v.J(e);
            throw null;
        } catch (Exception e3) {
            C1185v.J(e3);
            throw null;
        }
    }

    final boolean d() {
        return this.b instanceof Constructor;
    }

    final boolean e() {
        return this.b instanceof Method;
    }

    final boolean f() {
        return Modifier.isPublic(this.b.getModifiers());
    }

    final boolean g() {
        return Modifier.isStatic(this.b.getModifiers());
    }

    final Method h() {
        return (Method) this.b;
    }

    final Object i(Object[] objArr) {
        Constructor constructor = (Constructor) this.b;
        try {
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                if (J2.a.f()) {
                    return constructor.newInstance(objArr);
                }
                C1185v.J(e);
                throw null;
            }
        } catch (Exception e2) {
            C1185v.J(e2);
            throw null;
        }
    }

    final String k() {
        String name;
        StringBuilder sb = new StringBuilder();
        Member member = this.b;
        if (member instanceof Method) {
            Method method = (Method) member;
            sb.append(method.getReturnType());
            sb.append(' ');
            name = method.getName();
        } else {
            name = ((Constructor) member).getDeclaringClass().getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                name = name.substring(iLastIndexOf + 1);
            }
        }
        sb.append(name);
        sb.append(C1147j0.j(this.c));
        return sb.toString();
    }

    public final String toString() {
        return this.b.toString();
    }

    C1186v0(Method method) {
        this.b = method;
        this.c = method.getParameterTypes();
        this.d = method.isVarArgs();
    }
}
