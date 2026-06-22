package com.github.catvod.spider.merge;

import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class kA {
    public static String S(String str) {
        return l8(str).trim();
    }

    public static String T4(String str, boolean z) {
        return z ? l8(str) : S(str);
    }

    public static String l8(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }
}
