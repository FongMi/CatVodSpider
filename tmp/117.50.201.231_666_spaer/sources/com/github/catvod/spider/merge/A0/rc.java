package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rc extends lo {
    public static final HashMap a;
    public final Constructor h;
    public final Object[] i;
    public final HashMap j;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        a = map;
    }

    public rc(Class cls, vg vgVar) {
        super(vgVar);
        this.j = new HashMap();
        acs acsVar = ce.a;
        Constructor constructorB = acsVar.b(cls);
        this.h = constructorB;
        ce.g(constructorB);
        String[] strArrC = acsVar.c(cls);
        for (int i = 0; i < strArrC.length; i++) {
            this.j.put(strArrC[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.h.getParameterTypes();
        this.i = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.i[i2] = a.get(parameterTypes[i2]);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.lo
    public final Object d() {
        return (Object[]) this.i.clone();
    }

    @Override // com.github.catvod.spider.merge.A0.lo
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.h;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            acs acsVar = ce.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + ce.c(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + ce.c(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + ce.c(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // com.github.catvod.spider.merge.A0.lo
    public final void f(Object obj, rd rdVar, jv jvVar) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.j;
        String str = jvVar.c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + ce.c(this.h) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = jvVar.f.b(rdVar);
        if (objB != null || !jvVar.g) {
            objArr[iIntValue] = objB;
            return;
        }
        throw new tv("null is not allowed as value for record component '" + str + "' of primitive type; at path " + rdVar.w(false));
    }
}
