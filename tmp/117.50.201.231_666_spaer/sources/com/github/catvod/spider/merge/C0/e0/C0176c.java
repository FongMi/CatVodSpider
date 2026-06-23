package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0176c {
    public static C0180g a(N n, com.github.catvod.spider.merge.C0.c0.l lVar) {
        C0180g c0180g = new C0180g();
        com.github.catvod.spider.merge.C0.W.a.c(new C0174a(lVar, c0180g, n), lVar);
        return c0180g;
    }

    public static com.github.catvod.spider.merge.C0.c0.l b(N n, com.github.catvod.spider.merge.C0.c0.l lVar) {
        C0175b c0175b = new C0175b(lVar, n);
        int i = 0;
        com.github.catvod.spider.merge.C0.c0.r rVarG = lVar;
        while (rVarG != null) {
            int iB = c0175b.b(rVarG);
            if (iB == 5) {
                break;
            }
            if (iB != 1 || rVarG.h() <= 0) {
                int i2 = i;
                while (rVarG.s() == null && i2 > 0) {
                    if (iB == 1 || iB == 2) {
                        iB = 1;
                    }
                    com.github.catvod.spider.merge.C0.c0.r rVarA = rVarG.A();
                    i2--;
                    if (iB == 4) {
                        rVarG.C();
                    }
                    rVarG = rVarA;
                    iB = 1;
                }
                if (iB == 1 || iB == 2) {
                    iB = 1;
                }
                if (rVarG == lVar) {
                    break;
                }
                com.github.catvod.spider.merge.C0.c0.r rVarS = rVarG.s();
                if (iB == 4) {
                    rVarG.C();
                }
                i = i2;
                rVarG = rVarS;
            } else {
                rVarG = rVarG.g(0);
                i++;
            }
        }
        return c0175b.b;
    }
}
