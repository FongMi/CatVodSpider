package com.github.catvod.spider.merge.C;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class r implements w {
    public static final r a = new r();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        if (!(type instanceof GenericArrayType)) {
            return (!(type instanceof Class) || type == Object.class || type == Serializable.class || type == Cloneable.class || type == Closeable.class || type == Comparable.class) ? (T) bVar.o(obj) : (T) bVar.t(type, null);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        if (genericComponentType instanceof TypeVariable) {
            genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
        }
        ArrayList arrayList = new ArrayList();
        bVar.p(genericComponentType, arrayList, null);
        T t = (T) ((Object[]) Array.newInstance(com.github.catvod.spider.merge.H.A.W(genericComponentType), arrayList.size()));
        arrayList.toArray((Object[]) t);
        return t;
    }

    @Override // com.github.catvod.spider.merge.C.w
    public final int e() {
        return 12;
    }
}
