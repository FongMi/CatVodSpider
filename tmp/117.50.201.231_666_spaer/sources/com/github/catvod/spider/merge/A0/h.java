package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h implements u {
    public static final h a = new h(3);
    public static final h b = new h(5);
    public static final h c = new h(6);
    public final int d;

    public h(int i) {
        this.d = i;
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i == 0) {
            sb.append("Z");
            return;
        }
        if (i < 0) {
            sb.append('-');
            i = -i;
        } else {
            sb.append('+');
        }
        int i2 = i / 3600000;
        hi.h(sb, i2);
        int i3 = this.d;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            sb.append(':');
        }
        hi.h(sb, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        return this.d;
    }
}
