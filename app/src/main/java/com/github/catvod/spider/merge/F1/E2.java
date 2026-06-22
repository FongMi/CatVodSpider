package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class E2 implements Serializable {
    private transient int[] b;
    private transient Object[] c;
    private int d;
    private int e;
    private transient int f;
    private transient int g;

    public E2(int i) {
        if (i < 0) {
            C1162n0.c();
            throw null;
        }
        int i2 = 2;
        while ((1 << i2) < (i * 4) / 3) {
            i2++;
        }
        this.d = i2;
    }

    private int a(int i) {
        int i2;
        int[] iArr = this.b;
        if (iArr != null) {
            int i3 = (-1640531527) * i;
            int i4 = this.d;
            int i5 = i3 >>> (32 - i4);
            int i6 = iArr[i5];
            if (i6 == i) {
                return i5;
            }
            if (i6 != -1) {
                int i7 = (1 << i4) - 1;
                int iF = f(i3, i7, i4);
                do {
                    i5 = (i5 + iF) & i7;
                    i2 = iArr[i5];
                    if (i2 == i) {
                        return i5;
                    }
                } while (i2 != -1);
            }
        }
        return -1;
    }

    private int d(int i) {
        int[] iArr = this.b;
        int i2 = (-1640531527) * i;
        int i3 = this.d;
        int i4 = i2 >>> (32 - i3);
        if (iArr[i4] != -1) {
            int i5 = (1 << i3) - 1;
            int iF = f(i2, i5, i3);
            do {
                i4 = (i4 + iF) & i5;
            } while (iArr[i4] != -1);
        }
        iArr[i4] = i;
        this.f++;
        this.e++;
        return i4;
    }

    private static int f(int i, int i2, int i3) {
        int i4 = 32 - (i3 * 2);
        if (i4 >= 0) {
            i >>>= i4;
        } else {
            i2 >>>= -i4;
        }
        return (i & i2) | 1;
    }

    public final int b(int i) {
        if (i < 0) {
            C1162n0.c();
            throw null;
        }
        int iA = a(i);
        if (iA < 0) {
            C1162n0.c();
            throw null;
        }
        int i2 = this.g;
        if (i2 != 0) {
            return this.b[i2 + iA];
        }
        return 0;
    }

    public final int c(int i, int i2) {
        if (i < 0) {
            C1162n0.c();
            throw null;
        }
        int iA = a(i);
        if (iA < 0) {
            return i2;
        }
        int i3 = this.g;
        if (i3 != 0) {
            return this.b[i3 + iA];
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.E2.e(int, int):void");
    }
}
