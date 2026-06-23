package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class yf extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) {
        try {
            return new AtomicInteger(rdVar.ac());
        } catch (NumberFormatException e) {
            throw new yc(e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        aagVar.ac(((AtomicInteger) obj).get());
    }
}
