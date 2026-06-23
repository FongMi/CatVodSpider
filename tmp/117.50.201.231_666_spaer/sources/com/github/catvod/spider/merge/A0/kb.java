package com.github.catvod.spider.merge.A0;

import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class kb extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (Marker.ANY_MARKER.equals(c())) {
            as asVarD = as.d(Marker.ANY_MARKER);
            asVarD.k();
            return asVarD;
        }
        if (((ye) k(ye.class)) != null && !((ye) k(ye.class)).n()) {
            return (as) ((ye) k(ye.class)).b(uvVar);
        }
        if (((abj) k(abj.class)) == null || ((abj) k(abj.class)).n()) {
            return null;
        }
        return (as) ((abj) k(abj.class)).b(uvVar);
    }
}
