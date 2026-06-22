package com.github.catvod.spider.merge.F1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.F1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0627c {
    public C0625a a;
    public C0626b b;

    private C0627c(C0625a c0625a, C0626b c0626b) {
        this.a = c0625a;
        this.b = c0626b;
    }

    public static C0627c a() {
        return new C0627c(new C0625a("ANDROID", "21.03.36"), new C0626b("MOBILE", null, null, "Android", "16", 36));
    }

    public static C0627c b() {
        return new C0627c(new C0625a("WEB", "2.20260120.01.00"), new C0626b("DESKTOP", null, null, null, null, -1));
    }
}
