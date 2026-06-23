package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0279l extends AbstractC0277j {
    public C0279l(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return mVar2.n(this.a) && this.b.equalsIgnoreCase(mVar2.c(this.a).trim());
    }

    public final String toString() {
        return String.format("[%s=%s]", this.a, this.b);
    }
}
