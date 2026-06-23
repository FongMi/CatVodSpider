package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aba {
    public static final aba a = new aba("", "", false);
    public final String b;
    public final String c;
    public final boolean d;

    static {
        new aba("\n", "  ", true);
    }

    public aba(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
