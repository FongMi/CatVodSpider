package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class hu extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        int iAk = rdVar.ak();
        if (iAk != 9) {
            return iAk == 6 ? Boolean.valueOf(Boolean.parseBoolean(rdVar.ai())) : Boolean.valueOf(rdVar.aa());
        }
        rdVar.ag();
        return null;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            aagVar.w();
            return;
        }
        aagVar.ag();
        aagVar.o();
        aagVar.d.write(bool.booleanValue() ? "true" : "false");
    }
}
