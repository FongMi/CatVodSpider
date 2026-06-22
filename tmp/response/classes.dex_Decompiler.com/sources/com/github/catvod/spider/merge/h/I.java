package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class I implements x {
    private final int a;

    I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.H.x
    public final void a(Appendable appendable, int i) {
        if (i < 100) {
            N.a(appendable, i);
        } else {
            N.b(appendable, i, 2);
        }
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return 2;
    }
}
