package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class J implements x {
    static final J a = new J();

    J() {
    }

    @Override // com.github.catvod.spider.merge.FM.G.x
    public final void a(Appendable appendable, int i) {
        N.a(appendable, i % 100);
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final void b(Appendable appendable, Calendar calendar) {
        a(appendable, calendar.get(1) % 100);
    }

    @Override // com.github.catvod.spider.merge.FM.G.z
    public final int c() {
        return 2;
    }
}
