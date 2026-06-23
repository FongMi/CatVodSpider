package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class qs extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        String strAi = rdVar.ai();
        try {
            sk.c(strAi);
            return new BigInteger(strAi);
        } catch (NumberFormatException e) {
            throw new yc("Failed parsing '" + strAi + "' as BigInteger; at path " + rdVar.w(true), e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        aagVar.ad((BigInteger) obj);
    }
}
