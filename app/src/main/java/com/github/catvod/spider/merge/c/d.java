package com.github.catvod.spider.merge.C;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class d {
    public static final int[] c = new int[0];
    public int[] a = c;
    public int b;

    public final void a(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = this.b;
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
            this.a = Arrays.copyOf(this.a, length2);
        }
        int[] iArr2 = this.a;
        int i4 = this.b;
        iArr2[i4] = i;
        this.b = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b != dVar.b) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] != dVar.a[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        return Arrays.toString(i == 0 ? c : Arrays.copyOf(this.a, i));
    }
}
