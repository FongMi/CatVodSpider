package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0108Zo;
import com.github.catvod.spider.merge.C0082OO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.github.catvod.spider.merge.Gi */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
abstract class EnumC0064Gi {

    /* renamed from: B */
    public static final EnumC0064Gi f358B;

    /* renamed from: BP */
    private static final String f359BP;

    /* renamed from: E */
    public static final EnumC0064Gi f360E;

    /* renamed from: F */
    public static final EnumC0064Gi f361F;

    /* renamed from: FN */
    public static final EnumC0064Gi f362FN;

    /* renamed from: IS */
    public static final EnumC0064Gi f363IS;

    /* renamed from: KT */
    public static final EnumC0064Gi f364KT;

    /* renamed from: MH */
    public static final EnumC0064Gi f365MH;

    /* renamed from: Mo */
    public static final EnumC0064Gi f366Mo;

    /* renamed from: QU */
    public static final EnumC0064Gi f367QU;

    /* renamed from: RH */
    public static final EnumC0064Gi f368RH;

    /* renamed from: Tz */
    public static final EnumC0064Gi f369Tz;

    /* renamed from: UJ */
    public static final EnumC0064Gi f370UJ;

    /* renamed from: W */
    public static final EnumC0064Gi f371W;

    /* renamed from: go */
    public static final EnumC0064Gi f372go;

    /* renamed from: i */
    public static final EnumC0064Gi f373i;

    /* renamed from: k */
    public static final EnumC0064Gi f374k;

    /* renamed from: l */
    public static final EnumC0064Gi f375l;

    /* renamed from: p */
    public static final EnumC0064Gi f376p;

    /* renamed from: q */
    public static final EnumC0064Gi f377q;

    /* renamed from: se */
    public static final EnumC0064Gi f378se;

    /* renamed from: u */
    public static final EnumC0064Gi f379u;

    /* renamed from: w8 */
    public static final EnumC0064Gi f380w8;

    /* renamed from: xC */
    public static final EnumC0064Gi f381xC;

    /* renamed from: yS */
    private static final /* synthetic */ EnumC0064Gi[] f382yS;

    /* renamed from: com.github.catvod.spider.merge.Gi$N */
    class N extends EnumC0064Gi {
        N(String str, int i) {
            super(str, i, null);
        }

