package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class fp implements br {
    public final int a;
    public final int b;

    public fp(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.br
    public final void c(StringBuilder sb, int i) {
        hi.i(sb, i, this.b);
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        c(sb, calendar.get(this.a));
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        return this.b;
    }
}
