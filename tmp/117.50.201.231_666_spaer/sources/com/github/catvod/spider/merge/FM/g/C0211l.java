package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0211l extends AbstractC0213n {
    private static final C0211l b = new C0211l("(Z|(?:[+-]\\d{2}))");
    private static final C0211l c = new C0211l("(Z|(?:[+-]\\d{2}\\d{2}))");
    private static final C0211l d = new C0211l("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    C0211l(String str) {
        this.a = Pattern.compile(str);
    }

    static AbstractC0214o e(int i) {
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        if (i == 3) {
            return d;
        }
        throw new IllegalArgumentException("invalid number of X");
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0213n
    final void c(Calendar calendar, String str) {
        calendar.setTimeZone(O.a(str));
    }
}
