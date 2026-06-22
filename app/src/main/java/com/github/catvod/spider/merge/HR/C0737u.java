package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0737u extends N {
    private final String a;

    public C0737u(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        com.github.catvod.spider.merge.XI.p.b(new com.github.catvod.spider.merge.UY.j(sbB), mVar2);
        return com.github.catvod.spider.merge.XU.n.h(sbB).contains(this.a);
    }

    public final String toString() {
        return String.format(ZrJ.d("432024233C24102D381A202A15261F28303151663864"), this.a);
    }
}
