package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class js extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        String strAi = rdVar.ai();
        try {
            return UUID.fromString(strAi);
        } catch (IllegalArgumentException e) {
            throw new yc("Failed parsing '" + strAi + "' as UUID; at path " + rdVar.w(true), e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        aagVar.ae(uuid == null ? null : uuid.toString());
    }
}
