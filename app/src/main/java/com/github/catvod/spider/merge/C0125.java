package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ˋ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0125 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0125 f311 = new C0125(-1, -2);

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    static C0125[] f312 = new C0125[1001];

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static int f313 = 0;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static int f314 = 0;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static int f315 = 0;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static int f316 = 0;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public int f317;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public int f318;

    public C0125(int i, int i2) {
        this.f317 = i;
        this.f318 = i2;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static C0125 m418(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C0125(i, i2);
        }
        C0125[] c0125Arr = f312;
        if (c0125Arr[i] == null) {
            c0125Arr[i] = new C0125(i, i);
        }
        return f312[i];
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0125)) {
            return false;
        }
        C0125 c0125 = (C0125) obj;
        return this.f317 == c0125.f317 && this.f318 == c0125.f318;
    }

    public int hashCode() {
        return ((713 + this.f317) * 31) + this.f318;
    }

    public String toString() {
        return this.f317 + SOY.d("547C") + this.f318;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public boolean m419(C0125 c0125) {
        return this.f317 == c0125.f318 + 1 || this.f318 == c0125.f317 - 1;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public boolean m420(C0125 c0125) {
        return m422(c0125) || m421(c0125);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public boolean m421(C0125 c0125) {
        return this.f317 > c0125.f318;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public boolean m422(C0125 c0125) {
        int i = this.f317;
        int i2 = c0125.f317;
        return i < i2 && this.f318 < i2;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public C0125 m423(C0125 c0125) {
        return m418(Math.min(this.f317, c0125.f317), Math.max(this.f318, c0125.f318));
    }
}
