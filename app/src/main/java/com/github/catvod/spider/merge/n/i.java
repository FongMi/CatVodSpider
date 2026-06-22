package com.github.catvod.spider.merge.N;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class i extends o {
    public final String a;
    public final Pattern b;

    public i(String str, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.R.f.b(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        String str = this.a;
        return lVar2.k(str) && this.b.matcher(lVar2.c(str)).find();
    }

    public final String toString() {
        return "[" + this.a + "~=" + this.b.toString() + "]";
    }
}
