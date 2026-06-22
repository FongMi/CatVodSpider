package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class I extends AbstractC0738v {
    public I(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.HR.AbstractC0738v
    protected final int b(com.github.catvod.spider.merge.UY.m mVar) {
        int i = 0;
        if (mVar.k0() == null) {
            return 0;
        }
        C0724g c0724gV = mVar.k0().V();
        for (int iY = mVar.Y(); iY < c0724gV.size(); iY++) {
            if (c0724gV.get(iY).s0().equals(mVar.s0())) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.HR.AbstractC0738v
    protected final String c() {
        return ZrJ.d("1737236024240A3766222E680D3A3B28");
    }
}
