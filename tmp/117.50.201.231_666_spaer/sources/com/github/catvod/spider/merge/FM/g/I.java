package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class I implements x {
    private final int a;

    I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.G.x
    public final void a(Appendable appendable, int i) {
        if (i < 100) {
            N.a(appendable, i);
        } else {
            N.b(appendable, i, 2);
        }
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(this.a));
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final int c() {
        return 2;
    }
}
