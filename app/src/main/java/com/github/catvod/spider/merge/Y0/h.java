package com.github.catvod.spider.merge.Y0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class h {
    static void a(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int i4;
        int i5;
        int i6;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = iArr2[i8];
            iArr4[i9] = iArr4[i9] + 1;
        }
        iArr5[1] = 0;
        int i10 = 1;
        while (i10 < 15) {
            int i11 = i10 + 1;
            iArr5[i11] = iArr5[i10] + iArr4[i10];
            i10 = i11;
        }
        for (int i12 = 0; i12 < i3; i12++) {
            if (iArr2[i12] != 0) {
                int i13 = iArr2[i12];
                int i14 = iArr5[i13];
                iArr5[i13] = i14 + 1;
                iArr3[i14] = i12;
            }
        }
        int i15 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i16 = 0; i16 < i15; i16++) {
                iArr[i + i16] = iArr3[0];
            }
            return;
        }
        int i17 = 2;
        int i18 = 0;
        int i19 = 1;
        int i20 = 2;
        while (i19 <= i2) {
            while (iArr4[i19] > 0) {
                int i21 = i + i7;
                int i22 = i18 + 1;
                int i23 = (i19 << 16) | iArr3[i18];
                int i24 = i15;
                do {
                    i24 -= i20;
                    iArr[i21 + i24] = i23;
                } while (i24 > 0);
                int i25 = 1 << (i19 - 1);
                while ((i7 & i25) != 0) {
                    i25 >>= 1;
                }
                i7 = (i7 & (i25 - 1)) + i25;
                iArr4[i19] = iArr4[i19] - 1;
                i18 = i22;
            }
            i19++;
            i20 <<= 1;
        }
        int i26 = i15 - 1;
        int i27 = i2 + 1;
        int i28 = -1;
        int i29 = i;
        while (i27 <= 15) {
            while (iArr4[i27] > 0) {
                int i30 = i7 & i26;
                if (i30 != i28) {
                    int i31 = i29 + i15;
                    int i32 = 1 << (i27 - i2);
                    int i33 = i27;
                    while (i33 < 15) {
                        int i34 = i32 - iArr4[i33];
                        if (i34 <= 0) {
                            break;
                        }
                        i33++;
                        i32 = i34 << 1;
                    }
                    int i35 = i33 - i2;
                    iArr[i + i30] = ((i35 + i2) << 16) | ((i31 - i) - i30);
                    i6 = i31;
                    i5 = i30;
                    i4 = 1 << i35;
                } else {
                    i4 = i15;
                    i5 = i28;
                    i6 = i29;
                }
                int i36 = i6 + (i7 >> i2);
                int i37 = i18 + 1;
                int i38 = ((i27 - i2) << 16) | iArr3[i18];
                int i39 = i4;
                do {
                    i39 -= i17;
                    iArr[i36 + i39] = i38;
                } while (i39 > 0);
                int i40 = 1 << (i27 - 1);
                while ((i7 & i40) != 0) {
                    i40 >>= 1;
                }
                i7 = (i7 & (i40 - 1)) + i40;
                iArr4[i27] = iArr4[i27] - 1;
                i15 = i4;
                i29 = i6;
                i28 = i5;
                i18 = i37;
            }
            i27++;
            i17 <<= 1;
        }
    }
}
