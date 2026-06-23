package com.github.catvod.spider.merge.A0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ex extends dr {
    public final String a;
    public final Pattern e;

    public ex(String str, Pattern pattern) {
        this.a = qf.d(str);
        this.e = pattern;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        return 8;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        String str = this.a;
        return edVar2.av(str) && this.e.matcher(edVar2.au(str)).find();
    }

    public final String toString() {
        return "[" + this.a + "~=" + this.e.toString() + "]";
    }
}
