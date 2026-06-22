package com.github.catvod.spider.merge.e1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1031b {
    private com.github.catvod.spider.merge.c1.m a = null;
    private com.github.catvod.spider.merge.c1.m b = null;
    private final N c;

    C1031b(N n) {
        this.c = n;
    }

    final com.github.catvod.spider.merge.c1.m a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        this.a = mVar;
        this.b = null;
        com.github.catvod.spider.merge.c1.s sVarF = mVar2;
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
                    com.github.catvod.spider.merge.c1.s sVarZ = sVarF.z();
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
                com.github.catvod.spider.merge.c1.s sVarR = sVarF.r();
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

    public final int b(com.github.catvod.spider.merge.c1.s sVar) {
        if (!(sVar instanceof com.github.catvod.spider.merge.c1.m)) {
            return 1;
        }
        com.github.catvod.spider.merge.c1.m mVar = (com.github.catvod.spider.merge.c1.m) sVar;
        if (!this.c.a(this.a, mVar)) {
            return 1;
        }
        this.b = mVar;
        return 5;
    }
}
