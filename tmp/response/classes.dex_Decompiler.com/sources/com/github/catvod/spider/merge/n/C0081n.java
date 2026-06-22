package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0081n extends AbstractC0077j {
    public C0081n(String str, String str2) {
        super(str, str2, false);
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        return mVar2.n(this.a) && com.github.catvod.spider.merge.B.l.c(mVar2.c(this.a)).endsWith(this.b);
    }

    public final String toString() {
        return String.format(oZP.d("2E4A046551700632"), this.a, this.b);
    }
}
