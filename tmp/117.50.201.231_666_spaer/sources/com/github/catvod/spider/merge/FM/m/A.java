package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class A extends AbstractC0291y {
    public A(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return mVar != mVar2 && mVar2.Y() < this.a;
    }

    public final String toString() {
        return String.format(":lt(%d)", Integer.valueOf(this.a));
    }
}
