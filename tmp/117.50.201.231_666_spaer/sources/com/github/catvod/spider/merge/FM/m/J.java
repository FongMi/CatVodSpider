package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class J extends AbstractC0288v {
    public J(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.FM.M.AbstractC0288v
    protected final int b(com.github.catvod.spider.merge.FM.K.m mVar) {
        int i = 0;
        if (mVar.k0() == null) {
            return 0;
        }
        for (com.github.catvod.spider.merge.FM.K.m mVar2 : mVar.k0().V()) {
            if (mVar2.s0().equals(mVar.s0())) {
                i++;
            }
            if (mVar2 == mVar) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.FM.M.AbstractC0288v
    protected final String c() {
        return "nth-of-type";
    }
}
