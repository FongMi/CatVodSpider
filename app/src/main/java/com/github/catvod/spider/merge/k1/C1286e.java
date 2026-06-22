package com.github.catvod.spider.merge.k1;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1286e {
    public static String a(double d) {
        int iA;
        int i;
        long jB;
        long j;
        long j2;
        long j3;
        long j4;
        char c;
        int i2;
        int i3;
        double d2 = d;
        C1287f c1287f = new C1287f();
        c1287f.b = 0;
        c1287f.d = false;
        if (d2 < 0.0d) {
            c1287f.a('-');
            d2 = -d2;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        long jB2 = C1285d.b(jDoubleToLongBits);
        int iA2 = C1285d.a(jDoubleToLongBits);
        while ((jB2 & 4503599627370496L) == 0) {
            jB2 <<= 1;
            iA2--;
        }
        C1284c c1284c = new C1284c(jB2 << 11, iA2 - 11);
        C1284c c1284c2 = new C1284c();
        C1284c c1284c3 = new C1284c();
        C1284c c1284c4 = new C1284c(C1285d.b(jDoubleToLongBits), C1285d.a(jDoubleToLongBits));
        boolean z = c1284c4.b() == 4503599627370496L;
        c1284c3.f((c1284c4.b() << 1) + 1);
        c1284c3.e(c1284c4.a() - 1);
        c1284c3.d();
        if (!z || c1284c4.a() == -1074) {
            c1284c2.f((c1284c4.b() << 1) - 1);
            iA = c1284c4.a() - 1;
        } else {
            c1284c2.f((c1284c4.b() << 2) - 1);
            iA = c1284c4.a() - 2;
        }
        c1284c2.e(iA);
        c1284c2.f(c1284c2.b() << (c1284c2.a() - c1284c3.a()));
        c1284c2.e(c1284c3.a());
        C1284c c1284c5 = new C1284c();
        double dA = (((-60) - (c1284c.a() + 64)) + 64) - 1;
        Double.isNaN(dA);
        Double.isNaN(dA);
        Double.isNaN(dA);
        Double.isNaN(dA);
        Double.isNaN(dA);
        C1282a c1282a = C1283b.a[(((((int) Math.ceil(dA * 0.30102999566398114d)) + 308) - 1) / 8) + 1];
        c1284c5.f(c1282a.a);
        c1284c5.e(c1282a.b);
        short s = c1282a.c;
        C1284c c1284cG = C1284c.g(c1284c, c1284c5);
        C1284c c1284cG2 = C1284c.g(c1284c2, c1284c5);
        C1284c c1284cG3 = C1284c.g(c1284c3, c1284c5);
        C1284c c1284c6 = new C1284c(c1284cG2.b() - 1, c1284cG2.a());
        C1284c c1284c7 = new C1284c(c1284cG3.b() + 1, c1284cG3.a());
        C1284c c1284cC = C1284c.c(c1284c7, c1284c6);
        C1284c c1284c8 = new C1284c(1 << (-c1284cG.a()), c1284cG.a());
        int iB = (int) ((c1284c7.b() >>> (-c1284c8.a())) & 4294967295L);
        long jB3 = c1284c7.b() & (c1284c8.b() - 1);
        int i4 = 10000;
        switch (64 - (-c1284c8.a())) {
            case 30:
            case 31:
            case 32:
                if (1000000000 <= iB) {
                    i = 9;
                    i4 = 1000000000;
                    break;
                }
            case 27:
            case 28:
            case 29:
                if (100000000 <= iB) {
                    i = 8;
                    i4 = 100000000;
                    break;
                }
            case 24:
            case 25:
            case 26:
                if (10000000 <= iB) {
                    i = 7;
                    i4 = 10000000;
                    break;
                }
            case 20:
            case 21:
            case 22:
            case 23:
                if (1000000 <= iB) {
                    i = 6;
                    i4 = 1000000;
                    break;
                }
            case 17:
            case 18:
            case 19:
                if (100000 <= iB) {
                    i = 5;
                    i4 = 100000;
                    break;
                }
            case 14:
            case 15:
            case 16:
                if (10000 <= iB) {
                    i = 4;
                    break;
                }
            case 10:
            case 11:
            case 12:
            case 13:
                if (1000 <= iB) {
                    i = 3;
                    i4 = 1000;
                    break;
                }
            case 7:
            case 8:
            case 9:
                if (100 <= iB) {
                    i = 2;
                    i4 = 100;
                    break;
                }
            case 4:
            case 5:
            case 6:
                if (10 <= iB) {
                    i = 1;
                    i4 = 10;
                    break;
                }
            case 1:
            case 2:
            case 3:
                if (1 <= iB) {
                    i4 = 1;
                    i = 0;
                    break;
                }
            case 0:
                i = -1;
                i4 = 0;
                break;
            default:
                i4 = 0;
                i = 0;
                break;
        }
        long j5 = (((long) i4) << 32) | (((long) i) & 4294967295L);
        int i5 = (int) ((j5 >>> 32) & 4294967295L);
        int i6 = ((int) (j5 & 4294967295L)) + 1;
        while (true) {
            if (i6 > 0) {
                c1287f.a((char) ((iB / i5) + 48));
                iB %= i5;
                i6--;
                long j6 = (((long) iB) << (-c1284c8.a())) + jB3;
                if (j6 < c1284cC.b()) {
                    c1287f.c = (c1287f.b - s) + i6;
                    jB = C1284c.c(c1284c7, c1284cG).b();
                    long jB4 = c1284cC.b();
                    j4 = 1;
                    j3 = ((long) i5) << (-c1284c8.a());
                    j = jB4;
                    j2 = j6;
                } else {
                    i5 /= 10;
                }
            } else {
                long j7 = 1;
                do {
                    long j8 = jB3 * 5;
                    j7 *= 5;
                    c1284cC.f(c1284cC.b() * 5);
                    c1284cC.e(c1284cC.a() + 1);
                    c1284c8.f(c1284c8.b() >>> 1);
                    c1284c8.e(c1284c8.a() + 1);
                    c1287f.a((char) (((int) ((j8 >>> (-c1284c8.a())) & 4294967295L)) + 48));
                    jB3 = j8 & (c1284c8.b() - 1);
                    i6--;
                } while (jB3 >= c1284cC.b());
                c1287f.c = (c1287f.b - s) + i6;
                jB = C1284c.c(c1284c7, c1284cG).b() * j7;
                long jB5 = c1284cC.b();
                long jB6 = c1284c8.b();
                j = jB5;
                j2 = jB3;
                j3 = jB6;
                j4 = j7;
            }
        }
        if (!b(c1287f, jB, j, j2, j3, j4)) {
            return null;
        }
        if (!c1287f.d) {
            char[] cArr = c1287f.a;
            int i7 = cArr[0] == '-' ? 1 : 0;
            int i8 = c1287f.c;
            int i9 = i8 - i7;
            if (i9 < -5 || i9 > 21) {
                int i10 = c1287f.b;
                if (i10 - i7 > 1) {
                    int i11 = i7 + 1;
                    System.arraycopy(cArr, i11, cArr, i11 + 1, i10 - i11);
                    c1287f.a[i11] = '.';
                    c1287f.b++;
                }
                char[] cArr2 = c1287f.a;
                int i12 = c1287f.b;
                int i13 = i12 + 1;
                c1287f.b = i13;
                cArr2[i12] = 'e';
                int i14 = i9 - 1;
                if (i14 < 0) {
                    i14 = -i14;
                    c = '-';
                } else {
                    c = '+';
                }
                int i15 = i13 + 1;
                c1287f.b = i15;
                cArr2[i13] = c;
                if (i14 > 99) {
                    i15 += 2;
                } else if (i14 > 9) {
                    i15++;
                }
                c1287f.b = i15 + 1;
                while (true) {
                    int i16 = i15 - 1;
                    c1287f.a[i15] = C1287f.e[i14 % 10];
                    i14 /= 10;
                    if (i14 != 0) {
                        i15 = i16;
                    }
                }
            } else {
                int i17 = c1287f.b;
                if (i8 < i17) {
                    if (i9 > 0) {
                        System.arraycopy(cArr, i8, cArr, i8 + 1, i17 - i8);
                        c1287f.a[c1287f.c] = '.';
                        c1287f.b++;
                    } else {
                        int i18 = i7 + 2;
                        int i19 = i18 - i9;
                        System.arraycopy(cArr, i7, cArr, i19, i17 - i7);
                        char[] cArr3 = c1287f.a;
                        cArr3[i7] = '0';
                        cArr3[i7 + 1] = '.';
                        if (i9 < 0) {
                            Arrays.fill(cArr3, i18, i19, '0');
                        }
                        i2 = c1287f.b;
                        i3 = 2 - i9;
                        c1287f.b = i3 + i2;
                    }
                } else if (i8 > i17) {
                    Arrays.fill(cArr, i17, i8, '0');
                    i2 = c1287f.b;
                    i3 = c1287f.c - i2;
                    c1287f.b = i3 + i2;
                }
            }
            c1287f.d = true;
        }
        return new String(c1287f.a, 0, c1287f.b);
    }

    static boolean b(C1287f c1287f, long j, long j2, long j3, long j4, long j5) {
        long j6 = j - j5;
        long j7 = j + j5;
        long j8 = j3;
        while (j8 < j6 && j2 - j8 >= j4) {
            long j9 = j8 + j4;
            if (j9 >= j6 && j6 - j8 < j9 - j6) {
                break;
            }
            c1287f.a[c1287f.b - 1] = (char) (r5[r6] - 1);
            j8 = j9;
        }
        if (j8 < j7 && j2 - j8 >= j4) {
            long j10 = j8 + j4;
            if (j10 < j7 || j7 - j8 > j10 - j7) {
                return false;
            }
        }
        return 2 * j5 <= j8 && j8 <= j2 - (4 * j5);
    }
}
