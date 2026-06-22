package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class y implements t {
    public static final y b = new y(true);
    public static final y c = new y(false);
    public final boolean a;

    public y(boolean z) {
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            sb.append('-');
            i = -i;
        } else {
            sb.append('+');
        }
        int i2 = i / 3600000;
        B.a(sb, i2);
        if (this.a) {
            sb.append(':');
        }
        B.a(sb, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
        return 5;
    }
}
