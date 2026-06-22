package com.github.catvod.spider.merge.e1;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1044o extends N {
    String a;
    Pattern b;

    public C1044o(String str, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.g.b.c(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        return mVar2.n(this.a) && this.b.matcher(mVar2.c(this.a)).find();
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.a, this.b.toString());
    }
}
