package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1064j extends N {
    String a;
    String b;

    public AbstractC1064j(String str, String str2, boolean z) {
        com.github.catvod.spider.merge.Dw.i.i(str);
        com.github.catvod.spider.merge.Dw.i.i(str2);
        this.a = com.github.catvod.spider.merge.Dw.s.d(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strC = (!z && z2) ? com.github.catvod.spider.merge.Dw.s.c(str2) : com.github.catvod.spider.merge.Dw.s.d(str2);
        this.b = strC;
    }
}
