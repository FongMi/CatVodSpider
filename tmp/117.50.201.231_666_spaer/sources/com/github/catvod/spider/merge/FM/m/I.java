package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class I extends AbstractC0288v {
    public I(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.FM.M.AbstractC0288v
    protected final int b(com.github.catvod.spider.merge.FM.K.m mVar) {
        int i = 0;
        if (mVar.k0() == null) {
            return 0;
        }
        C0274g c0274gV = mVar.k0().V();
        for (int iY = mVar.Y(); iY < c0274gV.size(); iY++) {
            if (c0274gV.get(iY).s0().equals(mVar.s0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.FM.M.AbstractC0288v
    protected final String c() {
        return "nth-last-of-type";
    }
}
