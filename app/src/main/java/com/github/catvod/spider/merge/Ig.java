package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.mt;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class Ig {
    static final int[] S = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private static final char[] l8;
    private String E9;
    private final kJ T4;
    private final O b;
    private mt l;
    mt.Ph v;
    private m OL = m.l8;
    private boolean tT = false;
    private String N = null;
    private StringBuilder HM = new StringBuilder(1024);
    StringBuilder n = new StringBuilder(1024);
    mt.i A = new mt.i();
    mt.XT cD = new mt.XT();
    mt.Y s = new mt.Y();
    mt.xq hR = new mt.xq();
    mt.c Kf = new mt.c();
    private final int[] uS = new int[1];
    private final int[] c = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        l8 = cArr;
        Arrays.sort(cArr);
    }

    Ig(kJ kJVar, O o) {
        this.T4 = kJVar;
        this.b = o;
    }

    private void T4(String str) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), "Invalid character reference: %s", str));
        }
    }

    void A(StringBuilder sb) {
        if (this.N == null) {
            this.N = sb.toString();
            return;
        }
        if (this.HM.length() == 0) {
            this.HM.append(this.N);
        }
        this.HM.append((CharSequence) sb);
    }

    void C(m mVar) {
        this.OL = mVar;
    }

    void E9() {
        this.v.OY();
        cD(this.v);
    }

    void HM() {
        mt.s(this.n);
    }

    void Kf() {
        cD(this.hR);
    }

    mt.Ph N(boolean z) {
        mt.Ph phCD = z ? this.A.cD() : this.cD.cD();
        this.v = phCD;
        return phCD;
    }

    void OL() {
        this.Kf.cD();
        this.Kf.b = true;
    }

    boolean Q() {
        return this.E9 != null && this.v.G().equalsIgnoreCase(this.E9);
    }

    String S() {
        return this.E9;
    }

    mt W() {
        while (!this.tT) {
            this.OL.HM(this, this.T4);
        }
        StringBuilder sb = this.HM;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.N = null;
            return this.s.Kf(string);
        }
        String str = this.N;
        if (str == null) {
            this.tT = false;
            return this.l;
        }
        mt.Y yKf = this.s.Kf(str);
        this.N = null;
        return yKf;
    }

    int[] b(Character ch, boolean z) {
        int iIntValue;
        if (this.T4.Q()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.T4.eD()) || this.T4.rD(l8)) {
            return null;
        }
        int[] iArr = this.uS;
        this.T4.C();
        if (this.T4.OY("#")) {
            boolean zR1 = this.T4.r1("X");
            kJ kJVar = this.T4;
            String strHM = zR1 ? kJVar.HM() : kJVar.N();
            if (strHM.length() == 0) {
                T4("numeric reference with no numerals");
                this.T4.PP();
                return null;
            }
            this.T4.mF();
            if (!this.T4.OY(";")) {
                T4("missing semicolon");
            }
            try {
                iIntValue = Integer.valueOf(strHM, zR1 ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                T4("character outside of valid range");
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128) {
                    int[] iArr2 = S;
                    if (iIntValue < iArr2.length + 128) {
                        T4("character is not a valid unicode code point");
                        iIntValue = iArr2[iIntValue - 128];
                    }
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        String strV = this.T4.v();
        boolean zR = this.T4.R(';');
        if (!(Y9.l(strV) || (Y9.tT(strV) && zR))) {
            this.T4.PP();
            if (zR) {
                T4("invalid named reference");
            }
            return null;
        }
        if (z && (this.T4.hd() || this.T4.oH() || this.T4.G('=', '-', '_'))) {
            this.T4.PP();
            return null;
        }
        this.T4.mF();
        if (!this.T4.OY(";")) {
            T4("missing semicolon");
        }
        int iB = Y9.b(strV, this.c);
        if (iB == 1) {
            iArr[0] = this.c[0];
            return iArr;
        }
        if (iB == 2) {
            return this.c;
        }
        Rc.l8("Unexpected characters returned for " + strV);
        return this.c;
    }

    void c(String str) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), str));
        }
    }

    void cD(mt mtVar) {
        Rc.S(this.tT);
        this.l = mtVar;
        this.tT = true;
        mt.Q q = mtVar.l8;
        if (q == mt.Q.StartTag) {
            this.E9 = ((mt.i) mtVar).S;
        } else if (q == mt.Q.EndTag && ((mt.XT) mtVar).R()) {
            c("Attributes incorrectly present on end tag");
        }
    }

    void eD(m mVar) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.T4.eD()), mVar));
        }
    }

    void hR() {
        cD(this.Kf);
    }

    void l() {
        this.Kf.cD();
    }

    void l8(m mVar) {
        this.T4.l8();
        this.OL = mVar;
    }

    void n(char c) {
        if (this.N == null) {
            this.N = String.valueOf(c);
            return;
        }
        if (this.HM.length() == 0) {
            this.HM.append(this.N);
        }
        this.HM.append(c);
    }

    void s(int[] iArr) {
        v(new String(iArr, 0, iArr.length));
    }

    void tT() {
        this.hR.cD();
    }

    void uS(m mVar) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), "Unexpectedly reached end of file (EOF) in input state [%s]", mVar));
        }
    }

    void v(String str) {
        if (this.N == null) {
            this.N = str;
            return;
        }
        if (this.HM.length() == 0) {
            this.HM.append(this.N);
        }
        this.HM.append(str);
    }
}
