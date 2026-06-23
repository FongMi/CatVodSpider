package com.github.catvod.spider.merge.A0;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class sg {
    public static final Charset a;
    public static volatile Charset b;
    public static volatile Charset c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        ko.e("forName(...)", charsetForName);
        a = charsetForName;
        ko.e("forName(...)", Charset.forName("UTF-16"));
        ko.e("forName(...)", Charset.forName("UTF-16BE"));
        ko.e("forName(...)", Charset.forName("UTF-16LE"));
        ko.e("forName(...)", Charset.forName("US-ASCII"));
        ko.e("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
