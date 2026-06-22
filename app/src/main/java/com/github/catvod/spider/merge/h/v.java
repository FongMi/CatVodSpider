package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class v implements t {
    public final int a;
    public final String[] b;

    public v(String[] strArr, int i) {
        this.a = i;
        this.b = strArr;
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
        sb.append((CharSequence) this.b[calendar.get(this.a)]);
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
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
