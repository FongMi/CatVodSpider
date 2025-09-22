package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: com.github.catvod.spider.merge.O */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0081O {

    /* renamed from: QU */
    public static final Charset f474QU;

    /* renamed from: q */
    public static final Charset f475q = StandardCharsets.ISO_8859_1;

    /* renamed from: xC */
    public static final Charset f476xC = StandardCharsets.UTF_8;

    static {
        Charset charsetForName;
        try {
            charsetForName = Charset.forName("GBK");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f474QU = charsetForName;
    }
}
