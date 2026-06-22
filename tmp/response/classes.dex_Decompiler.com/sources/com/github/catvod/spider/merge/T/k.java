package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class k {
    private int[] a;

    public k(int[] iArr) {
        this.a = iArr;
    }

    public static int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i | (i2 << 4) | (((i4 << 4) | i3) << 8) | (((((i8 << 4) | i7) << 8) | ((i6 << 4) | i5)) << 16);
    }

    public final int b(int i) {
        return (this.a[i >> 3] >> ((i & 7) << 2)) & 15;
    }
}
