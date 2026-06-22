package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class qS {
    public static final Charset S;
    static final String T4;
    private static final char[] b;
    private static final Pattern l8 = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        S = charsetForName;
        T4 = charsetForName.name();
        b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
