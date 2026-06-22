package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0080m extends AbstractC0077j {
    public C0080m(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        return mVar2.n(this.a) && com.github.catvod.spider.merge.B.l.c(mVar2.c(this.a)).contains(this.b);
    }

    public final String toString() {
        return String.format(oZP.d("2E4A046B51700632"), this.a, this.b);
    }
}
