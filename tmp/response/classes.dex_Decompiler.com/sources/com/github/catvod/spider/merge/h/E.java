package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class E implements z {
    static final E b = new E(true);
    static final E c = new E(false);
    final boolean a;

    E(boolean z) {
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        N.a(appendable, i2);
        if (this.a) {
            ((StringBuilder) appendable).append(':');
        }
        N.a(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        return 5;
    }
}
