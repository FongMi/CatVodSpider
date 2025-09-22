package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.Lt */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0073Lt implements Cloneable {

    /* renamed from: xC */
    private static final String[] f449xC;

    /* renamed from: W */
    private String f455W;

    /* renamed from: se */
    private String f457se;

    /* renamed from: q */
    private static final Map<String, C0073Lt> f447q = new HashMap();

    /* renamed from: QU */
    private static final String[] f444QU = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};

    /* renamed from: UJ */
    private static final String[] f445UJ = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: u */
    private static final String[] f448u = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: Mo */
    private static final String[] f443Mo = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: i */
    private static final String[] f446i = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: MH */
    private static final String[] f442MH = {"input", "keygen", "object", "select", "textarea"};

    /* renamed from: FN */
    private boolean f452FN = true;

    /* renamed from: B */
    private boolean f450B = true;

    /* renamed from: w8 */
    private boolean f458w8 = false;

    /* renamed from: F */
    private boolean f451F = false;

    /* renamed from: RH */
    private boolean f454RH = false;

    /* renamed from: KT */
    private boolean f453KT = false;

    /* renamed from: k */
    private boolean f456k = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center"};
        f449xC = strArr;
        for (String str : strArr) {
            m236B(new C0073Lt(str));
        }
        for (String str2 : f444QU) {
            C0073Lt c0073Lt = new C0073Lt(str2);
            c0073Lt.f452FN = false;
            c0073Lt.f450B = false;
            m236B(c0073Lt);
        }
        for (String str3 : f445UJ) {
            C0073Lt c0073Lt2 = f447q.get(str3);
            C0111bw.m559se(c0073Lt2);
            c0073Lt2.f458w8 = true;
        }
        for (String str4 : f448u) {
            C0073Lt c0073Lt3 = f447q.get(str4);
            C0111bw.m559se(c0073Lt3);
            c0073Lt3.f450B = false;
        }
        for (String str5 : f443Mo) {
            C0073Lt c0073Lt4 = f447q.get(str5);
            C0111bw.m559se(c0073Lt4);
            c0073Lt4.f454RH = true;
        }
        for (String str6 : f446i) {
            C0073Lt c0073Lt5 = f447q.get(str6);
            C0111bw.m559se(c0073Lt5);
            c0073Lt5.f453KT = true;
        }
        for (String str7 : f442MH) {
            C0073Lt c0073Lt6 = f447q.get(str7);
            C0111bw.m559se(c0073Lt6);
            c0073Lt6.f456k = true;
        }
    }

    private C0073Lt(String str) {
        this.f457se = str;
        this.f455W = C0139qf.m699q(str);
    }

    /* renamed from: B */
    private static void m236B(C0073Lt c0073Lt) {
        f447q.put(c0073Lt.f457se, c0073Lt);
    }

    /* renamed from: F */
    public static C0073Lt m237F(String str) {
        return m238RH(str, C0068Jt.f430xC);
    }

    /* renamed from: RH */
    public static C0073Lt m238RH(String str, C0068Jt c0068Jt) {
        C0111bw.m559se(str);
        Map<String, C0073Lt> map = f447q;
        C0073Lt c0073Lt = map.get(str);
        if (c0073Lt != null) {
            return c0073Lt;
        }
        String strM230QU = c0068Jt.m230QU(str);
        C0111bw.m557i(strM230QU);
        String strM699q = C0139qf.m699q(strM230QU);
        C0073Lt c0073Lt2 = map.get(strM699q);
        if (c0073Lt2 == null) {
            C0073Lt c0073Lt3 = new C0073Lt(strM230QU);
            c0073Lt3.f452FN = false;
            return c0073Lt3;
        }
        if (!c0068Jt.m233u() || strM230QU.equals(strM699q)) {
            return c0073Lt2;
        }
        C0073Lt c0073LtClone = c0073Lt2.clone();
        c0073LtClone.f457se = strM230QU;
        return c0073LtClone;
    }

    /* renamed from: FN */
    public boolean m239FN() {
        return this.f454RH;
    }

    /* renamed from: MH */
    public boolean m240MH() {
        return f447q.containsKey(this.f457se);
    }

    /* renamed from: Mo */
    public boolean m241Mo() {
        return this.f453KT;
    }

    /* renamed from: QU */
    public String m242QU() {
        return this.f457se;
    }

    /* renamed from: UJ */
    public boolean m243UJ() {
        return this.f452FN;
    }

    /* renamed from: W */
    public String m244W() {
        return this.f455W;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0073Lt)) {
            return false;
        }
        C0073Lt c0073Lt = (C0073Lt) obj;
        return this.f457se.equals(c0073Lt.f457se) && this.f458w8 == c0073Lt.f458w8 && this.f450B == c0073Lt.f450B && this.f452FN == c0073Lt.f452FN && this.f454RH == c0073Lt.f454RH && this.f451F == c0073Lt.f451F && this.f453KT == c0073Lt.f453KT && this.f456k == c0073Lt.f456k;
    }

    public int hashCode() {
        return (((((((((((((this.f457se.hashCode() * 31) + (this.f452FN ? 1 : 0)) * 31) + (this.f450B ? 1 : 0)) * 31) + (this.f458w8 ? 1 : 0)) * 31) + (this.f451F ? 1 : 0)) * 31) + (this.f454RH ? 1 : 0)) * 31) + (this.f453KT ? 1 : 0)) * 31) + (this.f456k ? 1 : 0);
    }

    /* renamed from: i */
    public boolean m245i() {
        return !this.f452FN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0073Lt clone() {
        try {
            return (C0073Lt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: se */
    public boolean m247se() {
        return this.f458w8 || this.f451F;
    }

    public String toString() {
        return this.f457se;
    }

    /* renamed from: u */
    public boolean m248u() {
        return this.f458w8;
    }

    /* renamed from: w8 */
    C0073Lt m249w8() {
        this.f451F = true;
        return this;
    }

    /* renamed from: xC */
    public boolean m250xC() {
        return this.f450B;
    }
}
