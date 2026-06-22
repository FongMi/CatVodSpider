package com.github.catvod.spider.merge;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class Pt {
    private static boolean S;
    private static ut l8;

    private static final class ut extends SecurityManager {
        private ut() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Pt() {
    }

    private static ut OL() {
        try {
            return new ut();
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static ut S() {
        ut utVar = l8;
        if (utVar != null) {
            return utVar;
        }
        if (S) {
            return null;
        }
        ut utVarOL = OL();
        l8 = utVarOL;
        S = true;
        return utVarOL;
    }

    public static final void T4(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void b(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static boolean l(String str) {
        String strTT = tT(str);
        if (strTT == null) {
            return false;
        }
        return strTT.equalsIgnoreCase("true");
    }

    public static Class<?> l8() {
        int i;
        ut utVarS = S();
        if (utVarS == null) {
            return null;
        }
        Class<?>[] classContext = utVarS.getClassContext();
        String name = Pt.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static String tT(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