        @Override // com.github.catvod.spider.merge.EnumC0064Gi
        /* renamed from: W */
        boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
            if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                return true;
            }
            if (abstractC0108Zo.m507MH()) {
                c0084Ot.m390mT(abstractC0108Zo.m518xC());
            } else {
                if (!abstractC0108Zo.m515se()) {
                    c0084Ot.m381fi(EnumC0064Gi.f381xC);
                    return c0084Ot.mo359Mo(abstractC0108Zo);
                }
                AbstractC0108Zo.Qt qtM509QU = abstractC0108Zo.m509QU();
                C0056BN c0056bn = new C0056BN(c0084Ot.f714MH.m230QU(qtM509QU.m528KT()), qtM509QU.m529Tz(), qtM509QU.m527IS());
                c0056bn.m125Oz(qtM509QU.m530k());
                c0084Ot.m411yS().m658id(c0056bn);
                if (qtM509QU.m526E()) {
                    c0084Ot.m411yS().m319xv(C0082OO.Qe.quirks);
                }
                c0084Ot.m381fi(EnumC0064Gi.f381xC);
            }
            return true;
        }
    }

    /* renamed from: com.github.catvod.spider.merge.Gi$l */
    static final class l {

        /* renamed from: q */
        static final String[] f413q = {"base", "basefont", "bgsound", "command", "link"};

        /* renamed from: xC */
        static final String[] f419xC = {"noframes", "style"};

        /* renamed from: QU */
        static final String[] f395QU = {"body", "br", "html"};

        /* renamed from: UJ */
        static final String[] f400UJ = {"body", "html"};

        /* renamed from: u */
        static final String[] f417u = {"body", "br", "head", "html"};

        /* renamed from: Mo */
        static final String[] f393Mo = {"basefont", "bgsound", "link", "meta", "noframes", "style"};

        /* renamed from: i */
        static final String[] f407i = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};

        /* renamed from: MH */
        static final String[] f392MH = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};

        /* renamed from: se */
        static final String[] f416se = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* renamed from: W */
        static final String[] f402W = {"address", "div", "p"};

        /* renamed from: FN */
        static final String[] f387FN = {"dd", "dt"};

        /* renamed from: B */
        static final String[] f383B = {"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};

        /* renamed from: w8 */
        static final String[] f418w8 = {"applet", "marquee", "object"};

        /* renamed from: F */
        static final String[] f386F = {"area", "br", "embed", "img", "keygen", "wbr"};

        /* renamed from: RH */
        static final String[] f396RH = {"param", "source", "track"};

        /* renamed from: KT */
        static final String[] f390KT = {"action", "name", "prompt"};

        /* renamed from: k */
        static final String[] f408k = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: Tz */
        static final String[] f398Tz = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};

        /* renamed from: IS */
        static final String[] f389IS = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* renamed from: E */
        static final String[] f385E = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: p */
        static final String[] f411p = {"tbody", "tfoot", "thead"};

        /* renamed from: go */
        static final String[] f406go = {"td", "th", "tr"};

        /* renamed from: l */
        static final String[] f409l = {"script", "style"};

        /* renamed from: BP */
        static final String[] f384BP = {"td", "th"};

        /* renamed from: yS */
        static final String[] f420yS = {"body", "caption", "col", "colgroup", "html"};

        /* renamed from: UN */
        static final String[] f401UN = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: Fp */
        static final String[] f388Fp = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: pb */
        static final String[] f412pb = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: P */
        static final String[] f394P = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: Xl */
        static final String[] f403Xl = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* renamed from: fH */
        static final String[] f405fH = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* renamed from: d */
        static final String[] f404d = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: U */
        static final String[] f399U = {"body", "caption", "col", "colgroup", "html", "td", "th"};

        /* renamed from: m */
        static final String[] f410m = {"input", "keygen", "textarea"};

        /* renamed from: T */
        static final String[] f397T = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: s */
        static final String[] f415s = {"tbody", "tfoot", "thead"};

        /* renamed from: rF */
        static final String[] f414rF = {"head", "noscript"};

        /* renamed from: M */
        static final String[] f391M = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }

    /* renamed from: com.github.catvod.spider.merge.Gi$tY */
    static /* synthetic */ class tY {

        /* renamed from: q */
        static final /* synthetic */ int[] f421q;

        static {
            int[] iArr = new int[AbstractC0108Zo.O.values().length];
            f421q = iArr;
            try {
                iArr[AbstractC0108Zo.O.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421q[AbstractC0108Zo.O.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421q[AbstractC0108Zo.O.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421q[AbstractC0108Zo.O.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421q[AbstractC0108Zo.O.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421q[AbstractC0108Zo.O.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        N n = new N("Initial", 0);
        f377q = n;
        EnumC0064Gi enumC0064Gi = new EnumC0064Gi("BeforeHtml", 1) { // from class: com.github.catvod.spider.merge.Gi.Y
            {
                N n2 = null;
            }

            /* renamed from: FN */
            private boolean m216FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                c0084Ot.m353I("html");
                c0084Ot.m381fi(EnumC0064Gi.f367QU);
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m515se()) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("html")) {
                    c0084Ot.m402t(abstractC0108Zo.m516u());
                    c0084Ot.m381fi(EnumC0064Gi.f367QU);
                    return true;
                }
                if (abstractC0108Zo.m506FN() && C0157x3.m772UJ(abstractC0108Zo.m511UJ().m544fH(), l.f417u)) {
                    return m216FN(abstractC0108Zo, c0084Ot);
                }
                if (!abstractC0108Zo.m506FN()) {
                    return m216FN(abstractC0108Zo, c0084Ot);
                }
                c0084Ot.m365Tz(this);
                return false;
            }
        };
        f381xC = enumC0064Gi;
        EnumC0064Gi enumC0064Gi2 = new EnumC0064Gi("BeforeHead", 2) { // from class: com.github.catvod.spider.merge.Gi.LA
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (abstractC0108Zo.m515se()) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("html")) {
                    return EnumC0064Gi.f373i.mo207W(abstractC0108Zo, c0084Ot);
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("head")) {
                    c0084Ot.m413zw(c0084Ot.m402t(abstractC0108Zo.m516u()));
                    c0084Ot.m381fi(EnumC0064Gi.f370UJ);
                    return true;
                }
                if (abstractC0108Zo.m506FN() && C0157x3.m772UJ(abstractC0108Zo.m511UJ().m544fH(), l.f417u)) {
                    c0084Ot.m672MH("head");
                    return c0084Ot.mo359Mo(abstractC0108Zo);
                }
                if (abstractC0108Zo.m506FN()) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                c0084Ot.m672MH("head");
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }
        };
        f367QU = enumC0064Gi2;
        EnumC0064Gi enumC0064Gi3 = new EnumC0064Gi("InHead", 3) { // from class: com.github.catvod.spider.merge.Gi.Ux
            {
                N n2 = null;
            }

            /* renamed from: FN */
            private boolean m214FN(AbstractC0108Zo abstractC0108Zo, AbstractC0128lc abstractC0128lc) {
                abstractC0128lc.m675i("head");
                return abstractC0128lc.mo359Mo(abstractC0108Zo);
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                int i = tY.f421q[abstractC0108Zo.f572q.ordinal()];
                if (i == 1) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                } else {
                    if (i == 2) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    if (i == 3) {
                        AbstractC0108Zo.Vm vmM516u = abstractC0108Zo.m516u();
                        String strM544fH = vmM516u.m544fH();
                        if (strM544fH.equals("html")) {
                            return EnumC0064Gi.f373i.mo207W(abstractC0108Zo, c0084Ot);
                        }
                        if (C0157x3.m772UJ(strM544fH, l.f413q)) {
                            C0127lK c0127lKM369V = c0084Ot.m369V(vmM516u);
                            if (strM544fH.equals("base") && c0127lKM369V.m261KT("href")) {
                                c0084Ot.m378el(c0127lKM369V);
                            }
                        } else if (strM544fH.equals("meta")) {
                            c0084Ot.m369V(vmM516u);
                        } else if (strM544fH.equals("title")) {
                            EnumC0064Gi.m202i(vmM516u, c0084Ot);
                        } else if (C0157x3.m772UJ(strM544fH, l.f419xC)) {
                            EnumC0064Gi.m199Mo(vmM516u, c0084Ot);
                        } else if (strM544fH.equals("noscript")) {
                            c0084Ot.m402t(vmM516u);
                            c0084Ot.m381fi(EnumC0064Gi.f379u);
                        } else {
                            if (!strM544fH.equals("script")) {
                                if (!strM544fH.equals("head")) {
                                    return m214FN(abstractC0108Zo, c0084Ot);
                                }
                                c0084Ot.m365Tz(this);
                                return false;
                            }
                            c0084Ot.f716QU.m149l(EnumC0115dT.f621Mo);
                            c0084Ot.m407wt();
                            c0084Ot.m381fi(EnumC0064Gi.f365MH);
                            c0084Ot.m402t(vmM516u);
                        }
                    } else {
                        if (i != 4) {
                            return m214FN(abstractC0108Zo, c0084Ot);
                        }
                        String strM544fH2 = abstractC0108Zo.m511UJ().m544fH();
                        if (!strM544fH2.equals("head")) {
                            if (C0157x3.m772UJ(strM544fH2, l.f395QU)) {
                                return m214FN(abstractC0108Zo, c0084Ot);
                            }
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        c0084Ot.m391mu();
                        c0084Ot.m381fi(EnumC0064Gi.f366Mo);
                    }
                }
                return true;
            }
        };
        f370UJ = enumC0064Gi3;
        EnumC0064Gi enumC0064Gi4 = new EnumC0064Gi("InHeadNoscript", 4) { // from class: com.github.catvod.spider.merge.Gi.Dl
            {
                N n2 = null;
            }

            /* renamed from: FN */
            private boolean m208FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                c0084Ot.m365Tz(this);
                c0084Ot.m375c(new AbstractC0108Zo.J().m523KT(abstractC0108Zo.toString()));
                return true;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m515se()) {
                    c0084Ot.m365Tz(this);
                    return true;
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("html")) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                if (abstractC0108Zo.m506FN() && abstractC0108Zo.m511UJ().m544fH().equals("noscript")) {
                    c0084Ot.m391mu();
                    c0084Ot.m381fi(EnumC0064Gi.f370UJ);
                    return true;
                }
                if (EnumC0064Gi.m204se(abstractC0108Zo) || abstractC0108Zo.m507MH() || (abstractC0108Zo.m505B() && C0157x3.m772UJ(abstractC0108Zo.m516u().m544fH(), l.f393Mo))) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f370UJ);
                }
                if (abstractC0108Zo.m506FN() && abstractC0108Zo.m511UJ().m544fH().equals("br")) {
                    return m208FN(abstractC0108Zo, c0084Ot);
                }
                if ((!abstractC0108Zo.m505B() || !C0157x3.m772UJ(abstractC0108Zo.m516u().m544fH(), l.f414rF)) && !abstractC0108Zo.m506FN()) {
                    return m208FN(abstractC0108Zo, c0084Ot);
                }
                c0084Ot.m365Tz(this);
                return false;
            }
        };
        f379u = enumC0064Gi4;
        EnumC0064Gi enumC0064Gi5 = new EnumC0064Gi("AfterHead", 5) { // from class: com.github.catvod.spider.merge.Gi.V
            {
                N n2 = null;
            }

            /* renamed from: FN */
            private boolean m215FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                c0084Ot.m672MH("body");
                c0084Ot.m354IS(true);
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (abstractC0108Zo.m515se()) {
                    c0084Ot.m365Tz(this);
                    return true;
                }
                if (!abstractC0108Zo.m505B()) {
                    if (!abstractC0108Zo.m506FN()) {
                        m215FN(abstractC0108Zo, c0084Ot);
                        return true;
                    }
                    if (C0157x3.m772UJ(abstractC0108Zo.m511UJ().m544fH(), l.f400UJ)) {
                        m215FN(abstractC0108Zo, c0084Ot);
                        return true;
                    }
                    c0084Ot.m365Tz(this);
                    return false;
                }
                AbstractC0108Zo.Vm vmM516u = abstractC0108Zo.m516u();
                String strM544fH = vmM516u.m544fH();
                if (strM544fH.equals("html")) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                if (strM544fH.equals("body")) {
                    c0084Ot.m402t(vmM516u);
                    c0084Ot.m354IS(false);
                    c0084Ot.m381fi(EnumC0064Gi.f373i);
                    return true;
                }
                if (strM544fH.equals("frameset")) {
                    c0084Ot.m402t(vmM516u);
                    c0084Ot.m381fi(EnumC0064Gi.f363IS);
                    return true;
                }
                if (!C0157x3.m772UJ(strM544fH, l.f407i)) {
                    if (strM544fH.equals("head")) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    m215FN(abstractC0108Zo, c0084Ot);
                    return true;
                }
                c0084Ot.m365Tz(this);
                C0127lK c0127lKM397pb = c0084Ot.m397pb();
                c0084Ot.m404v(c0127lKM397pb);
                c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f370UJ);
                c0084Ot.m374b(c0127lKM397pb);
                return true;
            }
        };
        f366Mo = enumC0064Gi5;
        EnumC0064Gi enumC0064Gi6 = new EnumC0064Gi("InBody", 6) { // from class: com.github.catvod.spider.merge.Gi.lm
            {
                N n2 = null;
            }

            /* renamed from: B */
            private boolean m217B(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                AbstractC0108Zo.t7 t7VarM511UJ;
                String strM544fH;
                t7VarM511UJ = abstractC0108Zo.m511UJ();
                strM544fH = t7VarM511UJ.m544fH();
                strM544fH.hashCode();
                switch (strM544fH) {
                    case "p":
                        if (!c0084Ot.m380fH(strM544fH)) {
                            c0084Ot.m365Tz(this);
                            c0084Ot.m672MH(strM544fH);
                            return c0084Ot.mo359Mo(t7VarM511UJ);
                        }
                        c0084Ot.m382go(strM544fH);
                        if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                            c0084Ot.m365Tz(this);
                        }
                        c0084Ot.m408x(strM544fH);
                        return true;
                    case "br":
                        c0084Ot.m365Tz(this);
                        c0084Ot.m672MH("br");
                        return false;
                    case "dd":
                    case "dt":
                        if (!c0084Ot.m366U(strM544fH)) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        c0084Ot.m382go(strM544fH);
                        if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                            c0084Ot.m365Tz(this);
                        }
                        c0084Ot.m408x(strM544fH);
                        return true;
                    case "h1":
                    case "h2":
                    case "h3":
                    case "h4":
                    case "h5":
                    case "h6":
                        String[] strArr = l.f416se;
                        if (!c0084Ot.m364T(strArr)) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        c0084Ot.m382go(strM544fH);
                        if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                            c0084Ot.m365Tz(this);
                        }
                        c0084Ot.m342A(strArr);
                        return true;
                    case "li":
                        if (!c0084Ot.m377d(strM544fH)) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        c0084Ot.m382go(strM544fH);
                        if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                            c0084Ot.m365Tz(this);
                        }
                        c0084Ot.m408x(strM544fH);
                        return true;
                    case "body":
                        if (c0084Ot.m366U("body")) {
                            c0084Ot.m381fi(EnumC0064Gi.f369Tz);
                            return true;
                        }
                        c0084Ot.m365Tz(this);
                        return false;
                    case "form":
                        C0105Z c0105zM368UN = c0084Ot.m368UN();
                        c0084Ot.m356Kq(null);
                        if (c0105zM368UN == null || !c0084Ot.m366U(strM544fH)) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        c0084Ot.m394p();
                        if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                            c0084Ot.m365Tz(this);
                        }
                        c0084Ot.m374b(c0105zM368UN);
                        return true;
                    case "html":
                        if (c0084Ot.m675i("body")) {
                            return c0084Ot.mo359Mo(t7VarM511UJ);
                        }
                        return true;
                    case "span":
                    case "sarcasm":
                        return m220FN(abstractC0108Zo, c0084Ot);
                    default:
                        if (C0157x3.m772UJ(strM544fH, l.f389IS)) {
                            return m219w8(abstractC0108Zo, c0084Ot);
                        }
                        if (C0157x3.m772UJ(strM544fH, l.f398Tz)) {
                            if (!c0084Ot.m366U(strM544fH)) {
                                c0084Ot.m365Tz(this);
                                return false;
                            }
                            c0084Ot.m394p();
                            if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                                c0084Ot.m365Tz(this);
                            }
                            c0084Ot.m408x(strM544fH);
                        } else {
                            if (!C0157x3.m772UJ(strM544fH, l.f418w8)) {
                                return m220FN(abstractC0108Zo, c0084Ot);
                            }
                            if (!c0084Ot.m366U("name")) {
                                if (!c0084Ot.m366U(strM544fH)) {
                                    c0084Ot.m365Tz(this);
                                    return false;
                                }
                                c0084Ot.m394p();
                                if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                                    c0084Ot.m365Tz(this);
                                }
                                c0084Ot.m408x(strM544fH);
                                c0084Ot.m405w8();
                            }
                        }
                        return true;
                }
            }

            /* renamed from: F */
            private boolean m218F(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) throws IOException {
                AbstractC0108Zo.Vm vmM516u;
                String strM544fH;
                vmM516u = abstractC0108Zo.m516u();
                strM544fH = vmM516u.m544fH();
                strM544fH.hashCode();
                switch (strM544fH) {
                    case "frameset":
                        c0084Ot.m365Tz(this);
                        ArrayList<C0127lK> arrayListM370Xl = c0084Ot.m370Xl();
                        if (arrayListM370Xl.size() == 1 || ((arrayListM370Xl.size() > 2 && !arrayListM370Xl.get(1).m644A().equals("body")) || !c0084Ot.m348E())) {
                            return false;
                        }
                        C0127lK c0127lK = arrayListM370Xl.get(1);
                        if (c0127lK.mo278pb() != null) {
                            c0127lK.m272d();
                        }
                        while (arrayListM370Xl.size() > 1) {
                            arrayListM370Xl.remove(arrayListM370Xl.size() - 1);
                        }
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.m381fi(EnumC0064Gi.f363IS);
                        return true;
                    case "button":
                        if (c0084Ot.m380fH("button")) {
                            c0084Ot.m365Tz(this);
                            c0084Ot.m675i("button");
                            c0084Ot.mo359Mo(vmM516u);
                            return true;
                        }
                        c0084Ot.m349E5();
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.m354IS(false);
                        return true;
                    case "iframe":
                        c0084Ot.m354IS(false);
                        EnumC0064Gi.m199Mo(vmM516u, c0084Ot);
                        return true;
                    case "option":
                    case "optgroup":
                        if (c0084Ot.m676q().m644A().equals("option")) {
                            c0084Ot.m675i("option");
                        }
                        c0084Ot.m349E5();
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "textarea":
                        c0084Ot.m402t(vmM516u);
                        if (!vmM516u.m536Fp()) {
                            c0084Ot.f716QU.m149l(EnumC0115dT.f624QU);
                            c0084Ot.m407wt();
                            c0084Ot.m354IS(false);
                            c0084Ot.m381fi(EnumC0064Gi.f365MH);
                        }
                        return true;
                    case "select":
                        c0084Ot.m349E5();
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.m354IS(false);
                        EnumC0064Gi enumC0064GiM376cV = c0084Ot.m376cV();
                        if (enumC0064GiM376cV.equals(EnumC0064Gi.f378se) || enumC0064GiM376cV.equals(EnumC0064Gi.f362FN) || enumC0064GiM376cV.equals(EnumC0064Gi.f380w8) || enumC0064GiM376cV.equals(EnumC0064Gi.f361F) || enumC0064GiM376cV.equals(EnumC0064Gi.f368RH)) {
                            c0084Ot.m381fi(EnumC0064Gi.f374k);
                        } else {
                            c0084Ot.m381fi(EnumC0064Gi.f364KT);
                        }
                        return true;
                    case "a":
                        if (c0084Ot.m388l("a") != null) {
                            c0084Ot.m365Tz(this);
                            c0084Ot.m675i("a");
                            C0127lK c0127lKM351Fp = c0084Ot.m351Fp("a");
                            if (c0127lKM351Fp != null) {
                                c0084Ot.m360OF(c0127lKM351Fp);
                                c0084Ot.m374b(c0127lKM351Fp);
                            }
                        }
                        c0084Ot.m349E5();
                        c0084Ot.m383hp(c0084Ot.m402t(vmM516u));
                        return true;
                    case "dd":
                    case "dt":
                        c0084Ot.m354IS(false);
                        ArrayList<C0127lK> arrayListM370Xl2 = c0084Ot.m370Xl();
                        int size = arrayListM370Xl2.size() - 1;
                        while (true) {
                            if (size > 0) {
                                C0127lK c0127lK2 = arrayListM370Xl2.get(size);
                                if (C0157x3.m772UJ(c0127lK2.m644A(), l.f387FN)) {
                                    c0084Ot.m675i(c0127lK2.m644A());
                                } else if (!c0084Ot.m352GD(c0127lK2) || C0157x3.m772UJ(c0127lK2.m644A(), l.f402W)) {
                                    size--;
                                }
                            }
                        }
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "h1":
                    case "h2":
                    case "h3":
                    case "h4":
                    case "h5":
                    case "h6":
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        if (C0157x3.m772UJ(c0084Ot.m676q().m644A(), l.f416se)) {
                            c0084Ot.m365Tz(this);
                            c0084Ot.m391mu();
                        }
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "hr":
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m369V(vmM516u);
                        c0084Ot.m354IS(false);
                        return true;
                    case "li":
                        c0084Ot.m354IS(false);
                        ArrayList<C0127lK> arrayListM370Xl3 = c0084Ot.m370Xl();
                        int size2 = arrayListM370Xl3.size() - 1;
                        while (true) {
                            if (size2 > 0) {
                                C0127lK c0127lK3 = arrayListM370Xl3.get(size2);
                                if (c0127lK3.m644A().equals("li")) {
                                    c0084Ot.m675i("li");
                                } else if (!c0084Ot.m352GD(c0127lK3) || C0157x3.m772UJ(c0127lK3.m644A(), l.f402W)) {
                                    size2--;
                                }
                            }
                        }
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "rp":
                    case "rt":
                        if (c0084Ot.m366U("ruby")) {
                            c0084Ot.m394p();
                            if (!c0084Ot.m676q().m644A().equals("ruby")) {
                                c0084Ot.m365Tz(this);
                                c0084Ot.m343AI("ruby");
                            }
                            c0084Ot.m402t(vmM516u);
                        }
                        return true;
                    case "pre":
                    case "listing":
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.f723xC.m161BP("\n");
                        c0084Ot.m354IS(false);
                        return true;
                    case "svg":
                        c0084Ot.m349E5();
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "xmp":
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m349E5();
                        c0084Ot.m354IS(false);
                        EnumC0064Gi.m199Mo(vmM516u, c0084Ot);
                        return true;
                    case "body":
                        c0084Ot.m365Tz(this);
                        ArrayList<C0127lK> arrayListM370Xl4 = c0084Ot.m370Xl();
                        if (arrayListM370Xl4.size() == 1 || (arrayListM370Xl4.size() > 2 && !arrayListM370Xl4.get(1).m644A().equals("body"))) {
                            return false;
                        }
                        c0084Ot.m354IS(false);
                        C0127lK c0127lK4 = arrayListM370Xl4.get(1);
                        if (vmM516u.m542UN()) {
                            Iterator<C0133nW> it = vmM516u.f593W.iterator();
                            while (it.hasNext()) {
                                C0133nW next = it.next();
                                if (!c0127lK4.m261KT(next.getKey())) {
                                    c0127lK4.mo282u().m461l(next);
                                }
                            }
                        }
                        return true;
                    case "form":
                        if (c0084Ot.m368UN() != null) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m384id(vmM516u, true);
                        return true;
                    case "html":
                        c0084Ot.m365Tz(this);
                        C0127lK c0127lK5 = c0084Ot.m370Xl().get(0);
                        if (vmM516u.m542UN()) {
                            Iterator<C0133nW> it2 = vmM516u.f593W.iterator();
                            while (it2.hasNext()) {
                                C0133nW next2 = it2.next();
                                if (!c0127lK5.m261KT(next2.getKey())) {
                                    c0127lK5.mo282u().m461l(next2);
                                }
                            }
                        }
                        return true;
                    case "math":
                        c0084Ot.m349E5();
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "nobr":
                        c0084Ot.m349E5();
                        if (c0084Ot.m366U("nobr")) {
                            c0084Ot.m365Tz(this);
                            c0084Ot.m675i("nobr");
                            c0084Ot.m349E5();
                        }
                        c0084Ot.m383hp(c0084Ot.m402t(vmM516u));
                        return true;
                    case "span":
                        c0084Ot.m349E5();
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "image":
                        if (c0084Ot.m351Fp("svg") == null) {
                            return c0084Ot.mo359Mo(vmM516u.m539P("img"));
                        }
                        c0084Ot.m402t(vmM516u);
                        return true;
                    case "input":
                        c0084Ot.m349E5();
                        if (!c0084Ot.m369V(vmM516u).mo126QU("type").equalsIgnoreCase("hidden")) {
                            c0084Ot.m354IS(false);
                        }
                        return true;
                    case "table":
                        if (c0084Ot.m411yS().m315R() != C0082OO.Qe.quirks && c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.m354IS(false);
                        c0084Ot.m381fi(EnumC0064Gi.f378se);
                        return true;
                    case "plaintext":
                        if (c0084Ot.m380fH("p")) {
                            c0084Ot.m675i("p");
                        }
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.f716QU.m149l(EnumC0115dT.f643i);
                        return true;
                    case "isindex":
                        c0084Ot.m365Tz(this);
                        if (c0084Ot.m368UN() != null) {
                            return false;
                        }
                        c0084Ot.m672MH("form");
                        if (vmM516u.m550yS("action")) {
                            c0084Ot.m368UN().m645BE("action", vmM516u.f593W.m453FN("action"));
                        }
                        c0084Ot.m672MH("hr");
                        c0084Ot.m672MH("label");
                        c0084Ot.mo359Mo(new AbstractC0108Zo.J().m523KT(vmM516u.m550yS("prompt") ? vmM516u.f593W.m453FN("prompt") : "This is a searchable index. Enter search keywords: "));
                        C0094Tz c0094Tz = new C0094Tz();
                        if (vmM516u.m542UN()) {
                            Iterator<C0133nW> it3 = vmM516u.f593W.iterator();
                            while (it3.hasNext()) {
                                C0133nW next3 = it3.next();
                                if (!C0157x3.m772UJ(next3.getKey(), l.f390KT)) {
                                    c0094Tz.m461l(next3);
                                }
                            }
                        }
                        c0094Tz.m459go("name", "isindex");
                        c0084Ot.mo401se("input", c0094Tz);
                        c0084Ot.m675i("label");
                        c0084Ot.m672MH("hr");
                        c0084Ot.m675i("form");
                        return true;
                    case "noembed":
                        EnumC0064Gi.m199Mo(vmM516u, c0084Ot);
                        return true;
                    default:
                        if (C0157x3.m772UJ(strM544fH, l.f386F)) {
                            c0084Ot.m349E5();
                            c0084Ot.m369V(vmM516u);
                            c0084Ot.m354IS(false);
                        } else if (C0157x3.m772UJ(strM544fH, l.f392MH)) {
                            if (c0084Ot.m380fH("p")) {
                                c0084Ot.m675i("p");
                            }
                            c0084Ot.m402t(vmM516u);
                        } else {
                            if (C0157x3.m772UJ(strM544fH, l.f407i)) {
                                return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f370UJ);
                            }
                            if (C0157x3.m772UJ(strM544fH, l.f383B)) {
                                c0084Ot.m349E5();
                                c0084Ot.m383hp(c0084Ot.m402t(vmM516u));
                            } else if (C0157x3.m772UJ(strM544fH, l.f418w8)) {
                                c0084Ot.m349E5();
                                c0084Ot.m402t(vmM516u);
                                c0084Ot.m361Oz();
                                c0084Ot.m354IS(false);
                            } else {
                                if (!C0157x3.m772UJ(strM544fH, l.f396RH)) {
                                    if (C0157x3.m772UJ(strM544fH, l.f408k)) {
                                        c0084Ot.m365Tz(this);
                                        return false;
                                    }
                                    c0084Ot.m349E5();
                                    c0084Ot.m402t(vmM516u);
                                    return true;
                                }
                                c0084Ot.m369V(vmM516u);
                            }
                        }
                        return true;
                }
            }

            /* renamed from: w8 */
            private boolean m219w8(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                String strM544fH = abstractC0108Zo.m511UJ().m544fH();
                ArrayList<C0127lK> arrayListM370Xl = c0084Ot.m370Xl();
                boolean z = false;
                int i = 0;
                while (i < 8) {
                    C0127lK c0127lKM388l = c0084Ot.m388l(strM544fH);
                    if (c0127lKM388l == null) {
                        return m220FN(abstractC0108Zo, c0084Ot);
                    }
                    if (!c0084Ot.m403uR(c0127lKM388l)) {
                        c0084Ot.m365Tz(this);
                        c0084Ot.m360OF(c0127lKM388l);
                        return true;
                    }
                    if (!c0084Ot.m366U(c0127lKM388l.m644A())) {
                        c0084Ot.m365Tz(this);
                        return z;
                    }
                    if (c0084Ot.m676q() != c0127lKM388l) {
                        c0084Ot.m365Tz(this);
                    }
                    int size = arrayListM370Xl.size();
                    int iM386kB = -1;
                    C0127lK c0127lK = null;
                    C0127lK c0127lK2 = null;
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i2 >= size || i2 >= 64) {
                            break;
                        }
                        C0127lK c0127lK3 = arrayListM370Xl.get(i2);
                        if (c0127lK3 != c0127lKM388l) {
                            if (z2 && c0084Ot.m352GD(c0127lK3)) {
                                c0127lK = c0127lK3;
                                break;
                            }
                        } else {
                            c0127lK2 = arrayListM370Xl.get(i2 - 1);
                            iM386kB = c0084Ot.m386kB(c0127lK3);
                            z2 = true;
                        }
                        i2++;
                    }
                    if (c0127lK == null) {
                        c0084Ot.m408x(c0127lKM388l.m644A());
                        c0084Ot.m360OF(c0127lKM388l);
                        return true;
                    }
                    C0127lK c0127lKM350FN = c0127lK;
                    C0127lK c0127lK4 = c0127lKM350FN;
                    for (int i3 = 0; i3 < 3; i3++) {
                        if (c0084Ot.m403uR(c0127lKM350FN)) {
                            c0127lKM350FN = c0084Ot.m350FN(c0127lKM350FN);
                        }
                        if (!c0084Ot.m396pS(c0127lKM350FN)) {
                            c0084Ot.m374b(c0127lKM350FN);
                        } else {
                            if (c0127lKM350FN == c0127lKM388l) {
                                break;
                            }
                            C0127lK c0127lK5 = new C0127lK(C0073Lt.m238RH(c0127lKM350FN.mo129p(), C0068Jt.f430xC), c0084Ot.m345BP());
                            c0084Ot.m346BU(c0127lKM350FN, c0127lK5);
                            c0084Ot.m387kZ(c0127lKM350FN, c0127lK5);
                            if (c0127lK4 == c0127lK) {
                                iM386kB = c0084Ot.m386kB(c0127lK5) + 1;
                            }
                            if (c0127lK4.mo278pb() != null) {
                                c0127lK4.m272d();
                            }
                            c0127lK5.m658id(c0127lK4);
                            c0127lKM350FN = c0127lK5;
                            c0127lK4 = c0127lKM350FN;
                        }
                    }
                    if (c0127lK2 != null) {
                        if (C0157x3.m772UJ(c0127lK2.m644A(), l.f385E)) {
                            if (c0127lK4.mo278pb() != null) {
                                c0127lK4.m272d();
                            }
                            c0084Ot.m347BY(c0127lK4);
                        } else {
                            if (c0127lK4.mo278pb() != null) {
                                c0127lK4.m272d();
                            }
                            c0127lK2.m658id(c0127lK4);
                        }
                    }
                    C0127lK c0127lK6 = new C0127lK(c0127lKM388l.m655bA(), c0084Ot.m345BP());
                    c0127lK6.mo282u().m464u(c0127lKM388l.mo282u());
                    for (AbstractC0077NC abstractC0077NC : (AbstractC0077NC[]) c0127lK.m269W().toArray(new AbstractC0077NC[0])) {
                        c0127lK6.m658id(abstractC0077NC);
                    }
                    c0127lK.m658id(c0127lK6);
                    c0084Ot.m360OF(c0127lKM388l);
                    c0084Ot.m395pE(c0127lK6, iM386kB);
                    c0084Ot.m374b(c0127lKM388l);
                    c0084Ot.m371Z(c0127lK, c0127lK6);
                    i++;
                    z = false;
                }
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
            
                return true;
             */
            /* renamed from: FN */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            boolean m220FN(com.github.catvod.spider.merge.AbstractC0108Zo r6, com.github.catvod.spider.merge.C0084Ot r7) {
                /*
                    r5 = this;
                    com.github.catvod.spider.merge.Zo$t7 r6 = r6.m511UJ()
                    java.lang.String r6 = r6.f591QU
                    java.util.ArrayList r0 = r7.m370Xl()
                    int r1 = r0.size()
                    r2 = 1
                    int r1 = r1 - r2
                L10:
                    if (r1 < 0) goto L48
                    java.lang.Object r3 = r0.get(r1)
                    com.github.catvod.spider.merge.lK r3 = (com.github.catvod.spider.merge.C0127lK) r3
                    java.lang.String r4 = r3.m644A()
                    boolean r4 = r4.equals(r6)
                    if (r4 == 0) goto L3a
                    r7.m382go(r6)
                    com.github.catvod.spider.merge.lK r0 = r7.m676q()
                    java.lang.String r0 = r0.m644A()
                    boolean r0 = r6.equals(r0)
                    if (r0 != 0) goto L36
                    r7.m365Tz(r5)
                L36:
                    r7.m408x(r6)
                    goto L48
                L3a:
                    boolean r3 = r7.m352GD(r3)
                    if (r3 == 0) goto L45
                    r7.m365Tz(r5)
                    r6 = 0
                    return r6
                L45:
                    int r1 = r1 + (-1)
                    goto L10
                L48:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.EnumC0064Gi.lm.m220FN(com.github.catvod.spider.merge.Zo, com.github.catvod.spider.merge.Ot):boolean");
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                int i = tY.f421q[abstractC0108Zo.f572q.ordinal()];
                if (i == 1) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                } else {
                    if (i == 2) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    if (i == 3) {
                        return m218F(abstractC0108Zo, c0084Ot);
                    }
                    if (i == 4) {
                        return m217B(abstractC0108Zo, c0084Ot);
                    }
                    if (i == 5) {
                        AbstractC0108Zo.J jM514q = abstractC0108Zo.m514q();
                        if (jM514q.m524k().equals(EnumC0064Gi.f359BP)) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        if (c0084Ot.m348E() && EnumC0064Gi.m204se(jM514q)) {
                            c0084Ot.m349E5();
                            c0084Ot.m375c(jM514q);
                        } else {
                            c0084Ot.m349E5();
                            c0084Ot.m375c(jM514q);
                            c0084Ot.m354IS(false);
                        }
                    }
                }
                return true;
            }
        };
        f373i = enumC0064Gi6;
        EnumC0064Gi enumC0064Gi7 = new EnumC0064Gi("Text", 7) { // from class: com.github.catvod.spider.merge.Gi.Tb
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m513i()) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                if (abstractC0108Zo.m512W()) {
                    c0084Ot.m365Tz(this);
                    c0084Ot.m391mu();
                    c0084Ot.m381fi(c0084Ot.m379f());
                    return c0084Ot.mo359Mo(abstractC0108Zo);
                }
                if (!abstractC0108Zo.m506FN()) {
                    return true;
                }
                c0084Ot.m391mu();
                c0084Ot.m381fi(c0084Ot.m379f());
                return true;
            }
        };
        f365MH = enumC0064Gi7;
        EnumC0064Gi enumC0064Gi8 = new EnumC0064Gi("InTable", 8) { // from class: com.github.catvod.spider.merge.Gi.s
            {
                N n2 = null;
            }

            /* renamed from: FN */
            boolean m223FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                c0084Ot.m365Tz(this);
                if (!C0157x3.m772UJ(c0084Ot.m676q().m644A(), l.f394P)) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                c0084Ot.m372Zu(true);
                boolean zM399rO = c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                c0084Ot.m372Zu(false);
                return zM399rO;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m513i()) {
                    c0084Ot.m410y();
                    c0084Ot.m407wt();
                    c0084Ot.m381fi(EnumC0064Gi.f371W);
                    return c0084Ot.mo359Mo(abstractC0108Zo);
                }
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (abstractC0108Zo.m515se()) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (!abstractC0108Zo.m505B()) {
                    if (!abstractC0108Zo.m506FN()) {
                        if (!abstractC0108Zo.m512W()) {
                            return m223FN(abstractC0108Zo, c0084Ot);
                        }
                        if (c0084Ot.m676q().m644A().equals("html")) {
                            c0084Ot.m365Tz(this);
                        }
                        return true;
                    }
                    String strM544fH = abstractC0108Zo.m511UJ().m544fH();
                    if (!strM544fH.equals("table")) {
                        if (!C0157x3.m772UJ(strM544fH, l.f412pb)) {
                            return m223FN(abstractC0108Zo, c0084Ot);
                        }
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    if (!c0084Ot.m406wR(strM544fH)) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    c0084Ot.m408x("table");
                    c0084Ot.m373a();
                    return true;
                }
                AbstractC0108Zo.Vm vmM516u = abstractC0108Zo.m516u();
                String strM544fH2 = vmM516u.m544fH();
                if (strM544fH2.equals("caption")) {
                    c0084Ot.m355KT();
                    c0084Ot.m361Oz();
                    c0084Ot.m402t(vmM516u);
                    c0084Ot.m381fi(EnumC0064Gi.f362FN);
                } else if (strM544fH2.equals("colgroup")) {
                    c0084Ot.m355KT();
                    c0084Ot.m402t(vmM516u);
                    c0084Ot.m381fi(EnumC0064Gi.f358B);
                } else {
                    if (strM544fH2.equals("col")) {
                        c0084Ot.m672MH("colgroup");
                        return c0084Ot.mo359Mo(abstractC0108Zo);
                    }
                    if (C0157x3.m772UJ(strM544fH2, l.f411p)) {
                        c0084Ot.m355KT();
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.m381fi(EnumC0064Gi.f380w8);
                    } else {
                        if (C0157x3.m772UJ(strM544fH2, l.f406go)) {
                            c0084Ot.m672MH("tbody");
                            return c0084Ot.mo359Mo(abstractC0108Zo);
                        }
                        if (strM544fH2.equals("table")) {
                            c0084Ot.m365Tz(this);
                            if (c0084Ot.m675i("table")) {
                                return c0084Ot.mo359Mo(abstractC0108Zo);
                            }
                        } else {
                            if (C0157x3.m772UJ(strM544fH2, l.f409l)) {
                                return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f370UJ);
                            }
                            if (strM544fH2.equals("input")) {
                                if (!vmM516u.m542UN() || !vmM516u.f593W.m453FN("type").equalsIgnoreCase("hidden")) {
                                    return m223FN(abstractC0108Zo, c0084Ot);
                                }
                                c0084Ot.m369V(vmM516u);
                            } else {
                                if (!strM544fH2.equals("form")) {
                                    return m223FN(abstractC0108Zo, c0084Ot);
                                }
                                c0084Ot.m365Tz(this);
                                if (c0084Ot.m368UN() != null) {
                                    return false;
                                }
                                c0084Ot.m384id(vmM516u, false);
                            }
                        }
                    }
                }
                return true;
            }
        };
        f378se = enumC0064Gi8;
        EnumC0064Gi enumC0064Gi9 = new EnumC0064Gi("InTableText", 9) { // from class: com.github.catvod.spider.merge.Gi.p
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.f572q == AbstractC0108Zo.O.Character) {
                    AbstractC0108Zo.J jM514q = abstractC0108Zo.m514q();
                    if (jM514q.m524k().equals(EnumC0064Gi.f359BP)) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    c0084Ot.m362P().add(jM514q.m524k());
                    return true;
                }
                if (c0084Ot.m362P().size() > 0) {
                    for (String str : c0084Ot.m362P()) {
                        if (EnumC0064Gi.m198MH(str)) {
                            c0084Ot.m375c(new AbstractC0108Zo.J().m523KT(str));
                        } else {
                            c0084Ot.m365Tz(this);
                            if (C0157x3.m772UJ(c0084Ot.m676q().m644A(), l.f394P)) {
                                c0084Ot.m372Zu(true);
                                c0084Ot.m399rO(new AbstractC0108Zo.J().m523KT(str), EnumC0064Gi.f373i);
                                c0084Ot.m372Zu(false);
                            } else {
                                c0084Ot.m399rO(new AbstractC0108Zo.J().m523KT(str), EnumC0064Gi.f373i);
                            }
                        }
                    }
                    c0084Ot.m410y();
                }
                c0084Ot.m381fi(c0084Ot.m379f());
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }
        };
        f371W = enumC0064Gi9;
        EnumC0064Gi enumC0064Gi10 = new EnumC0064Gi("InCaption", 10) { // from class: com.github.catvod.spider.merge.Gi.Qe
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m506FN() && abstractC0108Zo.m511UJ().m544fH().equals("caption")) {
                    if (!c0084Ot.m406wR(abstractC0108Zo.m511UJ().m544fH())) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    c0084Ot.m394p();
                    if (!c0084Ot.m676q().m644A().equals("caption")) {
                        c0084Ot.m365Tz(this);
                    }
                    c0084Ot.m408x("caption");
                    c0084Ot.m405w8();
                    c0084Ot.m381fi(EnumC0064Gi.f378se);
                    return true;
                }
                if ((abstractC0108Zo.m505B() && C0157x3.m772UJ(abstractC0108Zo.m516u().m544fH(), l.f388Fp)) || (abstractC0108Zo.m506FN() && abstractC0108Zo.m511UJ().m544fH().equals("table"))) {
                    c0084Ot.m365Tz(this);
                    if (c0084Ot.m675i("caption")) {
                        return c0084Ot.mo359Mo(abstractC0108Zo);
                    }
                    return true;
                }
                if (!abstractC0108Zo.m506FN() || !C0157x3.m772UJ(abstractC0108Zo.m511UJ().m544fH(), l.f391M)) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                c0084Ot.m365Tz(this);
                return false;
            }
        };
        f362FN = enumC0064Gi10;
        EnumC0064Gi enumC0064Gi11 = new EnumC0064Gi("InColumnGroup", 11) { // from class: com.github.catvod.spider.merge.Gi.J
            {
                N n2 = null;
            }

            /* renamed from: FN */
            private boolean m211FN(AbstractC0108Zo abstractC0108Zo, AbstractC0128lc abstractC0128lc) {
                if (abstractC0128lc.m675i("colgroup")) {
                    return abstractC0128lc.mo359Mo(abstractC0108Zo);
                }
                return true;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                int i = tY.f421q[abstractC0108Zo.f572q.ordinal()];
                if (i == 1) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                } else if (i == 2) {
                    c0084Ot.m365Tz(this);
                } else if (i == 3) {
                    AbstractC0108Zo.Vm vmM516u = abstractC0108Zo.m516u();
                    String strM544fH = vmM516u.m544fH();
                    strM544fH.hashCode();
                    if (!strM544fH.equals("col")) {
                        return !strM544fH.equals("html") ? m211FN(abstractC0108Zo, c0084Ot) : c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                    }
                    c0084Ot.m369V(vmM516u);
                } else {
                    if (i != 4) {
                        if (i != 6) {
                            return m211FN(abstractC0108Zo, c0084Ot);
                        }
                        if (c0084Ot.m676q().m644A().equals("html")) {
                            return true;
                        }
                        return m211FN(abstractC0108Zo, c0084Ot);
                    }
                    if (!abstractC0108Zo.m511UJ().f591QU.equals("colgroup")) {
                        return m211FN(abstractC0108Zo, c0084Ot);
                    }
                    if (c0084Ot.m676q().m644A().equals("html")) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    c0084Ot.m391mu();
                    c0084Ot.m381fi(EnumC0064Gi.f378se);
                }
                return true;
            }
        };
        f358B = enumC0064Gi11;
        EnumC0064Gi enumC0064Gi12 = new EnumC0064Gi("InTableBody", 12) { // from class: com.github.catvod.spider.merge.Gi.FD
            {
                N n2 = null;
            }

            /* renamed from: B */
            private boolean m209B(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (!c0084Ot.m406wR("tbody") && !c0084Ot.m406wR("thead") && !c0084Ot.m366U("tfoot")) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                c0084Ot.m363RH();
                c0084Ot.m675i(c0084Ot.m676q().m644A());
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }

            /* renamed from: FN */
            private boolean m210FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f378se);
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                int i = tY.f421q[abstractC0108Zo.f572q.ordinal()];
                if (i == 3) {
                    AbstractC0108Zo.Vm vmM516u = abstractC0108Zo.m516u();
                    String strM544fH = vmM516u.m544fH();
                    if (strM544fH.equals("template")) {
                        c0084Ot.m402t(vmM516u);
                        return true;
                    }
                    if (strM544fH.equals("tr")) {
                        c0084Ot.m363RH();
                        c0084Ot.m402t(vmM516u);
                        c0084Ot.m381fi(EnumC0064Gi.f361F);
                        return true;
                    }
                    if (!C0157x3.m772UJ(strM544fH, l.f384BP)) {
                        return C0157x3.m772UJ(strM544fH, l.f403Xl) ? m209B(abstractC0108Zo, c0084Ot) : m210FN(abstractC0108Zo, c0084Ot);
                    }
                    c0084Ot.m365Tz(this);
                    c0084Ot.m672MH("tr");
                    return c0084Ot.mo359Mo(vmM516u);
                }
                if (i != 4) {
                    return m210FN(abstractC0108Zo, c0084Ot);
                }
                String strM544fH2 = abstractC0108Zo.m511UJ().m544fH();
                if (!C0157x3.m772UJ(strM544fH2, l.f415s)) {
                    if (strM544fH2.equals("table")) {
                        return m209B(abstractC0108Zo, c0084Ot);
                    }
                    if (!C0157x3.m772UJ(strM544fH2, l.f405fH)) {
                        return m210FN(abstractC0108Zo, c0084Ot);
                    }
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (!c0084Ot.m406wR(strM544fH2)) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                c0084Ot.m363RH();
                c0084Ot.m391mu();
                c0084Ot.m381fi(EnumC0064Gi.f378se);
                return true;
            }
        };
        f380w8 = enumC0064Gi12;
        EnumC0064Gi enumC0064Gi13 = new EnumC0064Gi("InRow", 13) { // from class: com.github.catvod.spider.merge.Gi.Qt
            {
                N n2 = null;
            }

            /* renamed from: B */
            private boolean m212B(AbstractC0108Zo abstractC0108Zo, AbstractC0128lc abstractC0128lc) {
                if (abstractC0128lc.m675i("tr")) {
                    return abstractC0128lc.mo359Mo(abstractC0108Zo);
                }
                return false;
            }

            /* renamed from: FN */
            private boolean m213FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f378se);
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m505B()) {
                    AbstractC0108Zo.Vm vmM516u = abstractC0108Zo.m516u();
                    String strM544fH = vmM516u.m544fH();
                    if (strM544fH.equals("template")) {
                        c0084Ot.m402t(vmM516u);
                        return true;
                    }
                    if (!C0157x3.m772UJ(strM544fH, l.f384BP)) {
                        return C0157x3.m772UJ(strM544fH, l.f404d) ? m212B(abstractC0108Zo, c0084Ot) : m213FN(abstractC0108Zo, c0084Ot);
                    }
                    c0084Ot.m385k();
                    c0084Ot.m402t(vmM516u);
                    c0084Ot.m381fi(EnumC0064Gi.f368RH);
                    c0084Ot.m361Oz();
                    return true;
                }
                if (!abstractC0108Zo.m506FN()) {
                    return m213FN(abstractC0108Zo, c0084Ot);
                }
                String strM544fH2 = abstractC0108Zo.m511UJ().m544fH();
                if (strM544fH2.equals("tr")) {
                    if (!c0084Ot.m406wR(strM544fH2)) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    c0084Ot.m385k();
                    c0084Ot.m391mu();
                    c0084Ot.m381fi(EnumC0064Gi.f380w8);
                    return true;
                }
                if (strM544fH2.equals("table")) {
                    return m212B(abstractC0108Zo, c0084Ot);
                }
                if (!C0157x3.m772UJ(strM544fH2, l.f411p)) {
                    if (!C0157x3.m772UJ(strM544fH2, l.f399U)) {
                        return m213FN(abstractC0108Zo, c0084Ot);
                    }
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (!c0084Ot.m406wR(strM544fH2) || !c0084Ot.m406wR("tr")) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                c0084Ot.m385k();
                c0084Ot.m391mu();
                c0084Ot.m381fi(EnumC0064Gi.f380w8);
                return true;
            }
        };
        f361F = enumC0064Gi13;
        EnumC0064Gi enumC0064Gi14 = new EnumC0064Gi("InCell", 14) { // from class: com.github.catvod.spider.merge.Gi.oK
            {
                N n2 = null;
            }

            /* renamed from: B */
            private void m221B(C0084Ot c0084Ot) {
                if (c0084Ot.m406wR("td")) {
                    c0084Ot.m675i("td");
                } else {
                    c0084Ot.m675i("th");
                }
            }

            /* renamed from: FN */
            private boolean m222FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (!abstractC0108Zo.m506FN()) {
                    if (!abstractC0108Zo.m505B() || !C0157x3.m772UJ(abstractC0108Zo.m516u().m544fH(), l.f388Fp)) {
                        return m222FN(abstractC0108Zo, c0084Ot);
                    }
                    if (c0084Ot.m406wR("td") || c0084Ot.m406wR("th")) {
                        m221B(c0084Ot);
                        return c0084Ot.mo359Mo(abstractC0108Zo);
                    }
                    c0084Ot.m365Tz(this);
                    return false;
                }
                String strM544fH = abstractC0108Zo.m511UJ().m544fH();
                if (!C0157x3.m772UJ(strM544fH, l.f384BP)) {
                    if (C0157x3.m772UJ(strM544fH, l.f420yS)) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    if (!C0157x3.m772UJ(strM544fH, l.f401UN)) {
                        return m222FN(abstractC0108Zo, c0084Ot);
                    }
                    if (c0084Ot.m406wR(strM544fH)) {
                        m221B(c0084Ot);
                        return c0084Ot.mo359Mo(abstractC0108Zo);
                    }
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (!c0084Ot.m406wR(strM544fH)) {
                    c0084Ot.m365Tz(this);
                    c0084Ot.m381fi(EnumC0064Gi.f361F);
                    return false;
                }
                c0084Ot.m394p();
                if (!c0084Ot.m676q().m644A().equals(strM544fH)) {
                    c0084Ot.m365Tz(this);
                }
                c0084Ot.m408x(strM544fH);
                c0084Ot.m405w8();
                c0084Ot.m381fi(EnumC0064Gi.f361F);
                return true;
            }
        };
        f368RH = enumC0064Gi14;
        EnumC0064Gi enumC0064Gi15 = new EnumC0064Gi("InSelect", 15) { // from class: com.github.catvod.spider.merge.Gi.t7
            {
                N n2 = null;
            }

            /* renamed from: FN */
            private boolean m224FN(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                c0084Ot.m365Tz(this);
                return false;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                String strM544fH;
                switch (tY.f421q[abstractC0108Zo.f572q.ordinal()]) {
                    case 1:
                        c0084Ot.m390mT(abstractC0108Zo.m518xC());
                        return true;
                    case 2:
                        c0084Ot.m365Tz(this);
                        return false;
                    case 3:
                        AbstractC0108Zo.Vm vmM516u = abstractC0108Zo.m516u();
                        String strM544fH2 = vmM516u.m544fH();
                        if (strM544fH2.equals("html")) {
                            return c0084Ot.m399rO(vmM516u, EnumC0064Gi.f373i);
                        }
                        if (strM544fH2.equals("option")) {
                            if (c0084Ot.m676q().m644A().equals("option")) {
                                c0084Ot.m675i("option");
                            }
                            c0084Ot.m402t(vmM516u);
                        } else {
                            if (!strM544fH2.equals("optgroup")) {
                                if (strM544fH2.equals("select")) {
                                    c0084Ot.m365Tz(this);
                                    return c0084Ot.m675i("select");
                                }
                                if (!C0157x3.m772UJ(strM544fH2, l.f410m)) {
                                    return strM544fH2.equals("script") ? c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f370UJ) : m224FN(abstractC0108Zo, c0084Ot);
                                }
                                c0084Ot.m365Tz(this);
                                if (!c0084Ot.m400s("select")) {
                                    return false;
                                }
                                c0084Ot.m675i("select");
                                return c0084Ot.mo359Mo(vmM516u);
                            }
                            if (c0084Ot.m676q().m644A().equals("option")) {
                                c0084Ot.m675i("option");
                            }
                            if (c0084Ot.m676q().m644A().equals("optgroup")) {
                                c0084Ot.m675i("optgroup");
                            }
                            c0084Ot.m402t(vmM516u);
                        }
                        return true;
                    case 4:
                        strM544fH = abstractC0108Zo.m511UJ().m544fH();
                        strM544fH.hashCode();
                        switch (strM544fH) {
                            case "option":
                                if (c0084Ot.m676q().m644A().equals("option")) {
                                    c0084Ot.m391mu();
                                } else {
                                    c0084Ot.m365Tz(this);
                                }
                                return true;
                            case "select":
                                if (!c0084Ot.m400s(strM544fH)) {
                                    c0084Ot.m365Tz(this);
                                    return false;
                                }
                                c0084Ot.m408x(strM544fH);
                                c0084Ot.m373a();
                                return true;
                            case "optgroup":
                                if (c0084Ot.m676q().m644A().equals("option") && c0084Ot.m350FN(c0084Ot.m676q()) != null && c0084Ot.m350FN(c0084Ot.m676q()).m644A().equals("optgroup")) {
                                    c0084Ot.m675i("option");
                                }
                                if (c0084Ot.m676q().m644A().equals("optgroup")) {
                                    c0084Ot.m391mu();
                                } else {
                                    c0084Ot.m365Tz(this);
                                }
                                return true;
                            default:
                                return m224FN(abstractC0108Zo, c0084Ot);
                        }
                    case 5:
                        AbstractC0108Zo.J jM514q = abstractC0108Zo.m514q();
                        if (jM514q.m524k().equals(EnumC0064Gi.f359BP)) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        c0084Ot.m375c(jM514q);
                        return true;
                    case 6:
                        if (!c0084Ot.m676q().m644A().equals("html")) {
                            c0084Ot.m365Tz(this);
                        }
                        return true;
                    default:
                        return m224FN(abstractC0108Zo, c0084Ot);
                }
            }
        };
        f364KT = enumC0064Gi15;
        EnumC0064Gi enumC0064Gi16 = new EnumC0064Gi("InSelectInTable", 16) { // from class: com.github.catvod.spider.merge.Gi.Vm
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m505B() && C0157x3.m772UJ(abstractC0108Zo.m516u().m544fH(), l.f397T)) {
                    c0084Ot.m365Tz(this);
                    c0084Ot.m675i("select");
                    return c0084Ot.mo359Mo(abstractC0108Zo);
                }
                if (!abstractC0108Zo.m506FN() || !C0157x3.m772UJ(abstractC0108Zo.m511UJ().m544fH(), l.f397T)) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f364KT);
                }
                c0084Ot.m365Tz(this);
                if (!c0084Ot.m406wR(abstractC0108Zo.m511UJ().m544fH())) {
                    return false;
                }
                c0084Ot.m675i("select");
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }
        };
        f374k = enumC0064Gi16;
        EnumC0064Gi enumC0064Gi17 = new EnumC0064Gi("AfterBody", 17) { // from class: com.github.catvod.spider.merge.Gi.yn
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (abstractC0108Zo.m515se()) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("html")) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                if (abstractC0108Zo.m506FN() && abstractC0108Zo.m511UJ().m544fH().equals("html")) {
                    if (c0084Ot.m393om()) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    c0084Ot.m381fi(EnumC0064Gi.f376p);
                    return true;
                }
                if (abstractC0108Zo.m512W()) {
                    return true;
                }
                c0084Ot.m365Tz(this);
                c0084Ot.m381fi(EnumC0064Gi.f373i);
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }
        };
        f369Tz = enumC0064Gi17;
        EnumC0064Gi enumC0064Gi18 = new EnumC0064Gi("InFrameset", 18) { // from class: com.github.catvod.spider.merge.Gi.O
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                AbstractC0108Zo.Vm vmM516u;
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                } else if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                } else {
                    if (abstractC0108Zo.m515se()) {
                        c0084Ot.m365Tz(this);
                        return false;
                    }
                    if (abstractC0108Zo.m505B()) {
                        vmM516u = abstractC0108Zo.m516u();
                        String strM544fH = vmM516u.m544fH();
                        strM544fH.hashCode();
                        switch (strM544fH) {
                            case "frameset":
                                c0084Ot.m402t(vmM516u);
                                break;
                            case "html":
                                return c0084Ot.m399rO(vmM516u, EnumC0064Gi.f373i);
                            case "frame":
                                c0084Ot.m369V(vmM516u);
                                break;
                            case "noframes":
                                return c0084Ot.m399rO(vmM516u, EnumC0064Gi.f370UJ);
                            default:
                                c0084Ot.m365Tz(this);
                                return false;
                        }
                    } else if (abstractC0108Zo.m506FN() && abstractC0108Zo.m511UJ().m544fH().equals("frameset")) {
                        if (c0084Ot.m676q().m644A().equals("html")) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        c0084Ot.m391mu();
                        if (!c0084Ot.m393om() && !c0084Ot.m676q().m644A().equals("frameset")) {
                            c0084Ot.m381fi(EnumC0064Gi.f360E);
                        }
                    } else {
                        if (!abstractC0108Zo.m512W()) {
                            c0084Ot.m365Tz(this);
                            return false;
                        }
                        if (!c0084Ot.m676q().m644A().equals("html")) {
                            c0084Ot.m365Tz(this);
                        }
                    }
                }
                return true;
            }
        };
        f363IS = enumC0064Gi18;
        EnumC0064Gi enumC0064Gi19 = new EnumC0064Gi("AfterFrameset", 19) { // from class: com.github.catvod.spider.merge.Gi.b
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    return true;
                }
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (abstractC0108Zo.m515se()) {
                    c0084Ot.m365Tz(this);
                    return false;
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("html")) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                if (abstractC0108Zo.m506FN() && abstractC0108Zo.m511UJ().m544fH().equals("html")) {
                    c0084Ot.m381fi(EnumC0064Gi.f372go);
                    return true;
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("noframes")) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f370UJ);
                }
                if (abstractC0108Zo.m512W()) {
                    return true;
                }
                c0084Ot.m365Tz(this);
                return false;
            }
        };
        f360E = enumC0064Gi19;
        EnumC0064Gi enumC0064Gi20 = new EnumC0064Gi("AfterAfterBody", 20) { // from class: com.github.catvod.spider.merge.Gi.HU
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (abstractC0108Zo.m515se() || (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("html"))) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                if (EnumC0064Gi.m204se(abstractC0108Zo)) {
                    C0127lK c0127lKM408x = c0084Ot.m408x("html");
                    c0084Ot.m375c(abstractC0108Zo.m514q());
                    c0084Ot.f722u.add(c0127lKM408x);
                    c0084Ot.f722u.add(c0127lKM408x.m667pt("body"));
                    return true;
                }
                if (abstractC0108Zo.m512W()) {
                    return true;
                }
                c0084Ot.m365Tz(this);
                c0084Ot.m381fi(EnumC0064Gi.f373i);
                return c0084Ot.mo359Mo(abstractC0108Zo);
            }
        };
        f376p = enumC0064Gi20;
        EnumC0064Gi enumC0064Gi21 = new EnumC0064Gi("AfterAfterFrameset", 21) { // from class: com.github.catvod.spider.merge.Gi.Q
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                if (abstractC0108Zo.m507MH()) {
                    c0084Ot.m390mT(abstractC0108Zo.m518xC());
                    return true;
                }
                if (abstractC0108Zo.m515se() || EnumC0064Gi.m204se(abstractC0108Zo) || (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("html"))) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f373i);
                }
                if (abstractC0108Zo.m512W()) {
                    return true;
                }
                if (abstractC0108Zo.m505B() && abstractC0108Zo.m516u().m544fH().equals("noframes")) {
                    return c0084Ot.m399rO(abstractC0108Zo, EnumC0064Gi.f370UJ);
                }
                c0084Ot.m365Tz(this);
                return false;
            }
        };
        f372go = enumC0064Gi21;
        EnumC0064Gi enumC0064Gi22 = new EnumC0064Gi("ForeignContent", 22) { // from class: com.github.catvod.spider.merge.Gi.MS
            {
                N n2 = null;
            }

            @Override // com.github.catvod.spider.merge.EnumC0064Gi
            /* renamed from: W */
            boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot) {
                return true;
            }
        };
        f375l = enumC0064Gi22;
        f382yS = new EnumC0064Gi[]{n, enumC0064Gi, enumC0064Gi2, enumC0064Gi3, enumC0064Gi4, enumC0064Gi5, enumC0064Gi6, enumC0064Gi7, enumC0064Gi8, enumC0064Gi9, enumC0064Gi10, enumC0064Gi11, enumC0064Gi12, enumC0064Gi13, enumC0064Gi14, enumC0064Gi15, enumC0064Gi16, enumC0064Gi17, enumC0064Gi18, enumC0064Gi19, enumC0064Gi20, enumC0064Gi21, enumC0064Gi22};
        f359BP = String.valueOf((char) 0);
    }

    private EnumC0064Gi(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MH */
    public static boolean m198MH(String str) {
        return C0157x3.m769Mo(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Mo */
    public static void m199Mo(AbstractC0108Zo.Vm vm, C0084Ot c0084Ot) {
        c0084Ot.f716QU.m149l(EnumC0115dT.f663u);
        c0084Ot.m407wt();
        c0084Ot.m381fi(f365MH);
        c0084Ot.m402t(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static void m202i(AbstractC0108Zo.Vm vm, C0084Ot c0084Ot) {
        c0084Ot.f716QU.m149l(EnumC0115dT.f624QU);
        c0084Ot.m407wt();
        c0084Ot.m381fi(f365MH);
        c0084Ot.m402t(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: se */
    public static boolean m204se(AbstractC0108Zo abstractC0108Zo) {
        if (abstractC0108Zo.m513i()) {
            return C0157x3.m769Mo(abstractC0108Zo.m514q().m524k());
        }
        return false;
    }

    /* renamed from: W */
    abstract boolean mo207W(AbstractC0108Zo abstractC0108Zo, C0084Ot c0084Ot);

    /* synthetic */ EnumC0064Gi(String str, int i, N n) {
        this(str, i);
    }
}
