package com.github.catvod.spider.merge;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ႁ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0579 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public int f1272;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0407 f1273;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0579[] f1274;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public boolean f1275;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public int f1276;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public C0445 f1277;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public boolean f1278;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public C0580[] f1279;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ႁ$Ϳ, reason: contains not printable characters */
    public static class C0580 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public AbstractC0561 f1280;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public int f1281;

        public C0580(AbstractC0561 abstractC0561, int i) {
            this.f1281 = i;
            this.f1280 = abstractC0561;
        }

        public String toString() {
            return SOY.d("52") + this.f1280 + SOY.d("5672") + this.f1281 + SOY.d("53");
        }
    }

    public C0579() {
        this.f1272 = -1;
        this.f1273 = new C0407();
        this.f1275 = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0579) {
            return this.f1273.equals(((C0579) obj).f1273);
        }
        return false;
    }

    public int hashCode() {
        return C0120.m406(C0120.m410(C0120.m409(7), this.f1273.hashCode()), 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1272);
        sb.append(SOY.d("40"));
        sb.append(this.f1273);
        if (this.f1275) {
            sb.append(SOY.d("476C"));
            C0580[] c0580Arr = this.f1279;
            if (c0580Arr != null) {
                sb.append(Arrays.toString(c0580Arr));
            } else {
                sb.append(this.f1276);
            }
        }
        return sb.toString();
    }

    public C0579(C0407 c0407) {
        this.f1272 = -1;
        this.f1273 = new C0407();
        this.f1275 = false;
        this.f1273 = c0407;
    }
}
