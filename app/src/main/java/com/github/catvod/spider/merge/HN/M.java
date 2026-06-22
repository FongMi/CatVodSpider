package com.github.catvod.spider.merge.HN;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class M implements x {
    private final x a;

    M(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.HN.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        this.a.a(appendable, calendar.getWeekYear());
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return this.a.c();
    }
}
