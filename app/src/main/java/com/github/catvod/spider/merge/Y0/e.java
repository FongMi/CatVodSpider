package com.github.catvod.spider.merge.Y0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class e {
    private static final int[] a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(l lVar, int i) {
        a aVar = lVar.c;
        int[] iArr = lVar.p;
        int i2 = i * 2;
        a.d(aVar);
        int i3 = i * 1080;
        int iH = h(lVar.e, i3, aVar);
        lVar.n[i] = f(lVar.f, i3, aVar);
        int i4 = iH == 1 ? iArr[i2 + 1] + 1 : iH == 0 ? iArr[i2] : iH - 2;
        int[] iArr2 = lVar.o;
        if (i4 >= iArr2[i]) {
            i4 -= iArr2[i];
        }
        int i5 = i2 + 1;
        iArr[i2] = iArr[i5];
        iArr[i5] = i4;
    }

    private static int b(int i, byte[] bArr, a aVar) {
        a.i(aVar);
        int iD = d(aVar) + 1;
        if (iD == 1) {
            n.a(bArr, i);
            return iD;
        }
        int iH = a.h(aVar, 1) == 1 ? a.h(aVar, 4) + 1 : 0;
        int[] iArr = new int[1080];
        g(iD + iH, iArr, 0, aVar);
        int i2 = 0;
        while (i2 < i) {
            a.i(aVar);
            a.d(aVar);
            int iH2 = h(iArr, 0, aVar);
            if (iH2 == 0) {
                bArr[i2] = 0;
            } else if (iH2 <= iH) {
                for (int iH3 = (1 << iH2) + a.h(aVar, iH2); iH3 != 0; iH3--) {
                    if (i2 >= i) {
                        throw new c("Corrupted context map");
                    }
                    bArr[i2] = 0;
                    i2++;
                }
            } else {
                bArr[i2] = (byte) (iH2 - iH);
            }
            i2++;
        }
        if (a.h(aVar, 1) == 1) {
            int[] iArr2 = new int[256];
            for (int i3 = 0; i3 < 256; i3++) {
                iArr2[i3] = i3;
            }
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                bArr[i4] = (byte) iArr2[i5];
                if (i5 != 0) {
                    int i6 = iArr2[i5];
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        iArr2[i5] = iArr2[i7];
                        i5 = i7;
                    }
                    iArr2[0] = i6;
                }
            }
        }
        return iD;
    }

    private static void c(l lVar) {
        a(lVar, 0);
        int i = lVar.p[1];
        int i2 = i << 6;
        lVar.A = i2;
        lVar.v = lVar.k.c[lVar.z[i2] & 255];
        byte b2 = lVar.y[i];
        int[] iArr = d.b;
        lVar.C = iArr[b2];
        lVar.D = iArr[b2 + 1];
    }

    private static int d(a aVar) {
        if (a.h(aVar, 1) == 0) {
            return 0;
        }
        int iH = a.h(aVar, 3);
        if (iH == 0) {
            return 1;
        }
        return a.h(aVar, iH) + (1 << iH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        throw new com.github.catvod.spider.merge.Y0.c("Invalid backward reference");
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x034a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x046c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028c A[LOOP:6: B:77:0x028c->B:336:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void e(com.github.catvod.spider.merge.Y0.l r17) {
        /*
            Method dump skipped, instruction units count: 1622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Y0.e.e(com.github.catvod.spider.merge.Y0.l):void");
    }

    private static int f(int[] iArr, int i, a aVar) {
        a.d(aVar);
        int iH = h(iArr, i, aVar);
        return k.a[iH] + a.h(aVar, k.b[iH]);
    }

    static void g(int i, int[] iArr, int i2, a aVar) {
        a.i(aVar);
        int[] iArr2 = new int[i];
        int iH = a.h(aVar, 2);
        boolean z = true;
        if (iH == 1) {
            int i3 = i - 1;
            int[] iArr3 = new int[4];
            int iH2 = a.h(aVar, 2) + 1;
            int i4 = 0;
            while (i3 != 0) {
                i3 >>= 1;
                i4++;
            }
            for (int i5 = 0; i5 < iH2; i5++) {
                iArr3[i5] = a.h(aVar, i4) % i;
                iArr2[iArr3[i5]] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (iH2 != 1) {
                if (iH2 == 2) {
                    boolean z2 = iArr3[0] != iArr3[1];
                    iArr2[iArr3[1]] = 1;
                    z = z2;
                } else if (iH2 != 3) {
                    boolean z3 = (iArr3[0] == iArr3[1] || iArr3[0] == iArr3[2] || iArr3[0] == iArr3[3] || iArr3[1] == iArr3[2] || iArr3[1] == iArr3[3] || iArr3[2] == iArr3[3]) ? false : true;
                    if (a.h(aVar, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z = z3;
                } else if (iArr3[0] == iArr3[1] || iArr3[0] == iArr3[2] || iArr3[1] == iArr3[2]) {
                    z = false;
                }
            }
        } else {
            int[] iArr4 = new int[18];
            int i6 = 32;
            int i7 = 0;
            for (int i8 = 18; iH < i8 && i6 > 0; i8 = 18) {
                int i9 = a[iH];
                a.d(aVar);
                long j = aVar.f;
                int i10 = aVar.g;
                int i11 = ((int) (j >>> i10)) & 15;
                int[] iArr5 = d;
                aVar.g = i10 + (iArr5[i11] >> 16);
                int i12 = iArr5[i11] & 65535;
                iArr4[i9] = i12;
                if (i12 != 0) {
                    i6 -= 32 >> i12;
                    i7++;
                }
                iH++;
            }
            if (i7 != 1 && i6 != 0) {
                z = false;
            }
            int[] iArr6 = new int[32];
            h.a(iArr6, 0, 5, iArr4, 18);
            int i13 = 8;
            int i14 = 0;
            int i15 = 32768;
            int i16 = 0;
            loop3: while (true) {
                int i17 = 0;
                while (i14 < i && i15 > 0) {
                    a.i(aVar);
                    a.d(aVar);
                    int i18 = i15;
                    long j2 = aVar.f;
                    int i19 = aVar.g;
                    int i20 = ((int) (j2 >>> i19)) & 31;
                    aVar.g = i19 + (iArr6[i20] >> 16);
                    int i21 = iArr6[i20] & 65535;
                    if (i21 < 16) {
                        int i22 = i14 + 1;
                        iArr2[i14] = i21;
                        if (i21 != 0) {
                            i18 -= 32768 >> i21;
                            i13 = i21;
                        }
                        i14 = i22;
                        i15 = i18;
                    } else {
                        int i23 = i21 - 14;
                        int i24 = i21 == 16 ? i13 : 0;
                        if (i16 != i24) {
                            i16 = i24;
                            i17 = 0;
                        }
                        int iH3 = (i17 > 0 ? (i17 - 2) << i23 : i17) + a.h(aVar, i23) + 3;
                        int i25 = iH3 - i17;
                        if (i14 + i25 > i) {
                            throw new c("symbol + repeatDelta > numSymbols");
                        }
                        int i26 = 0;
                        while (i26 < i25) {
                            iArr2[i14] = i16;
                            i26++;
                            i14++;
                        }
                        i15 = i16 != 0 ? i18 - (i25 << (15 - i16)) : i18;
                        i17 = iH3;
                    }
                }
                break loop3;
            }
            if (i15 != 0) {
                throw new c("Unused space");
            }
            n.b(iArr2, i14, i - i14);
        }
        if (!z) {
            throw new c("Can't readHuffmanCode");
        }
        h.a(iArr, i2, 8, iArr2, i);
    }

    private static int h(int[] iArr, int i, a aVar) {
        long j = aVar.f;
        int i2 = aVar.g;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & 255);
        int i5 = iArr[i4] >> 16;
        int i6 = iArr[i4] & 65535;
        if (i5 <= 8) {
            aVar.g = i2 + i5;
            return i6;
        }
        int i7 = i4 + i6 + ((((1 << i5) - 1) & i3) >>> 8);
        aVar.g = (iArr[i7] >> 16) + 8 + i2;
        return iArr[i7] & 65535;
    }
}
