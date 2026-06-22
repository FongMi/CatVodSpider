package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1416e;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f extends g implements InterfaceC1405b {
    public f(C1416e c1416e) {
        super(c1416e);
        C0899d.j(c1416e.u("didYouMean"));
    }

    @Override // com.github.catvod.spider.merge.x0.g
    protected final String f(C1416e c1416e) {
        return C0899d.j(c1416e.u("correctedQuery"));
    }

    @Override // com.github.catvod.spider.merge.x0.g
    protected final String g(C1416e c1416e) {
        return c1416e.u("correctedQueryEndpoint").u("commandMetadata").u("webCommandMetadata").x("url");
    }

    @Override // com.github.catvod.spider.merge.x0.InterfaceC1405b
    public final EnumC1406c type() {
        return EnumC1406c.SUGGESTION;
    }
}
