package com.github.catvod.spider.merge.FM.M;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0282o extends N {
    String a;
    Pattern b;

    public C0282o(String str, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.FM.A.l.e(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return mVar2.n(this.a) && this.b.matcher(mVar2.c(this.a)).find();
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.a, this.b.toString());
    }
}
