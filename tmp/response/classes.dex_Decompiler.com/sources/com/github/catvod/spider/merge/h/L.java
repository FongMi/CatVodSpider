package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class L implements x {
    private final int a;

    L(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.H.x
    public final void a(Appendable appendable, int i) {
        if (i < 10) {
            ((StringBuilder) appendable).append((char) (i + 48));
        } else if (i < 100) {
            N.a(appendable, i);
        } else {
            N.b(appendable, i, 1);
        }
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return 4;
    }
}
