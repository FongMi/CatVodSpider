package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class H extends AbstractC0288v {
    public H(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.FM.M.AbstractC0288v
    protected final int b(com.github.catvod.spider.merge.FM.K.m mVar) {
        if (mVar.k0() == null) {
            return 0;
        }
        return mVar.k0().V().size() - mVar.Y();
    }

    @Override // com.github.catvod.spider.merge.FM.M.AbstractC0288v
    protected final String c() {
        return "nth-last-child";
    }
}
