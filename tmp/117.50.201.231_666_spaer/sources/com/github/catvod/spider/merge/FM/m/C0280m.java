package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0280m extends AbstractC0277j {
    public C0280m(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return mVar2.n(this.a) && com.github.catvod.spider.merge.FM.A.l.d(mVar2.c(this.a)).contains(this.b);
    }

    public final String toString() {
        return String.format("[%s*=%s]", this.a, this.b);
    }
}
