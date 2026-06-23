package com.github.catvod.spider.merge.A0;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ad implements Cloneable {
    public static final HashMap a = new HashMap();
    public String b;
    public final String c;
    public String d;
    public boolean e = true;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    static {
        String[] strArr = act.a;
        HashMap map = new HashMap();
        map.put("http://www.w3.org/1998/Math/MathML", new String[]{"math", "mi", "mo", "msup", "mn", "mtext"});
        map.put("http://www.w3.org/2000/svg", new String[]{"svg", "text"});
        final int i = 0;
        l(new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"}, new Consumer() { // from class: com.github.catvod.spider.merge.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ad adVar = (ad) obj;
                switch (i) {
                    case 0:
                        adVar.e = true;
                        adVar.f = true;
                        break;
                    case 1:
                        adVar.e = false;
                        adVar.f = false;
                        break;
                    case 2:
                        adVar.g = true;
                        break;
                    case 3:
                        adVar.f = false;
                        break;
                    case 4:
                        adVar.i = true;
                        break;
                    case 5:
                        adVar.j = true;
                        break;
                    default:
                        adVar.k = true;
                        break;
                }
            }
        });
        final int i2 = 1;
        l(new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb", "text", "mi", "mo", "msup", "mn", "mtext"}, new Consumer() { // from class: com.github.catvod.spider.merge.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ad adVar = (ad) obj;
                switch (i2) {
                    case 0:
                        adVar.e = true;
                        adVar.f = true;
                        break;
                    case 1:
                        adVar.e = false;
                        adVar.f = false;
                        break;
                    case 2:
                        adVar.g = true;
                        break;
                    case 3:
                        adVar.f = false;
                        break;
                    case 4:
                        adVar.i = true;
                        break;
                    case 5:
                        adVar.j = true;
                        break;
                    default:
                        adVar.k = true;
                        break;
                }
            }
        });
        final int i3 = 2;
        l(new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new Consumer() { // from class: com.github.catvod.spider.merge.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ad adVar = (ad) obj;
                switch (i3) {
                    case 0:
                        adVar.e = true;
                        adVar.f = true;
                        break;
                    case 1:
                        adVar.e = false;
                        adVar.f = false;
                        break;
                    case 2:
                        adVar.g = true;
                        break;
                    case 3:
                        adVar.f = false;
                        break;
                    case 4:
                        adVar.i = true;
                        break;
                    case 5:
                        adVar.j = true;
                        break;
                    default:
                        adVar.k = true;
                        break;
                }
            }
        });
        final int i4 = 3;
        l(new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s", "button"}, new Consumer() { // from class: com.github.catvod.spider.merge.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ad adVar = (ad) obj;
                switch (i4) {
                    case 0:
                        adVar.e = true;
                        adVar.f = true;
                        break;
                    case 1:
                        adVar.e = false;
                        adVar.f = false;
                        break;
                    case 2:
                        adVar.g = true;
                        break;
                    case 3:
                        adVar.f = false;
                        break;
                    case 4:
                        adVar.i = true;
                        break;
                    case 5:
                        adVar.j = true;
                        break;
                    default:
                        adVar.k = true;
                        break;
                }
            }
        });
        final int i5 = 4;
        l(new String[]{"pre", "plaintext", "title", "textarea"}, new Consumer() { // from class: com.github.catvod.spider.merge.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ad adVar = (ad) obj;
                switch (i5) {
                    case 0:
                        adVar.e = true;
                        adVar.f = true;
                        break;
                    case 1:
                        adVar.e = false;
                        adVar.f = false;
                        break;
                    case 2:
                        adVar.g = true;
                        break;
                    case 3:
                        adVar.f = false;
                        break;
                    case 4:
                        adVar.i = true;
                        break;
                    case 5:
                        adVar.j = true;
                        break;
                    default:
                        adVar.k = true;
                        break;
                }
            }
        });
        final int i6 = 5;
        l(new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"}, new Consumer() { // from class: com.github.catvod.spider.merge.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ad adVar = (ad) obj;
                switch (i6) {
                    case 0:
                        adVar.e = true;
                        adVar.f = true;
                        break;
                    case 1:
                        adVar.e = false;
                        adVar.f = false;
                        break;
                    case 2:
                        adVar.g = true;
                        break;
                    case 3:
                        adVar.f = false;
                        break;
                    case 4:
                        adVar.i = true;
                        break;
                    case 5:
                        adVar.j = true;
                        break;
                    default:
                        adVar.k = true;
                        break;
                }
            }
        });
        final int i7 = 6;
        l(strArr, new Consumer() { // from class: com.github.catvod.spider.merge.A0.tz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ad adVar = (ad) obj;
                switch (i7) {
                    case 0:
                        adVar.e = true;
                        adVar.f = true;
                        break;
                    case 1:
                        adVar.e = false;
                        adVar.f = false;
                        break;
                    case 2:
                        adVar.g = true;
                        break;
                    case 3:
                        adVar.f = false;
                        break;
                    case 4:
                        adVar.i = true;
                        break;
                    case 5:
                        adVar.j = true;
                        break;
                    default:
                        adVar.k = true;
                        break;
                }
            }
        });
        for (final Map.Entry entry : map.entrySet()) {
            l((String[]) entry.getValue(), new Consumer() { // from class: com.github.catvod.spider.merge.A0.ib
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((ad) obj).d = (String) entry.getKey();
                }
            });
        }
    }

    public ad(String str, String str2) {
        this.b = str;
        this.c = qf.c(str);
        this.d = str2;
    }

    public static void l(String[] strArr, Consumer consumer) {
        for (String str : strArr) {
            HashMap map = a;
            ad adVar = (ad) map.get(str);
            if (adVar == null) {
                adVar = new ad(str, "http://www.w3.org/1999/xhtml");
                map.put(adVar.b, adVar);
            }
            consumer.accept(adVar);
        }
    }

    public static ad m(String str, String str2, vz vzVar) {
        wc.c(str);
        wc.e(str2);
        HashMap map = a;
        ad adVar = (ad) map.get(str);
        if (adVar != null && adVar.d.equals(str2)) {
            return adVar;
        }
        vzVar.getClass();
        String strTrim = str.trim();
        boolean z = vzVar.c;
        if (!z) {
            strTrim = qf.c(strTrim);
        }
        wc.c(strTrim);
        String strC = qf.c(strTrim);
        ad adVar2 = (ad) map.get(strC);
        if (adVar2 == null || !adVar2.d.equals(str2)) {
            ad adVar3 = new ad(strTrim, str2);
            adVar3.e = false;
            return adVar3;
        }
        if (z && !strTrim.equals(strC)) {
            try {
                adVar2 = (ad) super.clone();
                adVar2.b = strTrim;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return adVar2;
    }

    public final Object clone() {
        try {
            return (ad) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.b.equals(adVar.b) && this.g == adVar.g && this.f == adVar.f && this.e == adVar.e && this.i == adVar.i && this.h == adVar.h && this.j == adVar.j && this.k == adVar.k;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k));
    }

    public final String toString() {
        return this.b;
    }
}
