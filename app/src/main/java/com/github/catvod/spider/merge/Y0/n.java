package com.github.catvod.spider.merge.Y0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class n {
    private static final byte[] a = new byte[1024];
    private static final int[] b = new int[1024];

    static void a(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int iMin = Math.min(i2 + 1024, i) - i2;
            System.arraycopy(a, 0, bArr, 0 + i2, iMin);
            i2 += iMin;
        }
    }

    static void b(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iMin = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(b, 0, iArr, i + i3, iMin);
            i3 += iMin;
        }
    }
}
