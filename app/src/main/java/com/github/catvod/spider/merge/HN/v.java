package com.github.catvod.spider.merge.HN;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class v implements x {
    private final x a;

    v(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.HN.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(7);
        this.a.a(appendable, i != 1 ? i - 1 : 7);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return this.a.c();
    }
}
