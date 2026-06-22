package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1416e;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.x0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1407d extends g {
    public C1407d(C1416e c1416e) {
        super(c1416e);
        C0899d.k(c1416e.u("thumbnail"));
    }

    @Override // com.github.catvod.spider.merge.x0.g
    protected final String f(C1416e c1416e) {
        return C0899d.j(c1416e.u("query"));
    }

    @Override // com.github.catvod.spider.merge.x0.g
    protected final String g(C1416e c1416e) {
        return c1416e.u("searchEndpoint").u("commandMetadata").u("webCommandMetadata").x("url");
    }
}
