package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0292z extends AbstractC0291y {
    public C0292z(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return mVar2.Y() > this.a;
    }

    public final String toString() {
        return String.format(":gt(%d)", Integer.valueOf(this.a));
    }
}
