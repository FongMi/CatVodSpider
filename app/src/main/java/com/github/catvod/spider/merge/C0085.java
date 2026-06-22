package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ɹ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0085 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static C0087 f263;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static boolean f264;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ɹ$Ԩ, reason: contains not printable characters */
    private static final class C0087 extends SecurityManager {
        private C0087() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private C0085() {
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static Class<?> m344() {
        int i;
        C0087 c0087M345 = m345();
        if (c0087M345 == null) {
            return null;
        }
        Class<?>[] classContext = c0087M345.getClassContext();
        String name = C0085.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException(SOY.d("3C33381A11135A263E56121E14367119061054213D10401D543A341A041208217F23001E16723E04541E0E217115151B163723561D195A26391354040E33321D4F570E3A38055404123D241A1057143D25561C160A223418"));
        }
        return classContext[i];
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static C0087 m345() {
        C0087 c0087 = f263;
        if (c0087 != null) {
            return c0087;
        }
        if (f264) {
            return null;
        }
        C0087 c0087M348 = m348();
        f263 = c0087M348;
        f264 = true;
        return c0087M348;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static final void m346(String str) {
        System.err.println(SOY.d("291E17423E4D5A") + str);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static final void m347(String str, Throwable th) {
        System.err.println(str);
        System.err.println(SOY.d("2837211906031F3671130C141F22251F1B1940"));
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static C0087 m348() {
        try {
            return new C0087();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static boolean m349(String str) {
        String strM350 = m350(str);
        if (strM350 == null) {
            return false;
        }
        return strM350.equalsIgnoreCase(SOY.d("0E202413"));
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static String m350(String str) {
        if (str == null) {
            throw new IllegalArgumentException(SOY.d("14273D1A541E14222402"));
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
