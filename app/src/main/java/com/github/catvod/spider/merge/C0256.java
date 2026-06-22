package com.github.catvod.spider.merge;

import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0256 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m916(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String m917(String str) {
        return m916(str).trim();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static String m918(String str, boolean z) {
        return z ? m916(str) : m917(str);
    }
}
