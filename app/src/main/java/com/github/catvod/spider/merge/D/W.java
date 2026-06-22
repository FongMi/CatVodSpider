package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.C1413b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class W implements X, com.github.catvod.spider.merge.C.w {
    public static final W a = new W();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> T f(com.github.catvod.spider.merge.B.b r12, java.lang.Class<?> r13, com.github.catvod.spider.merge.y.C1413b r14) {
        /*
            r11 = this;
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            int r1 = r14.size()
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r13, r1)
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r1) goto L65
            java.lang.Object r5 = r14.get(r4)
            if (r5 != r14) goto L1a
            java.lang.reflect.Array.set(r2, r4, r2)
            goto L62
        L1a:
            boolean r6 = r13.isArray()
            if (r6 == 0) goto L31
            boolean r6 = r13.isInstance(r5)
            if (r6 == 0) goto L27
            goto L2d
        L27:
            com.github.catvod.spider.merge.y.b r5 = (com.github.catvod.spider.merge.y.C1413b) r5
            java.lang.Object r5 = r11.f(r12, r13, r5)
        L2d:
            java.lang.reflect.Array.set(r2, r4, r5)
            goto L62
        L31:
            boolean r6 = r5 instanceof com.github.catvod.spider.merge.y.C1413b
            if (r6 == 0) goto L54
            r6 = r5
            com.github.catvod.spider.merge.y.b r6 = (com.github.catvod.spider.merge.y.C1413b) r6
            int r7 = r6.size()
            r8 = 0
            r9 = 0
        L3e:
            if (r8 >= r7) goto L4d
            java.lang.Object r10 = r6.get(r8)
            if (r10 != r14) goto L4a
            r6.set(r4, r2)
            r9 = 1
        L4a:
            int r8 = r8 + 1
            goto L3e
        L4d:
            if (r9 == 0) goto L54
            java.lang.Object[] r6 = r6.toArray()
            goto L55
        L54:
            r6 = r0
        L55:
            if (r6 != 0) goto L5f
            com.github.catvod.spider.merge.B.o r6 = r12.e()
            java.lang.Object r6 = com.github.catvod.spider.merge.H.A.d(r5, r13, r6)
        L5f:
            java.lang.reflect.Array.set(r2, r4, r6)
        L62:
            int r4 = r4 + 1
            goto Le
        L65:
            r14.s(r2)
            r14.q(r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.W.f(com.github.catvod.spider.merge.B.b, java.lang.Class, com.github.catvod.spider.merge.y.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, byte[]] */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        Type componentType;
        Class clsG;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        int iP = dVar.p();
        Type type2 = null;
        if (iP == 8) {
            dVar.o(16);
            return null;
        }
        if (iP == 4 || iP == 26) {
            ?? r8 = (T) dVar.A();
            dVar.o(16);
            if (r8.length != 0 || type == byte[].class) {
                return r8;
            }
            return null;
        }
        if (type instanceof GenericArrayType) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
            if (componentType instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) componentType;
                Type type3 = bVar.f().e;
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    Type rawType = parameterizedType.getRawType();
                    if (rawType instanceof Class) {
                        TypeVariable<Class<T>>[] typeParameters = ((Class) rawType).getTypeParameters();
                        for (int i = 0; i < typeParameters.length; i++) {
                            if (typeParameters[i].getName().equals(typeVariable.getName())) {
                                type2 = parameterizedType.getActualTypeArguments()[i];
                            }
                        }
                    }
                    clsG = type2 instanceof Class ? (Class) type2 : Object.class;
                } else {
                    clsG = com.github.catvod.spider.merge.H.A.G(typeVariable.getBounds()[0]);
                }
            } else {
                clsG = com.github.catvod.spider.merge.H.A.G(componentType);
            }
        } else {
            componentType = ((Class) type).getComponentType();
            clsG = componentType;
        }
        C1413b c1413b = new C1413b();
        bVar.p(componentType, c1413b, obj);
        return (T) f(bVar, clsG, c1413b);
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            h0Var.u(i0.WriteNullListAsEmpty);
            return;
        }
        int length = objArr.length;
        int i2 = length - 1;
        if (i2 == -1) {
            h0Var.b("[]");
            return;
        }
        c0 c0Var = l.p;
        l.s(c0Var, obj, obj2);
        try {
            h0Var.write(91);
            if (h0Var.g(i0.PrettyFormat)) {
                l.o();
                l.r();
                for (int i3 = 0; i3 < length; i3++) {
                    if (i3 != 0) {
                        h0Var.write(44);
                        l.r();
                    }
                    l.y(objArr[i3], Integer.valueOf(i3));
                }
                l.j();
                l.r();
                h0Var.write(93);
                return;
            }
            Class<?> cls = null;
            X xN = null;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj3 = objArr[i4];
                if (obj3 == null) {
                    h0Var.b("null,");
                } else {
                    if (l.i(obj3)) {
                        l.x(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            xN.d(l, obj3, Integer.valueOf(i4), null, 0);
                        } else {
                            xN = l.n(cls2);
                            xN.d(l, obj3, Integer.valueOf(i4), null, 0);
                            cls = cls2;
                        }
                    }
                    h0Var.write(44);
                }
            }
            Object obj4 = objArr[i2];
            if (obj4 == null) {
                h0Var.b("null]");
            } else {
                if (l.i(obj4)) {
                    l.x(obj4);
                } else {
                    l.y(obj4, Integer.valueOf(i2));
                }
                h0Var.write(93);
            }
        } finally {
            l.p = c0Var;
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 14;
    }
}
