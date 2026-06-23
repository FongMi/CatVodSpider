package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class wq extends rf {
    public to a;

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        Class cls;
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        List listL = l(zd.class);
        if (listL.size() == 1) {
            return (as) ((dl) listL.get(0)).b(uvVar);
        }
        if (listL.size() != 2) {
            throw new tv("error equalityExpr near:" + c());
        }
        as asVar = (as) ((dl) listL.get(0)).b(uvVar);
        as asVar2 = (as) ((dl) listL.get(1)).b(uvVar);
        cls = Object.class;
        if ("=".equals(this.a.j())) {
            Serializable serializable = asVar.a;
            Class<?> cls2 = serializable == null ? cls : serializable.getClass();
            Serializable serializable2 = asVar2.a;
            return cls2.equals(serializable2 != null ? serializable2.getClass() : Object.class) ? as.d(Boolean.valueOf(asVar.equals(asVar2))) : as.d(Boolean.valueOf(Objects.equals(asVar.i(), asVar2.i())));
        }
        Serializable serializable3 = asVar.a;
        Class<?> cls3 = serializable3 == null ? cls : serializable3.getClass();
        Serializable serializable4 = asVar2.a;
        return cls3.equals(serializable4 != null ? serializable4.getClass() : Object.class) ? as.d(Boolean.valueOf(!asVar.equals(asVar2))) : as.d(Boolean.valueOf(!Objects.equals(asVar.i(), asVar2.i())));
    }
}
