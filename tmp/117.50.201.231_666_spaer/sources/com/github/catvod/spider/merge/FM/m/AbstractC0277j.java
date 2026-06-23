package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0277j extends N {
    String a;
    String b;

    public AbstractC0277j(String str, String str2, boolean z) {
        com.github.catvod.spider.merge.FM.I.c.e(str);
        com.github.catvod.spider.merge.FM.I.c.e(str2);
        this.a = com.github.catvod.spider.merge.FM.A.l.e(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strD = (!z && z2) ? com.github.catvod.spider.merge.FM.A.l.d(str2) : com.github.catvod.spider.merge.FM.A.l.e(str2);
        this.b = strD;
    }
}
