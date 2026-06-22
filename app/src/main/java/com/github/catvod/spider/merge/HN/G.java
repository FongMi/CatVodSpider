package com.github.catvod.spider.merge.HN;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class G implements x {
    private final x a;

    G(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.HN.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        int maximum = calendar.get(11);
        if (maximum == 0) {
            maximum = calendar.getMaximum(11) + 1;
        }
        this.a.a(appendable, maximum);
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return this.a.c();
    }
}
