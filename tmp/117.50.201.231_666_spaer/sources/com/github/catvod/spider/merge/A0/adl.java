package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class adl extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        try {
            String strAi = rdVar.ai();
            if (strAi.equals("null")) {
                return null;
            }
            return new URI(strAi);
        } catch (URISyntaxException e) {
            throw new yc(e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        aagVar.ae(uri == null ? null : uri.toASCIIString());
    }
}
