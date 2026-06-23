package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class vm extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (((jz) k(jz.class)) != null && !((jz) k(jz.class)).n()) {
            return (as) ((jz) k(jz.class)).b(uvVar);
        }
        if (((fk) k(fk.class)) != null && !((fk) k(fk.class)).n()) {
            return (as) ((fk) k(fk.class)).b(uvVar);
        }
        if (m(39) != null) {
            as asVarD = as.d(m(39).c());
            asVarD.k();
            return asVarD;
        }
        if (m(6) != null) {
            String strC = m(6).c();
            return as.d(strC == null ? null : Double.valueOf(strC));
        }
        throw new tv("not support variableReference:" + c());
    }
}
