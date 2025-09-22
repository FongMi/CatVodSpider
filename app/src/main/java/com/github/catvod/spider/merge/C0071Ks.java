package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.Ks */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public final class C0071Ks {

    /* renamed from: QU */
    static final String f436QU;

    /* renamed from: UJ */
    private static final char[] f437UJ;

    /* renamed from: q */
    private static final Pattern f438q = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: xC */
    public static final Charset f439xC;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        f439xC = charsetForName;
        f436QU = charsetForName.name();
        f437UJ = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
