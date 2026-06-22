package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.і, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0179 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private char[] f434;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private Reader f435;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private int f436;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private int f437;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private int f438;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private int f439;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private int f440;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private String[] f441;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private boolean f442;

    public C0179(Reader reader, int i) {
        this.f440 = -1;
        this.f441 = new String[512];
        C0034.m284(reader);
        C0034.m278(reader.markSupported());
        this.f435 = reader;
        this.f434 = new char[Math.min(i, 32768)];
        m601();
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private void m601() {
        int i;
        int i2;
        boolean z;
        if (this.f442 || (i = this.f438) < this.f437) {
            return;
        }
        int i3 = this.f440;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.f435.skip(j);
            this.f435.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.f435;
                char[] cArr = this.f434;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.f442 = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.f435.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                C0034.m278(z);
                this.f436 = i4;
                this.f439 += i;
                this.f438 = i2;
                if (this.f440 != -1) {
                    this.f440 = 0;
                }
                this.f437 = Math.min(i4, 24576);
            }
        } catch (IOException e) {
            throw new C0167(e);
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static String m602(char[] cArr, String[] strArr, int i, int i2) {
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
        if (m604(cArr, i, i2, str)) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[i6] = str3;
        return str3;
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    private boolean m603() {
        return this.f438 >= this.f436;
    }

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    static boolean m604(char[] cArr, int i, int i2, String str) {
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

    public String toString() {
        if (this.f436 - this.f438 < 0) {
            return "";
        }
        char[] cArr = this.f434;
        int i = this.f438;
        return new String(cArr, i, this.f436 - i);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public void m605() {
        this.f438++;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public void m606() {
        Reader reader = this.f435;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f435 = null;
            this.f434 = null;
            this.f441 = null;
            throw th;
        }
        this.f435 = null;
        this.f434 = null;
        this.f441 = null;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    char m607() {
        m601();
        char c = m603() ? (char) 65535 : this.f434[this.f438];
        this.f438++;
        return c;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    String m608(boolean z) {
        int i = this.f438;
        int i2 = this.f436;
        char[] cArr = this.f434;
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
        this.f438 = i3;
        return i3 > i ? m602(this.f434, this.f441, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    String m609() {
        int i = this.f438;
        int i2 = this.f436;
        char[] cArr = this.f434;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f438 = i3;
        return i3 > i ? m602(this.f434, this.f441, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    String m610() {
        int i;
        char c;
        m601();
        int i2 = this.f438;
        while (true) {
            i = this.f438;
            if (i >= this.f436 || (c = this.f434[i]) < '0' || c > '9') {
                break;
            }
            this.f438 = i + 1;
        }
        return m602(this.f434, this.f441, i2, i - i2);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    String m611() {
        int i;
        char c;
        m601();
        int i2 = this.f438;
        while (true) {
            i = this.f438;
            if (i >= this.f436 || (((c = this.f434[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f438 = i + 1;
        }
        return m602(this.f434, this.f441, i2, i - i2);
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    String m612() {
        char c;
        m601();
        int i = this.f438;
        while (true) {
            int i2 = this.f438;
            if (i2 >= this.f436 || (((c = this.f434[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f438++;
        }
        return m602(this.f434, this.f441, i, this.f438 - i);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    String m613() {
        char c;
        m601();
        int i = this.f438;
        while (true) {
            int i2 = this.f438;
            if (i2 >= this.f436 || (((c = this.f434[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f438++;
        }
        while (!m603()) {
            char[] cArr = this.f434;
            int i3 = this.f438;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f438 = i3 + 1;
        }
        return m602(this.f434, this.f441, i, this.f438 - i);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    String m614() {
        int i = this.f438;
        int i2 = this.f436;
        char[] cArr = this.f434;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f438 = i3;
        return i3 > i ? m602(this.f434, this.f441, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    String m615() {
        m601();
        int i = this.f438;
        int i2 = this.f436;
        char[] cArr = this.f434;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i3++;
        }
        this.f438 = i3;
        return i3 > i ? m602(this.f434, this.f441, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public String m616(char c) {
        int iM634 = m634(c);
        if (iM634 == -1) {
            return m620();
        }
        String strM602 = m602(this.f434, this.f441, this.f438, iM634);
        this.f438 += iM634;
        return strM602;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    String m617(String str) {
        int iM635 = m635(str);
        if (iM635 != -1) {
            String strM602 = m602(this.f434, this.f441, this.f438, iM635);
            this.f438 += iM635;
            return strM602;
        }
        if (this.f436 - this.f438 < str.length()) {
            return m620();
        }
        int length = (this.f436 - str.length()) + 1;
        char[] cArr = this.f434;
        String[] strArr = this.f441;
        int i = this.f438;
        String strM6022 = m602(cArr, strArr, i, length - i);
        this.f438 = length;
        return strM6022;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public String m618(char... cArr) {
        m601();
        int i = this.f438;
        int i2 = this.f436;
        char[] cArr2 = this.f434;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f438 = i3;
        return i3 > i ? m602(this.f434, this.f441, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    String m619(char... cArr) {
        m601();
        int i = this.f438;
        int i2 = this.f436;
        char[] cArr2 = this.f434;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f438 = i3;
        return i3 > i ? m602(this.f434, this.f441, i, i3 - i) : "";
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    String m620() {
        m601();
        char[] cArr = this.f434;
        String[] strArr = this.f441;
        int i = this.f438;
        String strM602 = m602(cArr, strArr, i, this.f436 - i);
        this.f438 = this.f436;
        return strM602;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    boolean m621(String str) {
        Locale locale = Locale.ENGLISH;
        return m635(str.toLowerCase(locale)) > -1 || m635(str.toUpperCase(locale)) > -1;
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public char m622() {
        m601();
        if (m603()) {
            return (char) 65535;
        }
        return this.f434[this.f438];
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public boolean m623() {
        m601();
        return this.f438 >= this.f436;
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    void m624() {
        if (this.f436 - this.f438 < 1024) {
            this.f437 = 0;
        }
        m601();
        this.f440 = this.f438;
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    boolean m625(String str) {
        m601();
        if (!m628(str)) {
            return false;
        }
        this.f438 += str.length();
        return true;
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    boolean m626(String str) {
        if (!m632(str)) {
            return false;
        }
        this.f438 += str.length();
        return true;
    }

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    boolean m627(char c) {
        return !m623() && this.f434[this.f438] == c;
    }

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    boolean m628(String str) {
        m601();
        int length = str.length();
        if (length > this.f436 - this.f438) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f434[this.f438 + i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    boolean m629(char... cArr) {
        if (m623()) {
            return false;
        }
        m601();
        char c = this.f434[this.f438];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    boolean m630(char[] cArr) {
        m601();
        return !m623() && Arrays.binarySearch(cArr, this.f434[this.f438]) >= 0;
    }

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    boolean m631() {
        char c;
        return !m623() && (c = this.f434[this.f438]) >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    boolean m632(String str) {
        m601();
        int length = str.length();
        if (length > this.f436 - this.f438) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f434[this.f438 + i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    boolean m633() {
        if (m623()) {
            return false;
        }
        char c = this.f434[this.f438];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    int m634(char c) {
        m601();
        for (int i = this.f438; i < this.f436; i++) {
            if (c == this.f434[i]) {
                return i - this.f438;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    int m635(CharSequence charSequence) {
        m601();
        char cCharAt = charSequence.charAt(0);
        int i = this.f438;
        while (i < this.f436) {
            if (cCharAt != this.f434[i]) {
                do {
                    i++;
                    if (i >= this.f436) {
                        break;
                    }
                } while (cCharAt != this.f434[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f436;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f434[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f438;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    public int m636() {
        return this.f439 + this.f438;
    }

    /* JADX INFO: renamed from: ޙ, reason: contains not printable characters */
    void m637() {
        int i = this.f440;
        if (i == -1) {
            throw new C0167(new IOException(SOY.d("3733231D541E1424301A1D13")));
        }
        this.f438 = i;
        m639();
    }

    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters */
    void m638() {
        int i = this.f438;
        if (i < 1) {
            throw new C0167(new IOException(SOY.d("2D06174C54391572330312111F20711A11110E722519540214313E18070217377F")));
        }
        this.f438 = i - 1;
    }

    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters */
    void m639() {
        this.f440 = -1;
    }

    public C0179(Reader reader) {
        this(reader, 32768);
    }

    public C0179(String str) {
        this(new StringReader(str), str.length());
    }
}
