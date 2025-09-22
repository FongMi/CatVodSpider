package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0108Zo;
import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.EV */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
final class C0059EV {

    /* renamed from: q */
    private static final char[] f328q;

    /* renamed from: xC */
    static final int[] f329xC = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: FN */
    AbstractC0108Zo.yn f332FN;

    /* renamed from: Mo */
    private AbstractC0108Zo f336Mo;

    /* renamed from: QU */
    private final C0060Eo f337QU;

    /* renamed from: UJ */
    private final C0104Yh f340UJ;

    /* renamed from: k */
    private String f343k;

    /* renamed from: u */
    private EnumC0115dT f345u = EnumC0115dT.f657q;

    /* renamed from: i */
    private boolean f342i = false;

    /* renamed from: MH */
    private String f335MH = null;

    /* renamed from: se */
    private StringBuilder f344se = new StringBuilder(1024);

    /* renamed from: W */
    StringBuilder f341W = new StringBuilder(1024);

    /* renamed from: B */
    AbstractC0108Zo.Vm f330B = new AbstractC0108Zo.Vm();

    /* renamed from: w8 */
    AbstractC0108Zo.t7 f346w8 = new AbstractC0108Zo.t7();

    /* renamed from: F */
    AbstractC0108Zo.J f331F = new AbstractC0108Zo.J();

    /* renamed from: RH */
    AbstractC0108Zo.Qt f338RH = new AbstractC0108Zo.Qt();

    /* renamed from: KT */
    AbstractC0108Zo.FD f334KT = new AbstractC0108Zo.FD();

    /* renamed from: Tz */
    private final int[] f339Tz = new int[1];

