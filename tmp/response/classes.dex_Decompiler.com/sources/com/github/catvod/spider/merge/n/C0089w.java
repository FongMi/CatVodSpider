package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0089w extends N {
    private final String a;

    public C0089w(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        return this.a.equals(mVar2.d0());
    }

    public final String toString() {
        return String.format(oZP.d("564A04"), this.a);
    }
}
