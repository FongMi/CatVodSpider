package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.Eo */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public final class C0060Eo {

    /* renamed from: MH */
    private String[] f347MH;

    /* renamed from: Mo */
    private int f348Mo;

    /* renamed from: QU */
    private int f349QU;

    /* renamed from: UJ */
    private int f350UJ;

    /* renamed from: i */
    private int f351i;

    /* renamed from: q */
    private char[] f352q;

    /* renamed from: se */
    private boolean f353se;

    /* renamed from: u */
    private int f354u;

    /* renamed from: xC */
    private Reader f355xC;

    public C0060Eo(Reader reader, int i) throws IOException {
        this.f351i = -1;
        this.f347MH = new String[512];
        C0111bw.m559se(reader);
        C0111bw.m554QU(reader.markSupported());
        this.f355xC = reader;
        this.f352q = new char[Math.min(i, 32768)];
        m159xC();
    }

    /* renamed from: QU */
    private static String m156QU(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 * 31;
        int i4 = 0;
        int i5 = i;
        while (i4 < i2) {
            i3 = (i3 * 31) + cArr[i5];
            i4++;
            i5++;
        }
        int i6 = i3 & 511;
        String str = strArr[i6];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[i6] = str2;
            return str2;
        }
        if (m158s(cArr, i, i2, str)) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[i6] = str3;
        return str3;
    }

    /* renamed from: go */
    private boolean m157go() {
        return this.f354u >= this.f349QU;
    }

    /* renamed from: s */
    static boolean m158s(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* renamed from: xC */
    private void m159xC() throws IOException {
        int i;
        int i2;
        boolean z;
        if (this.f353se || (i = this.f354u) < this.f350UJ) {
            return;
        }
        int i3 = this.f351i;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f355xC.skip(j);
            this.f355xC.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.f355xC;
                char[] cArr = this.f352q;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f353se = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f355xC.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C0111bw.m554QU(z);
                this.f349QU = i4;
                this.f348Mo += i;
                this.f354u = i2;
                if (this.f351i != -1) {
                    this.f351i = 0;
                }
                this.f350UJ = Math.min(i4, 24576);
            }
        } catch (IOException e) {
            throw new C0161ze(e);
        }
    }

    /* renamed from: B */
    String m160B() {
        int i = this.f354u;
        int i2 = this.f349QU;
        char[] cArr = this.f352q;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f354u = i3;
        return i3 > i ? m156QU(this.f352q, this.f347MH, i, i3 - i) : "";
    }

    /* renamed from: BP */
    boolean m161BP(String str) throws IOException {
        m159xC();
        if (!m165Fp(str)) {
            return false;
        }
        this.f354u += str.length();
        return true;
    }

    /* renamed from: E */
    public char m162E() throws IOException {
        m159xC();
        if (m157go()) {
            return (char) 65535;
        }
        return this.f352q[this.f354u];
    }

    /* renamed from: F */
    public String m163F(char c) throws IOException {
        int iM175U = m175U(c);
        if (iM175U == -1) {
            return m174Tz();
        }
        String strM156QU = m156QU(this.f352q, this.f347MH, this.f354u, iM175U);
        this.f354u += iM175U;
        return strM156QU;
    }

    /* renamed from: FN */
    String m164FN() throws IOException {
        char c;
        m159xC();
        int i = this.f354u;
        while (true) {
            int i2 = this.f354u;
            if (i2 >= this.f349QU || (((c = this.f352q[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f354u++;
        }
        while (!m157go()) {
            char[] cArr = this.f352q;
            int i3 = this.f354u;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f354u = i3 + 1;
        }
        return m156QU(this.f352q, this.f347MH, i, this.f354u - i);
    }

    /* renamed from: Fp */
    boolean m165Fp(String str) throws IOException {
        m159xC();
        int length = str.length();
        if (length > this.f349QU - this.f354u) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f352q[this.f354u + i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: IS */
    boolean m166IS(String str) {
        Locale locale = Locale.ENGLISH;
        return m185m(str.toLowerCase(locale)) > -1 || m185m(str.toUpperCase(locale)) > -1;
    }

    /* renamed from: KT */
    public String m167KT(char... cArr) throws IOException {
        m159xC();
        int i = this.f354u;
        int i2 = this.f349QU;
        char[] cArr2 = this.f352q;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f354u = i3;
        return i3 > i ? m156QU(this.f352q, this.f347MH, i, i3 - i) : "";
    }

    /* renamed from: M */
    void m168M() {
        int i = this.f354u;
        if (i < 1) {
            throw new C0161ze(new IOException("WTF: No buffer left to unconsume."));
        }
        this.f354u = i - 1;
    }

    /* renamed from: MH */
    String m169MH() throws IOException {
        int i;
        char c;
        m159xC();
        int i2 = this.f354u;
        while (true) {
            i = this.f354u;
            if (i >= this.f349QU || (c = this.f352q[i]) < '0' || c > '9') {
                break;
            }
            this.f354u = i + 1;
        }
        return m156QU(this.f352q, this.f347MH, i2, i - i2);
    }

    /* renamed from: Mo */
    String m170Mo(boolean z) {
        int i = this.f354u;
        int i2 = this.f349QU;
        char[] cArr = this.f352q;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c == '\'') {
                    if (!z) {
                        break;
                        break;
                    }
                    break;
                }
                continue;
                i3++;
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.f354u = i3;
        return i3 > i ? m156QU(this.f352q, this.f347MH, i, i3 - i) : "";
    }

    /* renamed from: P */
    boolean m171P(char[] cArr) throws IOException {
        m159xC();
        return !m186p() && Arrays.binarySearch(cArr, this.f352q[this.f354u]) >= 0;
    }

    /* renamed from: RH */
    String m172RH(String str) throws IOException {
        int iM185m = m185m(str);
        if (iM185m != -1) {
            String strM156QU = m156QU(this.f352q, this.f347MH, this.f354u, iM185m);
            this.f354u += iM185m;
            return strM156QU;
        }
        if (this.f349QU - this.f354u < str.length()) {
            return m174Tz();
        }
        int length = (this.f349QU - str.length()) + 1;
        char[] cArr = this.f352q;
        String[] strArr = this.f347MH;
        int i = this.f354u;
        String strM156QU2 = m156QU(cArr, strArr, i, length - i);
        this.f354u = length;
        return strM156QU2;
    }

    /* renamed from: T */
    public int m173T() {
        return this.f348Mo + this.f354u;
    }

    /* renamed from: Tz */
    String m174Tz() throws IOException {
        m159xC();
        char[] cArr = this.f352q;
        String[] strArr = this.f347MH;
        int i = this.f354u;
        String strM156QU = m156QU(cArr, strArr, i, this.f349QU - i);
        this.f354u = this.f349QU;
        return strM156QU;
    }

    /* renamed from: U */
    int m175U(char c) throws IOException {
        m159xC();
        for (int i = this.f354u; i < this.f349QU; i++) {
            if (c == this.f352q[i]) {
                return i - this.f354u;
            }
        }
        return -1;
    }

    /* renamed from: UJ */
    public void m176UJ() {
        Reader reader = this.f355xC;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f355xC = null;
            this.f352q = null;
            this.f347MH = null;
            throw th;
        }
        this.f355xC = null;
        this.f352q = null;
        this.f347MH = null;
    }

    /* renamed from: UN */
    boolean m177UN(char c) {
        return !m186p() && this.f352q[this.f354u] == c;
    }

    /* renamed from: W */
    String m178W() throws IOException {
        char c;
        m159xC();
        int i = this.f354u;
        while (true) {
            int i2 = this.f354u;
            if (i2 >= this.f349QU || (((c = this.f352q[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f354u++;
        }
        return m156QU(this.f352q, this.f347MH, i, this.f354u - i);
    }

    /* renamed from: Xl */
    boolean m179Xl() {
        char c;
        return !m186p() && (c = this.f352q[this.f354u]) >= '0' && c <= '9';
    }

    /* renamed from: d */
    boolean m180d() {
        if (m186p()) {
            return false;
        }
        char c = this.f352q[this.f354u];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* renamed from: fH */
    boolean m181fH(String str) throws IOException {
        m159xC();
        int length = str.length();
        if (length > this.f349QU - this.f354u) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f352q[this.f354u + i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    String m182i() {
        int i = this.f354u;
        int i2 = this.f349QU;
        char[] cArr = this.f352q;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f354u = i3;
        return i3 > i ? m156QU(this.f352q, this.f347MH, i, i3 - i) : "";
    }

    /* renamed from: k */
    String m183k(char... cArr) throws IOException {
        m159xC();
        int i = this.f354u;
        int i2 = this.f349QU;
        char[] cArr2 = this.f352q;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f354u = i3;
        return i3 > i ? m156QU(this.f352q, this.f347MH, i, i3 - i) : "";
    }

    /* renamed from: l */
    void m184l() throws IOException {
        if (this.f349QU - this.f354u < 1024) {
            this.f350UJ = 0;
        }
        m159xC();
        this.f351i = this.f354u;
    }

    /* renamed from: m */
    int m185m(CharSequence charSequence) throws IOException {
        m159xC();
        char cCharAt = charSequence.charAt(0);
        int i = this.f354u;
        while (i < this.f349QU) {
            if (cCharAt != this.f352q[i]) {
                do {
                    i++;
                    if (i >= this.f349QU) {
                        break;
                    }
                } while (cCharAt != this.f352q[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f349QU;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f352q[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f354u;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: p */
    public boolean m186p() throws IOException {
        m159xC();
        return this.f354u >= this.f349QU;
    }

    /* renamed from: pb */
    boolean m187pb(char... cArr) throws IOException {
        if (m186p()) {
            return false;
        }
        m159xC();
        char c = this.f352q[this.f354u];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void m188q() {
        this.f354u++;
    }

    /* renamed from: rF */
    void m189rF() {
        int i = this.f351i;
        if (i == -1) {
            throw new C0161ze(new IOException("Mark invalid"));
        }
        this.f354u = i;
        m193wR();
    }

    /* renamed from: se */
    String m190se() throws IOException {
        int i;
        char c;
        m159xC();
        int i2 = this.f354u;
        while (true) {
            i = this.f354u;
            if (i >= this.f349QU || (((c = this.f352q[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f354u = i + 1;
        }
        return m156QU(this.f352q, this.f347MH, i2, i - i2);
    }

    public String toString() {
        if (this.f349QU - this.f354u < 0) {
            return "";
        }
        char[] cArr = this.f352q;
        int i = this.f354u;
        return new String(cArr, i, this.f349QU - i);
    }

    /* renamed from: u */
    char m191u() throws IOException {
        m159xC();
        char c = m157go() ? (char) 65535 : this.f352q[this.f354u];
        this.f354u++;
        return c;
    }

    /* renamed from: w8 */
    String m192w8() throws IOException {
        m159xC();
        int i = this.f354u;
        int i2 = this.f349QU;
        char[] cArr = this.f352q;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i3++;
        }
        this.f354u = i3;
        return i3 > i ? m156QU(this.f352q, this.f347MH, i, i3 - i) : "";
    }

    /* renamed from: wR */
    void m193wR() {
        this.f351i = -1;
    }

    /* renamed from: yS */
    boolean m194yS(String str) {
        if (!m181fH(str)) {
            return false;
        }
        this.f354u += str.length();
        return true;
    }

    public C0060Eo(Reader reader) {
        this(reader, 32768);
    }

    public C0060Eo(String str) {
        this(new StringReader(str), str.length());
    }
}
