package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.mt;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class oL {
    public static final oL A;
    public static final oL C;
    public static final oL E9;
    public static final oL HM;
    public static final oL Kf;
    public static final oL N;
    public static final oL OL;
    private static final String OY;
    public static final oL Q;
    public static final oL S;
    public static final oL T4;
    public static final oL W;
    public static final oL b;
    public static final oL c;
    public static final oL cD;
    public static final oL eD;
    public static final oL hR;
    public static final oL l;
    public static final oL l8;
    public static final oL n;
    private static final /* synthetic */ oL[] r1;
    public static final oL s;
    public static final oL tT;
    public static final oL uS;
    public static final oL v;

    class a extends oL {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.github.catvod.spider.merge.oL
        boolean n(mt mtVar, xU xUVar) {
            if (oL.HM(mtVar)) {
                return true;
            }
            if (mtVar.N()) {
                xUVar.Lw(mtVar.S());
            } else {
                if (!mtVar.HM()) {
                    xUVar.T(oL.S);
                    return xUVar.l(mtVar);
                }
                mt.xq xqVarT4 = mtVar.T4();
                Oi oi = new Oi(xUVar.N.T4(xqVarT4.Kf()), xqVarT4.uS(), xqVarT4.c());
                oi.FG(xqVarT4.E9());
                xUVar.r1().f(oi);
                if (xqVarT4.eD()) {
                    xUVar.r1().E7(g9.ut.quirks);
                }
                xUVar.T(oL.S);
            }
            return true;
        }
    }

    static /* synthetic */ class k {
        static final /* synthetic */ int[] l8;

        static {
            int[] iArr = new int[mt.Q.values().length];
            l8 = iArr;
            try {
                iArr[mt.Q.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                l8[mt.Q.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                l8[mt.Q.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                l8[mt.Q.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                l8[mt.Q.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                l8[mt.Q.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static final class n {
        static final String[] l8 = {"base", "basefont", "bgsound", "command", "link"};
        static final String[] S = {"noframes", "style"};
        static final String[] T4 = {"body", "br", "html"};
        static final String[] b = {"body", "html"};
        static final String[] OL = {"body", "br", "head", "html"};
        static final String[] l = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
        static final String[] tT = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
        static final String[] N = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        static final String[] HM = {"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] n = {"address", "div", "p"};
        static final String[] v = {"dd", "dt"};
        static final String[] A = {"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] cD = {"applet", "marquee", "object"};
        static final String[] s = {"area", "br", "embed", "img", "keygen", "wbr"};
        static final String[] hR = {"param", "source", "track"};
        static final String[] Kf = {"action", "name", "prompt"};
        static final String[] E9 = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] uS = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] c = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] eD = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] Q = {"tbody", "tfoot", "thead"};
        static final String[] W = {"td", "th", "tr"};
        static final String[] C = {"script", "style"};
        static final String[] OY = {"td", "th"};
        static final String[] r1 = {"body", "caption", "col", "colgroup", "html"};
        static final String[] R = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] bc = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] G = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] rD = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] oH = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        static final String[] A0 = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        static final String[] hd = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        static final String[] d = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        static final String[] O = {"input", "keygen", "textarea"};
        static final String[] Bz = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] H6 = {"tbody", "tfoot", "thead"};
        static final String[] PP = {"head", "noscript"};
        static final String[] o = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }

    static {
        a aVar = new a("Initial", 0);
        l8 = aVar;
        oL oLVar = new oL("BeforeHtml", 1) { // from class: com.github.catvod.spider.merge.oL.L
            {
                a aVar2 = null;
            }

            private boolean v(mt mtVar, xU xUVar) {
                xUVar.U("html");
                xUVar.T(oL.T4);
                return xUVar.l(mtVar);
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.HM()) {
                    xUVar.uS(this);
                    return false;
                }
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                if (mtVar.A() && mtVar.OL().A0().equals("html")) {
                    xUVar.y(mtVar.OL());
                    xUVar.T(oL.T4);
                    return true;
                }
                if (mtVar.v() && tv.b(mtVar.b().A0(), n.OL)) {
                    return v(mtVar, xUVar);
                }
                if (!mtVar.v()) {
                    return v(mtVar, xUVar);
                }
                xUVar.uS(this);
                return false;
            }
        };
        S = oLVar;
        oL oLVar2 = new oL("BeforeHead", 2) { // from class: com.github.catvod.spider.merge.oL.rs
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (mtVar.HM()) {
                    xUVar.uS(this);
                    return false;
                }
                if (mtVar.A() && mtVar.OL().A0().equals("html")) {
                    return oL.tT.n(mtVar, xUVar);
                }
                if (mtVar.A() && mtVar.OL().A0().equals("head")) {
                    xUVar.K(xUVar.y(mtVar.OL()));
                    xUVar.T(oL.b);
                    return true;
                }
                if (mtVar.v() && tv.b(mtVar.b().A0(), n.OL)) {
                    xUVar.N("head");
                    return xUVar.l(mtVar);
                }
                if (mtVar.v()) {
                    xUVar.uS(this);
                    return false;
                }
                xUVar.N("head");
                return xUVar.l(mtVar);
            }
        };
        T4 = oLVar2;
        oL oLVar3 = new oL("InHead", 3) { // from class: com.github.catvod.spider.merge.oL.ii
            {
                a aVar2 = null;
            }

            private boolean v(mt mtVar, gx gxVar) {
                gxVar.tT("head");
                return gxVar.l(mtVar);
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                int i2 = k.l8[mtVar.l8.ordinal()];
                if (i2 == 1) {
                    xUVar.Lw(mtVar.S());
                } else {
                    if (i2 == 2) {
                        xUVar.uS(this);
                        return false;
                    }
                    if (i2 == 3) {
                        mt.i iVarOL = mtVar.OL();
                        String strA0 = iVarOL.A0();
                        if (strA0.equals("html")) {
                            return oL.tT.n(mtVar, xUVar);
                        }
                        if (tv.b(strA0, n.l8)) {
                            Iw iwDL = xUVar.DL(iVarOL);
                            if (strA0.equals("base") && iwDL.Kf("href")) {
                                xUVar.nZ(iwDL);
                            }
                        } else if (strA0.equals("meta")) {
                            xUVar.DL(iVarOL);
                        } else if (strA0.equals("title")) {
                            oL.tT(iVarOL, xUVar);
                        } else if (tv.b(strA0, n.S)) {
                            oL.l(iVarOL, xUVar);
                        } else if (strA0.equals("noscript")) {
                            xUVar.y(iVarOL);
                            xUVar.T(oL.OL);
                        } else {
                            if (!strA0.equals("script")) {
                                if (!strA0.equals("head")) {
                                    return v(mtVar, xUVar);
                                }
                                xUVar.uS(this);
                                return false;
                            }
                            xUVar.T4.C(m.l);
                            xUVar.Jb();
                            xUVar.T(oL.N);
                            xUVar.y(iVarOL);
                        }
                    } else {
                        if (i2 != 4) {
                            return v(mtVar, xUVar);
                        }
                        String strA02 = mtVar.b().A0();
                        if (!strA02.equals("head")) {
                            if (tv.b(strA02, n.T4)) {
                                return v(mtVar, xUVar);
                            }
                            xUVar.uS(this);
                            return false;
                        }
                        xUVar.OT();
                        xUVar.T(oL.l);
                    }
                }
                return true;
            }
        };
        b = oLVar3;
        oL oLVar4 = new oL("InHeadNoscript", 4) { // from class: com.github.catvod.spider.merge.oL.Zv
            {
                a aVar2 = null;
            }

            private boolean v(mt mtVar, xU xUVar) {
                xUVar.uS(this);
                xUVar.M(new mt.Y().Kf(mtVar.toString()));
                return true;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.HM()) {
                    xUVar.uS(this);
                    return true;
                }
                if (mtVar.A() && mtVar.OL().A0().equals("html")) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                if (mtVar.v() && mtVar.b().A0().equals("noscript")) {
                    xUVar.OT();
                    xUVar.T(oL.b);
                    return true;
                }
                if (oL.HM(mtVar) || mtVar.N() || (mtVar.A() && tv.b(mtVar.OL().A0(), n.l))) {
                    return xUVar.b6(mtVar, oL.b);
                }
                if (mtVar.v() && mtVar.b().A0().equals("br")) {
                    return v(mtVar, xUVar);
                }
                if ((!mtVar.A() || !tv.b(mtVar.OL().A0(), n.PP)) && !mtVar.v()) {
                    return v(mtVar, xUVar);
                }
                xUVar.uS(this);
                return false;
            }
        };
        OL = oLVar4;
        oL oLVar5 = new oL("AfterHead", 5) { // from class: com.github.catvod.spider.merge.oL.ib
            {
                a aVar2 = null;
            }

            private boolean v(mt mtVar, xU xUVar) {
                xUVar.N("body");
                xUVar.c(true);
                return xUVar.l(mtVar);
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (mtVar.HM()) {
                    xUVar.uS(this);
                    return true;
                }
                if (!mtVar.A()) {
                    if (!mtVar.v()) {
                        v(mtVar, xUVar);
                        return true;
                    }
                    if (tv.b(mtVar.b().A0(), n.b)) {
                        v(mtVar, xUVar);
                        return true;
                    }
                    xUVar.uS(this);
                    return false;
                }
                mt.i iVarOL = mtVar.OL();
                String strA0 = iVarOL.A0();
                if (strA0.equals("html")) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                if (strA0.equals("body")) {
                    xUVar.y(iVarOL);
                    xUVar.c(false);
                    xUVar.T(oL.tT);
                    return true;
                }
                if (strA0.equals("frameset")) {
                    xUVar.y(iVarOL);
                    xUVar.T(oL.c);
                    return true;
                }
                if (!tv.b(strA0, n.tT)) {
                    if (strA0.equals("head")) {
                        xUVar.uS(this);
                        return false;
                    }
                    v(mtVar, xUVar);
                    return true;
                }
                xUVar.uS(this);
                Iw iwG = xUVar.G();
                xUVar.L(iwG);
                xUVar.b6(mtVar, oL.b);
                xUVar.LD(iwG);
                return true;
            }
        };
        l = oLVar5;
        oL oLVar6 = new oL("InBody", 6) { // from class: com.github.catvod.spider.merge.oL.VT
            {
                a aVar2 = null;
            }

            private boolean A(mt mtVar, xU xUVar) {
                mt.XT xtB;
                String strA0;
                xtB = mtVar.b();
                strA0 = xtB.A0();
                strA0.hashCode();
                switch (strA0) {
                    case "p":
                        if (!xUVar.A0(strA0)) {
                            xUVar.uS(this);
                            xUVar.N(strA0);
                            return xUVar.l(xtB);
                        }
                        xUVar.W(strA0);
                        if (!xUVar.l8().m().equals(strA0)) {
                            xUVar.uS(this);
                        }
                        xUVar.e(strA0);
                        return true;
                    case "br":
                        xUVar.uS(this);
                        xUVar.N("br");
                        return false;
                    case "dd":
                    case "dt":
                        if (!xUVar.d(strA0)) {
                            xUVar.uS(this);
                            return false;
                        }
                        xUVar.W(strA0);
                        if (!xUVar.l8().m().equals(strA0)) {
                            xUVar.uS(this);
                        }
                        xUVar.e(strA0);
                        return true;
                    case "h1":
                    case "h2":
                    case "h3":
                    case "h4":
                    case "h5":
                    case "h6":
                        String[] strArr = n.HM;
                        if (!xUVar.Bz(strArr)) {
                            xUVar.uS(this);
                            return false;
                        }
                        xUVar.W(strA0);
                        if (!xUVar.l8().m().equals(strA0)) {
                            xUVar.uS(this);
                        }
                        xUVar.m(strArr);
                        return true;
                    case "li":
                        if (!xUVar.hd(strA0)) {
                            xUVar.uS(this);
                            return false;
                        }
                        xUVar.W(strA0);
                        if (!xUVar.l8().m().equals(strA0)) {
                            xUVar.uS(this);
                        }
                        xUVar.e(strA0);
                        return true;
                    case "body":
                        if (xUVar.d("body")) {
                            xUVar.T(oL.uS);
                            return true;
                        }
                        xUVar.uS(this);
                        return false;
                    case "form":
                        C1399vv c1399vvR = xUVar.R();
                        xUVar.KP(null);
                        if (c1399vvR == null || !xUVar.d(strA0)) {
                            xUVar.uS(this);
                            return false;
                        }
                        xUVar.Q();
                        if (!xUVar.l8().m().equals(strA0)) {
                            xUVar.uS(this);
                        }
                        xUVar.LD(c1399vvR);
                        return true;
                    case "html":
                        if (xUVar.tT("body")) {
                            return xUVar.l(xtB);
                        }
                        return true;
                    case "span":
                    case "sarcasm":
                        return v(mtVar, xUVar);
                    default:
                        if (tv.b(strA0, n.c)) {
                            return cD(mtVar, xUVar);
                        }
                        if (tv.b(strA0, n.uS)) {
                            if (!xUVar.d(strA0)) {
                                xUVar.uS(this);
                                return false;
                            }
                            xUVar.Q();
                            if (!xUVar.l8().m().equals(strA0)) {
                                xUVar.uS(this);
                            }
                            xUVar.e(strA0);
                        } else {
                            if (!tv.b(strA0, n.cD)) {
                                return v(mtVar, xUVar);
                            }
                            if (!xUVar.d("name")) {
                                if (!xUVar.d(strA0)) {
                                    xUVar.uS(this);
                                    return false;
                                }
                                xUVar.Q();
                                if (!xUVar.l8().m().equals(strA0)) {
                                    xUVar.uS(this);
                                }
                                xUVar.e(strA0);
                                xUVar.cD();
                            }
                        }
                        return true;
                }
            }

            private boolean cD(mt mtVar, xU xUVar) {
                String strA0 = mtVar.b().A0();
                ArrayList<Iw> arrayListOH = xUVar.oH();
                boolean z = false;
                int i2 = 0;
                while (i2 < 8) {
                    Iw iwC = xUVar.C(strA0);
                    if (iwC == null) {
                        return v(mtVar, xUVar);
                    }
                    if (!xUVar.h(iwC)) {
                        xUVar.uS(this);
                        xUVar.DX(iwC);
                        return true;
                    }
                    if (!xUVar.d(iwC.m())) {
                        xUVar.uS(this);
                        return z;
                    }
                    if (xUVar.l8() != iwC) {
                        xUVar.uS(this);
                    }
                    int size = arrayListOH.size();
                    int iUM = -1;
                    Iw iw = null;
                    Iw iw2 = null;
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i3 >= size || i3 >= 64) {
                            break;
                        }
                        Iw iw3 = arrayListOH.get(i3);
                        if (iw3 != iwC) {
                            if (z2 && xUVar.r0(iw3)) {
                                iw = iw3;
                                break;
                            }
                        } else {
                            iw2 = arrayListOH.get(i3 - 1);
                            iUM = xUVar.UM(iw3);
                            z2 = true;
                        }
                        i3++;
                    }
                    if (iw == null) {
                        xUVar.e(iwC.m());
                        xUVar.DX(iwC);
                        return true;
                    }
                    Iw iwV = iw;
                    Iw iw4 = iwV;
                    for (int i4 = 0; i4 < 3; i4++) {
                        if (xUVar.h(iwV)) {
                            iwV = xUVar.v(iwV);
                        }
                        if (!xUVar.I(iwV)) {
                            xUVar.LD(iwV);
                        } else {
                            if (iwV == iwC) {
                                break;
                            }
                            Iw iw5 = new Iw(hs.hR(iwV.Q(), rO.S), xUVar.OY());
                            xUVar.Ut(iwV, iw5);
                            xUVar.F(iwV, iw5);
                            if (iw4 == iw) {
                                iUM = xUVar.UM(iw5) + 1;
                            }
                            if (iw4.G() != null) {
                                iw4.hd();
                            }
                            iw5.f(iw4);
                            iwV = iw5;
                            iw4 = iwV;
                        }
                    }
                    if (iw2 != null) {
                        if (tv.b(iw2.m(), n.eD)) {
                            if (iw4.G() != null) {
                                iw4.hd();
                            }
                            xUVar.x(iw4);
                        } else {
                            if (iw4.G() != null) {
                                iw4.hd();
                            }
                            iw2.f(iw4);
                        }
                    }
                    Iw iw6 = new Iw(iwC.cE(), xUVar.OY());
                    iw6.OL().OL(iwC.OL());
                    for (A0 a0 : (A0[]) iw.n().toArray(new A0[0])) {
                        iw6.f(a0);
                    }
                    iw.f(iw6);
                    xUVar.DX(iwC);
                    xUVar.W8(iw6, iUM);
                    xUVar.LD(iwC);
                    xUVar.Y(iw, iw6);
                    i2++;
                    z = false;
                }
                return true;
            }

            private boolean s(mt mtVar, xU xUVar) {
                mt.i iVarOL;
                String strA0;
                iVarOL = mtVar.OL();
                strA0 = iVarOL.A0();
                strA0.hashCode();
                switch (strA0) {
                    case "frameset":
                        xUVar.uS(this);
                        ArrayList<Iw> arrayListOH = xUVar.oH();
                        if (arrayListOH.size() == 1 || ((arrayListOH.size() > 2 && !arrayListOH.get(1).m().equals("body")) || !xUVar.eD())) {
                            return false;
                        }
                        Iw iw = arrayListOH.get(1);
                        if (iw.G() != null) {
                            iw.hd();
                        }
                        while (arrayListOH.size() > 1) {
                            arrayListOH.remove(arrayListOH.size() - 1);
                        }
                        xUVar.y(iVarOL);
                        xUVar.T(oL.c);
                        return true;
                    case "button":
                        if (xUVar.A0("button")) {
                            xUVar.uS(this);
                            xUVar.tT("button");
                            xUVar.l(iVarOL);
                            return true;
                        }
                        xUVar.Nb();
                        xUVar.y(iVarOL);
                        xUVar.c(false);
                        return true;
                    case "iframe":
                        xUVar.c(false);
                        oL.l(iVarOL, xUVar);
                        return true;
                    case "option":
                    case "optgroup":
                        if (xUVar.l8().m().equals("option")) {
                            xUVar.tT("option");
                        }
                        xUVar.Nb();
                        xUVar.y(iVarOL);
                        return true;
                    case "textarea":
                        xUVar.y(iVarOL);
                        if (!iVarOL.bc()) {
                            xUVar.T4.C(m.T4);
                            xUVar.Jb();
                            xUVar.c(false);
                            xUVar.T(oL.N);
                        }
                        return true;
                    case "select":
                        xUVar.Nb();
                        xUVar.y(iVarOL);
                        xUVar.c(false);
                        oL oLVarYr = xUVar.Yr();
                        if (oLVarYr.equals(oL.HM) || oLVarYr.equals(oL.v) || oLVarYr.equals(oL.cD) || oLVarYr.equals(oL.s) || oLVarYr.equals(oL.hR)) {
                            xUVar.T(oL.E9);
                        } else {
                            xUVar.T(oL.Kf);
                        }
                        return true;
                    case "a":
                        if (xUVar.C("a") != null) {
                            xUVar.uS(this);
                            xUVar.tT("a");
                            Iw iwBc = xUVar.bc("a");
                            if (iwBc != null) {
                                xUVar.DX(iwBc);
                                xUVar.LD(iwBc);
                            }
                        }
                        xUVar.Nb();
                        xUVar.Kw(xUVar.y(iVarOL));
                        return true;
                    case "dd":
                    case "dt":
                        xUVar.c(false);
                        ArrayList<Iw> arrayListOH2 = xUVar.oH();
                        int size = arrayListOH2.size() - 1;
                        while (true) {
                            if (size > 0) {
                                Iw iw2 = arrayListOH2.get(size);
                                if (tv.b(iw2.m(), n.v)) {
                                    xUVar.tT(iw2.m());
                                } else if (!xUVar.r0(iw2) || tv.b(iw2.m(), n.n)) {
                                    size--;
                                }
                            }
                        }
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.y(iVarOL);
                        return true;
                    case "h1":
                    case "h2":
                    case "h3":
                    case "h4":
                    case "h5":
                    case "h6":
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        if (tv.b(xUVar.l8().m(), n.HM)) {
                            xUVar.uS(this);
                            xUVar.OT();
                        }
                        xUVar.y(iVarOL);
                        return true;
                    case "hr":
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.DL(iVarOL);
                        xUVar.c(false);
                        return true;
                    case "li":
                        xUVar.c(false);
                        ArrayList<Iw> arrayListOH3 = xUVar.oH();
                        int size2 = arrayListOH3.size() - 1;
                        while (true) {
                            if (size2 > 0) {
                                Iw iw3 = arrayListOH3.get(size2);
                                if (iw3.m().equals("li")) {
                                    xUVar.tT("li");
                                } else if (!xUVar.r0(iw3) || tv.b(iw3.m(), n.n)) {
                                    size2--;
                                }
                            }
                        }
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.y(iVarOL);
                        return true;
                    case "rp":
                    case "rt":
                        if (xUVar.d("ruby")) {
                            xUVar.Q();
                            if (!xUVar.l8().m().equals("ruby")) {
                                xUVar.uS(this);
                                xUVar.vi("ruby");
                            }
                            xUVar.y(iVarOL);
                        }
                        return true;
                    case "pre":
                    case "listing":
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.y(iVarOL);
                        xUVar.S.OY("\n");
                        xUVar.c(false);
                        return true;
                    case "svg":
                        xUVar.Nb();
                        xUVar.y(iVarOL);
                        return true;
                    case "xmp":
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.Nb();
                        xUVar.c(false);
                        oL.l(iVarOL, xUVar);
                        return true;
                    case "body":
                        xUVar.uS(this);
                        ArrayList<Iw> arrayListOH4 = xUVar.oH();
                        if (arrayListOH4.size() == 1 || (arrayListOH4.size() > 2 && !arrayListOH4.get(1).m().equals("body"))) {
                            return false;
                        }
                        xUVar.c(false);
                        Iw iw4 = arrayListOH4.get(1);
                        if (iVarOL.R()) {
                            for (in inVar : iVarOL.n) {
                                if (!iw4.Kf(inVar.getKey())) {
                                    iw4.OL().C(inVar);
                                }
                            }
                        }
                        return true;
                    case "form":
                        if (xUVar.R() != null) {
                            xUVar.uS(this);
                            return false;
                        }
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.f(iVarOL, true);
                        return true;
                    case "html":
                        xUVar.uS(this);
                        Iw iw5 = xUVar.oH().get(0);
                        if (iVarOL.R()) {
                            for (in inVar2 : iVarOL.n) {
                                if (!iw5.Kf(inVar2.getKey())) {
                                    iw5.OL().C(inVar2);
                                }
                            }
                        }
                        return true;
                    case "math":
                        xUVar.Nb();
                        xUVar.y(iVarOL);
                        return true;
                    case "nobr":
                        xUVar.Nb();
                        if (xUVar.d("nobr")) {
                            xUVar.uS(this);
                            xUVar.tT("nobr");
                            xUVar.Nb();
                        }
                        xUVar.Kw(xUVar.y(iVarOL));
                        return true;
                    case "span":
                        xUVar.Nb();
                        xUVar.y(iVarOL);
                        return true;
                    case "image":
                        if (xUVar.bc("svg") == null) {
                            return xUVar.l(iVarOL.rD("img"));
                        }
                        xUVar.y(iVarOL);
                        return true;
                    case "input":
                        xUVar.Nb();
                        if (!xUVar.DL(iVarOL).T4("type").equalsIgnoreCase("hidden")) {
                            xUVar.c(false);
                        }
                        return true;
                    case "table":
                        if (xUVar.r1().Qy() != g9.ut.quirks && xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.y(iVarOL);
                        xUVar.c(false);
                        xUVar.T(oL.HM);
                        return true;
                    case "plaintext":
                        if (xUVar.A0("p")) {
                            xUVar.tT("p");
                        }
                        xUVar.y(iVarOL);
                        xUVar.T4.C(m.tT);
                        return true;
                    case "isindex":
                        xUVar.uS(this);
                        if (xUVar.R() != null) {
                            return false;
                        }
                        xUVar.N("form");
                        if (iVarOL.r1("action")) {
                            xUVar.R().B("action", iVarOL.n.v("action"));
                        }
                        xUVar.N("hr");
                        xUVar.N("label");
                        xUVar.l(new mt.Y().Kf(iVarOL.r1("prompt") ? iVarOL.n.v("prompt") : "This is a searchable index. Enter search keywords: "));
                        Rz rz = new Rz();
                        if (iVarOL.R()) {
                            for (in inVar3 : iVarOL.n) {
                                if (!tv.b(inVar3.getKey(), n.Kf)) {
                                    rz.C(inVar3);
                                }
                            }
                        }
                        rz.W("name", "isindex");
                        xUVar.HM("input", rz);
                        xUVar.tT("label");
                        xUVar.N("hr");
                        xUVar.tT("form");
                        return true;
                    case "noembed":
                        oL.l(iVarOL, xUVar);
                        return true;
                    default:
                        if (tv.b(strA0, n.s)) {
                            xUVar.Nb();
                            xUVar.DL(iVarOL);
                            xUVar.c(false);
                        } else if (tv.b(strA0, n.N)) {
                            if (xUVar.A0("p")) {
                                xUVar.tT("p");
                            }
                            xUVar.y(iVarOL);
                        } else {
                            if (tv.b(strA0, n.tT)) {
                                return xUVar.b6(mtVar, oL.b);
                            }
                            if (tv.b(strA0, n.A)) {
                                xUVar.Nb();
                                xUVar.Kw(xUVar.y(iVarOL));
                            } else if (tv.b(strA0, n.cD)) {
                                xUVar.Nb();
                                xUVar.y(iVarOL);
                                xUVar.FG();
                                xUVar.c(false);
                            } else {
                                if (!tv.b(strA0, n.hR)) {
                                    if (tv.b(strA0, n.E9)) {
                                        xUVar.uS(this);
                                        return false;
                                    }
                                    xUVar.Nb();
                                    xUVar.y(iVarOL);
                                    return true;
                                }
                                xUVar.DL(iVarOL);
                            }
                        }
                        return true;
                }
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                int i2 = k.l8[mtVar.l8.ordinal()];
                if (i2 == 1) {
                    xUVar.Lw(mtVar.S());
                } else {
                    if (i2 == 2) {
                        xUVar.uS(this);
                        return false;
                    }
                    if (i2 == 3) {
                        return s(mtVar, xUVar);
                    }
                    if (i2 == 4) {
                        return A(mtVar, xUVar);
                    }
                    if (i2 == 5) {
                        mt.Y yL8 = mtVar.l8();
                        if (yL8.E9().equals(oL.OY)) {
                            xUVar.uS(this);
                            return false;
                        }
                        if (xUVar.eD() && oL.HM(yL8)) {
                            xUVar.Nb();
                            xUVar.M(yL8);
                        } else {
                            xUVar.Nb();
                            xUVar.M(yL8);
                            xUVar.c(false);
                        }
                    }
                }
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            boolean v(com.github.catvod.spider.merge.mt r6, com.github.catvod.spider.merge.xU r7) {
                /*
                    r5 = this;
                    com.github.catvod.spider.merge.mt$XT r6 = r6.b()
                    java.lang.String r6 = r6.T4
                    java.util.ArrayList r0 = r7.oH()
                    int r1 = r0.size()
                    r2 = 1
                    int r1 = r1 - r2
                L10:
                    if (r1 < 0) goto L48
                    java.lang.Object r3 = r0.get(r1)
                    com.github.catvod.spider.merge.Iw r3 = (com.github.catvod.spider.merge.Iw) r3
                    java.lang.String r4 = r3.m()
                    boolean r4 = r4.equals(r6)
                    if (r4 == 0) goto L3a
                    r7.W(r6)
                    com.github.catvod.spider.merge.Iw r0 = r7.l8()
                    java.lang.String r0 = r0.m()
                    boolean r0 = r6.equals(r0)
                    if (r0 != 0) goto L36
                    r7.uS(r5)
                L36:
                    r7.e(r6)
                    goto L48
                L3a:
                    boolean r3 = r7.r0(r3)
                    if (r3 == 0) goto L45
                    r7.uS(r5)
                    r6 = 0
                    return r6
                L45:
                    int r1 = r1 + (-1)
                    goto L10
                L48:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.oL.VT.v(com.github.catvod.spider.merge.mt, com.github.catvod.spider.merge.xU):boolean");
            }
        };
        tT = oLVar6;
        oL oLVar7 = new oL("Text", 7) { // from class: com.github.catvod.spider.merge.oL.dY
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.tT()) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                if (mtVar.n()) {
                    xUVar.uS(this);
                    xUVar.OT();
                    xUVar.T(xUVar.n6());
                    return xUVar.l(mtVar);
                }
                if (!mtVar.v()) {
                    return true;
                }
                xUVar.OT();
                xUVar.T(xUVar.n6());
                return true;
            }
        };
        N = oLVar7;
        oL oLVar8 = new oL("InTable", 8) { // from class: com.github.catvod.spider.merge.oL.F
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.tT()) {
                    xUVar.Xc();
                    xUVar.Jb();
                    xUVar.T(oL.n);
                    return xUVar.l(mtVar);
                }
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (mtVar.HM()) {
                    xUVar.uS(this);
                    return false;
                }
                if (!mtVar.A()) {
                    if (!mtVar.v()) {
                        if (!mtVar.n()) {
                            return v(mtVar, xUVar);
                        }
                        if (xUVar.l8().m().equals("html")) {
                            xUVar.uS(this);
                        }
                        return true;
                    }
                    String strA0 = mtVar.b().A0();
                    if (!strA0.equals("table")) {
                        if (!tv.b(strA0, n.G)) {
                            return v(mtVar, xUVar);
                        }
                        xUVar.uS(this);
                        return false;
                    }
                    if (!xUVar.mF(strA0)) {
                        xUVar.uS(this);
                        return false;
                    }
                    xUVar.e("table");
                    xUVar.GO();
                    return true;
                }
                mt.i iVarOL = mtVar.OL();
                String strA02 = iVarOL.A0();
                if (strA02.equals("caption")) {
                    xUVar.Kf();
                    xUVar.FG();
                    xUVar.y(iVarOL);
                    xUVar.T(oL.v);
                } else if (strA02.equals("colgroup")) {
                    xUVar.Kf();
                    xUVar.y(iVarOL);
                    xUVar.T(oL.A);
                } else {
                    if (strA02.equals("col")) {
                        xUVar.N("colgroup");
                        return xUVar.l(mtVar);
                    }
                    if (tv.b(strA02, n.Q)) {
                        xUVar.Kf();
                        xUVar.y(iVarOL);
                        xUVar.T(oL.cD);
                    } else {
                        if (tv.b(strA02, n.W)) {
                            xUVar.N("tbody");
                            return xUVar.l(mtVar);
                        }
                        if (strA02.equals("table")) {
                            xUVar.uS(this);
                            if (xUVar.tT("table")) {
                                return xUVar.l(mtVar);
                            }
                        } else {
                            if (tv.b(strA02, n.C)) {
                                return xUVar.b6(mtVar, oL.b);
                            }
                            if (strA02.equals("input")) {
                                if (!iVarOL.R() || !iVarOL.n.v("type").equalsIgnoreCase("hidden")) {
                                    return v(mtVar, xUVar);
                                }
                                xUVar.DL(iVarOL);
                            } else {
                                if (!strA02.equals("form")) {
                                    return v(mtVar, xUVar);
                                }
                                xUVar.uS(this);
                                if (xUVar.R() != null) {
                                    return false;
                                }
                                xUVar.f(iVarOL, false);
                            }
                        }
                    }
                }
                return true;
            }

            boolean v(mt mtVar, xU xUVar) {
                xUVar.uS(this);
                if (!tv.b(xUVar.l8().m(), n.rD)) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                xUVar.g(true);
                boolean zB6 = xUVar.b6(mtVar, oL.tT);
                xUVar.g(false);
                return zB6;
            }
        };
        HM = oLVar8;
        oL oLVar9 = new oL("InTableText", 9) { // from class: com.github.catvod.spider.merge.oL.aA
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.l8 == mt.Q.Character) {
                    mt.Y yL8 = mtVar.l8();
                    if (yL8.E9().equals(oL.OY)) {
                        xUVar.uS(this);
                        return false;
                    }
                    xUVar.rD().add(yL8.E9());
                    return true;
                }
                if (xUVar.rD().size() > 0) {
                    for (String str : xUVar.rD()) {
                        if (oL.N(str)) {
                            xUVar.M(new mt.Y().Kf(str));
                        } else {
                            xUVar.uS(this);
                            if (tv.b(xUVar.l8().m(), n.rD)) {
                                xUVar.g(true);
                                xUVar.b6(new mt.Y().Kf(str), oL.tT);
                                xUVar.g(false);
                            } else {
                                xUVar.b6(new mt.Y().Kf(str), oL.tT);
                            }
                        }
                    }
                    xUVar.Xc();
                }
                xUVar.T(xUVar.n6());
                return xUVar.l(mtVar);
            }
        };
        n = oLVar9;
        oL oLVar10 = new oL("InCaption", 10) { // from class: com.github.catvod.spider.merge.oL.ut
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.v() && mtVar.b().A0().equals("caption")) {
                    if (!xUVar.mF(mtVar.b().A0())) {
                        xUVar.uS(this);
                        return false;
                    }
                    xUVar.Q();
                    if (!xUVar.l8().m().equals("caption")) {
                        xUVar.uS(this);
                    }
                    xUVar.e("caption");
                    xUVar.cD();
                    xUVar.T(oL.HM);
                    return true;
                }
                if ((mtVar.A() && tv.b(mtVar.OL().A0(), n.bc)) || (mtVar.v() && mtVar.b().A0().equals("table"))) {
                    xUVar.uS(this);
                    if (xUVar.tT("caption")) {
                        return xUVar.l(mtVar);
                    }
                    return true;
                }
                if (!mtVar.v() || !tv.b(mtVar.b().A0(), n.o)) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                xUVar.uS(this);
                return false;
            }
        };
        v = oLVar10;
        oL oLVar11 = new oL("InColumnGroup", 11) { // from class: com.github.catvod.spider.merge.oL.Y
            {
                a aVar2 = null;
            }

            private boolean v(mt mtVar, gx gxVar) {
                if (gxVar.tT("colgroup")) {
                    return gxVar.l(mtVar);
                }
                return true;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                int i2 = k.l8[mtVar.l8.ordinal()];
                if (i2 == 1) {
                    xUVar.Lw(mtVar.S());
                } else if (i2 == 2) {
                    xUVar.uS(this);
                } else if (i2 == 3) {
                    mt.i iVarOL = mtVar.OL();
                    String strA0 = iVarOL.A0();
                    strA0.hashCode();
                    if (!strA0.equals("col")) {
                        return !strA0.equals("html") ? v(mtVar, xUVar) : xUVar.b6(mtVar, oL.tT);
                    }
                    xUVar.DL(iVarOL);
                } else {
                    if (i2 != 4) {
                        if (i2 != 6) {
                            return v(mtVar, xUVar);
                        }
                        if (xUVar.l8().m().equals("html")) {
                            return true;
                        }
                        return v(mtVar, xUVar);
                    }
                    if (!mtVar.b().T4.equals("colgroup")) {
                        return v(mtVar, xUVar);
                    }
                    if (xUVar.l8().m().equals("html")) {
                        xUVar.uS(this);
                        return false;
                    }
                    xUVar.OT();
                    xUVar.T(oL.HM);
                }
                return true;
            }
        };
        A = oLVar11;
        oL oLVar12 = new oL("InTableBody", 12) { // from class: com.github.catvod.spider.merge.oL.c
            {
                a aVar2 = null;
            }

            private boolean A(mt mtVar, xU xUVar) {
                if (!xUVar.mF("tbody") && !xUVar.mF("thead") && !xUVar.d("tfoot")) {
                    xUVar.uS(this);
                    return false;
                }
                xUVar.hR();
                xUVar.tT(xUVar.l8().m());
                return xUVar.l(mtVar);
            }

            private boolean v(mt mtVar, xU xUVar) {
                return xUVar.b6(mtVar, oL.HM);
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                int i2 = k.l8[mtVar.l8.ordinal()];
                if (i2 == 3) {
                    mt.i iVarOL = mtVar.OL();
                    String strA0 = iVarOL.A0();
                    if (strA0.equals("template")) {
                        xUVar.y(iVarOL);
                        return true;
                    }
                    if (strA0.equals("tr")) {
                        xUVar.hR();
                        xUVar.y(iVarOL);
                        xUVar.T(oL.s);
                        return true;
                    }
                    if (!tv.b(strA0, n.OY)) {
                        return tv.b(strA0, n.oH) ? A(mtVar, xUVar) : v(mtVar, xUVar);
                    }
                    xUVar.uS(this);
                    xUVar.N("tr");
                    return xUVar.l(iVarOL);
                }
                if (i2 != 4) {
                    return v(mtVar, xUVar);
                }
                String strA02 = mtVar.b().A0();
                if (!tv.b(strA02, n.H6)) {
                    if (strA02.equals("table")) {
                        return A(mtVar, xUVar);
                    }
                    if (!tv.b(strA02, n.A0)) {
                        return v(mtVar, xUVar);
                    }
                    xUVar.uS(this);
                    return false;
                }
                if (!xUVar.mF(strA02)) {
                    xUVar.uS(this);
                    return false;
                }
                xUVar.hR();
                xUVar.OT();
                xUVar.T(oL.HM);
                return true;
            }
        };
        cD = oLVar12;
        oL oLVar13 = new oL("InRow", 13) { // from class: com.github.catvod.spider.merge.oL.xq
            {
                a aVar2 = null;
            }

            private boolean A(mt mtVar, gx gxVar) {
                if (gxVar.tT("tr")) {
                    return gxVar.l(mtVar);
                }
                return false;
            }

            private boolean v(mt mtVar, xU xUVar) {
                return xUVar.b6(mtVar, oL.HM);
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.A()) {
                    mt.i iVarOL = mtVar.OL();
                    String strA0 = iVarOL.A0();
                    if (strA0.equals("template")) {
                        xUVar.y(iVarOL);
                        return true;
                    }
                    if (!tv.b(strA0, n.OY)) {
                        return tv.b(strA0, n.hd) ? A(mtVar, xUVar) : v(mtVar, xUVar);
                    }
                    xUVar.E9();
                    xUVar.y(iVarOL);
                    xUVar.T(oL.hR);
                    xUVar.FG();
                    return true;
                }
                if (!mtVar.v()) {
                    return v(mtVar, xUVar);
                }
                String strA02 = mtVar.b().A0();
                if (strA02.equals("tr")) {
                    if (!xUVar.mF(strA02)) {
                        xUVar.uS(this);
                        return false;
                    }
                    xUVar.E9();
                    xUVar.OT();
                    xUVar.T(oL.cD);
                    return true;
                }
                if (strA02.equals("table")) {
                    return A(mtVar, xUVar);
                }
                if (!tv.b(strA02, n.Q)) {
                    if (!tv.b(strA02, n.d)) {
                        return v(mtVar, xUVar);
                    }
                    xUVar.uS(this);
                    return false;
                }
                if (!xUVar.mF(strA02) || !xUVar.mF("tr")) {
                    xUVar.uS(this);
                    return false;
                }
                xUVar.E9();
                xUVar.OT();
                xUVar.T(oL.cD);
                return true;
            }
        };
        s = oLVar13;
        oL oLVar14 = new oL("InCell", 14) { // from class: com.github.catvod.spider.merge.oL.OD
            {
                a aVar2 = null;
            }

            private void A(xU xUVar) {
                if (xUVar.mF("td")) {
                    xUVar.tT("td");
                } else {
                    xUVar.tT("th");
                }
            }

            private boolean v(mt mtVar, xU xUVar) {
                return xUVar.b6(mtVar, oL.tT);
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (!mtVar.v()) {
                    if (!mtVar.A() || !tv.b(mtVar.OL().A0(), n.bc)) {
                        return v(mtVar, xUVar);
                    }
                    if (xUVar.mF("td") || xUVar.mF("th")) {
                        A(xUVar);
                        return xUVar.l(mtVar);
                    }
                    xUVar.uS(this);
                    return false;
                }
                String strA0 = mtVar.b().A0();
                if (!tv.b(strA0, n.OY)) {
                    if (tv.b(strA0, n.r1)) {
                        xUVar.uS(this);
                        return false;
                    }
                    if (!tv.b(strA0, n.R)) {
                        return v(mtVar, xUVar);
                    }
                    if (xUVar.mF(strA0)) {
                        A(xUVar);
                        return xUVar.l(mtVar);
                    }
                    xUVar.uS(this);
                    return false;
                }
                if (!xUVar.mF(strA0)) {
                    xUVar.uS(this);
                    xUVar.T(oL.s);
                    return false;
                }
                xUVar.Q();
                if (!xUVar.l8().m().equals(strA0)) {
                    xUVar.uS(this);
                }
                xUVar.e(strA0);
                xUVar.cD();
                xUVar.T(oL.s);
                return true;
            }
        };
        hR = oLVar14;
        oL oLVar15 = new oL("InSelect", 15) { // from class: com.github.catvod.spider.merge.oL.XT
            {
                a aVar2 = null;
            }

            private boolean v(mt mtVar, xU xUVar) {
                xUVar.uS(this);
                return false;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                String strA0;
                switch (k.l8[mtVar.l8.ordinal()]) {
                    case 1:
                        xUVar.Lw(mtVar.S());
                        return true;
                    case 2:
                        xUVar.uS(this);
                        return false;
                    case 3:
                        mt.i iVarOL = mtVar.OL();
                        String strA02 = iVarOL.A0();
                        if (strA02.equals("html")) {
                            return xUVar.b6(iVarOL, oL.tT);
                        }
                        if (strA02.equals("option")) {
                            if (xUVar.l8().m().equals("option")) {
                                xUVar.tT("option");
                            }
                            xUVar.y(iVarOL);
                        } else {
                            if (!strA02.equals("optgroup")) {
                                if (strA02.equals("select")) {
                                    xUVar.uS(this);
                                    return xUVar.tT("select");
                                }
                                if (!tv.b(strA02, n.O)) {
                                    return strA02.equals("script") ? xUVar.b6(mtVar, oL.b) : v(mtVar, xUVar);
                                }
                                xUVar.uS(this);
                                if (!xUVar.H6("select")) {
                                    return false;
                                }
                                xUVar.tT("select");
                                return xUVar.l(iVarOL);
                            }
                            if (xUVar.l8().m().equals("option")) {
                                xUVar.tT("option");
                            }
                            if (xUVar.l8().m().equals("optgroup")) {
                                xUVar.tT("optgroup");
                            }
                            xUVar.y(iVarOL);
                        }
                        return true;
                    case 4:
                        strA0 = mtVar.b().A0();
                        strA0.hashCode();
                        switch (strA0) {
                            case "option":
                                if (xUVar.l8().m().equals("option")) {
                                    xUVar.OT();
                                } else {
                                    xUVar.uS(this);
                                }
                                return true;
                            case "select":
                                if (!xUVar.H6(strA0)) {
                                    xUVar.uS(this);
                                    return false;
                                }
                                xUVar.e(strA0);
                                xUVar.GO();
                                return true;
                            case "optgroup":
                                if (xUVar.l8().m().equals("option") && xUVar.v(xUVar.l8()) != null && xUVar.v(xUVar.l8()).m().equals("optgroup")) {
                                    xUVar.tT("option");
                                }
                                if (xUVar.l8().m().equals("optgroup")) {
                                    xUVar.OT();
                                } else {
                                    xUVar.uS(this);
                                }
                                return true;
                            default:
                                return v(mtVar, xUVar);
                        }
                    case 5:
                        mt.Y yL8 = mtVar.l8();
                        if (yL8.E9().equals(oL.OY)) {
                            xUVar.uS(this);
                            return false;
                        }
                        xUVar.M(yL8);
                        return true;
                    case 6:
                        if (!xUVar.l8().m().equals("html")) {
                            xUVar.uS(this);
                        }
                        return true;
                    default:
                        return v(mtVar, xUVar);
                }
            }
        };
        Kf = oLVar15;
        oL oLVar16 = new oL("InSelectInTable", 16) { // from class: com.github.catvod.spider.merge.oL.i
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.A() && tv.b(mtVar.OL().A0(), n.Bz)) {
                    xUVar.uS(this);
                    xUVar.tT("select");
                    return xUVar.l(mtVar);
                }
                if (!mtVar.v() || !tv.b(mtVar.b().A0(), n.Bz)) {
                    return xUVar.b6(mtVar, oL.Kf);
                }
                xUVar.uS(this);
                if (!xUVar.mF(mtVar.b().A0())) {
                    return false;
                }
                xUVar.tT("select");
                return xUVar.l(mtVar);
            }
        };
        E9 = oLVar16;
        oL oLVar17 = new oL("AfterBody", 17) { // from class: com.github.catvod.spider.merge.oL.Ph
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (mtVar.HM()) {
                    xUVar.uS(this);
                    return false;
                }
                if (mtVar.A() && mtVar.OL().A0().equals("html")) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                if (mtVar.v() && mtVar.b().A0().equals("html")) {
                    if (xUVar.J()) {
                        xUVar.uS(this);
                        return false;
                    }
                    xUVar.T(oL.Q);
                    return true;
                }
                if (mtVar.n()) {
                    return true;
                }
                xUVar.uS(this);
                xUVar.T(oL.tT);
                return xUVar.l(mtVar);
            }
        };
        uS = oLVar17;
        oL oLVar18 = new oL("InFrameset", 18) { // from class: com.github.catvod.spider.merge.oL.Q
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                mt.i iVarOL;
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                } else if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                } else {
                    if (mtVar.HM()) {
                        xUVar.uS(this);
                        return false;
                    }
                    if (mtVar.A()) {
                        iVarOL = mtVar.OL();
                        String strA0 = iVarOL.A0();
                        strA0.hashCode();
                        switch (strA0) {
                            case "frameset":
                                xUVar.y(iVarOL);
                                break;
                            case "html":
                                return xUVar.b6(iVarOL, oL.tT);
                            case "frame":
                                xUVar.DL(iVarOL);
                                break;
                            case "noframes":
                                return xUVar.b6(iVarOL, oL.b);
                            default:
                                xUVar.uS(this);
                                return false;
                        }
                    } else if (mtVar.v() && mtVar.b().A0().equals("frameset")) {
                        if (xUVar.l8().m().equals("html")) {
                            xUVar.uS(this);
                            return false;
                        }
                        xUVar.OT();
                        if (!xUVar.J() && !xUVar.l8().m().equals("frameset")) {
                            xUVar.T(oL.eD);
                        }
                    } else {
                        if (!mtVar.n()) {
                            xUVar.uS(this);
                            return false;
                        }
                        if (!xUVar.l8().m().equals("html")) {
                            xUVar.uS(this);
                        }
                    }
                }
                return true;
            }
        };
        c = oLVar18;
        oL oLVar19 = new oL("AfterFrameset", 19) { // from class: com.github.catvod.spider.merge.oL.b
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (oL.HM(mtVar)) {
                    xUVar.M(mtVar.l8());
                    return true;
                }
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (mtVar.HM()) {
                    xUVar.uS(this);
                    return false;
                }
                if (mtVar.A() && mtVar.OL().A0().equals("html")) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                if (mtVar.v() && mtVar.b().A0().equals("html")) {
                    xUVar.T(oL.W);
                    return true;
                }
                if (mtVar.A() && mtVar.OL().A0().equals("noframes")) {
                    return xUVar.b6(mtVar, oL.b);
                }
                if (mtVar.n()) {
                    return true;
                }
                xUVar.uS(this);
                return false;
            }
        };
        eD = oLVar19;
        oL oLVar20 = new oL("AfterAfterBody", 20) { // from class: com.github.catvod.spider.merge.oL.cI
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (mtVar.HM() || (mtVar.A() && mtVar.OL().A0().equals("html"))) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                if (oL.HM(mtVar)) {
                    Iw iwE = xUVar.e("html");
                    xUVar.M(mtVar.l8());
                    xUVar.OL.add(iwE);
                    xUVar.OL.add(iwE.pu("body"));
                    return true;
                }
                if (mtVar.n()) {
                    return true;
                }
                xUVar.uS(this);
                xUVar.T(oL.tT);
                return xUVar.l(mtVar);
            }
        };
        Q = oLVar20;
        oL oLVar21 = new oL("AfterAfterFrameset", 21) { // from class: com.github.catvod.spider.merge.oL.U
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                if (mtVar.N()) {
                    xUVar.Lw(mtVar.S());
                    return true;
                }
                if (mtVar.HM() || oL.HM(mtVar) || (mtVar.A() && mtVar.OL().A0().equals("html"))) {
                    return xUVar.b6(mtVar, oL.tT);
                }
                if (mtVar.n()) {
                    return true;
                }
                if (mtVar.A() && mtVar.OL().A0().equals("noframes")) {
                    return xUVar.b6(mtVar, oL.b);
                }
                xUVar.uS(this);
                return false;
            }
        };
        W = oLVar21;
        oL oLVar22 = new oL("ForeignContent", 22) { // from class: com.github.catvod.spider.merge.oL.r
            {
                a aVar2 = null;
            }

            @Override // com.github.catvod.spider.merge.oL
            boolean n(mt mtVar, xU xUVar) {
                return true;
            }
        };
        C = oLVar22;
        r1 = new oL[]{aVar, oLVar, oLVar2, oLVar3, oLVar4, oLVar5, oLVar6, oLVar7, oLVar8, oLVar9, oLVar10, oLVar11, oLVar12, oLVar13, oLVar14, oLVar15, oLVar16, oLVar17, oLVar18, oLVar19, oLVar20, oLVar21, oLVar22};
        OY = String.valueOf((char) 0);
    }

    private oL(String str, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean HM(mt mtVar) {
        if (mtVar.tT()) {
            return tv.l(mtVar.l8().E9());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(String str) {
        return tv.l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(mt.i iVar, xU xUVar) {
        xUVar.T4.C(m.OL);
        xUVar.Jb();
        xUVar.T(N);
        xUVar.y(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tT(mt.i iVar, xU xUVar) {
        xUVar.T4.C(m.T4);
        xUVar.Jb();
        xUVar.T(N);
        xUVar.y(iVar);
    }

    abstract boolean n(mt mtVar, xU xUVar);

    /* synthetic */ oL(String str, int i2, a aVar) {
        this(str, i2);
    }
}
