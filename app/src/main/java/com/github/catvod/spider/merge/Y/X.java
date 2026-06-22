package com.github.catvod.spider.merge.y;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class X<T> {
    static ConcurrentMap<Type, Type> b = new ConcurrentHashMap(16, 0.75f, 1);
    protected final Type a;

    static {
        new W();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type>] */
    protected X() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Type type2 = (Type) b.get(type);
        if (type2 == null) {
            b.putIfAbsent(type, type);
            type2 = (Type) b.get(type);
        }
        this.a = type2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static Type a(com.github.catvod.spider.merge.H.n nVar) {
        Type type = b.get(nVar);
        if (type != null) {
            return type;
        }
        b.putIfAbsent(nVar, nVar);
        return b.get(nVar);
    }
}
