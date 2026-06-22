package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class s implements r {
    public final int a;
    public final int b;

    public s(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
        b(sb, calendar.get(this.a));
    }

    @Override // com.github.catvod.spider.merge.H.r
    public final void b(StringBuilder sb, int i) {
        B.b(sb, i, this.b);
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
        return this.b;
    }
}
