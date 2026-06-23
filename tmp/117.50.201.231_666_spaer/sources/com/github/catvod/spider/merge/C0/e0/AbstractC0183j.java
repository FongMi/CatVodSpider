package com.github.catvod.spider.merge.C0.e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0183j extends N {
    String a;
    String b;

    public AbstractC0183j(String str, String str2, boolean z) {
        com.github.catvod.spider.merge.C0.N.a.i(str);
        com.github.catvod.spider.merge.C0.N.a.i(str2);
        this.a = com.github.catvod.spider.merge.C0.x.a.d(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strC = (!z && z2) ? com.github.catvod.spider.merge.C0.x.a.c(str2) : com.github.catvod.spider.merge.C0.x.a.d(str2);
        this.b = strC;
    }
}
