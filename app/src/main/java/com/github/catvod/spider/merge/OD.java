package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class OD {
    private static final Charset l8 = Q.S;
    private static final byte[] S = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    private static class aA {
        int l8;

        aA(int i) {
            this.l8 = i;
        }
    }

    public static byte[] S(byte[] bArr) {
        return a.l8(bArr) ? bArr : T4(bArr, 0, bArr.length);
    }

    public static byte[] T4(byte[] bArr, int i, int i2) {
        if (a.l8(bArr)) {
            return bArr;
        }
        aA aAVar = new aA(i);
        int i3 = (i + i2) - 1;
        int i4 = 0;
        int i5 = (i2 * 3) / 4;
        byte[] bArr2 = new byte[i5];
        while (aAVar.l8 <= i3) {
            byte b = b(bArr, aAVar, i3);
            byte b2 = b(bArr, aAVar, i3);
            byte b3 = b(bArr, aAVar, i3);
            byte b4 = b(bArr, aAVar, i3);
            if (-2 != b2) {
                bArr2[i4] = (byte) ((b << 2) | (b2 >>> 4));
                i4++;
            }
            if (-2 != b3) {
                bArr2[i4] = (byte) (((b2 & 15) << 4) | (b3 >>> 2));
                i4++;
            }
            if (-2 != b4) {
                bArr2[i4] = (byte) (((b3 & 3) << 6) | b4);
                i4++;
            }
        }
        return i4 == i5 ? bArr2 : (byte[]) Ph.S(bArr2, new byte[i4], i4);
    }

    private static byte b(byte[] bArr, aA aAVar, int i) {
        byte b;
        while (true) {
            int i2 = aAVar.l8;
            if (i2 > i) {
                return (byte) -2;
            }
            aAVar.l8 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 > -1 && (b = S[b2]) > -1) {
                return b;
            }
        }
    }

    public static byte[] l8(CharSequence charSequence) {
        return S(i.l8(charSequence, l8));
    }
}
