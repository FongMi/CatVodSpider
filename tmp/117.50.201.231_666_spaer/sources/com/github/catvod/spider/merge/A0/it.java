package com.github.catvod.spider.merge.A0;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class it implements u {
    public final int a;
    public final String[] b;

    public it(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final void e(StringBuilder sb, Calendar calendar) {
        sb.append((CharSequence) this.b[calendar.get(this.a)]);
    }

    @Override // com.github.catvod.spider.merge.A0.u
    public final int f() {
        String[] strArr = this.b;
        int length = strArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int length2 = strArr[length].length();
            if (length2 > i) {
                i = length2;
            }
        }
    }
}
