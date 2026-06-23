package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class pp {
    public static final xb a = new xb("NO_DECISION", 3);

    public static void b(fd fdVar, fw fwVar) {
        wc.e(fwVar);
        fw fwVarAx = fwVar;
        int i = 0;
        while (fwVarAx != null) {
            fw fwVar2 = fwVarAx.ap;
            int iN = fwVar2 != null ? fwVar2.n() : 0;
            fw fwVarAx2 = fwVarAx.ax();
            fdVar.c(fwVarAx, i);
            if (fwVar2 != null && fwVarAx.ap == null) {
                if (iN == fwVar2.n()) {
                    fwVarAx = (fw) fwVar2.q().get(fwVarAx.aq);
                } else if (fwVarAx2 == null) {
                    i--;
                    fwVarAx = fwVar2;
                } else {
                    fwVarAx = fwVarAx2;
                }
            }
            if (fwVarAx.n() > 0) {
                fwVarAx = (fw) fwVarAx.q().get(0);
                i++;
            } else {
                while (fwVarAx.ax() == null && i > 0) {
                    fdVar.b(fwVarAx, i);
                    fwVarAx = fwVarAx.ap;
                    i--;
                }
                fdVar.b(fwVarAx, i);
                if (fwVarAx == fwVar) {
                    return;
                } else {
                    fwVarAx = fwVarAx.ax();
                }
            }
        }
    }
}
