package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0087u extends N {
    private final String a;

    public C0087u(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        com.github.catvod.spider.merge.F.a.b(new com.github.catvod.spider.merge.L.j(sbB), mVar2);
        return com.github.catvod.spider.merge.K.b.h(sbB).contains(this.a);
    }

    public final String toString() {
        return String.format(oZP.d("4F0C182F18341C010416043A190A232414215D4A0468"), this.a);
    }
}
