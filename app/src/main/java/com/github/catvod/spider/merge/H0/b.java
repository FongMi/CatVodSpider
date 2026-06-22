package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.l.C1290c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    private static final Pattern e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    private static final Pattern f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private static final Pattern g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public b(String str) {
        String strD;
        this.a = str;
        if (str != null) {
            this.b = d(str, e, "", 1);
            strD = d(str, f, null, 2);
        } else {
            this.b = "";
            strD = "UTF-8";
        }
        this.c = strD;
        if ("multipart/form-data".equalsIgnoreCase(this.b)) {
            this.d = d(str, g, null, 2);
        } else {
            this.d = null;
        }
    }

    private String d(String str, Pattern pattern, String str2, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(i) : str2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String e() {
        String str = this.c;
        return str == null ? "US-ASCII" : str;
    }

    public final boolean f() {
        return "multipart/form-data".equalsIgnoreCase(this.b);
    }

    public final b g() {
        return this.c == null ? new b(C1290c.b(new StringBuilder(), this.a, "; charset=UTF-8")) : this;
    }
}
