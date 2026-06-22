package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class y implements x {
    private final int a;
    private final int b;

    y(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.H.x
    public final void a(Appendable appendable, int i) {
        N.b(appendable, i, this.b);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return this.b;
    }
}
