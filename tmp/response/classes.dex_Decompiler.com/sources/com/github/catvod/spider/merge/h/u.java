package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class u implements z {
    private final char a;

    u(char c) {
        this.a = c;
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append(this.a);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return 1;
    }
}
