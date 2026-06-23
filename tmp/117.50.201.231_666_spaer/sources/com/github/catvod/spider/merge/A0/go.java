package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class go extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        as asVar = null;
        for (int i = 0; i < j(); i++) {
            dl dlVarI = i(i);
            if (dlVarI instanceof aax) {
                asVar = (as) ((aax) dlVarI).b(uvVar);
                Serializable serializable = asVar.a;
                if (serializable instanceof rp) {
                    uvVar.e((rp) serializable);
                }
            } else if ("//".equals(dlVarI.c())) {
                uvVar.d().b = true;
            } else {
                uvVar.d().b = false;
            }
        }
        return asVar;
    }
}
