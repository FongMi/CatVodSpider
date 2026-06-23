package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class fl implements GenericArrayType, Serializable {
    public final Type a;

    public fl(Type type) {
        Objects.requireNonNull(type);
        this.a = po.b(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && po.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return po.i(this.a) + "[]";
    }
}
