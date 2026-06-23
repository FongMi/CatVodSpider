package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class j implements br {
    public final /* synthetic */ int a;
    public final br b;

    public /* synthetic */ j(br brVar, int i) {
        this.a = i;
        this.b = brVar;
    }

    @Override // com.github.catvod.spider.merge.A0.br
    public final void c(StringBuilder sb, int i) {
        switch (this.a) {
            case 0:
                this.b.c(sb, i);
                break;
            case 1:
                this.b.c(sb, i);
                break;
            case 2:
                this.b.c(sb, i);
                break;
            default:
                this.b.c(sb, i);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        switch (this.a) {
            case 0:
                int i = calendar.get(7);
                this.b.c(sb, i != 1 ? i - 1 : 7);
                break;
            case 1:
                int leastMaximum = calendar.get(10);
                if (leastMaximum == 0) {
                    leastMaximum = calendar.getLeastMaximum(10) + 1;
                }
                this.b.c(sb, leastMaximum);
                break;
            case 2:
                int maximum = calendar.get(11);
                if (maximum == 0) {
                    maximum = calendar.getMaximum(11) + 1;
                }
                this.b.c(sb, maximum);
                break;
            default:
                this.b.c(sb, calendar.getWeekYear());
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        switch (this.a) {
        }
        return this.b.f();
    }
}
