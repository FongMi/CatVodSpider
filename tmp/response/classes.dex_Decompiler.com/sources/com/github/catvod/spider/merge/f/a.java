package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.D.h;
import com.github.catvod.spider.merge.J.c;
import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.N.O;
import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a {
    public static String a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = b.e;
        String strA = b.a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append(oZP.d("4F4F"));
        int i2 = h.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    public static void b(O o, s sVar) {
        c.g(sVar);
        s sVarF = sVar;
        int i = 0;
        while (sVarF != null) {
            s sVarZ = sVarF.z();
            int iG = sVarZ != null ? sVarZ.g() : 0;
            s sVarR = sVarF.r();
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
