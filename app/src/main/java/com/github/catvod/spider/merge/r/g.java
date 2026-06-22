package com.github.catvod.spider.merge.R;

import com.github.catvod.spider.merge.L.q;
import com.github.catvod.spider.merge.N.p;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class g {
    public static void a(p pVar, q qVar) {
        com.github.catvod.spider.merge.J.b.f(qVar);
        q qVarN = qVar;
        int i = 0;
        while (qVarN != null) {
            q qVar2 = qVarN.a;
            int iF = qVar2 != null ? qVar2.f() : 0;
            q qVarN2 = qVarN.n();
            pVar.b(qVarN, i);
            if (qVar2 != null && qVarN.a == null) {
                if (iF == qVar2.f()) {
                    qVarN = (q) qVar2.j().get(qVarN.b);
                } else if (qVarN2 == null) {
                    i--;
                    qVarN = qVar2;
                } else {
                    qVarN = qVarN2;
                }
            }
            if (qVarN.f() > 0) {
                qVarN = (q) qVarN.j().get(0);
                i++;
            } else {
                while (qVarN.n() == null && i > 0) {
                    pVar.a(qVarN, i);
                    qVarN = qVarN.a;
                    i--;
                }
                pVar.a(qVarN, i);
                if (qVarN == qVar) {
                    return;
                } else {
                    qVarN = qVarN.n();
                }
            }
        }
    }
}
