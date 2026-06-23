package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rn extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (m(7) == null) {
            if (!"@".equals(c())) {
                return null;
            }
            as asVarD = as.d(null);
            asVarD.b = true;
            return asVarD;
        }
        String strC = m(7).c();
        if (jr.a.get(strC) != null) {
            throw new ClassCastException();
        }
        throw new tv("not support axis: " + strC);
    }
}
