package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ji implements WildcardType, Serializable {
    public final Type a;
    public final Type b;

    public ji(Type[] typeArr, Type[] typeArr2) {
        rk.a(typeArr2.length <= 1);
        rk.a(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            po.c(typeArr[0]);
            this.b = null;
            this.a = po.b(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        po.c(typeArr2[0]);
        rk.a(typeArr[0] == Object.class);
        this.b = po.b(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && po.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : po.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + po.i(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + po.i(type2);
    }
}
