package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class J implements x {
    static final J a = new J();

    J() {
    }

    @Override // com.github.catvod.spider.merge.H.x
    public final void a(Appendable appendable, int i) {
        N.a(appendable, i % 100);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(1) % 100);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return 2;
    }
}
