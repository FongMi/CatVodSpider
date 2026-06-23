package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class K implements x {
    static final K a = new K();

    K() {
    }

    @Override // com.github.catvod.spider.merge.FM.G.x
    public final void a(Appendable appendable, int i) {
        if (i >= 10) {
            N.a(appendable, i);
        } else {
            ((StringBuilder) appendable).append((char) (i + 48));
        }
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(2) + 1);
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final int c() {
        return 2;
    }
}
