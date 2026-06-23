package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class hv extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        String strAi = rdVar.ai();
        if (strAi.equals("null")) {
            return null;
        }
        return new URL(strAi);
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        URL url = (URL) obj;
        aagVar.ae(url == null ? null : url.toExternalForm());
    }
}
