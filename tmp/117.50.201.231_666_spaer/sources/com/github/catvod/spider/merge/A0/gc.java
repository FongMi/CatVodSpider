package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class gc implements br {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ gc(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.A0.br
    public final void c(StringBuilder sb, int i) {
        switch (this.a) {
            case 0:
                if (i >= 100) {
                    hi.i(sb, i, 2);
                } else {
                    hi.h(sb, i);
                }
                break;
            default:
                if (i < 10) {
                    sb.append((char) (i + 48));
                } else if (i >= 100) {
                    hi.i(sb, i, 1);
                } else {
                    hi.h(sb, i);
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        switch (this.a) {
            case 0:
                c(sb, calendar.get(this.b));
                break;
            default:
                c(sb, calendar.get(this.b));
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 4;
        }
    }
}
