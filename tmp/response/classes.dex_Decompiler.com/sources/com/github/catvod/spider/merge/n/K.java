package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class K extends N {
    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        com.github.catvod.spider.merge.L.m mVarK0 = mVar2.k0();
        if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.L.h)) {
            return false;
        }
        Iterator<com.github.catvod.spider.merge.L.m> it = mVarK0.V().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().s0().equals(mVar2.s0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return oZP.d("4F00192D15781A095A35152510");
    }
}
