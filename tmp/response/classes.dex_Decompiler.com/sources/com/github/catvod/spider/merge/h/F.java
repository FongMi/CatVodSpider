package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class F implements x {
    private final x a;

    F(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.H.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        int leastMaximum = calendar.get(10);
        if (leastMaximum == 0) {
            leastMaximum = calendar.getLeastMaximum(10) + 1;
        }
        this.a.a(appendable, leastMaximum);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return this.a.c();
    }
}
