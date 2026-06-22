package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0731n extends AbstractC0727j {
    public C0731n(String str, String str2) {
        super(str, str2, false);
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        return mVar2.n(this.a) && com.github.catvod.spider.merge.Bk.l.c(mVar2.c(this.a)).endsWith(this.b);
    }

    public final String toString() {
        return String.format(ZrJ.d("2266386975600A1E"), this.a, this.b);
    }
}
