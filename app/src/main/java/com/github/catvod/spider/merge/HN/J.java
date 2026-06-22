package com.github.catvod.spider.merge.HN;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class J implements x {
    static final J a = new J();

    J() {
    }

    @Override // com.github.catvod.spider.merge.HN.x
    public final void a(Appendable appendable, int i) {
        N.a(appendable, i % 100);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(1) % 100);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return 2;
    }
}
