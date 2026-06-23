package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class vw extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        String strAi = rdVar.ai();
        try {
            return Currency.getInstance(strAi);
        } catch (IllegalArgumentException e) {
            throw new yc("Failed parsing '" + strAi + "' as Currency; at path " + rdVar.w(true), e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        aagVar.ae(((Currency) obj).getCurrencyCode());
    }
}
