package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class mu extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() != 9) {
            return InetAddress.getByName(rdVar.ai());
        }
        rdVar.ag();
        return null;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        aagVar.ae(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
