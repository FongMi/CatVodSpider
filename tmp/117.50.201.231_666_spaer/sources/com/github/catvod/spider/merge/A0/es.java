package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class es implements u {
    public static final es a = new es(true);
    public static final es b = new es(false);
    public final boolean c;

    public es(boolean z) {
        this.c = z;
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            sb.append('-');
            i = -i;
        } else {
            sb.append('+');
        }
        int i2 = i / 3600000;
        hi.h(sb, i2);
        if (this.c) {
            sb.append(':');
        }
        hi.h(sb, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        return 5;
    }
}
