package com.github.catvod.spider.merge.A0;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ue extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        List listL = l(aad.class);
        if (listL.size() <= 1) {
            return (as) ((dl) listL.get(0)).b(uvVar);
        }
        Boolean boolE = ((as) ((dl) listL.get(0)).b(uvVar)).e();
        for (int i = 1; i < listL.size(); i++) {
            boolE = Boolean.valueOf(boolE.booleanValue() | ((as) ((dl) listL.get(i)).b(uvVar)).e().booleanValue());
        }
        return as.d(boolE);
    }
}
