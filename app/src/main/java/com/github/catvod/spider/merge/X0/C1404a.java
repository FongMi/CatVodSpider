package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.y.C1416e;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.x0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1404a implements InterfaceC1405b {
    private final String b;

    public C1404a(C1416e c1416e) {
        this.b = C0899d.j(c1416e.u("correctedQuery"));
    }

    @Override // com.github.catvod.spider.merge.x0.InterfaceC1405b
    public final EnumC1406c type() {
        return EnumC1406c.AUTO_CORRECTION;
    }
}
