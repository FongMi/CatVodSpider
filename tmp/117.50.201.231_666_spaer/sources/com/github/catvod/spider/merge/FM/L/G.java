package com.github.catvod.spider.merge.FM.L;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class G implements Cloneable {
    private static final Map<String, G> j = new HashMap();
    private static final String[] k = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};
    private static final String[] l = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] m = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] n = {"pre", "plaintext", "title", "textarea"};
    private static final String[] o = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] p = {"input", "keygen", "object", "select", "textarea"};
    private String a;
    private String b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        for (int i = 0; i < 69; i++) {
            G g = new G(strArr[i]);
            j.put(g.a, g);
        }
        for (String str : k) {
            G g2 = new G(str);
            g2.c = false;
            g2.d = false;
            j.put(g2.a, g2);
        }
        for (String str2 : l) {
            G g3 = (G) j.get(str2);
            com.github.catvod.spider.merge.FM.I.c.g(g3);
            g3.e = true;
        }
        for (String str3 : m) {
            G g4 = (G) j.get(str3);
            com.github.catvod.spider.merge.FM.I.c.g(g4);
            g4.d = false;
        }
        for (String str4 : n) {
            G g5 = (G) j.get(str4);
            com.github.catvod.spider.merge.FM.I.c.g(g5);
            g5.g = true;
        }
        for (String str5 : o) {
            G g6 = (G) j.get(str5);
            com.github.catvod.spider.merge.FM.I.c.g(g6);
            g6.h = true;
        }
        for (String str6 : p) {
            G g7 = (G) j.get(str6);
            com.github.catvod.spider.merge.FM.I.c.g(g7);
            g7.i = true;
        }
    }

    private G(String str) {
        this.a = str;
        this.b = com.github.catvod.spider.merge.FM.A.l.d(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    public static boolean h(String str) {
        return j.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    public static G m(String str, E e) {
        com.github.catvod.spider.merge.FM.I.c.g(str);
        ?? r0 = j;
        G g = (G) r0.get(str);
        if (g != null) {
            return g;
        }
        String strD = e.d(str);
        com.github.catvod.spider.merge.FM.I.c.e(strD);
        String strD2 = com.github.catvod.spider.merge.FM.A.l.d(strD);
        G g2 = (G) r0.get(strD2);
        if (g2 == null) {
            G g3 = new G(strD);
            g3.c = false;
            return g3;
        }
        if (!e.f() || strD.equals(strD2)) {
            return g2;
        }
        try {
            G g4 = (G) super.clone();
            g4.a = strD;
            return g4;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    protected final Object clone() {
        try {
            return (G) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return this.a.equals(g.a) && this.e == g.e && this.d == g.d && this.c == g.c && this.g == g.g && this.f == g.f && this.h == g.h && this.i == g.i;
    }

    public final boolean f() {
        return !this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    public final boolean g() {
        return j.containsKey(this.a);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public final boolean i() {
        return this.e || this.f;
    }

    public final String j() {
        return this.b;
    }

    public final boolean k() {
        return this.g;
    }

    final G l() {
        this.f = true;
        return this;
    }

    public final String toString() {
        return this.a;
    }
}
