package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class Q {
    public static final Charset T4;
    public static final Charset l8 = StandardCharsets.ISO_8859_1;
    public static final Charset S = StandardCharsets.UTF_8;

    static {
        Charset charsetForName;
        try {
            charsetForName = Charset.forName("GBK");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        T4 = charsetForName;
    }
}
