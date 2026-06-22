package com.github.catvod.spider.merge.HN;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class F implements x {
    private final x a;

    F(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.HN.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        int leastMaximum = calendar.get(10);
        if (leastMaximum == 0) {
            leastMaximum = calendar.getLeastMaximum(10) + 1;
        }
        this.a.a(appendable, leastMaximum);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return this.a.c();
    }
}
