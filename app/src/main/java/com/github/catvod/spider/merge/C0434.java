package com.github.catvod.spider.merge;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ॱ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0434 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static int[] f1061 = new int[0];

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private int[] f1062 = f1061;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private int f1063;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private void m1612(int i) {
        if (i < 0 || i > 2147483639) {
            throw new OutOfMemoryError();
        }
        int[] iArr = this.f1062;
        int length = iArr.length == 0 ? 4 : iArr.length;
        while (length < i) {
            length *= 2;
            if (length < 0 || length > 2147483639) {
                length = 2147483639;
            }
        }
        this.f1062 = Arrays.copyOf(this.f1062, length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0434)) {
            return false;
        }
        C0434 c0434 = (C0434) obj;
        if (this.f1063 != c0434.f1063) {
            return false;
        }
        for (int i = 0; i < this.f1063; i++) {
            if (this.f1062[i] != c0434.f1062[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1063; i2++) {
            i = (i * 31) + this.f1062[i2];
        }
        return i;
    }

    public String toString() {
        return Arrays.toString(m1619());
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public final void m1613(int i) {
        int length = this.f1062.length;
        int i2 = this.f1063;
        if (length == i2) {
            m1612(i2 + 1);
        }
        int[] iArr = this.f1062;
        int i3 = this.f1063;
        iArr[i3] = i;
        this.f1063 = i3 + 1;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public final void m1614() {
        Arrays.fill(this.f1062, 0, this.f1063, 0);
        this.f1063 = 0;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final int m1615(int i) {
        if (i < 0 || i >= this.f1063) {
            throw new IndexOutOfBoundsException();
        }
        return this.f1062[i];
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final boolean m1616() {
        return this.f1063 == 0;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public final int m1617(int i) {
        int iM1615 = m1615(i);
        int[] iArr = this.f1062;
        System.arraycopy(iArr, i + 1, iArr, i, (this.f1063 - i) - 1);
        int[] iArr2 = this.f1062;
        int i2 = this.f1063;
        iArr2[i2 - 1] = 0;
        this.f1063 = i2 - 1;
        return iM1615;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public final int m1618() {
        return this.f1063;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public final int[] m1619() {
        int i = this.f1063;
        return i == 0 ? f1061 : Arrays.copyOf(this.f1062, i);
    }
}
