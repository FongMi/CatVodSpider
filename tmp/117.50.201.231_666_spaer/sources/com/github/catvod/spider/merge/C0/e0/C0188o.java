package com.github.catvod.spider.merge.C0.e0;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0188o extends N {
    String a;
    Pattern b;

    public C0188o(String str, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.C0.x.a.d(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        return lVar2.o(this.a) && this.b.matcher(lVar2.c(this.a)).find();
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.a, this.b.toString());
    }
}
