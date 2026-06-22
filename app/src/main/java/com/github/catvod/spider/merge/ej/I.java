package com.github.catvod.spider.merge.ej;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class I extends N {
    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        com.github.catvod.spider.merge.Em.l lVarF0 = lVar2.f0();
        if (lVarF0 == null || (lVarF0 instanceof com.github.catvod.spider.merge.Em.h)) {
            return false;
        }
        Iterator<com.github.catvod.spider.merge.Em.l> it = lVarF0.R().iterator();
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
