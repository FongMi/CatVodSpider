package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.a1.C0899d;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1039j extends N {
    String a;
    String b;

    public AbstractC1039j(String str, String str2, boolean z) {
        C0899d.f(str);
        C0899d.f(str2);
        this.a = com.github.catvod.spider.merge.g.b.c(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strB = (!z && z2) ? com.github.catvod.spider.merge.g.b.b(str2) : com.github.catvod.spider.merge.g.b.c(str2);
        this.b = strB;
    }
}
