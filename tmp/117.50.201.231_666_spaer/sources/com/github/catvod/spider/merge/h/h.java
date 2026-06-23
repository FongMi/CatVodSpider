package com.github.catvod.spider.merge.H;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class h implements Cloneable {
    private static final Map<String, h> j = new HashMap();
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

    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        for (int i = 0; i < 69; i++) {
            h hVar = new h(strArr[i]);
            j.put(hVar.a, hVar);
        }
        for (String str : k) {
            h hVar2 = new h(str);
            hVar2.c = false;
            hVar2.d = false;
            j.put(hVar2.a, hVar2);
        }
        for (String str2 : l) {
            h hVar3 = (h) j.get(str2);
            com.github.catvod.spider.merge.E.c.g(hVar3);
            hVar3.e = true;
        }
        for (String str3 : m) {
            h hVar4 = (h) j.get(str3);
            com.github.catvod.spider.merge.E.c.g(hVar4);
            hVar4.d = false;
        }
        for (String str4 : n) {
            h hVar5 = (h) j.get(str4);
            com.github.catvod.spider.merge.E.c.g(hVar5);
            hVar5.g = true;
        }
        for (String str5 : o) {
            h hVar6 = (h) j.get(str5);
            com.github.catvod.spider.merge.E.c.g(hVar6);
            hVar6.h = true;
        }
        for (String str6 : p) {
            h hVar7 = (h) j.get(str6);
            com.github.catvod.spider.merge.E.c.g(hVar7);
            hVar7.i = true;
        }
    }

    private h(String str) {
        this.a = str;
        this.b = com.github.catvod.spider.merge.F.a.e(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    public static boolean h(String str) {
        return j.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
    public static h m(String str, f fVar) {
        com.github.catvod.spider.merge.E.c.g(str);
        ?? r0 = j;
        h hVar = (h) r0.get(str);
        if (hVar != null) {
            return hVar;
        }
        String strD = fVar.d(str);
        com.github.catvod.spider.merge.E.c.e(strD);
        String strE = com.github.catvod.spider.merge.F.a.e(strD);
        h hVar2 = (h) r0.get(strE);
        if (hVar2 == null) {
            h hVar3 = new h(strD);
            hVar3.c = false;
            return hVar3;
        }
        if (!fVar.f() || strD.equals(strE)) {
            return hVar2;
        }
        try {
            h hVar4 = (h) super.clone();
            hVar4.a = strD;
            return hVar4;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
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
            return (h) super.clone();
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a) && this.e == hVar.e && this.d == hVar.d && this.c == hVar.c && this.g == hVar.g && this.f == hVar.f && this.h == hVar.h && this.i == hVar.i;
    }

    public final boolean f() {
        return !this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.H.h>] */
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

    final h l() {
        this.f = true;
        return this;
    }

    public final String toString() {
        return this.a;
    }
}
