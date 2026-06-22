package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class K extends N {
    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        com.github.catvod.spider.merge.UY.m mVarK0 = mVar2.k0();
        if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.UY.h)) {
            return false;
        }
        Iterator<com.github.catvod.spider.merge.UY.m> it = mVarK0.V().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().s0().equals(mVar2.s0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return ZrJ.d("432C252131681625663931351C");
    }
}
