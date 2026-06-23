package com.github.catvod.spider.merge.FM.M;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class K extends N {
    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        com.github.catvod.spider.merge.FM.K.m mVarK0 = mVar2.k0();
        if (mVarK0 == null || (mVarK0 instanceof com.github.catvod.spider.merge.FM.K.h)) {
            return false;
        }
        Iterator<com.github.catvod.spider.merge.FM.K.m> it = mVarK0.V().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().s0().equals(mVar2.s0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return ":only-of-type";
    }
}
