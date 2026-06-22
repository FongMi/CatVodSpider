package com.github.catvod.spider.merge.H;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class g extends i {
    public static final g b = new g("(Z|(?:[+-]\\d{2}))");
    public static final g c = new g("(Z|(?:[+-]\\d{2}\\d{2}))");
    public static final g d = new g("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public g(String str) {
        this.a = Pattern.compile(str);
    }

    @Override // com.github.catvod.spider.merge.H.i
    public final void c(Calendar calendar, String str) {
        calendar.setTimeZone(C.a(str));
    }
}
