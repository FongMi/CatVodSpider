package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class H implements x {
    static final H a = new H();

    H() {
    }

    @Override // com.github.catvod.spider.merge.H.x
    public final void a(Appendable appendable, int i) {
        N.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        N.a(appendable, calendar.get(2) + 1);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return 2;
    }
}
