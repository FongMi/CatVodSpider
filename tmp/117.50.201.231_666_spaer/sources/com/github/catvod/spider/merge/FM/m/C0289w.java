package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0289w extends N {
    private final String a;

    public C0289w(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return this.a.equals(mVar2.d0());
    }

    public final String toString() {
        return String.format("#%s", this.a);
    }
}
