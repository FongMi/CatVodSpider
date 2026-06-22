package com.github.catvod.spider.merge.f1;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1197z {
    private char[] a = new char[128];
    private int b;

    private void i(char c) {
        int i = this.b;
        if (i == this.a.length) {
            o(i + 1);
        }
        char[] cArr = this.a;
        int i2 = this.b;
        cArr[i2] = c;
        this.b = i2 + 1;
    }

    private void j(String str) {
        int length = str.length();
        int i = this.b + (length >= 32768 ? 2 : 1) + length;
        if (i > this.a.length) {
            o(i);
        }
        if (length >= 32768) {
            char[] cArr = this.a;
            int i2 = this.b;
            cArr[i2] = (char) (32768 | (length >>> 16));
            this.b = i2 + 1;
        }
        char[] cArr2 = this.a;
        int i3 = this.b;
        cArr2[i3] = (char) length;
        int i4 = i3 + 1;
        this.b = i4;
        str.getChars(0, length, cArr2, i4);
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f6, code lost:
    
        if (88 == n(r17, r2, r12)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0245, code lost:
    
        if (1 != n(r17, r2, r12)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02ce, code lost:
    
        if (39 == n(r17, r2, r12)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02dc, code lost:
    
        if (39 == n(r17, r2, r12)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03a9, code lost:
    
        if (85 != n(r17, r2, r12)) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x039a  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String k(java.lang.String r17, int r18, com.github.catvod.spider.merge.f1.E2 r19) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1197z.k(java.lang.String, int, com.github.catvod.spider.merge.f1.E2):java.lang.String");
    }

    private static int n(String str, int i, int i2) {
        int i3 = i2 + 1;
        if (i3 < i) {
            return str.charAt(i3);
        }
        return 0;
    }

    private void o(int i) {
        char[] cArr = this.a;
        if (i <= cArr.length) {
            C1162n0.c();
            throw null;
        }
        int length = cArr.length * 2;
        if (length >= i) {
            i = length;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, this.b);
        this.a = cArr2;
    }

    private static int r(String str, int i, boolean z, StringBuilder sb) {
        int iCharAt = str.charAt(i);
        int i2 = i + 1;
        if ((32768 & iCharAt) != 0) {
            iCharAt = ((iCharAt & 32767) << 16) | str.charAt(i2);
            i2++;
        }
        if (sb != null) {
            String strSubstring = str.substring(i2, i2 + iCharAt);
            if (z) {
                sb.append('\"');
                sb.append(C1157l2.E(strSubstring));
                sb.append('\"');
            } else {
                sb.append(strSubstring);
            }
        }
        return i2 + iCharAt;
    }

    final void a(BigInteger bigInteger) {
        h(83);
        j(bigInteger.toString());
    }

    final void b(int i) {
        if (i < 0 || i > 174) {
            throw new IllegalArgumentException();
        }
        i((char) i);
        i((char) 1);
    }

    final void c(String str) {
        h(39);
        j(str);
    }

    final void d(double d) {
        char c;
        char c2;
        h(40);
        long j = (long) d;
        if (j != d) {
            long jDoubleToLongBits = Double.doubleToLongBits(d);
            i('D');
            i((char) (jDoubleToLongBits >> 48));
            i((char) (jDoubleToLongBits >> 32));
            i((char) (jDoubleToLongBits >> 16));
            c2 = (char) jDoubleToLongBits;
        } else {
            if (j < 0) {
                C1162n0.c();
                throw null;
            }
            if (j <= 65535) {
                c = 'S';
            } else {
                i('J');
                i((char) (j >> 48));
                i((char) (j >> 32));
                c = (char) (j >> 16);
            }
            i(c);
            c2 = (char) j;
        }
        i(c2);
    }

    final void e(String str, String str2) {
        h(48);
        j('/' + str + '/' + str2);
    }

    final void f(String str) {
        h(41);
        j(str);
    }

    final void g(String str) {
        h(171);
        j(str);
    }

    final void h(int i) {
        if (i < 0 || i > 174) {
            throw new IllegalArgumentException();
        }
        i((char) i);
    }

    final int l() {
        return this.b;
    }

    final String m() {
        int i = this.b;
        if (i >= 0) {
            return new String(this.a, 0, i - 0);
        }
        C1162n0.c();
        throw null;
    }

    final int p() {
        int i = this.b;
        i((char) 175);
        return i;
    }

    final int q(int i, boolean z) {
        int i2 = this.b;
        if (i != 4) {
            h(113);
            if (z) {
                h(23);
            }
            i((char) i);
        }
        return i2;
    }
}
