package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class J extends AbstractC0738v {
    public J(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.HR.AbstractC0738v
    protected final int b(com.github.catvod.spider.merge.UY.m mVar) {
        int i = 0;
        if (mVar.k0() == null) {
            return 0;
        }
        for (com.github.catvod.spider.merge.UY.m mVar2 : mVar.k0().V()) {
            if (mVar2.s0().equals(mVar.s0())) {
                i++;
            }
            if (mVar2 == mVar) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.HR.AbstractC0738v
    protected final String c() {
        return ZrJ.d("1737236027235437323D2D");
    }
}
