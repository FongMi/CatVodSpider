package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class B implements z {
    private final int a;
    private final String[] b;

    B(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final void b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.b[calendar.get(this.a)]);
    }

    @Override // com.github.catvod.spider.merge.H.z
    public final int c() {
        int length = this.b.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int length2 = this.b[length].length();
            if (length2 > i) {
                i = length2;
            }
        }
    }
}
