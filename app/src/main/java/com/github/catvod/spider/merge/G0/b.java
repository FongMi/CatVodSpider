package com.github.catvod.spider.merge.G0;

import com.github.catvod.spider.merge.L1.l;
import com.github.catvod.spider.merge.l.C1290c;
import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    public static a a(BigInteger bigInteger) {
        String strA = String.format("%x", bigInteger);
        if (strA.length() % 2 != 0) {
            strA = C1290c.a("0", strA);
        }
        a aVar = new a(l.a(strA));
        if (aVar.b() <= 127) {
            aVar.c(0, l.h(aVar.e()));
            aVar.c(0, l.h(2));
            return aVar;
        }
        int iE = aVar.e();
        aVar.c(0, l.h(0));
        aVar.c(0, l.h(iE + 1));
        aVar.c(0, l.h(2));
        return aVar;
    }
}
