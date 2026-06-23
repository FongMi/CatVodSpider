package com.github.catvod.spider.merge.A0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class dy extends dr {
    public final /* synthetic */ int a;
    public final Pattern e;

    public /* synthetic */ dy(Pattern pattern, int i) {
        this.a = i;
        this.e = pattern;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        switch (this.a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        switch (this.a) {
            case 0:
                return this.e.matcher(edVar2.ak()).find();
            case 1:
                return this.e.matcher(edVar2.ag()).find();
            case 2:
                return this.e.matcher((String) edVar2.i.stream().map(new el(0)).collect(ws.m(""))).find();
            default:
                edVar2.getClass();
                return this.e.matcher((String) pq.b(edVar2, fw.class).map(new el(0)).collect(ws.m(""))).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":matches(" + this.e + ")";
            case 1:
                return ":matchesOwn(" + this.e + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.e + ")";
            default:
                return ":matchesWholeText(" + this.e + ")";
        }
    }
}
