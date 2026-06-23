package com.github.catvod.spider.merge.A0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sv implements vq {
    public final /* synthetic */ int b;
    public final xg c;

    public /* synthetic */ sv(xg xgVar, int i) {
        this.b = i;
        this.c = xgVar;
    }

    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        Class cls;
        Type[] actualTypeArguments;
        xg xgVar = this.c;
        cls = Object.class;
        switch (this.b) {
            case 0:
                Type type = fjVar.b;
                Class cls2 = fjVar.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                rk.a(Collection.class.isAssignableFrom(cls2));
                Type typeH = po.h(type, cls2, po.f(type, cls2, Collection.class), new HashMap());
                cls = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                return new su(oaVar, cls, oaVar.aa(new fj(cls)), xgVar.e(fjVar));
            default:
                Type type2 = fjVar.b;
                Class cls3 = fjVar.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    rk.a(Map.class.isAssignableFrom(cls3));
                    Type typeH2 = po.h(type2, cls3, po.f(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                return new aao(this, oaVar, actualTypeArguments[0], (type3 == Boolean.TYPE || type3 == Boolean.class) ? ado.c : oaVar.aa(new fj(type3)), actualTypeArguments[1], oaVar.aa(new fj(actualTypeArguments[1])), xgVar.e(fjVar));
        }
    }
}
