package com.github.catvod.spider.merge.K1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.K1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0789c extends com.github.catvod.spider.merge.J1.c {
    private static final String[] j = {"ثانية", "ثانيتين", "ثوانٍ"};
    private static final String[] k = {"دقائق", "دقيقة", "دقيقتين"};
    private static final String[] l = {"ساعات", "ساعة", "ساعتين"};
    private static final String[] m = {"أيام", "يوم", "يومين"};
    private static final String[] n = {"أسابيع", "أسبوع", "أسبوعين"};
    private static final String[] o = {"أشهر", "شهر", "شهرين", "شهرًا"};
    private static final String[] p = {"سنة", "سنتين", "سنوات"};
    private static final C0789c q = new C0789c();

    private C0789c() {
        super(" ", j, k, l, m, n, o, p);
    }

    public static C0789c e() {
        return q;
    }
}
