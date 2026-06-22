package com.github.catvod.spider.merge.X0;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    protected final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    protected final byte[] b = new byte[128];

    public b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i >= bArr2.length) {
                return;
            }
            this.b[bArr2[i]] = (byte) i;
            i++;
        }
    }

    private boolean c(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    private int d(String str, int i, int i2) {
        while (i < i2 && c(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public final int a(String str, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!c(str.charAt(i))) {
                break;
            }
            length = i;
        }
        if (length == 0) {
            return 0;
        }
        int i2 = length;
        int i3 = 0;
        while (i2 > 0 && i3 != 4) {
            i2--;
            if (!c(str.charAt(i2))) {
                i3++;
            }
        }
        int iD = d(str, 0, i2);
        int i4 = 0;
        int i5 = 0;
        while (iD < i2) {
            int i6 = iD + 1;
            byte b = this.b[str.charAt(iD)];
            int iD2 = d(str, i6, i2);
            int i7 = iD2 + 1;
            byte b2 = this.b[str.charAt(iD2)];
            int iD3 = d(str, i7, i2);
            int i8 = iD3 + 1;
            byte b3 = this.b[str.charAt(iD3)];
            int iD4 = d(str, i8, i2);
            int i9 = iD4 + 1;
            byte b4 = this.b[str.charAt(iD4)];
            if ((b | b2 | b3 | b4) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            int i10 = i4 + 1;
            bArr[i4] = (byte) ((b << 2) | (b2 >> 4));
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((b2 << 4) | (b3 >> 2));
            i4 = i11 + 1;
            bArr[i11] = (byte) ((b3 << 6) | b4);
            i5 += 3;
            if (i4 == 54) {
                outputStream.write(bArr);
                i4 = 0;
            }
            iD = d(str, i9, i2);
        }
        if (i4 > 0) {
            outputStream.write(bArr, 0, i4);
        }
        int iD5 = d(str, iD, length);
        int iD6 = d(str, iD5 + 1, length);
        int iD7 = d(str, iD6 + 1, length);
        int iD8 = d(str, iD7 + 1, length);
        char cCharAt = str.charAt(iD5);
        char cCharAt2 = str.charAt(iD6);
        char cCharAt3 = str.charAt(iD7);
        char cCharAt4 = str.charAt(iD8);
        int i12 = 2;
        if (cCharAt3 == '=') {
            if (cCharAt4 != '=') {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr2 = this.b;
            byte b5 = bArr2[cCharAt];
            byte b6 = bArr2[cCharAt2];
            if ((b5 | b6) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b6 >> 4) | (b5 << 2));
            i12 = 1;
        } else if (cCharAt4 == '=') {
            byte[] bArr3 = this.b;
            byte b7 = bArr3[cCharAt];
            byte b8 = bArr3[cCharAt2];
            byte b9 = bArr3[cCharAt3];
            if ((b7 | b8 | b9) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b7 << 2) | (b8 >> 4));
            outputStream.write((b9 >> 2) | (b8 << 4));
        } else {
            byte[] bArr4 = this.b;
            byte b10 = bArr4[cCharAt];
            byte b11 = bArr4[cCharAt2];
            byte b12 = bArr4[cCharAt3];
            byte b13 = bArr4[cCharAt4];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b10 << 2) | (b11 >> 4));
            outputStream.write((b11 << 4) | (b12 >> 2));
            outputStream.write(b13 | (b12 << 6));
            i12 = 3;
        }
        return i5 + i12;
    }

    public final int b(byte[] bArr, int i, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[72];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int iMin = Math.min(54, i2);
            int i4 = i3 + iMin;
            int i5 = i4 - 2;
            int i6 = i3;
            int i7 = 0;
            while (i6 < i5) {
                int i8 = i6 + 1;
                byte b = bArr[i6];
                int i9 = i8 + 1;
                int i10 = bArr[i8] & 255;
                int i11 = i9 + 1;
                int i12 = bArr[i9] & 255;
                int i13 = i7 + 1;
                byte[] bArr3 = this.a;
                bArr2[i7] = bArr3[(b >>> 2) & 63];
                int i14 = i13 + 1;
                bArr2[i13] = bArr3[((b << 4) | (i10 >>> 4)) & 63];
                int i15 = i14 + 1;
                bArr2[i14] = bArr3[((i10 << 2) | (i12 >>> 6)) & 63];
                i7 = i15 + 1;
                bArr2[i15] = bArr3[i12 & 63];
                i6 = i11;
            }
            int i16 = iMin - (i6 - i3);
            if (i16 == 1) {
                int i17 = bArr[i6] & 255;
                int i18 = i7 + 1;
                byte[] bArr4 = this.a;
                bArr2[i7] = bArr4[(i17 >>> 2) & 63];
                int i19 = i18 + 1;
                bArr2[i18] = bArr4[(i17 << 4) & 63];
                int i20 = i19 + 1;
                bArr2[i19] = 61;
                i7 = i20 + 1;
                bArr2[i20] = 61;
            } else if (i16 == 2) {
                int i21 = i6 + 1;
                int i22 = bArr[i6] & 255;
                int i23 = bArr[i21] & 255;
                int i24 = i7 + 1;
                byte[] bArr5 = this.a;
                bArr2[i7] = bArr5[(i22 >>> 2) & 63];
                int i25 = i24 + 1;
                bArr2[i24] = bArr5[((i22 << 4) | (i23 >>> 4)) & 63];
                int i26 = i25 + 1;
                bArr2[i25] = bArr5[(i23 << 2) & 63];
                i7 = i26 + 1;
                bArr2[i26] = 61;
            }
            outputStream.write(bArr2, 0, i7 - 0);
            i2 -= iMin;
            i3 = i4;
        }
        return ((i2 + 2) / 3) * 4;
    }
}
