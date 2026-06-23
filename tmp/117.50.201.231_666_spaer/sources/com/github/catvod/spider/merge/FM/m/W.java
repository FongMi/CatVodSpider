package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class W extends a0 {
    public W(N n) {
        this.a = n;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return !this.a.a(mVar, mVar2);
    }

    public final String toString() {
        return String.format(":not(%s)", this.a);
    }
}
