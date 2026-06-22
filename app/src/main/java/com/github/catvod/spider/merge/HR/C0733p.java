package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0733p extends AbstractC0727j {
    public C0733p(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        return !this.b.equalsIgnoreCase(mVar2.c(this.a));
    }

    public final String toString() {
        return String.format(ZrJ.d("2266386C75600A1E"), this.a, this.b);
    }
}
