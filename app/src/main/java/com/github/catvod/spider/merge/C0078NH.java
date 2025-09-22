package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0070KB;
import com.github.catvod.spider.merge.AbstractC0123i;
import com.github.catvod.spider.merge.AbstractC0144sn;
import com.github.catvod.spider.merge.C0055AV;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.NH */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0078NH {

    /* renamed from: Mo */
    private final String f468Mo;

    /* renamed from: i */
    private final List<AbstractC0123i> f469i = new ArrayList();

    /* renamed from: u */
    private final C0121hg f470u;

    /* renamed from: q */
    private static final String[] f466q = {",", ">", "+", "~", " "};

    /* renamed from: xC */
    private static final String[] f467xC = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: QU */
    private static final Pattern f464QU = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: UJ */
    private static final Pattern f465UJ = Pattern.compile("([+-])?(\\d+)");

    private C0078NH(String str) {
        C0111bw.m557i(str);
        String strTrim = str.trim();
        this.f468Mo = strTrim;
        this.f470u = new C0121hg(strTrim);
    }

    /* renamed from: B */
    private void m289B() throws NumberFormatException {
        if (this.f470u.m615FN("#")) {
            m299UJ();
            return;
        }
        if (this.f470u.m615FN(".")) {
            m296QU();
            return;
        }
        if (this.f470u.m616KT() || this.f470u.m613B("*|")) {
            m305u();
            return;
        }
        if (this.f470u.m613B("[")) {
            m307xC();
            return;
        }
        if (this.f470u.m615FN("*")) {
            m303q();
            return;
        }
        if (this.f470u.m615FN(":lt(")) {
            m293KT();
            return;
        }
        if (this.f470u.m615FN(":gt(")) {
            m297RH();
            return;
        }
        if (this.f470u.m615FN(":eq(")) {
            m291F();
            return;
        }
        if (this.f470u.m613B(":has(")) {
            m306w8();
            return;
        }
        if (this.f470u.m613B(":contains(")) {
            m304se(false);
            return;
        }
        if (this.f470u.m613B(":containsOwn(")) {
            m304se(true);
            return;
        }
        if (this.f470u.m613B(":containsData(")) {
            m300W();
            return;
        }
        if (this.f470u.m613B(":matches(")) {
            m302k(false);
            return;
        }
        if (this.f470u.m613B(":matchesOwn(")) {
            m302k(true);
            return;
        }
        if (this.f470u.m613B(":not(")) {
            m298Tz();
            return;
        }
        if (this.f470u.m615FN(":nth-child(")) {
            m292FN(false, false);
            return;
        }
        if (this.f470u.m615FN(":nth-last-child(")) {
            m292FN(true, false);
            return;
        }
        if (this.f470u.m615FN(":nth-of-type(")) {
            m292FN(false, true);
            return;
        }
        if (this.f470u.m615FN(":nth-last-of-type(")) {
            m292FN(true, true);
            return;
        }
        if (this.f470u.m615FN(":first-child")) {
            this.f469i.add(new AbstractC0123i.lm());
            return;
        }
        if (this.f470u.m615FN(":last-child")) {
            this.f469i.add(new AbstractC0123i.s());
            return;
        }
        if (this.f470u.m615FN(":first-of-type")) {
            this.f469i.add(new AbstractC0123i.Tb());
            return;
        }
        if (this.f470u.m615FN(":last-of-type")) {
            this.f469i.add(new AbstractC0123i.l());
            return;
        }
        if (this.f470u.m615FN(":only-child")) {
            this.f469i.add(new AbstractC0123i.jm());
            return;
        }
        if (this.f470u.m615FN(":only-of-type")) {
            this.f469i.add(new AbstractC0123i.d());
            return;
        }
        if (this.f470u.m615FN(":empty")) {
            this.f469i.add(new AbstractC0123i.V());
        } else if (this.f470u.m615FN(":root")) {
            this.f469i.add(new AbstractC0123i.p8());
        } else {
            if (!this.f470u.m615FN(":matchText")) {
                throw new C0055AV.p("Could not parse query '%s': unexpected token at '%s'", this.f468Mo, this.f470u.m624k());
            }
            this.f469i.add(new AbstractC0123i.au());
        }
    }

    /* renamed from: E */
    public static AbstractC0123i m290E(String str) {
        try {
            return new C0078NH(str).m308IS();
        } catch (IllegalArgumentException e) {
            throw new C0055AV.p(e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: F */
    private void m291F() {
        this.f469i.add(new AbstractC0123i.Y(m301i()));
    }

    /* renamed from: FN */
    private void m292FN(boolean z, boolean z2) throws NumberFormatException {
        String strM700xC = C0139qf.m700xC(this.f470u.m629xC(")"));
        Matcher matcher = f464QU.matcher(strM700xC);
        Matcher matcher2 = f465UJ.matcher(strM700xC);
        int i = 2;
        if ("odd".equals(strM700xC)) {
            i = 1;
        } else if (!"even".equals(strM700xC)) {
            if (matcher.matches()) {
                int i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i2;
            } else {
                if (!matcher2.matches()) {
                    throw new C0055AV.p("Could not parse nth-index '%s': unexpected format", strM700xC);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            }
        }
        if (z2) {
            if (z) {
                this.f469i.add(new AbstractC0123i.F(i, i));
                return;
            } else {
                this.f469i.add(new AbstractC0123i.Sb(i, i));
                return;
            }
        }
        if (z) {
            this.f469i.add(new AbstractC0123i.U(i, i));
        } else {
            this.f469i.add(new AbstractC0123i.qB(i, i));
        }
    }

    /* renamed from: KT */
    private void m293KT() {
        this.f469i.add(new AbstractC0123i.Dl(m301i()));
    }

    /* renamed from: MH */
    private String m294MH() {
        StringBuilder sbM779xC = C0157x3.m779xC();
        while (!this.f470u.m622W()) {
            if (this.f470u.m613B("(")) {
                sbM779xC.append("(");
                sbM779xC.append(this.f470u.m625q('(', ')'));
                sbM779xC.append(")");
            } else if (this.f470u.m613B("[")) {
                sbM779xC.append("[");
                sbM779xC.append(this.f470u.m625q('[', ']'));
                sbM779xC.append("]");
            } else {
                if (this.f470u.m614F(f466q)) {
                    break;
                }
                sbM779xC.append(this.f470u.m619QU());
            }
        }
        return C0157x3.m778w8(sbM779xC);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* renamed from: Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m295Mo(char r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0078NH.m295Mo(char):void");
    }

    /* renamed from: QU */
    private void m296QU() {
        String strM627u = this.f470u.m627u();
        C0111bw.m557i(strM627u);
        this.f469i.add(new AbstractC0123i.N(strM627u.trim()));
    }

    /* renamed from: RH */
    private void m297RH() {
        this.f469i.add(new AbstractC0123i.Ux(m301i()));
    }

    /* renamed from: Tz */
    private void m298Tz() {
        this.f470u.m621UJ(":not");
        String strM625q = this.f470u.m625q('(', ')');
        C0111bw.m552MH(strM625q, ":not(selector) subselect must not be empty");
        this.f469i.add(new AbstractC0070KB.FD(m290E(strM625q)));
    }

    /* renamed from: UJ */
    private void m299UJ() {
        String strM627u = this.f470u.m627u();
        C0111bw.m557i(strM627u);
        this.f469i.add(new AbstractC0123i.tY(strM627u));
    }

    /* renamed from: W */
    private void m300W() {
        this.f470u.m621UJ(":containsData");
        String strM611IS = C0121hg.m611IS(this.f470u.m625q('(', ')'));
        C0111bw.m552MH(strM611IS, ":containsData(text) query must not be empty");
        this.f469i.add(new AbstractC0123i.b(strM611IS));
    }

    /* renamed from: i */
    private int m301i() {
        String strTrim = this.f470u.m629xC(")").trim();
        C0111bw.m555UJ(C0157x3.m768MH(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    /* renamed from: k */
    private void m302k(boolean z) {
        this.f470u.m621UJ(z ? ":matchesOwn" : ":matches");
        String strM625q = this.f470u.m625q('(', ')');
        C0111bw.m552MH(strM625q, ":matches(regex) query must not be empty");
        if (z) {
            this.f469i.add(new AbstractC0123i.vp(Pattern.compile(strM625q)));
        } else {
            this.f469i.add(new AbstractC0123i.r(Pattern.compile(strM625q)));
        }
    }

    /* renamed from: q */
    private void m303q() {
        this.f469i.add(new AbstractC0123i.p());
    }

    /* renamed from: se */
    private void m304se(boolean z) {
        this.f470u.m621UJ(z ? ":containsOwn" : ":contains");
        String strM611IS = C0121hg.m611IS(this.f470u.m625q('(', ')'));
        C0111bw.m552MH(strM611IS, ":contains(text) query must not be empty");
        if (z) {
            this.f469i.add(new AbstractC0123i.HU(strM611IS));
        } else {
            this.f469i.add(new AbstractC0123i.Q(strM611IS));
        }
    }

    /* renamed from: u */
    private void m305u() {
        String strM700xC = C0139qf.m700xC(this.f470u.m618Mo());
        C0111bw.m557i(strM700xC);
        if (strM700xC.startsWith("*|")) {
            this.f469i.add(new AbstractC0144sn.Qe(new AbstractC0123i.mQ(strM700xC), new AbstractC0123i.tG(strM700xC.replace("*|", ":"))));
            return;
        }
        if (strM700xC.contains("|")) {
            strM700xC = strM700xC.replace("|", ":");
        }
        this.f469i.add(new AbstractC0123i.mQ(strM700xC));
    }

    /* renamed from: w8 */
    private void m306w8() {
        this.f470u.m621UJ(":has");
        String strM625q = this.f470u.m625q('(', ')');
        C0111bw.m552MH(strM625q, ":has(el) subselect must not be empty");
        this.f469i.add(new AbstractC0070KB.p(m290E(strM625q)));
    }

    /* renamed from: xC */
    private void m307xC() {
        C0121hg c0121hg = new C0121hg(this.f470u.m625q('[', ']'));
        String strM617MH = c0121hg.m617MH(f467xC);
        C0111bw.m557i(strM617MH);
        c0121hg.m626se();
        if (c0121hg.m622W()) {
            if (strM617MH.startsWith("^")) {
                this.f469i.add(new AbstractC0123i.FD(strM617MH.substring(1)));
                return;
            } else {
                this.f469i.add(new AbstractC0123i.Qe(strM617MH));
                return;
            }
        }
        if (c0121hg.m615FN("=")) {
            this.f469i.add(new AbstractC0123i.Qt(strM617MH, c0121hg.m624k()));
            return;
        }
        if (c0121hg.m615FN("!=")) {
            this.f469i.add(new AbstractC0123i.yn(strM617MH, c0121hg.m624k()));
            return;
        }
        if (c0121hg.m615FN("^=")) {
            this.f469i.add(new AbstractC0123i.O(strM617MH, c0121hg.m624k()));
            return;
        }
        if (c0121hg.m615FN("$=")) {
            this.f469i.add(new AbstractC0123i.t7(strM617MH, c0121hg.m624k()));
        } else if (c0121hg.m615FN("*=")) {
            this.f469i.add(new AbstractC0123i.oK(strM617MH, c0121hg.m624k()));
        } else {
            if (!c0121hg.m615FN("~=")) {
                throw new C0055AV.p("Could not parse attribute query '%s': unexpected token at '%s'", this.f468Mo, c0121hg.m624k());
            }
            this.f469i.add(new AbstractC0123i.Vm(strM617MH, Pattern.compile(c0121hg.m624k())));
        }
    }

    /* renamed from: IS */
    AbstractC0123i m308IS() throws NumberFormatException {
        this.f470u.m626se();
        if (this.f470u.m614F(f466q)) {
            this.f469i.add(new AbstractC0070KB.t7());
            m295Mo(this.f470u.m619QU());
        } else {
            m289B();
        }
        while (!this.f470u.m622W()) {
            boolean zM626se = this.f470u.m626se();
            if (this.f470u.m614F(f466q)) {
                m295Mo(this.f470u.m619QU());
            } else if (zM626se) {
                m295Mo(' ');
            } else {
                m289B();
            }
        }
        return this.f469i.size() == 1 ? this.f469i.get(0) : new AbstractC0144sn.p(this.f469i);
    }

    public String toString() {
        return this.f468Mo;
    }
}
