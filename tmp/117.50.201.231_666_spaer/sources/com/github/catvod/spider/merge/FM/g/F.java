package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class F implements x {
    private final x a;

    F(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.FM.G.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final void b(Appendable appendable, Calendar calendar) {
        int leastMaximum = calendar.get(10);
        if (leastMaximum == 0) {
            leastMaximum = calendar.getLeastMaximum(10) + 1;
        }
        this.a.a(appendable, leastMaximum);
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final int c() {
        return this.a.c();
    }
}
