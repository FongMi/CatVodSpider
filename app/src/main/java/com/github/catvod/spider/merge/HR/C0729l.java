package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0729l extends AbstractC0727j {
    public C0729l(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        return mVar2.n(this.a) && this.b.equalsIgnoreCase(mVar2.c(this.a).trim());
    }

    public final String toString() {
        return String.format(ZrJ.d("226638706D3624"), this.a, this.b);
    }
}
