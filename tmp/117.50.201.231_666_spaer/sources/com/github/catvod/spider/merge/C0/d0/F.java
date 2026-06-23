package com.github.catvod.spider.merge.C0.d0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class F implements Cloneable {
    private static final Map<String, F> l = new HashMap();
    private static final String[] m = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};
    private static final String[] n = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] o = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] p = {"pre", "plaintext", "title", "textarea"};
    private static final String[] q = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] r = {"input", "keygen", "object", "select", "textarea"};
    private String c;
    private String d;
    private boolean e = true;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    /* JADX WARN: Type inference failed for: r3v103, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    static {
        for (int i = 0; i < 64; i++) {
            F f = new F(new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center"}[i]);
            l.put(f.c, f);
        }
        for (String str : m) {
            F f2 = new F(str);
            f2.e = false;
            f2.f = false;
            l.put(f2.c, f2);
        }
        for (String str2 : n) {
            F f3 = (F) l.get(str2);
            com.github.catvod.spider.merge.C0.N.a.k(f3);
            f3.g = true;
        }
        for (String str3 : o) {
            F f4 = (F) l.get(str3);
            com.github.catvod.spider.merge.C0.N.a.k(f4);
            f4.f = false;
        }
        for (String str4 : p) {
            F f5 = (F) l.get(str4);
            com.github.catvod.spider.merge.C0.N.a.k(f5);
            f5.i = true;
        }
        for (String str5 : q) {
            F f6 = (F) l.get(str5);
            com.github.catvod.spider.merge.C0.N.a.k(f6);
            f6.j = true;
        }
        for (String str6 : r) {
            F f7 = (F) l.get(str6);
            com.github.catvod.spider.merge.C0.N.a.k(f7);
            f7.k = true;
        }
    }

    private F(String str) {
        this.c = str;
        this.d = com.github.catvod.spider.merge.C0.x.a.c(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    public static F l(String str, D d) {
        com.github.catvod.spider.merge.C0.N.a.k(str);
        ?? r1 = l;
        F f = (F) r1.get(str);
        if (f != null) {
            return f;
        }
        String strC = d.c(str);
        com.github.catvod.spider.merge.C0.N.a.i(strC);
        String strC2 = com.github.catvod.spider.merge.C0.x.a.c(strC);
        F f2 = (F) r1.get(strC2);
        if (f2 == null) {
            F f3 = new F(strC);
            f3.e = false;
            return f3;
        }
        if (!d.e() || strC.equals(strC2)) {
            return f2;
        }
        try {
            F f4 = (F) super.clone();
            f4.c = strC;
            return f4;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    protected final Object clone() {
        try {
            return (F) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean d() {
        return this.g;
    }

    public final boolean e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f = (F) obj;
        if (this.c.equals(f.c) && this.g == f.g && this.f == f.f && this.e == f.e && this.i == f.i && this.h == f.h && this.j == f.j) {
            return this.k == f.k;
        }
        return false;
    }

    public final boolean f() {
        return !this.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C0.d0.F>] */
    public final boolean g() {
        return l.containsKey(this.c);
    }

    public final boolean h() {
        return this.g || this.h;
    }

    public final int hashCode() {
        return (((((((((((((this.c.hashCode() * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.i;
    }

    final F k() {
        this.h = true;
        return this;
    }

    public final String toString() {
        return this.c;
    }
}
