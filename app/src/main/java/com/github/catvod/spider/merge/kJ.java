package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class kJ {
    private boolean HM;
    private String[] N;
    private int OL;
    private Reader S;
    private int T4;
    private int b;
    private int l;
    private char[] l8;
    private int tT;

    public kJ(Reader reader, int i) {
        this.tT = -1;
        this.N = new String[512];
        Rc.HM(reader);
        Rc.T4(reader.markSupported());
        this.S = reader;
        this.l8 = new char[Math.min(i, 32768)];
        S();
    }

    static boolean H6(char[] cArr, int i, int i2, String str) {
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

    private void S() {
        int i;
        int i2;
        boolean z;
        if (this.HM || (i = this.OL) < this.b) {
            return;
        }
        int i3 = this.tT;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.S.skip(j);
            this.S.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.S;
                char[] cArr = this.l8;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.HM = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.S.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                Rc.T4(z);
                this.T4 = i4;
                this.l += i;
                this.OL = i2;
                if (this.tT != -1) {
                    this.tT = 0;
                }
                this.b = Math.min(i4, 24576);
            }
        } catch (IOException e) {
            throw new VU(e);
        }
    }

    private static String T4(char[] cArr, String[] strArr, int i, int i2) {
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
        if (H6(cArr, i, i2, str)) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[i6] = str3;
        return str3;
    }

    private boolean W() {
        return this.OL >= this.T4;
    }

    String A() {
        int i = this.OL;
        int i2 = this.T4;
        char[] cArr = this.l8;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.OL = i3;
        return i3 > i ? T4(this.l8, this.N, i, i3 - i) : "";
    }

    boolean A0(String str) {
        S();
        int length = str.length();
        if (length > this.T4 - this.OL) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.l8[this.OL + i])) {
                return false;
            }
        }
        return true;
    }

    public int Bz() {
        return this.l + this.OL;
    }

    void C() {
        if (this.T4 - this.OL < 1024) {
            this.b = 0;
        }
        S();
        this.tT = this.OL;
    }

    String E9(char... cArr) {
        S();
        int i = this.OL;
        int i2 = this.T4;
        char[] cArr2 = this.l8;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.OL = i3;
        return i3 > i ? T4(this.l8, this.N, i, i3 - i) : "";
    }

    boolean G(char... cArr) {
        if (Q()) {
            return false;
        }
        S();
        char c = this.l8[this.OL];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    String HM() {
        int i;
        char c;
        S();
        int i2 = this.OL;
        while (true) {
            i = this.OL;
            if (i >= this.T4 || (((c = this.l8[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.OL = i + 1;
        }
        return T4(this.l8, this.N, i2, i - i2);
    }

    public String Kf(char... cArr) {
        S();
        int i = this.OL;
        int i2 = this.T4;
        char[] cArr2 = this.l8;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.OL = i3;
        return i3 > i ? T4(this.l8, this.N, i, i3 - i) : "";
    }

    String N() {
        int i;
        char c;
        S();
        int i2 = this.OL;
        while (true) {
            i = this.OL;
            if (i >= this.T4 || (c = this.l8[i]) < '0' || c > '9') {
                break;
            }
            this.OL = i + 1;
        }
        return T4(this.l8, this.N, i2, i - i2);
    }

    int O(CharSequence charSequence) {
        S();
        char cCharAt = charSequence.charAt(0);
        int i = this.OL;
        while (i < this.T4) {
            if (cCharAt != this.l8[i]) {
                do {
                    i++;
                    if (i >= this.T4) {
                        break;
                    }
                } while (cCharAt != this.l8[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.T4;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.l8[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.OL;
                }
            }
            i = i2;
        }
        return -1;
    }

    char OL() {
        S();
        char c = W() ? (char) 65535 : this.l8[this.OL];
        this.OL++;
        return c;
    }

    boolean OY(String str) {
        S();
        if (!bc(str)) {
            return false;
        }
        this.OL += str.length();
        return true;
    }

    void PP() {
        int i = this.tT;
        if (i == -1) {
            throw new VU(new IOException("Mark invalid"));
        }
        this.OL = i;
        mF();
    }

    public boolean Q() {
        S();
        return this.OL >= this.T4;
    }

    boolean R(char c) {
        return !Q() && this.l8[this.OL] == c;
    }

    public void b() {
        Reader reader = this.S;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.S = null;
            this.l8 = null;
            this.N = null;
            throw th;
        }
        this.S = null;
        this.l8 = null;
        this.N = null;
    }

    boolean bc(String str) {
        S();
        int length = str.length();
        if (length > this.T4 - this.OL) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.l8[this.OL + i]) {
                return false;
            }
        }
        return true;
    }

    boolean c(String str) {
        Locale locale = Locale.ENGLISH;
        return O(str.toLowerCase(locale)) > -1 || O(str.toUpperCase(locale)) > -1;
    }

    String cD() {
        S();
        int i = this.OL;
        int i2 = this.T4;
        char[] cArr = this.l8;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i3++;
        }
        this.OL = i3;
        return i3 > i ? T4(this.l8, this.N, i, i3 - i) : "";
    }

    int d(char c) {
        S();
        for (int i = this.OL; i < this.T4; i++) {
            if (c == this.l8[i]) {
                return i - this.OL;
            }
        }
        return -1;
    }

    public char eD() {
        S();
        if (W()) {
            return (char) 65535;
        }
        return this.l8[this.OL];
    }

    String hR(String str) {
        int iO = O(str);
        if (iO != -1) {
            String strT4 = T4(this.l8, this.N, this.OL, iO);
            this.OL += iO;
            return strT4;
        }
        if (this.T4 - this.OL < str.length()) {
            return uS();
        }
        int length = (this.T4 - str.length()) + 1;
        char[] cArr = this.l8;
        String[] strArr = this.N;
        int i = this.OL;
        String strT42 = T4(cArr, strArr, i, length - i);
        this.OL = length;
        return strT42;
    }

    boolean hd() {
        if (Q()) {
            return false;
        }
        char c = this.l8[this.OL];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    String l(boolean z) {
        int i = this.OL;
        int i2 = this.T4;
        char[] cArr = this.l8;
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
        this.OL = i3;
        return i3 > i ? T4(this.l8, this.N, i, i3 - i) : "";
    }

    public void l8() {
        this.OL++;
    }

    void mF() {
        this.tT = -1;
    }

    String n() {
        char c;
        S();
        int i = this.OL;
        while (true) {
            int i2 = this.OL;
            if (i2 >= this.T4 || (((c = this.l8[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.OL++;
        }
        return T4(this.l8, this.N, i, this.OL - i);
    }

    void o() {
        int i = this.OL;
        if (i < 1) {
            throw new VU(new IOException("WTF: No buffer left to unconsume."));
        }
        this.OL = i - 1;
    }

    boolean oH() {
        char c;
        return !Q() && (c = this.l8[this.OL]) >= '0' && c <= '9';
    }

    boolean r1(String str) {
        if (!A0(str)) {
            return false;
        }
        this.OL += str.length();
        return true;
    }

    boolean rD(char[] cArr) {
        S();
        return !Q() && Arrays.binarySearch(cArr, this.l8[this.OL]) >= 0;
    }

    public String s(char c) {
        int iD = d(c);
        if (iD == -1) {
            return uS();
        }
        String strT4 = T4(this.l8, this.N, this.OL, iD);
        this.OL += iD;
        return strT4;
    }

    String tT() {
        int i = this.OL;
        int i2 = this.T4;
        char[] cArr = this.l8;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.OL = i3;
        return i3 > i ? T4(this.l8, this.N, i, i3 - i) : "";
    }

    public String toString() {
        if (this.T4 - this.OL < 0) {
            return "";
        }
        char[] cArr = this.l8;
        int i = this.OL;
        return new String(cArr, i, this.T4 - i);
    }

    String uS() {
        S();
        char[] cArr = this.l8;
        String[] strArr = this.N;
        int i = this.OL;
        String strT4 = T4(cArr, strArr, i, this.T4 - i);
        this.OL = this.T4;
        return strT4;
    }

    String v() {
        char c;
        S();
        int i = this.OL;
        while (true) {
            int i2 = this.OL;
            if (i2 >= this.T4 || (((c = this.l8[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.OL++;
        }
        while (!W()) {
            char[] cArr = this.l8;
            int i3 = this.OL;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.OL = i3 + 1;
        }
        return T4(this.l8, this.N, i, this.OL - i);
    }

    public kJ(Reader reader) {
        this(reader, 32768);
    }

    public kJ(String str) {
        this(new StringReader(str), str.length());
    }
}
