package com.github.catvod.spider.merge.D;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b0 implements X, com.github.catvod.spider.merge.C.w {
    public static final b0 a = new b0();

    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Object objT = bVar.t(parameterizedType.getActualTypeArguments()[0], null);
        Type rawType = parameterizedType.getRawType();
        if (rawType == AtomicReference.class) {
            return (T) new AtomicReference(objT);
        }
        if (rawType == WeakReference.class) {
            return (T) new WeakReference(objT);
        }
        if (rawType == SoftReference.class) {
            return (T) new SoftReference(objT);
        }
        throw new UnsupportedOperationException(rawType.toString());
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        l.u(obj instanceof AtomicReference ? ((AtomicReference) obj).get() : ((Reference) obj).get());
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 12;
    }
}
