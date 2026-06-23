package com.github.catvod.spider.merge.C0.W;

import com.github.catvod.spider.merge.C0.U.b;
import com.github.catvod.spider.merge.C0.U.h;
import com.github.catvod.spider.merge.C0.c0.r;
import com.github.catvod.spider.merge.C0.e0.O;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a implements com.github.catvod.spider.merge.C0.n0.a {
    public static String b(Throwable th) {
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
        sb.append(": ");
        int i2 = h.a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    public static void c(O o, r rVar) {
        r rVarG = rVar;
        int i = 0;
        while (rVarG != null) {
            r rVarA = rVarG.A();
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

    @Override // com.github.catvod.spider.merge.C0.n0.a
    public com.github.catvod.spider.merge.C0.n0.b a(String str) {
        return com.github.catvod.spider.merge.C0.p0.b.c;
    }
}
