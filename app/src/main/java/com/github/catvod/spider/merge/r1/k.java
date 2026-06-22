package com.github.catvod.spider.merge.r1;

import com.github.catvod.spider.merge.l.C1290c;
import java.time.LocalDateTime;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {
    public static j a(e eVar) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        String strB = eVar.b();
        String strA = eVar.a();
        com.github.catvod.spider.merge.J1.c cVarA = com.github.catvod.spider.merge.J1.a.a(strB + ((strA == null || strA.isEmpty()) ? "" : C1290c.a("_", strA)));
        if (cVarA == null) {
            return null;
        }
        return new j(cVarA, localDateTimeNow);
    }
}
