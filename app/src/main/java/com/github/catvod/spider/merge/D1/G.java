package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.a1.C0899d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class G implements Cloneable {
    private static final Map<String, G> k = new HashMap();
    private static final String[] l = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr"};
    private static final String[] m = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] n = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] o = {"pre", "plaintext", "title", "textarea"};
    private static final String[] p = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] q = {"input", "keygen", "object", "select", "textarea"};
    private String b;
    private String c;
    private boolean d = true;
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        for (int i = 0; i < 69; i++) {
            G g = new G(strArr[i]);
            k.put(g.b, g);
        }
        for (String str : l) {
            G g2 = new G(str);
            g2.d = false;
            g2.e = false;
            k.put(g2.b, g2);
        }
        for (String str2 : m) {
            G g3 = (G) k.get(str2);
            C0899d.h(g3);
            g3.f = true;
        }
        for (String str3 : n) {
            G g4 = (G) k.get(str3);
            C0899d.h(g4);
            g4.e = false;
        }
        for (String str4 : o) {
            G g5 = (G) k.get(str4);
            C0899d.h(g5);
            g5.h = true;
        }
        for (String str5 : p) {
            G g6 = (G) k.get(str5);
            C0899d.h(g6);
            g6.i = true;
        }
        for (String str6 : q) {
            G g7 = (G) k.get(str6);
            C0899d.h(g7);
            g7.j = true;
        }
    }

    private G(String str) {
        this.b = str;
        this.c = com.github.catvod.spider.merge.g.b.b(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    public static boolean h(String str) {
        return k.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    public static G m(String str, C0972E c0972e) {
        C0899d.h(str);
        Object r0 = k;
        G g = (G) r0.get(str);
        if (g != null) {
            return g;
        }
        String strD = c0972e.d(str);
        C0899d.f(strD);
        String strB = com.github.catvod.spider.merge.g.b.b(strD);
        G g2 = (G) r0.get(strB);
        if (g2 == null) {
            G g3 = new G(strD);
            g3.d = false;
            return g3;
        }
        if (!c0972e.f() || strD.equals(strB)) {
            return g2;
        }
        try {
            G g4 = (G) super.clone();
            g4.b = strD;
            return g4;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    protected final Object clone() {
        try {
            return (G) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return this.b.equals(g.b) && this.f == g.f && this.e == g.e && this.d == g.d && this.h == g.h && this.g == g.g && this.i == g.i && this.j == g.j;
    }

    public final boolean f() {
        return !this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    public final boolean g() {
        return k.containsKey(this.b);
    }

    public final int hashCode() {
        return (((((((((((((this.b.hashCode() * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }

    public final boolean i() {
        return this.f || this.g;
    }

    public final String j() {
        return this.c;
    }

    public final boolean k() {
        return this.h;
    }

    final G l() {
        this.g = true;
        return this;
    }

    public final String toString() {
        return this.b;
    }
}
