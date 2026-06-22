package com.github.catvod.spider.merge.D1;

import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class JsoupParser {
    private j1 a;
    private com.github.catvod.spider.merge.d1.C0972E c = com.github.catvod.spider.merge.d1.C0972E.c;
    private com.github.catvod.spider.merge.d1.C0971D b = new com.github.catvod.spider.merge.d1.C0971D();

    public JsoupParser(j1 j1Var) {
        this.a = j1Var;
    }

    public static JsoupParser b() {
        return new JsoupParser(new com.github.catvod.spider.merge.d1.C0975b());
    }

    public static com.github.catvod.spider.merge.c1.h d(String str) {
        com.github.catvod.spider.merge.d1.C0975b c0975b = new com.github.catvod.spider.merge.d1.C0975b();
        return c0975b.d(new StringReader(str), "", new JsoupParser(c0975b));
    }

    public final com.github.catvod.spider.merge.d1.C0971D a() {
        return this.b;
    }

    public final boolean c() {
        return this.b.b() > 0;
    }

    public final com.github.catvod.spider.merge.c1.h e(Reader reader, String str) {
        return this.a.d(reader, str, this);
    }

    public final com.github.catvod.spider.merge.c1.h f(String str, String str2) {
        return this.a.d(new StringReader(str), str2, this);
    }

    public final com.github.catvod.spider.merge.d1.C0972E g() {
        return this.c;
    }

    public final JsoupParser h() {
        this.c = com.github.catvod.spider.merge.d1.C0972E.d;
        return this;
    }
}
