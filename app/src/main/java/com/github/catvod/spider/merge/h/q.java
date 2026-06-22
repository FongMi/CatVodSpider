package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class q implements t {
    public static final q b = new q(3);
    public static final q c = new q(5);
    public static final q d = new q(6);
    public final int a;

    public q(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
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
        B.a(sb, i2);
        int i3 = this.a;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            sb.append(':');
        }
        B.a(sb, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
        return this.a;
    }
}
