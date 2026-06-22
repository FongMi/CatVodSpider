package com.github.catvod.spider.merge.Fs;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0631a {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = -1;
    private String[] h = new String[512];
    private boolean i;

    public C0631a(Reader reader, int i) {
        com.github.catvod.spider.merge.Dw.i.f(reader.markSupported());
        this.b = reader;
        this.a = new char[Math.min(i, 32768)];
        b();
    }

    private void b() {
        int i;
        int i2;
        boolean z;
        if (this.i || (i = this.e) < this.d) {
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
                    this.i = true;
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
                com.github.catvod.spider.merge.Dw.i.f(z);
                this.c = i4;
                this.f += i;
                this.e = i2;
                if (this.g != -1) {
                    this.g = 0;
                }
                this.d = Math.min(i4, 24576);
            }
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Dw.r(e);
        }
    }

    private static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        boolean z = true;
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 * 31;
        int i4 = i;
        int i5 = 0;
        while (i5 < i2) {
            i3 = (i3 * 31) + cArr[i4];
            i5++;
            i4++;
        }
        int i6 = i3 & 511;
        String str = strArr[i6];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[i6] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            int i9 = 0;
            while (true) {
                int i10 = i8 - 1;
                if (i8 == 0) {
                    break;
                }
                int i11 = i7 + 1;
                int i12 = i9 + 1;
                if (cArr[i7] != str.charAt(i9)) {
                    break;
                }
                i7 = i11;
                i8 = i10;
                i9 = i12;
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[i6] = str3;
        return str3;
    }

    private boolean u() {
        return this.e >= this.c;
    }

    final boolean A(char[] cArr) {
        b();
        return !t() && Arrays.binarySearch(cArr, this.a[this.e]) >= 0;
    }

    final boolean B() {
        char c;
        return !t() && (c = this.a[this.e]) >= '0' && c <= '9';
    }

    final boolean C() {
        if (t()) {
            return false;
        }
        char c = this.a[this.e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    final int D(CharSequence charSequence) {
        b();
        char cCharAt = charSequence.charAt(0);
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
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.a[i4]; i5++) {
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

    public final int E() {
        return this.f + this.e;
    }

    final void F() {
        int i = this.g;
        if (i == -1) {
            throw new com.github.catvod.spider.merge.Dw.r(new IOException("Mark invalid"));
        }
        this.e = i;
        this.g = -1;
    }

    final void G() {
        int i = this.e;
        if (i < 1) {
            throw new com.github.catvod.spider.merge.Dw.r(new IOException("WTF: No buffer left to unconsume."));
        }
        this.e = i - 1;
    }

    final void H() {
        this.g = -1;
    }

    public final void a() {
        this.e++;
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

    final char e() {
        b();
        char c = u() ? (char) 65535 : this.a[this.e];
        this.e++;
        return c;
    }

    final String f(boolean z) {
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

    final String g() {
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

    final String h() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (c = this.a[i]) < '0' || c > '9') {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    final String i() {
        int i;
        char c;
        b();
        int i2 = this.e;
        while (true) {
            i = this.e;
            if (i >= this.c || (((c = this.a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.e = i + 1;
        }
        return c(this.a, this.h, i2, i - i2);
    }

    final String j() {
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

    final String k() {
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
        while (!u()) {
            char[] cArr = this.a;
            int i3 = this.e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.e = i3 + 1;
        }
        return c(this.a, this.h, i, this.e - i);
    }

    final String l() {
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String m() {
        b();
        int i = this.e;
        int i2 = this.c;
        char[] cArr = this.a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i3++;
        }
        this.e = i3;
        return i3 > i ? c(this.a, this.h, i, i3 - i) : "";
    }

    final String n() {
        int iD = D("]]>");
        if (iD != -1) {
            String strC = c(this.a, this.h, this.e, iD);
            this.e += iD;
            return strC;
        }
        int i = this.c;
        int i2 = this.e;
        if (i - i2 < 3) {
            return r();
        }
        int i3 = (i - 3) + 1;
        String strC2 = c(this.a, this.h, i2, i3 - i2);
        this.e = i3;
        return strC2;
    }

    public final String o(char c) {
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
        if (i == -1) {
            return r();
        }
        String strC = c(this.a, this.h, this.e, i);
        this.e += i;
        return strC;
    }

    public final String p(char... cArr) {
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

    final String q(char... cArr) {
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

    final String r() {
        b();
        char[] cArr = this.a;
        String[] strArr = this.h;
        int i = this.e;
        String strC = c(cArr, strArr, i, this.c - i);
        this.e = this.c;
        return strC;
    }

    public final char s() {
        b();
        if (u()) {
            return (char) 65535;
        }
        return this.a[this.e];
    }

    public final boolean t() {
        b();
        return this.e >= this.c;
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.e;
        return i - i2 < 0 ? "" : new String(this.a, i2, i - i2);
    }

    final void v() {
        if (this.c - this.e < 1024) {
            this.d = 0;
        }
        b();
        this.g = this.e;
    }

    final boolean w(String str) {
        boolean z;
        b();
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            z = false;
            break;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.a[this.e + i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        this.e = str.length() + this.e;
        return true;
    }

    final boolean x(String str) {
        boolean z;
        b();
        int length = str.length();
        if (length > this.c - this.e) {
            z = false;
            break;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.a[this.e + i])) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        this.e = str.length() + this.e;
        return true;
    }

    final boolean y(char c) {
        return !t() && this.a[this.e] == c;
    }

    final boolean z(char... cArr) {
        if (t()) {
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
}
