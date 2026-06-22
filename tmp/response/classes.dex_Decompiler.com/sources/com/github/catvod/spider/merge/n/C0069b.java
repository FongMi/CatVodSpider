package com.github.catvod.spider.merge.N;

import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0069b {

    @Nullable
    private com.github.catvod.spider.merge.L.m a = null;

    @Nullable
    private com.github.catvod.spider.merge.L.m b = null;
    private final N c;

    C0069b(N n) {
        this.c = n;
    }

    @Nullable
    final com.github.catvod.spider.merge.L.m a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        this.a = mVar;
        this.b = null;
        com.github.catvod.spider.merge.L.s sVarF = mVar2;
        int i = 0;
        while (sVarF != null) {
            int iB = b(sVarF);
            if (iB == 5) {
                break;
            }
            int i2 = 1;
            if (iB != 1 || sVarF.g() <= 0) {
                while (sVarF.r() == null && i > 0) {
                    if (iB == 1 || iB == 2) {
                        iB = 1;
                    }
                    com.github.catvod.spider.merge.L.s sVarZ = sVarF.z();
                    i--;
                    if (iB == 4) {
                        sVarF.B();
                    }
                    sVarF = sVarZ;
                    iB = 1;
                }
                if (iB != 1 && iB != 2) {
                    i2 = iB;
                }
                if (sVarF == mVar2) {
                    break;
                }
                com.github.catvod.spider.merge.L.s sVarR = sVarF.r();
                if (i2 == 4) {
                    sVarF.B();
                }
                sVarF = sVarR;
            } else {
                sVarF = sVarF.f(0);
                i++;
            }
        }
        return this.b;
    }

    public final int b(com.github.catvod.spider.merge.L.s sVar) {
        if (!(sVar instanceof com.github.catvod.spider.merge.L.m)) {
            return 1;
        }
        com.github.catvod.spider.merge.L.m mVar = (com.github.catvod.spider.merge.L.m) sVar;
        if (!this.c.a(this.a, mVar)) {
            return 1;
        }
        this.b = mVar;
        return 5;
    }
}
