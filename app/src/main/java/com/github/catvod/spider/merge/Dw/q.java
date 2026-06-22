package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.ej.O;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class q implements com.github.catvod.spider.merge.nz.a {
    public static String b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable cause = th; cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
            arrayList.add(cause);
        }
        Throwable th2 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th2 != null) {
            th = th2;
        }
        int i = o.e;
        String strA = o.a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append(": ");
        int i2 = p.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    public static void c(O o, com.github.catvod.spider.merge.Em.r rVar) {
        com.github.catvod.spider.merge.Em.r rVarG = rVar;
        int i = 0;
        while (rVarG != null) {
            com.github.catvod.spider.merge.Em.r rVarA = rVarG.A();
            o.a(rVarG, i);
            if (rVarA != null && !rVarG.q()) {
                rVarG = rVarA.g(rVarG.H());
            }
            if (rVarG.h() > 0) {
                rVarG = rVarG.g(0);
                i++;
            } else {
                while (rVarG.s() == null && i > 0) {
                    o.b(rVarG, i);
                    rVarG = rVarG.A();
                    i--;
                }
                o.b(rVarG, i);
                if (rVarG == rVar) {
                    return;
                } else {
                    rVarG = rVarG.s();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.catvod.spider.merge.Dw.b, com.github.catvod.spider.merge.nz.b] */
    @Override // com.github.catvod.spider.merge.nz.a
    public com.github.catvod.spider.merge.nz.b a(String str) {
        return b.c;
    }
}
