package com.github.catvod.spider.merge.N;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class n extends o {
    public final /* synthetic */ int a;
    public final Pattern b;

    public /* synthetic */ n(Pattern pattern, int i) {
        this.a = i;
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        switch (this.a) {
            case 0:
                return this.b.matcher(lVar2.O()).find();
            case 1:
                return this.b.matcher(lVar2.I()).find();
            case 2:
                return this.b.matcher(lVar2.P()).find();
            default:
                lVar2.getClass();
                StringBuilder sbB = com.github.catvod.bean.b.b();
                com.github.catvod.spider.merge.R.g.a(new com.github.catvod.spider.merge.L.j(sbB), lVar2);
                return this.b.matcher(com.github.catvod.bean.b.g(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":matches(" + this.b + ")";
            case 1:
                return ":matchesOwn(" + this.b + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.b + ")";
            default:
                return ":matchesWholeText(" + this.b + ")";
        }
    }
}
