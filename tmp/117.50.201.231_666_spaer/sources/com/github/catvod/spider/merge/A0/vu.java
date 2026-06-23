package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class vu {
    public static final String[] a = {"base", "basefont", "bgsound", "command", "link"};
    public static final String[] b = {"noframes", "style"};
    public static final String[] c = {"body", "br", "html"};
    public static final String[] d = {"body", "br", "html"};
    public static final String[] e = {"body", "br", "head", "html"};
    public static final String[] f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
    public static final String[] g = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] h = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
    public static final String[] i = {"h1", "h2", "h3", "h4", "h5", "h6"};
    public static final String[] j = {"address", "div", "p"};
    public static final String[] k = {"dd", "dt"};
    public static final String[] l = {"applet", "marquee", "object"};
    public static final String[] m = {"param", "source", "track"};
    public static final String[] n = {"action", "name", "prompt"};
    public static final String[] o = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] p = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
    public static final String[] q = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] r = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
    public static final String[] s = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] t = {"tbody", "tfoot", "thead"};
    public static final String[] u = {"td", "th", "tr"};
    public static final String[] v = {"script", "style", "template"};
    public static final String[] w = {"td", "th"};
    public static final String[] x = {"body", "caption", "col", "colgroup", "html"};
    public static final String[] y = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] z = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] aa = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] ab = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] ac = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] ad = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
    public static final String[] ae = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
    public static final String[] af = {"body", "caption", "col", "colgroup", "html", "td", "th"};
    public static final String[] ag = {"input", "keygen", "textarea"};
    public static final String[] ah = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] ai = {"tbody", "tfoot", "thead"};
    public static final String[] aj = {"head", "noscript"};
    public static final String[] ak = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] al = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] am = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] an = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};

    public static final int ao(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }
}
