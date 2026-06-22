package com.github.catvod.spider.merge.n0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.n0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1349d implements InterfaceC1348c {
    private static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

    public final String a(byte[] bArr) {
        int length = (bArr.length * 8) / 6;
        int i = length % 4;
        int i2 = length - i;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i4] & 255) << 16) | ((bArr[i5] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            for (int i10 = 3; i10 >= 0; i10--) {
                sb.append(a[(i9 >>> (i10 * 6)) & 63]);
            }
            i3 += 4;
            i4 = i8;
        }
        if (i > 0) {
            if (i == 1) {
                int i11 = bArr[i4] & 255;
                char[] cArr = a;
                sb.append(cArr[i11 >> 2]);
                sb.append(cArr[(i11 << 4) & 63]);
                sb.append("==");
            } else {
                int i12 = (bArr[i4 + 1] & 255) | ((bArr[i4] & 255) << 8);
                char[] cArr2 = a;
                sb.append(cArr2[(i12 >>> 10) & 63]);
                sb.append(cArr2[(i12 >>> 4) & 63]);
                sb.append(cArr2[(i12 << 2) & 63]);
                sb.append('=');
            }
        }
        return sb.toString();
    }
}
