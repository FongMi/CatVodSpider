package com.github.catvod.spider.merge.A0;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class fh extends ms {
    public static final fh c = new fh("(Z|(?:[+-]\\d{2}))");
    public static final fh d = new fh("(Z|(?:[+-]\\d{2}\\d{2}))");
    public static final fh e = new fh("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public fh(String str) {
        this.g = Pattern.compile(str);
    }

    @Override // com.github.catvod.spider.merge.A0.ms
    public final void f(Calendar calendar, String str) {
        calendar.setTimeZone(x.c(str));
    }
}
