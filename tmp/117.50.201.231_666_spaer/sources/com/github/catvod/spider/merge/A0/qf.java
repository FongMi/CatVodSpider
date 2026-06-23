package com.github.catvod.spider.merge.A0;

import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class qf {
    public static final xb a = new xb("UNDEFINED", 3);
    public static final xb b = new xb("REUSABLE_CLAIMED", 3);

    public static String c(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String d(String str) {
        return c(str).trim();
    }

    public static final void e(Object obj, xl xlVar) {
        if (!(xlVar instanceof acu)) {
            xlVar.resumeWith(obj);
            return;
        }
        acu acuVar = (acu) xlVar;
        Throwable thB = vx.b(obj);
        Object ttVar = thB == null ? obj : new tt(thB, false);
        ym ymVar = acuVar.d;
        xm xmVar = acuVar.e;
        xmVar.getContext();
        if (ymVar.g()) {
            acuVar.b = ttVar;
            acuVar.x = 1;
            ymVar.e(xmVar.getContext(), acuVar);
            return;
        }
        er erVarB = abk.b();
        if (erVarB.m >= 4294967296L) {
            acuVar.b = ttVar;
            acuVar.x = 1;
            erVarB.r(acuVar);
            return;
        }
        erVarB.t(true);
        try {
            nr nrVar = (nr) xmVar.getContext().get(nr.aj);
            if (nrVar == null || nrVar.f()) {
                yg context = xmVar.getContext();
                Object objD = zr.d(context, acuVar.c);
                try {
                    xmVar.resumeWith(obj);
                } finally {
                    zr.c(context, objD);
                }
            } else {
                CancellationException cancellationExceptionQ = ((bi) nrVar).q();
                acuVar.j(ttVar, cancellationExceptionQ);
                acuVar.resumeWith(act.b(cancellationExceptionQ));
            }
            while (erVarB.u()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
