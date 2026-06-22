package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˆ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0120 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static int m406(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static <T> int m407(T[] tArr, int i) {
        int iM409 = m409(i);
        for (T t : tArr) {
            iM409 = m411(iM409, t);
        }
        return m406(iM409, tArr.length);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static int m408() {
        return m409(0);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static int m409(int i) {
        return i;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static int m410(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static int m411(int i, Object obj) {
        return m410(i, obj != null ? obj.hashCode() : 0);
    }
}
