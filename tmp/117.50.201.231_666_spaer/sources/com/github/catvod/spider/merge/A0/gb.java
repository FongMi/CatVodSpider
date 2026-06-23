package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class gb extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        String strAi = rdVar.ai();
        if (strAi.length() == 1) {
            return Character.valueOf(strAi.charAt(0));
        }
        throw new yc("Expecting character, got: " + strAi + "; at " + rdVar.w(true));
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        aagVar.ae(ch == null ? null : String.valueOf(ch));
    }
}
