package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class I extends AbstractC0088v {
    public I(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.N.AbstractC0088v
    protected final int b(com.github.catvod.spider.merge.L.m mVar) {
        int i = 0;
        if (mVar.k0() == null) {
            return 0;
        }
        C0074g c0074gV = mVar.k0().V();
        for (int iY = mVar.Y(); iY < c0074gV.size(); iY++) {
            if (c0074gV.get(iY).s0().equals(mVar.s0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.N.AbstractC0088v
    protected final String c() {
        return oZP.d("1B1B1F6C0034061B5A2E0A7801160724");
    }
}
