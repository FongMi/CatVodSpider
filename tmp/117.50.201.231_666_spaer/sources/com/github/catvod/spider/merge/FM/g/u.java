package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class u implements z {
    private final char a;

    u(char c) {
        this.a = c;
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final void b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append(this.a);
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final int c() {
        return 1;
    }
}
