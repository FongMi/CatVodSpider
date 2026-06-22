package com.github.catvod.spider.merge.e1;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1028B extends N {
    public final /* synthetic */ int a;

    public /* synthetic */ C1028B(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        switch (this.a) {
            case 0:
                for (com.github.catvod.spider.merge.c1.s sVar : mVar2.h()) {
                    if (!(sVar instanceof com.github.catvod.spider.merge.c1.e) && !(sVar instanceof com.github.catvod.spider.merge.c1.w) && !(sVar instanceof com.github.catvod.spider.merge.c1.i)) {
                        break;
                    }
                }
                break;
            default:
                com.github.catvod.spider.merge.c1.m mVarH0 = mVar2.h0();
                if (mVarH0 != null && !(mVarH0 instanceof com.github.catvod.spider.merge.c1.h)) {
                    Iterator<com.github.catvod.spider.merge.c1.m> it = mVarH0.T().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (it.next().q0().equals(mVar2.q0())) {
                            i++;
                        }
                    }
                    if (i == 1) {
                    }
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":empty";
            default:
                return ":only-of-type";
        }
    }
}
