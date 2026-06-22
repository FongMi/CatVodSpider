package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class p implements r {
    public final /* synthetic */ int a;
    public final r b;

    public /* synthetic */ p(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
        switch (this.a) {
            case 0:
                int i = calendar.get(7);
                this.b.b(sb, i != 1 ? i - 1 : 7);
                break;
            case 1:
                int leastMaximum = calendar.get(10);
                if (leastMaximum == 0) {
                    leastMaximum = calendar.getLeastMaximum(10) + 1;
                }
                this.b.b(sb, leastMaximum);
                break;
            case 2:
                int maximum = calendar.get(11);
                if (maximum == 0) {
                    maximum = calendar.getMaximum(11) + 1;
                }
                this.b.b(sb, maximum);
                break;
            default:
                this.b.b(sb, calendar.getWeekYear());
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.H.r
    public final void b(StringBuilder sb, int i) {
        switch (this.a) {
            case 0:
                this.b.b(sb, i);
                break;
            case 1:
                this.b.b(sb, i);
                break;
            case 2:
                this.b.b(sb, i);
                break;
            default:
                this.b.b(sb, i);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
        switch (this.a) {
        }
        return this.b.c();
    }
}
