package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* renamed from: com.github.catvod.spider.merge.t7 */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0146t7 {

    /* renamed from: q */
    private static final Charset f740q = C0081O.f476xC;

    /* renamed from: xC */
    private static final byte[] f741xC = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: QU */
    private static final byte[] f739QU = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: QU */
    public static byte[] m710QU(byte[] bArr, boolean z, boolean z2) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        int i = (length / 3) * 3;
        int i2 = length - 1;
        int i3 = ((i2 / 3) + 1) << 2;
        int i4 = i3 + (z ? ((i3 - 1) / 76) << 1 : 0);
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = z2 ? f739QU : f741xC;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i) {
            int i8 = i5 + 1;
            int i9 = i8 + 1;
            int i10 = ((bArr[i5] & 255) << 16) | ((bArr[i8] & 255) << 8);
            int i11 = i9 + 1;
            int i12 = i10 | (bArr[i9] & 255);
            int i13 = i6 + 1;
            bArr2[i6] = bArr3[(i12 >>> 18) & 63];
            int i14 = i13 + 1;
            bArr2[i13] = bArr3[(i12 >>> 12) & 63];
            int i15 = i14 + 1;
            bArr2[i14] = bArr3[(i12 >>> 6) & 63];
            i6 = i15 + 1;
            bArr2[i15] = bArr3[i12 & 63];
            if (z && (i7 = i7 + 1) == 19 && i6 < i4 - 2) {
                int i16 = i6 + 1;
                bArr2[i6] = 13;
                i6 = i16 + 1;
                bArr2[i16] = 10;
                i7 = 0;
            }
            i5 = i11;
        }
        int i17 = length - i;
        if (i17 > 0) {
            int i18 = (i17 == 2 ? (bArr[i2] & 255) << 2 : 0) | ((bArr[i] & 255) << 10);
            bArr2[i4 - 4] = bArr3[i18 >> 12];
            bArr2[i4 - 3] = bArr3[(i18 >>> 6) & 63];
            if (z2) {
                int i19 = i4 - 2;
                if (2 == i17) {
                    bArr2[i19] = bArr3[i18 & 63];
                    i19++;
                }
                byte[] bArr4 = new byte[i19];
                System.arraycopy(bArr2, 0, bArr4, 0, i19);
                return bArr4;
            }
            bArr2[i4 - 2] = i17 == 2 ? bArr3[i18 & 63] : (byte) 61;
            bArr2[i4 - 1] = 61;
        }
        return bArr2;
    }

    /* renamed from: q */
    public static String m711q(byte[] bArr) {
        return C0110b.m551xC(m712xC(bArr, false), f740q);
    }

    /* renamed from: xC */
    public static byte[] m712xC(byte[] bArr, boolean z) {
        return m710QU(bArr, z, false);
    }
}
