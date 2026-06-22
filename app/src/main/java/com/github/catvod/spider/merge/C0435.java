package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ॽ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0435 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0435 f1064 = new C0435(false, false);

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static final C0435 f1065 = new C0435(true, true);

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final boolean f1066;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final boolean f1067;

    public C0435(boolean z, boolean z2) {
        this.f1066 = z;
        this.f1067 = z2;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public String m1620(String str) {
        String strTrim = str.trim();
        return !this.f1067 ? C0256.m916(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    C0542 m1621(C0542 c0542) {
        if (c0542 != null && !this.f1067) {
            c0542.m1760();
        }
        return c0542;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public String m1622(String str) {
        String strTrim = str.trim();
        return !this.f1066 ? C0256.m916(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public boolean m1623() {
        return this.f1067;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public boolean m1624() {
        return this.f1066;
    }
}
