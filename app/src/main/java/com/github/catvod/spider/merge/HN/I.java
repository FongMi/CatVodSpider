package com.github.catvod.spider.merge.HN;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class I implements x {
    private final int a;

    I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.HN.x
    public final void a(Appendable appendable, int i) {
        if (i < 100) {
            N.a(appendable, i);
        } else {
            N.b(appendable, i, 2);
        }
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return 2;
    }
}
