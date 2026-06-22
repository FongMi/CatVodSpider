package com.github.catvod.spider.merge.M;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.M.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0030a {
    public char[] a;
    public Reader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = -1;
    public String[] h = new String[512];
    public ArrayList i = null;
    public int j = 1;
    public boolean k;
    public String l;
    public int m;

    public C0030a(StringReader stringReader, int i) {
        com.github.catvod.spider.merge.J.b.c(stringReader.markSupported());
        this.b = stringReader;
        this.a = new char[Math.min(i, 32768)];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + cArr[i + i5];
        }
        int i6 = i4 & 511;
        String str = strArr[i6];
        if (str != null && i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] != str.charAt(i3)) {
                    break;
                }
                i7 = i10;
                i8 = i9;
                i3 = i11;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }

    public final void a() {
        this.e++;
    }

    public final void b() {
        int i;
        int i2;
        boolean z;
        if (this.k || (i = this.e) < this.d) {
            return;
        }
        int i3 = this.g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long jSkip = this.b.skip(j);
            this.b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.b;
                char[] cArr = this.a;
                int i5 = reader.read(cArr, i4, cArr.length - i4);
                if (i5 == -1) {
                    this.k = true;
                }
                if (i5 <= 0) {
                    break;
                } else {
                    i4 += i5;
                }
            }
            this.b.reset();
            if (i4 > 0) {
                if (jSkip != j) {
                    z = false;
                }
                com.github.catvod.spider.merge.J.b.c(z);
                this.c = i4;
                this.f += i;
                this.e = i2;
                if (this.g != -1) {
                    this.g = 0;
                }
                this.d = Math.min(i4, 24576);
            }
            y();
            this.l = null;
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.I.a(e);
        }
    }

    public final void d() {
        Reader reader = this.b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw th;
        }
        this.b = null;
        this.a = null;
        this.h = null;
    }

    public final char e() {
        b();
        int i = this.e;
        char c = i >= this.c ? (char) 65535 : this.a[i];
        this.e = i + 1;
        return c;
    }

    public final String f(boolean z) {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
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
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final String g() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final String h() {
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 >= this.c || (((c = this.a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    public final String i(char c) {
        int i;
        b();
        int i2 = this.e;
        while (true) {
            if (i2 >= this.c) {
                i = -1;
                break;
            }
            if (c == this.a[i2]) {
                i = i2 - this.e;
                break;
            }
            i2++;
        }
        if (i != -1) {
            String strC = c(this.a, this.h, this.e, i);
            this.e += i;
            return strC;
        }
        b();
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i3 = this.e;
        String strC2 = c(cArr, strArr, i3, this.c - i3);
        this.e = this.c;
        return strC2;
    }

    public final String j(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final String k(char... cArr) {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr2 = this.a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    public final char l() {
        b();
        int i = this.e;
        if (i >= this.c) {
            return (char) 65535;
        }
        return this.a[i];
    }

    public final String m() {
        int i;
        int iO;
        StringBuilder sb = new StringBuilder();
        int iW = w();
        if (this.i != null) {
            int iO2 = o(iW);
            i = iO2 == -1 ? this.j : iO2 + this.j + 1;
        } else {
            i = 1;
        }
        sb.append(i);
        sb.append(":");
        int iW2 = w();
        if (this.i != null && (iO = o(iW2)) != -1) {
            iW2 -= ((Integer) this.i.get(iO)).intValue();
        }
        sb.append(iW2 + 1);
        return sb.toString();
    }

    public final boolean n() {
        b();
        return this.e >= this.c;
    }

    public final int o(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    public final boolean p(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.a[this.e + i]) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean q(String str) {
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.a[this.e + i])) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean r(char c) {
        return !n() && this.a[this.e] == c;
    }

    public final boolean s(char... cArr) {
        if (n()) {
            return false;
        }
        b();
        char c = this.a[this.e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        if (n()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.e;
        return i - i2 < 0 ? "" : new String(this.a, i2, i - i2);
    }

    public final boolean u() {
        if (n()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    public final int v(String str) {
        b();
        char cCharAt = str.charAt(0);
        int i = this.e;
        while (i < this.c) {
            if (cCharAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.c) {
                        break;
                    }
                } while (cCharAt != this.a[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.e;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final int w() {
        return this.f + this.e;
    }

    public final void x() {
        int i = this.g;
        if (i == -1) {
            throw new com.github.catvod.spider.merge.I.a(new IOException("Mark invalid"));
        }
        this.e = i;
        this.g = -1;
    }

    public final void y() {
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iO = o(this.f);
                if (iO == -1) {
                    iO = 0;
                }
                Integer num = (Integer) this.i.get(iO);
                num.getClass();
                this.j += iO;
                this.i.clear();
                this.i.add(num);
            }
            for (int i = this.e; i < this.c; i++) {
                if (this.a[i] == '\n') {
                    this.i.add(Integer.valueOf(this.f + 1 + i));
                }
            }
        }
    }

    public final void z() {
        int i = this.e;
        if (i < 1) {
            throw new com.github.catvod.spider.merge.I.a(new IOException("WTF: No buffer left to unconsume."));
        }
        this.e = i - 1;
    }
}
