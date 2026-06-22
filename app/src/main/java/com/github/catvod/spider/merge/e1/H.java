package com.github.catvod.spider.merge.e1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class H extends AbstractC1050v {
    public H(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.e1.AbstractC1050v
    protected final int b(com.github.catvod.spider.merge.c1.m mVar) {
        int i = 0;
        if (mVar.h0() == null) {
            return 0;
        }
        C1036g c1036gT = mVar.h0().T();
        for (int iW = mVar.W(); iW < c1036gT.size(); iW++) {
            if (c1036gT.get(iW).q0().equals(mVar.q0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.e1.AbstractC1050v
    protected final String c() {
        return "nth-last-of-type";
    }
}
