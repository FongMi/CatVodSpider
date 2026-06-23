package com.github.catvod.spider.merge.A0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xc implements ub {
    public final /* synthetic */ int a;
    public final /* synthetic */ Type b;

    public /* synthetic */ xc(Type type, int i) {
        this.a = i;
        this.b = type;
    }

    @Override // com.github.catvod.spider.merge.A0.ub
    public final Object m() {
        switch (this.a) {
            case 0:
                Type type = this.b;
                if (!(type instanceof ParameterizedType)) {
                    throw new yc("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new yc("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.b;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new yc("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new yc("Invalid EnumMap type: " + type3.toString());
        }
    }
}
