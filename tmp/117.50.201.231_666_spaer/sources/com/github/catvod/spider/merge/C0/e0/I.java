package com.github.catvod.spider.merge.C0.e0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class I extends N {
    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        com.github.catvod.spider.merge.C0.c0.l lVarF0 = lVar2.f0();
        if (lVarF0 == null || (lVarF0 instanceof com.github.catvod.spider.merge.C0.c0.h)) {
            return false;
        }
        Iterator<com.github.catvod.spider.merge.C0.c0.l> it = lVarF0.R().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m0().equals(lVar2.m0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return ":only-of-type";
    }
}
