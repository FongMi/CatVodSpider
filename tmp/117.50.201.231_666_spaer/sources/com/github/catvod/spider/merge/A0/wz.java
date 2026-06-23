package com.github.catvod.spider.merge.A0;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class wz {
    public static final int[] a = new int[0];
    public int[] b = a;
    public int c;

    public final void d(int i) {
        int[] iArr = this.b;
        int length = iArr.length;
        int i2 = this.c;
        if (length == i2) {
            int i3 = i2 + 1;
            if (i3 < 0 || i3 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArr.length == 0 ? 4 : iArr.length;
            while (length2 < i3) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.b = Arrays.copyOf(this.b, length2);
        }
        int[] iArr2 = this.b;
        int i4 = this.c;
        iArr2[i4] = i;
        this.c = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        if (this.c != wzVar.c) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != wzVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.c;
        return Arrays.toString(i == 0 ? a : Arrays.copyOf(this.b, i));
    }
}
