package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.HR.O;
import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class p {
    public static String a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = com.github.catvod.spider.merge.VE.b.e;
        String strA = com.github.catvod.spider.merge.VE.b.a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append(ZrJ.d("4363"));
        int i2 = com.github.catvod.spider.merge.VE.h.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    public static void b(O o, com.github.catvod.spider.merge.UY.s sVar) {
        com.github.catvod.spider.merge.XU.k.g(sVar);
        com.github.catvod.spider.merge.UY.s sVarF = sVar;
        int i = 0;
        while (sVarF != null) {
            com.github.catvod.spider.merge.UY.s sVarZ = sVarF.z();
            int iG = sVarZ != null ? sVarZ.g() : 0;
            com.github.catvod.spider.merge.UY.s sVarR = sVarF.r();
            o.a(sVarF, i);
            if (sVarZ != null && !sVarF.p()) {
                if (iG == sVarZ.g()) {
                    sVarF = sVarZ.f(sVarF.G());
                } else if (sVarR == null) {
                    i--;
                    sVarF = sVarZ;
                } else {
                    sVarF = sVarR;
                }
            }
            if (sVarF.g() > 0) {
                sVarF = sVarF.f(0);
                i++;
            } else {
                while (sVarF.r() == null && i > 0) {
                    o.b(sVarF, i);
                    sVarF = sVarF.z();
                    i--;
                }
                o.b(sVarF, i);
                if (sVarF == sVar) {
                    return;
                } else {
                    sVarF = sVarF.r();
                }
            }
        }
    }
}
