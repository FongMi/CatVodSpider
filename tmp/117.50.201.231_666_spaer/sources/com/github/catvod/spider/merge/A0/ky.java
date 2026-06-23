package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ky implements br {
    public static final ky a = new ky(0);
    public static final ky b = new ky(1);
    public static final ky d = new ky(2);
    public final /* synthetic */ int g;

    public /* synthetic */ ky(int i) {
        this.g = i;
    }

    @Override // com.github.catvod.spider.merge.A0.br
    public final void c(StringBuilder sb, int i) {
        switch (this.g) {
            case 0:
                hi.h(sb, i);
                break;
            case 1:
                hi.h(sb, i % 100);
                break;
            default:
                if (i >= 10) {
                    hi.h(sb, i);
                } else {
                    sb.append((char) (i + 48));
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        switch (this.g) {
            case 0:
                hi.h(sb, calendar.get(2) + 1);
                break;
            case 1:
                c(sb, calendar.get(1) % 100);
                break;
            default:
                c(sb, calendar.get(2) + 1);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        switch (this.g) {
        }
        return 2;
    }
}
