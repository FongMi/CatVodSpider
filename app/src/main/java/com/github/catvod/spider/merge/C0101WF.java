package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.WF */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public final class C0101WF {

    /* renamed from: q */
    private static Qe f551q;

    /* renamed from: xC */
    private static boolean f552xC;

    /* renamed from: com.github.catvod.spider.merge.WF$Qe */
    private static final class Qe extends SecurityManager {
        private Qe() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private C0101WF() {
    }

    /* renamed from: Mo */
    public static boolean m471Mo(String str) {
        String strM474i = m474i(str);
        if (strM474i == null) {
            return false;
        }
        return strM474i.equalsIgnoreCase("true");
    }

    /* renamed from: QU */
    public static final void m472QU(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* renamed from: UJ */
    public static final void m473UJ(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: i */
    public static String m474i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static Class<?> m475q() {
        int i;
        Qe qeM477xC = m477xC();
        if (qeM477xC == null) {
            return null;
        }
        Class<?>[] classContext = qeM477xC.getClassContext();
        String name = C0101WF.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    /* renamed from: u */
    private static Qe m476u() {
        try {
            return new Qe();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: xC */
    private static Qe m477xC() {
        Qe qe = f551q;
        if (qe != null) {
            return qe;
        }
        if (f552xC) {
            return null;
        }
        Qe qeM476u = m476u();
        f551q = qeM476u;
        f552xC = true;
        return qeM476u;
    }
}
