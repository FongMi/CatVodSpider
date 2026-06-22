package com.github.catvod.spider.merge.Y0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class m {
    static final m[] d = {new m("", 0, ""), new m("", 0, " "), new m(" ", 0, " "), new m("", 12, ""), new m("", 10, " "), new m("", 0, " the "), new m(" ", 0, ""), new m("s ", 0, " "), new m("", 0, " of "), new m("", 10, ""), new m("", 0, " and "), new m("", 13, ""), new m("", 1, ""), new m(", ", 0, " "), new m("", 0, ", "), new m(" ", 10, " "), new m("", 0, " in "), new m("", 0, " to "), new m("e ", 0, " "), new m("", 0, "\""), new m("", 0, "."), new m("", 0, "\">"), new m("", 0, "\n"), new m("", 3, ""), new m("", 0, "]"), new m("", 0, " for "), new m("", 14, ""), new m("", 2, ""), new m("", 0, " a "), new m("", 0, " that "), new m(" ", 10, ""), new m("", 0, ". "), new m(".", 0, ""), new m(" ", 0, ", "), new m("", 15, ""), new m("", 0, " with "), new m("", 0, "'"), new m("", 0, " from "), new m("", 0, " by "), new m("", 16, ""), new m("", 17, ""), new m(" the ", 0, ""), new m("", 4, ""), new m("", 0, ". The "), new m("", 11, ""), new m("", 0, " on "), new m("", 0, " as "), new m("", 0, " is "), new m("", 7, ""), new m("", 1, "ing "), new m("", 0, "\n\t"), new m("", 0, ":"), new m(" ", 0, ". "), new m("", 0, "ed "), new m("", 20, ""), new m("", 18, ""), new m("", 6, ""), new m("", 0, "("), new m("", 10, ", "), new m("", 8, ""), new m("", 0, " at "), new m("", 0, "ly "), new m(" the ", 0, " of "), new m("", 5, ""), new m("", 9, ""), new m(" ", 10, ", "), new m("", 10, "\""), new m(".", 0, "("), new m("", 11, " "), new m("", 10, "\">"), new m("", 0, "=\""), new m(" ", 0, "."), new m(".com/", 0, ""), new m(" the ", 0, " of the "), new m("", 10, "'"), new m("", 0, ". This "), new m("", 0, ","), new m(".", 0, " "), new m("", 10, "("), new m("", 10, "."), new m("", 0, " not "), new m(" ", 0, "=\""), new m("", 0, "er "), new m(" ", 11, " "), new m("", 0, "al "), new m(" ", 11, ""), new m("", 0, "='"), new m("", 11, "\""), new m("", 10, ". "), new m(" ", 0, "("), new m("", 0, "ful "), new m(" ", 10, ". "), new m("", 0, "ive "), new m("", 0, "less "), new m("", 11, "'"), new m("", 0, "est "), new m(" ", 10, "."), new m("", 11, "\">"), new m(" ", 0, "='"), new m("", 10, ","), new m("", 0, "ize "), new m("", 11, "."), new m("Â ", 0, ""), new m(" ", 0, ","), new m("", 10, "=\""), new m("", 11, "=\""), new m("", 0, "ous "), new m("", 11, ", "), new m("", 10, "='"), new m(" ", 10, ","), new m(" ", 11, "=\""), new m(" ", 11, ", "), new m("", 11, ","), new m("", 11, "("), new m("", 11, ". "), new m(" ", 11, "."), new m("", 11, "='"), new m(" ", 11, ". "), new m(" ", 10, "=\""), new m(" ", 11, "='"), new m(" ", 10, "='")};
    private final byte[] a;
    private final int b;
    private final byte[] c;

    m(String str, int i, String str2) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) str.charAt(i2);
        }
        this.a = bArr;
        this.b = i;
        int length2 = str2.length();
        byte[] bArr2 = new byte[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            bArr2[i3] = (byte) str2.charAt(i3);
        }
        this.c = bArr2;
    }

    static int a(byte[] bArr, int i, byte[] bArr2, int i2, int i3, m mVar) {
        int i4 = i;
        for (byte b : mVar.a) {
            bArr[i4] = b;
            i4++;
        }
        int i5 = mVar.b;
        int i6 = i5 >= 12 ? (i5 - 12) + 1 : 0;
        if (i6 > i3) {
            i6 = i3;
        }
        int i7 = i2 + i6;
        int i8 = (i3 - i6) - (i5 <= 9 ? (i5 - 1) + 1 : 0);
        int i9 = i8;
        while (i9 > 0) {
            bArr[i4] = bArr2[i7];
            i9--;
            i4++;
            i7++;
        }
        if (i5 == 11 || i5 == 10) {
            int i10 = i4 - i8;
            int i11 = i5 != 10 ? i8 : 1;
            while (i11 > 0) {
                int i12 = bArr[i10] & 255;
                if (i12 < 192) {
                    if (i12 >= 97 && i12 <= 122) {
                        bArr[i10] = (byte) (bArr[i10] ^ 32);
                    }
                    i10++;
                    i11--;
                } else if (i12 < 224) {
                    int i13 = i10 + 1;
                    bArr[i13] = (byte) (bArr[i13] ^ 32);
                    i10 += 2;
                    i11 -= 2;
                } else {
                    int i14 = i10 + 2;
                    bArr[i14] = (byte) (bArr[i14] ^ 5);
                    i10 += 3;
                    i11 -= 3;
                }
            }
        }
        for (byte b2 : mVar.c) {
            bArr[i4] = b2;
            i4++;
        }
        return i4 - i;
    }
}
