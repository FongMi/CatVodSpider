package com.github.catvod.spider.merge;

import java.nio.charset.Charset;

/* renamed from: com.github.catvod.spider.merge.oK */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0134oK {

    /* renamed from: q */
    private static final Charset f730q = C0081O.f476xC;

    /* renamed from: xC */
    private static final byte[] f731xC = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: com.github.catvod.spider.merge.oK$p */
    private static class p {

        /* renamed from: q */
        int f732q;

        p(int i) {
            this.f732q = i;
        }
    }

    /* renamed from: QU */
    public static byte[] m692QU(byte[] bArr, int i, int i2) {
        if (C0076N.m253q(bArr)) {
            return bArr;
        }
        p pVar = new p(i);
        int i3 = (i + i2) - 1;
        int i4 = 0;
        int i5 = (i2 * 3) / 4;
        byte[] bArr2 = new byte[i5];
        while (pVar.f732q <= i3) {
            byte bM693UJ = m693UJ(bArr, pVar, i3);
            byte bM693UJ2 = m693UJ(bArr, pVar, i3);
            byte bM693UJ3 = m693UJ(bArr, pVar, i3);
            byte bM693UJ4 = m693UJ(bArr, pVar, i3);
            if (-2 != bM693UJ2) {
                bArr2[i4] = (byte) ((bM693UJ << 2) | (bM693UJ2 >>> 4));
                i4++;
            }
            if (-2 != bM693UJ3) {
                bArr2[i4] = (byte) (((bM693UJ2 & 15) << 4) | (bM693UJ3 >>> 2));
                i4++;
            }
            if (-2 != bM693UJ4) {
                bArr2[i4] = (byte) (((bM693UJ3 & 3) << 6) | bM693UJ4);
                i4++;
            }
        }
        return i4 == i5 ? bArr2 : (byte[]) C0160yn.m784xC(bArr2, new byte[i4], i4);
    }

    /* renamed from: UJ */
    private static byte m693UJ(byte[] bArr, p pVar, int i) {
        byte b;
        while (true) {
            int i2 = pVar.f732q;
            if (i2 > i) {
                return (byte) -2;
            }
            pVar.f732q = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 > -1 && (b = f731xC[b2]) > -1) {
                return b;
            }
        }
    }

    /* renamed from: q */
    public static byte[] m694q(CharSequence charSequence) {
        return m695xC(C0100Vm.m470q(charSequence, f730q));
    }

    /* renamed from: xC */
    public static byte[] m695xC(byte[] bArr) {
        return C0076N.m253q(bArr) ? bArr : m692QU(bArr, 0, bArr.length);
    }
}
