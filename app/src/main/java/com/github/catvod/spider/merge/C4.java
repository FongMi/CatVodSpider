package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Wf;
import com.github.catvod.spider.merge.aI;
import com.github.catvod.spider.merge.cE;
import com.github.catvod.spider.merge.i3;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C4 {
    private final ZR OL;
    private final String l;
    private final List<i3> tT = new ArrayList();
    private static final String[] l8 = {",", ">", "+", "~", " "};
    private static final String[] S = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern T4 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern b = Pattern.compile("([+-])?(\\d+)");

    private C4(String str) {
        Rc.tT(str);
        String strTrim = str.trim();
        this.l = strTrim;
        this.OL = new ZR(strTrim);
    }

    private void A() {
        if (this.OL.v("#")) {
            b();
            return;
        }
        if (this.OL.v(".")) {
            T4();
            return;
        }
        if (this.OL.Kf() || this.OL.A("*|")) {
            OL();
            return;
        }
        if (this.OL.A("[")) {
            S();
            return;
        }
        if (this.OL.v("*")) {
            l8();
            return;
        }
        if (this.OL.v(":lt(")) {
            Kf();
            return;
        }
        if (this.OL.v(":gt(")) {
            hR();
            return;
        }
        if (this.OL.v(":eq(")) {
            s();
            return;
        }
        if (this.OL.A(":has(")) {
            cD();
            return;
        }
        if (this.OL.A(":contains(")) {
            HM(false);
            return;
        }
        if (this.OL.A(":containsOwn(")) {
            HM(true);
            return;
        }
        if (this.OL.A(":containsData(")) {
            n();
            return;
        }
        if (this.OL.A(":matches(")) {
            E9(false);
            return;
        }
        if (this.OL.A(":matchesOwn(")) {
            E9(true);
            return;
        }
        if (this.OL.A(":not(")) {
            uS();
            return;
        }
        if (this.OL.v(":nth-child(")) {
            v(false, false);
            return;
        }
        if (this.OL.v(":nth-last-child(")) {
            v(true, false);
            return;
        }
        if (this.OL.v(":nth-of-type(")) {
            v(false, true);
            return;
        }
        if (this.OL.v(":nth-last-of-type(")) {
            v(true, true);
            return;
        }
        if (this.OL.v(":first-child")) {
            this.tT.add(new i3.VT());
            return;
        }
        if (this.OL.v(":last-child")) {
            this.tT.add(new i3.F());
            return;
        }
        if (this.OL.v(":first-of-type")) {
            this.tT.add(new i3.dY());
            return;
        }
        if (this.OL.v(":last-of-type")) {
            this.tT.add(new i3.n());
            return;
        }
        if (this.OL.v(":only-child")) {
            this.tT.add(new i3.cp());
            return;
        }
        if (this.OL.v(":only-of-type")) {
            this.tT.add(new i3.D());
            return;
        }
        if (this.OL.v(":empty")) {
            this.tT.add(new i3.ib());
        } else if (this.OL.v(":root")) {
            this.tT.add(new i3.X0());
        } else {
            if (!this.OL.v(":matchText")) {
                throw new aI.aA("Could not parse query '%s': unexpected token at '%s'", this.l, this.OL.E9());
            }
            this.tT.add(new i3.ff());
        }
    }

    private void E9(boolean z) {
        this.OL.b(z ? ":matchesOwn" : ":matches");
        String strL8 = this.OL.l8('(', ')');
        Rc.N(strL8, ":matches(regex) query must not be empty");
        if (z) {
            this.tT.add(new i3.p(Pattern.compile(strL8)));
        } else {
            this.tT.add(new i3.O5(Pattern.compile(strL8)));
        }
    }

    private void HM(boolean z) {
        this.OL.b(z ? ":containsOwn" : ":contains");
        String strC = ZR.c(this.OL.l8('(', ')'));
        Rc.N(strC, ":contains(text) query must not be empty");
        if (z) {
            this.tT.add(new i3.cI(strC));
        } else {
            this.tT.add(new i3.U(strC));
        }
    }

    private void Kf() {
        this.tT.add(new i3.Zv(tT()));
    }

    private String N() {
        StringBuilder sbS = tv.S();
        while (!this.OL.n()) {
            if (this.OL.A("(")) {
                sbS.append("(");
                sbS.append(this.OL.l8('(', ')'));
                sbS.append(")");
            } else if (this.OL.A("[")) {
                sbS.append("[");
                sbS.append(this.OL.l8('[', ']'));
                sbS.append("]");
            } else {
                if (this.OL.s(l8)) {
                    break;
                }
                sbS.append(this.OL.T4());
            }
        }
        return tv.cD(sbS);
    }

    private void OL() {
        String strS = kA.S(this.OL.l());
        Rc.tT(strS);
        if (strS.startsWith("*|")) {
            this.tT.add(new Wf.ut(new i3.MN(strS), new i3.G(strS.replace("*|", ":"))));
            return;
        }
        if (strS.contains("|")) {
            strS = strS.replace("|", ":");
        }
        this.tT.add(new i3.MN(strS));
    }

    private void S() {
        ZR zr = new ZR(this.OL.l8('[', ']'));
        String strN = zr.N(S);
        Rc.tT(strN);
        zr.HM();
        if (zr.n()) {
            if (strN.startsWith("^")) {
                this.tT.add(new i3.c(strN.substring(1)));
                return;
            } else {
                this.tT.add(new i3.ut(strN));
                return;
            }
        }
        if (zr.v("=")) {
            this.tT.add(new i3.xq(strN, zr.E9()));
            return;
        }
        if (zr.v("!=")) {
            this.tT.add(new i3.Ph(strN, zr.E9()));
            return;
        }
        if (zr.v("^=")) {
            this.tT.add(new i3.Q(strN, zr.E9()));
            return;
        }
        if (zr.v("$=")) {
            this.tT.add(new i3.XT(strN, zr.E9()));
        } else if (zr.v("*=")) {
            this.tT.add(new i3.OD(strN, zr.E9()));
        } else {
            if (!zr.v("~=")) {
                throw new aI.aA("Could not parse attribute query '%s': unexpected token at '%s'", this.l, zr.E9());
            }
            this.tT.add(new i3.i(strN, Pattern.compile(zr.E9())));
        }
    }

    private void T4() {
        String strOL = this.OL.OL();
        Rc.tT(strOL);
        this.tT.add(new i3.a(strOL.trim()));
    }

    private void b() {
        String strOL = this.OL.OL();
        Rc.tT(strOL);
        this.tT.add(new i3.k(strOL));
    }

    private void cD() {
        this.OL.b(":has");
        String strL8 = this.OL.l8('(', ')');
        Rc.N(strL8, ":has(el) subselect must not be empty");
        this.tT.add(new cE.aA(eD(strL8)));
    }

    public static i3 eD(String str) {
        try {
            return new C4(str).c();
        } catch (IllegalArgumentException e) {
            throw new aI.aA(e.getMessage(), new Object[0]);
        }
    }

    private void hR() {
        this.tT.add(new i3.ii(tT()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l(char r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C4.l(char):void");
    }

    private void l8() {
        this.tT.add(new i3.aA());
    }

    private void n() {
        this.OL.b(":containsData");
        String strC = ZR.c(this.OL.l8('(', ')'));
        Rc.N(strC, ":containsData(text) query must not be empty");
        this.tT.add(new i3.b(strC));
    }

    private void s() {
        this.tT.add(new i3.L(tT()));
    }

    private int tT() {
        String strTrim = this.OL.S(")").trim();
        Rc.b(tv.N(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    private void uS() {
        this.OL.b(":not");
        String strL8 = this.OL.l8('(', ')');
        Rc.N(strL8, ":not(selector) subselect must not be empty");
        this.tT.add(new cE.c(eD(strL8)));
    }

    private void v(boolean z, boolean z2) {
        String strS = kA.S(this.OL.S(")"));
        Matcher matcher = T4.matcher(strS);
        Matcher matcher2 = b.matcher(strS);
        int i = 2;
        if ("odd".equals(strS)) {
            i = 1;
        } else if (!"even".equals(strS)) {
            if (matcher.matches()) {
                int i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i2;
            } else {
                if (!matcher2.matches()) {
                    throw new aI.aA("Could not parse nth-index '%s': unexpected format", strS);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            }
        }
        if (z2) {
            if (z) {
                this.tT.add(new i3.ok(i, i));
                return;
            } else {
                this.tT.add(new i3.j(i, i));
                return;
            }
        }
        if (z) {
            this.tT.add(new i3.No(i, i));
        } else {
            this.tT.add(new i3.Z(i, i));
        }
    }

    i3 c() {
        this.OL.HM();
        if (this.OL.s(l8)) {
            this.tT.add(new cE.XT());
            l(this.OL.T4());
        } else {
            A();
        }
        while (!this.OL.n()) {
            boolean zHM = this.OL.HM();
            if (this.OL.s(l8)) {
                l(this.OL.T4());
            } else if (zHM) {
                l(' ');
            } else {
                A();
            }
        }
        return this.tT.size() == 1 ? this.tT.get(0) : new Wf.aA(this.tT);
    }

    public String toString() {
        return this.l;
    }
}
