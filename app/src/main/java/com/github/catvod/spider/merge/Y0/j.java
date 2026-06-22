package com.github.catvod.spider.merge.Y0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class j {
    private byte[] a;
    private int[] b;

    j() {
    }

    static void a(j jVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = jVar.b;
            byte[] bArr = jVar.a;
            int i3 = i2 * 4;
            iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
    }

    static void b(j jVar, byte[] bArr, int[] iArr) {
        jVar.a = bArr;
        jVar.b = iArr;
    }
}
