package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class h0 extends Writer {
    private static final ThreadLocal<char[]> r = new ThreadLocal<>();
    private static int s;
    static final int t;
    protected char[] b;
    protected int c;
    protected int d;
    private final Writer e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected char n;
    protected int o;
    protected boolean p;
    protected long q;

    static {
        int i;
        new ThreadLocal();
        ":true".toCharArray();
        ":false".toCharArray();
        s = 131072;
        try {
            String strE = com.github.catvod.spider.merge.H.i.e("fastjson.serializer_buffer_threshold");
            if (strE != null && strE.length() > 0 && (i = Integer.parseInt(strE)) >= 64 && i <= 65536) {
                s = i * 1024;
            }
        } catch (Throwable unused) {
        }
        t = i0.UseSingleQuotes.b | 0 | i0.BrowserCompatible.b | i0.PrettyFormat.b | i0.WriteEnumUsingToString.b | i0.WriteNonStringValueAsString.b | i0.WriteSlashAsSpecial.b | i0.IgnoreErrorGetter.b | i0.WriteClassName.b | i0.NotWriteDefaultValue.b;
    }

    public h0() {
        this(AbstractC1412a.h, i0.E);
    }

    public final h0 a(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence, int i, int i2) {
        c(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        c(charSequence, i, i2);
        return this;
    }

    public final h0 b(CharSequence charSequence) {
        String string = charSequence == null ? "null" : charSequence.toString();
        write(string, 0, string.length());
        return this;
    }

    public final h0 c(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i, i2).toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e != null && this.c > 0) {
            flush();
        }
        char[] cArr = this.b;
        if (cArr.length <= s) {
            r.set(cArr);
        }
        this.b = null;
    }

    protected final void d() {
        int i = this.d;
        boolean z = (i0.QuoteFieldNames.b & i) != 0;
        this.g = z;
        boolean z2 = (i0.UseSingleQuotes.b & i) != 0;
        this.f = z2;
        this.h = (i0.SortField.b & i) != 0;
        this.i = (i0.DisableCircularReferenceDetect.b & i) != 0;
        this.j = (i0.BeanToArray.b & i) != 0;
        int i2 = i0.WriteNonStringValueAsString.b;
        this.k = (i0.NotWriteDefaultValue.b & i) != 0;
        this.l = (i0.WriteEnumUsingName.b & i) != 0;
        this.m = (i0.WriteEnumUsingToString.b & i) != 0;
        if (z) {
            int i3 = t & i;
        }
        this.n = z2 ? '\'' : '\"';
        boolean z3 = (i0.BrowserSecure.b & i) != 0;
        this.p = z3;
        this.q = z3 ? 5764610843043954687L : (i & i0.WriteSlashAsSpecial.b) != 0 ? 140758963191807L : 21474836479L;
    }

    public final void e(int i) {
        ThreadLocal<char[]> threadLocal;
        char[] cArr;
        int i2 = this.o;
        if (i2 != -1 && i >= i2) {
            StringBuilder sbB = t0.b("serialize exceeded MAX_OUTPUT_LENGTH=");
            sbB.append(this.o);
            sbB.append(", minimumCapacity=");
            sbB.append(i);
            throw new C1415d(sbB.toString());
        }
        char[] cArr2 = this.b;
        int length = cArr2.length + (cArr2.length >> 1) + 1;
        if (length >= i) {
            i = length;
        }
        char[] cArr3 = new char[i];
        System.arraycopy(cArr2, 0, cArr3, 0, this.c);
        if (this.b.length < s && ((cArr = (threadLocal = r).get()) == null || cArr.length < this.b.length)) {
            threadLocal.set(this.b);
        }
        this.b = cArr3;
    }

    public final boolean f(int i) {
        return (i & this.d) != 0;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        Writer writer = this.e;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.b, 0, this.c);
            this.e.flush();
            this.c = 0;
        } catch (IOException e) {
            throw new C1415d(e.getMessage(), e);
        }
    }

    public final boolean g(i0 i0Var) {
        return (i0Var.b & this.d) != 0;
    }

    public final void h(byte[] bArr) {
        if (f(i0.WriteClassName.b)) {
            p(bArr);
            return;
        }
        int length = bArr.length;
        boolean z = this.f;
        char c = z ? '\'' : '\"';
        if (length == 0) {
            write(z ? "''" : "\"\"");
            return;
        }
        char[] cArr = com.github.catvod.spider.merge.H.i.o;
        int i = (length / 3) * 3;
        int i2 = length - 1;
        int i3 = this.c;
        int i4 = (((i2 / 3) + 1) << 2) + i3 + 2;
        if (i4 > this.b.length) {
            if (this.e != null) {
                write(c);
                int i5 = 0;
                while (i5 < i) {
                    int i6 = i5 + 1;
                    int i7 = i6 + 1;
                    int i8 = ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8) | (bArr[i7] & 255);
                    write(cArr[(i8 >>> 18) & 63]);
                    write(cArr[(i8 >>> 12) & 63]);
                    write(cArr[(i8 >>> 6) & 63]);
                    write(cArr[i8 & 63]);
                    i5 = i7 + 1;
                }
                int i9 = length - i;
                if (i9 > 0) {
                    int i10 = ((bArr[i] & 255) << 10) | (i9 == 2 ? (bArr[i2] & 255) << 2 : 0);
                    write(cArr[i10 >> 12]);
                    write(cArr[(i10 >>> 6) & 63]);
                    write(i9 == 2 ? cArr[i10 & 63] : '=');
                    write(61);
                }
                write(c);
                return;
            }
            e(i4);
        }
        this.c = i4;
        int i11 = i3 + 1;
        this.b[i3] = c;
        int i12 = 0;
        while (i12 < i) {
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
            int i16 = i14 + 1;
            int i17 = i15 | (bArr[i14] & 255);
            char[] cArr2 = this.b;
            int i18 = i11 + 1;
            cArr2[i11] = cArr[(i17 >>> 18) & 63];
            int i19 = i18 + 1;
            cArr2[i18] = cArr[(i17 >>> 12) & 63];
            int i20 = i19 + 1;
            cArr2[i19] = cArr[(i17 >>> 6) & 63];
            i11 = i20 + 1;
            cArr2[i20] = cArr[i17 & 63];
            i12 = i16;
        }
        int i21 = length - i;
        if (i21 > 0) {
            int i22 = ((bArr[i] & 255) << 10) | (i21 == 2 ? (bArr[i2] & 255) << 2 : 0);
            char[] cArr3 = this.b;
            cArr3[i4 - 5] = cArr[i22 >> 12];
            cArr3[i4 - 4] = cArr[(i22 >>> 6) & 63];
            cArr3[i4 - 3] = i21 == 2 ? cArr[i22 & 63] : '=';
            cArr3[i4 - 2] = '=';
        }
        this.b[i4 - 1] = c;
    }

    public final void i(double d, boolean z) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            s();
            return;
        }
        int i = this.c + 24;
        if (i > this.b.length) {
            if (this.e != null) {
                char[] cArr = new char[24];
                String str = new String(cArr, 0, com.github.catvod.spider.merge.H.o.a(d, cArr, 0));
                write(str, 0, str.length());
                if (z && g(i0.WriteClassName)) {
                    write(68);
                    return;
                }
                return;
            }
            e(i);
        }
        this.c += com.github.catvod.spider.merge.H.o.a(d, this.b, this.c);
        if (z && g(i0.WriteClassName)) {
            write(68);
        }
    }

    public final void j(String str) {
        if (str == null) {
            write("null:");
            return;
        }
        int i = 0;
        boolean z = true;
        if (!this.f) {
            if (!this.g) {
                boolean z2 = str.length() == 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= str.length()) {
                        z = z2;
                        break;
                    }
                    char cCharAt = str.charAt(i2);
                    if ((cCharAt < '@' && (this.q & (1 << cCharAt)) != 0) || cCharAt == '\\') {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    write(str);
                }
            }
            x(str, ':');
            return;
        }
        if (!this.g) {
            byte[] bArr = com.github.catvod.spider.merge.H.i.f;
            int length = str.length();
            int i3 = this.c + length + 1;
            if (i3 > this.b.length) {
                if (this.e != null) {
                    if (length != 0) {
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                char cCharAt2 = str.charAt(i4);
                                if (cCharAt2 < bArr.length && bArr[cCharAt2] != 0) {
                                    break;
                                } else {
                                    i4++;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            write(39);
                        }
                        while (i < length) {
                            char cCharAt3 = str.charAt(i);
                            if (cCharAt3 < bArr.length && bArr[cCharAt3] != 0) {
                                write(92);
                                cCharAt3 = com.github.catvod.spider.merge.H.i.i[cCharAt3];
                            }
                            write(cCharAt3);
                            i++;
                        }
                        if (z) {
                        }
                        write(58);
                        return;
                    }
                    write(39);
                    write(39);
                    write(58);
                    return;
                }
                e(i3);
            }
            if (length == 0) {
                int i5 = this.c + 3;
                if (i5 > this.b.length) {
                    e(i5);
                }
                char[] cArr = this.b;
                int i6 = this.c;
                int i7 = i6 + 1;
                this.c = i7;
                cArr[i6] = '\'';
                int i8 = i7 + 1;
                this.c = i8;
                cArr[i7] = '\'';
                this.c = i8 + 1;
                cArr[i8] = ':';
                return;
            }
            int i9 = this.c;
            int i10 = i9 + length;
            str.getChars(0, length, this.b, i9);
            this.c = i3;
            int i11 = i9;
            boolean z3 = false;
            while (i11 < i10) {
                char[] cArr2 = this.b;
                char c = cArr2[i11];
                if (c < bArr.length && bArr[c] != 0) {
                    if (z3) {
                        i3++;
                        if (i3 > cArr2.length) {
                            e(i3);
                        }
                        this.c = i3;
                        char[] cArr3 = this.b;
                        int i12 = i11 + 1;
                        System.arraycopy(cArr3, i12, cArr3, i11 + 2, i10 - i11);
                        char[] cArr4 = this.b;
                        cArr4[i11] = '\\';
                        cArr4[i12] = com.github.catvod.spider.merge.H.i.i[c];
                        i10++;
                        i11 = i12;
                    } else {
                        i3 += 3;
                        if (i3 > cArr2.length) {
                            e(i3);
                        }
                        this.c = i3;
                        char[] cArr5 = this.b;
                        int i13 = i11 + 1;
                        System.arraycopy(cArr5, i13, cArr5, i11 + 3, (i10 - i11) - 1);
                        char[] cArr6 = this.b;
                        System.arraycopy(cArr6, i, cArr6, 1, i11);
                        char[] cArr7 = this.b;
                        cArr7[i9] = '\'';
                        cArr7[i13] = '\\';
                        int i14 = i13 + 1;
                        cArr7[i14] = com.github.catvod.spider.merge.H.i.i[c];
                        i10 += 2;
                        cArr7[this.c - 2] = '\'';
                        i11 = i14;
                        z3 = true;
                    }
                }
                i11++;
                i = 0;
            }
            this.b[i3 - 1] = ':';
            return;
        }
        y(str);
        write(58);
    }

    public final void k(char c, String str, int i) {
        if (i == Integer.MIN_VALUE || !this.g) {
            write(c);
            j(str);
            q(i);
            return;
        }
        int iF = i < 0 ? com.github.catvod.spider.merge.H.i.f(-i) + 1 : com.github.catvod.spider.merge.H.i.f(i);
        int length = str.length();
        int i2 = this.c + length + 4 + iF;
        if (i2 > this.b.length) {
            if (this.e != null) {
                write(c);
                j(str);
                q(i);
                return;
            }
            e(i2);
        }
        int i3 = this.c;
        this.c = i2;
        char[] cArr = this.b;
        cArr[i3] = c;
        int i4 = i3 + length + 1;
        cArr[i3 + 1] = this.n;
        str.getChars(0, length, cArr, i3 + 2);
        char[] cArr2 = this.b;
        cArr2[i4 + 1] = this.n;
        cArr2[i4 + 2] = ':';
        com.github.catvod.spider.merge.H.i.c(i, this.c, cArr2);
    }

    public final void l(char c, String str, long j) {
        if (j == Long.MIN_VALUE || !this.g || f(i0.BrowserCompatible.b)) {
            write(c);
            j(str);
            r(j);
            return;
        }
        int iG = j < 0 ? com.github.catvod.spider.merge.H.i.g(-j) + 1 : com.github.catvod.spider.merge.H.i.g(j);
        int length = str.length();
        int i = this.c + length + 4 + iG;
        if (i > this.b.length) {
            if (this.e != null) {
                write(c);
                j(str);
                r(j);
                return;
            }
            e(i);
        }
        int i2 = this.c;
        this.c = i;
        char[] cArr = this.b;
        cArr[i2] = c;
        int i3 = i2 + length + 1;
        cArr[i2 + 1] = this.n;
        str.getChars(0, length, cArr, i2 + 2);
        char[] cArr2 = this.b;
        cArr2[i3 + 1] = this.n;
        cArr2[i3 + 2] = ':';
        com.github.catvod.spider.merge.H.i.d(j, this.c, cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        v(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r4 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(char r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L2a
            boolean r0 = r1.f
            if (r0 == 0) goto L11
            r1.write(r2)
            r1.j(r3)
            if (r4 != 0) goto L36
            goto L32
        L11:
            com.github.catvod.spider.merge.D.i0 r0 = com.github.catvod.spider.merge.D.i0.BrowserCompatible
            boolean r0 = r1.g(r0)
            if (r0 == 0) goto L26
            r1.write(r2)
            r2 = 58
            r1.x(r3, r2)
            r2 = 0
            r1.x(r4, r2)
            goto L39
        L26:
            r1.n(r2, r3, r4)
            goto L39
        L2a:
            r1.write(r2)
            r1.j(r3)
            if (r4 != 0) goto L36
        L32:
            r1.s()
            goto L39
        L36:
            r1.v(r4)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.h0.m(char, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[PHI: r1 r6 r10 r12
      0x00a1: PHI (r1v39 int) = (r1v29 int), (r1v3 int) binds: [B:55:0x00dc, B:30:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r6v14 int) = (r6v12 int), (r6v16 int) binds: [B:55:0x00dc, B:30:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r10v16 int) = (r10v14 int), (r10v18 int) binds: [B:55:0x00dc, B:30:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r12v21 int) = (r12v3 int), (r12v23 int) binds: [B:55:0x00dc, B:30:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(char r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.h0.n(char, java.lang.String, java.lang.String):void");
    }

    public final void o(float f) {
        if (f != f || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            s();
            return;
        }
        int i = this.c + 15;
        if (i > this.b.length) {
            if (this.e != null) {
                char[] cArr = new char[15];
                String str = new String(cArr, 0, com.github.catvod.spider.merge.H.p.a(f, cArr, 0));
                write(str, 0, str.length());
                if (g(i0.WriteClassName)) {
                    write(70);
                    return;
                }
                return;
            }
            e(i);
        }
        this.c += com.github.catvod.spider.merge.H.p.a(f, this.b, this.c);
        if (g(i0.WriteClassName)) {
            write(70);
        }
    }

    public final void p(byte[] bArr) {
        int length = (bArr.length * 2) + this.c + 3;
        if (length > this.b.length) {
            e(length);
        }
        char[] cArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        cArr[i] = 'x';
        this.c = i2 + 1;
        cArr[i2] = '\'';
        for (byte b : bArr) {
            int i3 = b & 255;
            int i4 = i3 >> 4;
            int i5 = i3 & 15;
            char[] cArr2 = this.b;
            int i6 = this.c;
            int i7 = i6 + 1;
            this.c = i7;
            int i8 = 48;
            cArr2[i6] = (char) (i4 + (i4 < 10 ? 48 : 55));
            this.c = i7 + 1;
            if (i5 >= 10) {
                i8 = 55;
            }
            cArr2[i7] = (char) (i5 + i8);
        }
        char[] cArr3 = this.b;
        int i9 = this.c;
        this.c = i9 + 1;
        cArr3[i9] = '\'';
    }

    public final void q(int i) {
        if (i == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int iF = i < 0 ? com.github.catvod.spider.merge.H.i.f(-i) + 1 : com.github.catvod.spider.merge.H.i.f(i);
        int i2 = this.c + iF;
        if (i2 > this.b.length) {
            if (this.e != null) {
                char[] cArr = new char[iF];
                com.github.catvod.spider.merge.H.i.c(i, iF, cArr);
                write(cArr, 0, iF);
                return;
            }
            e(i2);
        }
        com.github.catvod.spider.merge.H.i.c(i, i2, this.b);
        this.c = i2;
    }

    public final void r(long j) {
        boolean z = g(i0.BrowserCompatible) && !g(i0.WriteClassName) && (j > 9007199254740991L || j < -9007199254740991L);
        if (j == Long.MIN_VALUE) {
            write(z ? "\"-9223372036854775808\"" : "-9223372036854775808");
            return;
        }
        int iG = j < 0 ? com.github.catvod.spider.merge.H.i.g(-j) + 1 : com.github.catvod.spider.merge.H.i.g(j);
        int i = this.c + iG;
        if (z) {
            i += 2;
        }
        if (i > this.b.length) {
            if (this.e != null) {
                char[] cArr = new char[iG];
                com.github.catvod.spider.merge.H.i.d(j, iG, cArr);
                if (!z) {
                    write(cArr, 0, iG);
                    return;
                }
                write(34);
                write(cArr, 0, iG);
                write(34);
                return;
            }
            e(i);
        }
        if (z) {
            char[] cArr2 = this.b;
            cArr2[this.c] = '\"';
            int i2 = i - 1;
            com.github.catvod.spider.merge.H.i.d(j, i2, cArr2);
            this.b[i2] = '\"';
        } else {
            com.github.catvod.spider.merge.H.i.d(j, i, this.b);
        }
        this.c = i;
    }

    public final void s() {
        write("null");
    }

    public final void t(int i, int i2) {
        String str;
        if ((i & i2) == 0 && (this.d & i2) == 0) {
            s();
            return;
        }
        int i3 = i0.WriteMapNullValue.b;
        if ((i & i3) != 0 && (i & (i3 ^ (-1)) & i0.F) == 0) {
            s();
            return;
        }
        if (i2 == i0.WriteNullListAsEmpty.b) {
            str = "[]";
        } else if (i2 == i0.WriteNullStringAsEmpty.b) {
            v("");
            return;
        } else {
            if (i2 != i0.WriteNullBooleanAsFalse.b) {
                if (i2 == i0.WriteNullNumberAsZero.b) {
                    write(48);
                    return;
                } else {
                    s();
                    return;
                }
            }
            str = "false";
        }
        write(str);
    }

    public final String toString() {
        return new String(this.b, 0, this.c);
    }

    public final void u(i0 i0Var) {
        t(0, i0Var.b);
    }

    public final void v(String str) {
        if (this.f) {
            y(str);
        } else {
            x(str, (char) 0);
        }
    }

    public final void w(char[] cArr) {
        int i = 0;
        if (!this.f) {
            x(new String(cArr), (char) 0);
            return;
        }
        if (cArr == null) {
            int i2 = this.c + 4;
            if (i2 > this.b.length) {
                e(i2);
            }
            "null".getChars(0, 4, this.b, this.c);
            this.c = i2;
            return;
        }
        int length = cArr.length;
        int i3 = this.c + length + 2;
        if (i3 > this.b.length) {
            if (this.e != null) {
                write(39);
                while (i < cArr.length) {
                    char c = cArr[i];
                    if (c <= '\r' || c == '\\' || c == '\'' || (c == '/' && g(i0.WriteSlashAsSpecial))) {
                        write(92);
                        c = com.github.catvod.spider.merge.H.i.i[c];
                    }
                    write(c);
                    i++;
                }
                write(39);
                return;
            }
            e(i3);
        }
        int i4 = this.c;
        int i5 = i4 + 1;
        int i6 = length + i5;
        char[] cArr2 = this.b;
        cArr2[i4] = '\'';
        System.arraycopy(cArr, 0, cArr2, i5, cArr.length);
        this.c = i3;
        int i7 = -1;
        char c2 = 0;
        for (int i8 = i5; i8 < i6; i8++) {
            char c3 = this.b[i8];
            if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && g(i0.WriteSlashAsSpecial))) {
                i++;
                i7 = i8;
                c2 = c3;
            }
        }
        int i9 = i3 + i;
        if (i9 > this.b.length) {
            e(i9);
        }
        this.c = i9;
        if (i == 1) {
            char[] cArr3 = this.b;
            int i10 = i7 + 1;
            System.arraycopy(cArr3, i10, cArr3, i7 + 2, (i6 - i7) - 1);
            char[] cArr4 = this.b;
            cArr4[i7] = '\\';
            cArr4[i10] = com.github.catvod.spider.merge.H.i.i[c2];
        } else if (i > 1) {
            char[] cArr5 = this.b;
            int i11 = i7 + 1;
            System.arraycopy(cArr5, i11, cArr5, i7 + 2, (i6 - i7) - 1);
            char[] cArr6 = this.b;
            cArr6[i7] = '\\';
            cArr6[i11] = com.github.catvod.spider.merge.H.i.i[c2];
            int i12 = i6 + 1;
            for (int i13 = i11 - 2; i13 >= i5; i13--) {
                char c4 = this.b[i13];
                if (c4 <= '\r' || c4 == '\\' || c4 == '\'' || (c4 == '/' && g(i0.WriteSlashAsSpecial))) {
                    char[] cArr7 = this.b;
                    int i14 = i13 + 1;
                    System.arraycopy(cArr7, i14, cArr7, i13 + 2, (i12 - i13) - 1);
                    char[] cArr8 = this.b;
                    cArr8[i13] = '\\';
                    cArr8[i14] = com.github.catvod.spider.merge.H.i.i[c4];
                    i12++;
                }
            }
        }
        this.b[this.c - 1] = '\'';
    }

    @Override // java.io.Writer
    public final void write(int i) {
        int i2 = 1;
        int i3 = this.c + 1;
        if (i3 <= this.b.length) {
            i2 = i3;
        } else if (this.e == null) {
            e(i3);
            i2 = i3;
        } else {
            flush();
        }
        this.b[this.c] = (char) i;
        this.c = i2;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str == null) {
            s();
        } else {
            write(str, 0, str.length());
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3;
        int i4 = this.c + i2;
        if (i4 > this.b.length) {
            if (this.e == null) {
                e(i4);
            } else {
                while (true) {
                    char[] cArr = this.b;
                    int length = cArr.length;
                    int i5 = this.c;
                    int i6 = length - i5;
                    i3 = i + i6;
                    str.getChars(i, i3, cArr, i5);
                    this.c = this.b.length;
                    flush();
                    i2 -= i6;
                    if (i2 <= this.b.length) {
                        break;
                    } else {
                        i = i3;
                    }
                }
                i4 = i2;
                i = i3;
            }
        }
        str.getChars(i, i2 + i, this.b, this.c);
        this.c = i4;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.c + i2;
        if (i4 > this.b.length) {
            if (this.e == null) {
                e(i4);
            } else {
                do {
                    char[] cArr2 = this.b;
                    int length = cArr2.length;
                    int i5 = this.c;
                    int i6 = length - i5;
                    System.arraycopy(cArr, i, cArr2, i5, i6);
                    this.c = this.b.length;
                    flush();
                    i2 -= i6;
                    i += i6;
                } while (i2 > this.b.length);
                i4 = i2;
            }
        }
        System.arraycopy(cArr, i, this.b, this.c, i2);
        this.c = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x029d A[PHI: r4 r5 r8 r12
      0x029d: PHI (r4v44 int) = (r4v42 int), (r4v46 int) binds: [B:169:0x02db, B:144:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r5v35 int) = (r5v5 int), (r5v37 int) binds: [B:169:0x02db, B:144:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r8v20 int) = (r8v10 int), (r8v3 int) binds: [B:169:0x02db, B:144:0x0299] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r12v13 int) = (r12v11 int), (r12v15 int) binds: [B:169:0x02db, B:144:0x0299] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.String r23, char r24) {
        /*
            Method dump skipped, instruction units count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.h0.x(java.lang.String, char):void");
    }

    protected final void y(String str) {
        int i = 0;
        if (str == null) {
            int i2 = this.c + 4;
            if (i2 > this.b.length) {
                e(i2);
            }
            "null".getChars(0, 4, this.b, this.c);
            this.c = i2;
            return;
        }
        int length = str.length();
        int i3 = this.c + length + 2;
        if (i3 > this.b.length) {
            if (this.e != null) {
                write(39);
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt <= '\r' || cCharAt == '\\' || cCharAt == '\'' || (cCharAt == '/' && g(i0.WriteSlashAsSpecial))) {
                        write(92);
                        cCharAt = com.github.catvod.spider.merge.H.i.i[cCharAt];
                    }
                    write(cCharAt);
                    i++;
                }
                write(39);
                return;
            }
            e(i3);
        }
        int i4 = this.c;
        int i5 = i4 + 1;
        int i6 = i5 + length;
        char[] cArr = this.b;
        cArr[i4] = '\'';
        str.getChars(0, length, cArr, i5);
        this.c = i3;
        int i7 = -1;
        char c = 0;
        for (int i8 = i5; i8 < i6; i8++) {
            char c2 = this.b[i8];
            if (c2 <= '\r' || c2 == '\\' || c2 == '\'' || (c2 == '/' && g(i0.WriteSlashAsSpecial))) {
                i++;
                i7 = i8;
                c = c2;
            }
        }
        int i9 = i3 + i;
        if (i9 > this.b.length) {
            e(i9);
        }
        this.c = i9;
        if (i == 1) {
            char[] cArr2 = this.b;
            int i10 = i7 + 1;
            System.arraycopy(cArr2, i10, cArr2, i7 + 2, (i6 - i7) - 1);
            char[] cArr3 = this.b;
            cArr3[i7] = '\\';
            cArr3[i10] = com.github.catvod.spider.merge.H.i.i[c];
        } else if (i > 1) {
            char[] cArr4 = this.b;
            int i11 = i7 + 1;
            System.arraycopy(cArr4, i11, cArr4, i7 + 2, (i6 - i7) - 1);
            char[] cArr5 = this.b;
            cArr5[i7] = '\\';
            cArr5[i11] = com.github.catvod.spider.merge.H.i.i[c];
            int i12 = i6 + 1;
            for (int i13 = i11 - 2; i13 >= i5; i13--) {
                char c3 = this.b[i13];
                if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && g(i0.WriteSlashAsSpecial))) {
                    char[] cArr6 = this.b;
                    int i14 = i13 + 1;
                    System.arraycopy(cArr6, i14, cArr6, i13 + 2, (i12 - i13) - 1);
                    char[] cArr7 = this.b;
                    cArr7[i13] = '\\';
                    cArr7[i14] = com.github.catvod.spider.merge.H.i.i[c3];
                    i12++;
                }
            }
        }
        this.b[this.c - 1] = '\'';
    }

    public h0(int i, i0... i0VarArr) {
        this.o = -1;
        this.e = null;
        ThreadLocal<char[]> threadLocal = r;
        char[] cArr = threadLocal.get();
        this.b = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        } else {
            this.b = new char[2048];
        }
        for (i0 i0Var : i0VarArr) {
            i |= i0Var.b;
        }
        this.d = i;
        d();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        write(c);
        return this;
    }
}
