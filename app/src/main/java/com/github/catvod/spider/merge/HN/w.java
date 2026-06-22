package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class w implements z {
    static final w b = new w(3);
    static final w c = new w(5);
    static final w d = new w(6);
    final int a;

    w(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final void b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i == 0) {
            ((StringBuilder) appendable).append((CharSequence) ZrJ.d("23"));
            return;
        }
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        N.a(appendable, i2);
        int i3 = this.a;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            ((StringBuilder) appendable).append(':');
        }
        N.a(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.HN.z
    public final int c() {
        return this.a;
    }
}
