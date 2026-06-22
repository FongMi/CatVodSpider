package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class v implements x {
    private final x a;

    v(x xVar) {
        this.a = xVar;
    }

    @Override // com.github.catvod.spider.merge.H.x
    public final void a(Appendable appendable, int i) {
        this.a.a(appendable, i);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(7);
        this.a.a(appendable, i != 1 ? i - 1 : 7);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return this.a.c();
    }
}
