package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1057c {
    public static C1061g a(N n, com.github.catvod.spider.merge.Em.l lVar) {
        C1061g c1061g = new C1061g();
        com.github.catvod.spider.merge.Dw.q.c(new C1055a(lVar, c1061g, n), lVar);
        return c1061g;
    }

    public static com.github.catvod.spider.merge.Em.l b(N n, com.github.catvod.spider.merge.Em.l lVar) {
        C1056b c1056b = new C1056b(lVar, n);
        com.github.catvod.spider.merge.Em.r rVarG = lVar;
        int i = 0;
        while (rVarG != null) {
            int iB = c1056b.b(rVarG);
            if (iB == 5) {
                break;
            }
            int i2 = 1;
            if (iB != 1 || rVarG.h() <= 0) {
                while (rVarG.s() == null && i > 0) {
                    if (iB == 1 || iB == 2) {
                        iB = 1;
                    }
                    com.github.catvod.spider.merge.Em.r rVarA = rVarG.A();
                    i--;
                    if (iB == 4) {
                        rVarG.C();
                    }
                    rVarG = rVarA;
                    iB = 1;
                }
                if (iB != 1 && iB != 2) {
                    i2 = iB;
                }
                if (rVarG == lVar) {
                    break;
                }
                com.github.catvod.spider.merge.Em.r rVarS = rVarG.s();
                if (i2 == 4) {
                    rVarG.C();
                }
                rVarG = rVarS;
            } else {
                rVarG = rVarG.g(0);
                i++;
            }
        }
        return c1056b.b;
    }
}
