package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.N.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0082o extends N {
    String a;
    Pattern b;

    public C0082o(String str, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.B.l.d(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        return mVar2.n(this.a) && this.b.matcher(mVar2.c(this.a)).find();
    }

    public final String toString() {
        return String.format(oZP.d("2E4A043F51700632"), this.a, this.b.toString());
    }
}
