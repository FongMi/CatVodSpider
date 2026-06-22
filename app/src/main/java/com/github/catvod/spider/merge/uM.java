package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.sB;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class uM {
    public static void S(Lk lk, A0 a0) {
        A0 a0N = a0;
        int i = 0;
        while (a0N != null) {
            A0 a0RD = a0N.rD();
            lk.S(a0N, i);
            if (a0RD != null && !a0N.uS()) {
                a0N = a0RD.N(a0N.Ws());
            }
            if (a0N.HM() > 0) {
                a0N = a0N.N(0);
                i++;
            } else {
                while (a0N.eD() == null && i > 0) {
                    lk.l8(a0N, i);
                    a0N = a0N.rD();
                    i--;
                }
                lk.l8(a0N, i);
                if (a0N == a0) {
                    return;
                } else {
                    a0N = a0N.eD();
                }
            }
        }
    }

    public static sB.aA l8(sB sBVar, A0 a0) {
        A0 a0N = a0;
        int i = 0;
        while (a0N != null) {
            sB.aA aAVarS = sBVar.S(a0N, i);
            if (aAVarS == sB.aA.STOP) {
                return aAVarS;
            }
            if (aAVarS != sB.aA.CONTINUE || a0N.HM() <= 0) {
                while (a0N.eD() == null && i > 0) {
                    sB.aA aAVar = sB.aA.CONTINUE;
                    if ((aAVarS == aAVar || aAVarS == sB.aA.SKIP_CHILDREN) && (aAVarS = sBVar.l8(a0N, i)) == sB.aA.STOP) {
                        return aAVarS;
                    }
                    A0 a0RD = a0N.rD();
                    i--;
                    if (aAVarS == sB.aA.REMOVE) {
                        a0N.hd();
                    }
                    aAVarS = aAVar;
                    a0N = a0RD;
                }
                if ((aAVarS == sB.aA.CONTINUE || aAVarS == sB.aA.SKIP_CHILDREN) && (aAVarS = sBVar.l8(a0N, i)) == sB.aA.STOP) {
                    return aAVarS;
                }
                if (a0N == a0) {
                    return aAVarS;
                }
                A0 a0ED = a0N.eD();
                if (aAVarS == sB.aA.REMOVE) {
                    a0N.hd();
                }
                a0N = a0ED;
            } else {
                a0N = a0N.N(0);
                i++;
            }
        }
        return sB.aA.CONTINUE;
    }
}
