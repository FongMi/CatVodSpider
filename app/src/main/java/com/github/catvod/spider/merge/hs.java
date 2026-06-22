package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class hs implements Cloneable {
    private static final String[] S;
    private String HM;
    private String n;
    private static final Map<String, hs> l8 = new HashMap();
    private static final String[] T4 = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s"};
    private static final String[] b = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] OL = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] l = {"pre", "plaintext", "title", "textarea"};
    private static final String[] tT = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] N = {"input", "keygen", "object", "select", "textarea"};
    private boolean v = true;
    private boolean A = true;
    private boolean cD = false;
    private boolean s = false;
    private boolean hR = false;
    private boolean Kf = false;
    private boolean E9 = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center"};
        S = strArr;
        for (String str : strArr) {
            A(new hs(str));
        }
        for (String str2 : T4) {
            hs hsVar = new hs(str2);
            hsVar.v = false;
            hsVar.A = false;
            A(hsVar);
        }
        for (String str3 : b) {
            hs hsVar2 = l8.get(str3);
            Rc.HM(hsVar2);
            hsVar2.cD = true;
        }
        for (String str4 : OL) {
            hs hsVar3 = l8.get(str4);
            Rc.HM(hsVar3);
            hsVar3.A = false;
        }
        for (String str5 : l) {
            hs hsVar4 = l8.get(str5);
            Rc.HM(hsVar4);
            hsVar4.hR = true;
        }
        for (String str6 : tT) {
            hs hsVar5 = l8.get(str6);
            Rc.HM(hsVar5);
            hsVar5.Kf = true;
        }
        for (String str7 : N) {
            hs hsVar6 = l8.get(str7);
            Rc.HM(hsVar6);
            hsVar6.E9 = true;
        }
    }

    private hs(String str) {
        this.HM = str;
        this.n = kA.l8(str);
    }

    private static void A(hs hsVar) {
        l8.put(hsVar.HM, hsVar);
    }

    public static hs hR(String str, rO rOVar) {
        Rc.HM(str);
        Map<String, hs> map = l8;
        hs hsVar = map.get(str);
        if (hsVar != null) {
            return hsVar;
        }
        String strT4 = rOVar.T4(str);
        Rc.tT(strT4);
        String strL8 = kA.l8(strT4);
        hs hsVar2 = map.get(strL8);
        if (hsVar2 == null) {
            hs hsVar3 = new hs(strT4);
            hsVar3.v = false;
            return hsVar3;
        }
        if (!rOVar.OL() || strT4.equals(strL8)) {
            return hsVar2;
        }
        hs hsVarClone = hsVar2.clone();
        hsVarClone.HM = strT4;
        return hsVarClone;
    }

    public static hs s(String str) {
        return hR(str, rO.S);
    }

    public boolean HM() {
        return this.cD || this.s;
    }

    public boolean N() {
        return l8.containsKey(this.HM);
    }

    public boolean OL() {
        return this.cD;
    }

    public boolean S() {
        return this.A;
    }

    public String T4() {
        return this.HM;
    }

    public boolean b() {
        return this.v;
    }

    hs cD() {
        this.s = true;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        return this.HM.equals(hsVar.HM) && this.cD == hsVar.cD && this.A == hsVar.A && this.v == hsVar.v && this.hR == hsVar.hR && this.s == hsVar.s && this.Kf == hsVar.Kf && this.E9 == hsVar.E9;
    }

    public int hashCode() {
        return (((((((((((((this.HM.hashCode() * 31) + (this.v ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.cD ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.hR ? 1 : 0)) * 31) + (this.Kf ? 1 : 0)) * 31) + (this.E9 ? 1 : 0);
    }

    public boolean l() {
        return this.Kf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: l8, reason: merged with bridge method [inline-methods] */
    public hs clone() {
        try {
            return (hs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String n() {
        return this.n;
    }

    public boolean tT() {
        return !this.v;
    }

    public String toString() {
        return this.HM;
    }

    public boolean v() {
        return this.hR;
    }
}
