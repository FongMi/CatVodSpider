package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class J extends AbstractC0088v {
    public J(int i, int i2) {
        super(i, i2);
    }

    @Override // com.github.catvod.spider.merge.N.AbstractC0088v
    protected final int b(com.github.catvod.spider.merge.L.m mVar) {
        int i = 0;
        if (mVar.k0() == null) {
            return 0;
        }
        for (com.github.catvod.spider.merge.L.m mVar2 : mVar.k0().V()) {
            if (mVar2.s0().equals(mVar.s0())) {
                i++;
            }
            if (mVar2 == mVar) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.N.AbstractC0088v
    protected final String c() {
        return oZP.d("1B1B1F6C0333581B0E3109");
    }
}