    /* renamed from: IS */
    private final int[] f333IS = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f328q = cArr;
        Arrays.sort(cArr);
    }

    C0059EV(C0060Eo c0060Eo, C0104Yh c0104Yh) {
        this.f337QU = c0060Eo;
        this.f340UJ = c0104Yh;
    }

    /* renamed from: QU */
    private void m133QU(String str) {
        if (this.f340UJ.m479q()) {
            this.f340UJ.add(new C0069K(this.f337QU.m173T(), "Invalid character reference: %s", str));
        }
    }

    /* renamed from: B */
    void m134B(StringBuilder sb) {
        if (this.f335MH == null) {
            this.f335MH = sb.toString();
            return;
        }
        if (this.f344se.length() == 0) {
            this.f344se.append(this.f335MH);
        }
        this.f344se.append((CharSequence) sb);
    }

    /* renamed from: E */
    void m135E(EnumC0115dT enumC0115dT) {
        if (this.f340UJ.m479q()) {
            this.f340UJ.add(new C0069K(this.f337QU.m173T(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f337QU.m162E()), enumC0115dT));
        }
    }

    /* renamed from: F */
    void m136F(int[] iArr) {
        m137FN(new String(iArr, 0, iArr.length));
    }

    /* renamed from: FN */
    void m137FN(String str) {
        if (this.f335MH == null) {
            this.f335MH = str;
            return;
        }
        if (this.f344se.length() == 0) {
            this.f344se.append(this.f335MH);
        }
        this.f344se.append(str);
    }

    /* renamed from: IS */
    void m138IS(String str) {
        if (this.f340UJ.m479q()) {
            this.f340UJ.add(new C0069K(this.f337QU.m173T(), str));
        }
    }

    /* renamed from: KT */
    void m139KT() {
        m154w8(this.f338RH);
    }

    /* renamed from: MH */
    AbstractC0108Zo.yn m140MH(boolean z) {
        AbstractC0108Zo.yn ynVarMo517w8 = z ? this.f330B.mo517w8() : this.f346w8.mo517w8();
        this.f332FN = ynVarMo517w8;
        return ynVarMo517w8;
    }

    /* renamed from: Mo */
    void m141Mo() {
        this.f334KT.mo517w8();
    }

    /* renamed from: RH */
    void m142RH() {
        m154w8(this.f334KT);
    }

    /* renamed from: Tz */
    void m143Tz(EnumC0115dT enumC0115dT) {
        if (this.f340UJ.m479q()) {
            this.f340UJ.add(new C0069K(this.f337QU.m173T(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC0115dT));
        }
    }

    /* renamed from: UJ */
    int[] m144UJ(Character ch, boolean z) {
        int iIntValue;
        if (this.f337QU.m186p()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f337QU.m162E()) || this.f337QU.m171P(f328q)) {
            return null;
        }
        int[] iArr = this.f339Tz;
        this.f337QU.m184l();
        if (this.f337QU.m161BP("#")) {
            boolean zM194yS = this.f337QU.m194yS("X");
            C0060Eo c0060Eo = this.f337QU;
            String strM190se = zM194yS ? c0060Eo.m190se() : c0060Eo.m169MH();
            if (strM190se.length() == 0) {
                m133QU("numeric reference with no numerals");
                this.f337QU.m189rF();
                return null;
            }
            this.f337QU.m193wR();
            if (!this.f337QU.m161BP(";")) {
                m133QU("missing semicolon");
            }
            try {
                iIntValue = Integer.valueOf(strM190se, zM194yS ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                m133QU("character outside of valid range");
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128) {
                    int[] iArr2 = f329xC;
                    if (iIntValue < iArr2.length + 128) {
                        m133QU("character is not a valid unicode code point");
                        iIntValue = iArr2[iIntValue - 128];
                    }
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        String strM164FN = this.f337QU.m164FN();
        boolean zM177UN = this.f337QU.m177UN(';');
        if (!(C0090SP.m419Mo(strM164FN) || (C0090SP.m422i(strM164FN) && zM177UN))) {
            this.f337QU.m189rF();
            if (zM177UN) {
                m133QU("invalid named reference");
            }
            return null;
        }
        if (z && (this.f337QU.m180d() || this.f337QU.m179Xl() || this.f337QU.m187pb('=', '-', '_'))) {
            this.f337QU.m189rF();
            return null;
        }
        this.f337QU.m193wR();
        if (!this.f337QU.m161BP(";")) {
            m133QU("missing semicolon");
        }
        int iM421UJ = C0090SP.m421UJ(strM164FN, this.f333IS);
        if (iM421UJ == 1) {
            iArr[0] = this.f333IS[0];
            return iArr;
        }
        if (iM421UJ == 2) {
            return this.f333IS;
        }
        C0111bw.m558q("Unexpected characters returned for " + strM164FN);
        return this.f333IS;
    }

    /* renamed from: W */
    void m145W(char c) {
        if (this.f335MH == null) {
            this.f335MH = String.valueOf(c);
            return;
        }
        if (this.f344se.length() == 0) {
            this.f344se.append(this.f335MH);
        }
        this.f344se.append(c);
    }

    /* renamed from: go */
    AbstractC0108Zo m146go() {
        while (!this.f342i) {
            this.f345u.mo591se(this, this.f337QU);
        }
        StringBuilder sb = this.f344se;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f335MH = null;
            return this.f331F.m523KT(string);
        }
        String str = this.f335MH;
        if (str == null) {
            this.f342i = false;
            return this.f336Mo;
        }
        AbstractC0108Zo.J jM523KT = this.f331F.m523KT(str);
        this.f335MH = null;
        return jM523KT;
    }

    /* renamed from: i */
    void m147i() {
        this.f338RH.mo517w8();
    }

    /* renamed from: k */
    void m148k() {
        this.f332FN.m534BP();
        m154w8(this.f332FN);
    }

    /* renamed from: l */
    void m149l(EnumC0115dT enumC0115dT) {
        this.f345u = enumC0115dT;
    }

    /* renamed from: p */
    boolean m150p() {
        return this.f343k != null && this.f332FN.m549pb().equalsIgnoreCase(this.f343k);
    }

    /* renamed from: q */
    void m151q(EnumC0115dT enumC0115dT) {
        this.f337QU.m188q();
        this.f345u = enumC0115dT;
    }

    /* renamed from: se */
    void m152se() {
        AbstractC0108Zo.m504F(this.f341W);
    }

    /* renamed from: u */
    void m153u() {
        this.f334KT.mo517w8();
        this.f334KT.f574UJ = true;
    }

    /* renamed from: w8 */
    void m154w8(AbstractC0108Zo abstractC0108Zo) {
        C0111bw.m561xC(this.f342i);
        this.f336Mo = abstractC0108Zo;
        this.f342i = true;
        AbstractC0108Zo.O o = abstractC0108Zo.f572q;
        if (o == AbstractC0108Zo.O.StartTag) {
            this.f343k = ((AbstractC0108Zo.Vm) abstractC0108Zo).f597xC;
        } else if (o == AbstractC0108Zo.O.EndTag && ((AbstractC0108Zo.t7) abstractC0108Zo).m542UN()) {
            m138IS("Attributes incorrectly present on end tag");
        }
    }

    /* renamed from: xC */
    String m155xC() {
        return this.f343k;
    }
}
