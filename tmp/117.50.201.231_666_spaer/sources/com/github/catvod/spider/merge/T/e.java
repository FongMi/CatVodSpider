package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e {
    private static a a;
    private static boolean b;

    private static final class a extends SecurityManager {
        a() {
        }

        @Override // java.lang.SecurityManager
        protected final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private e() {
    }

    public static Class<?> a() {
        int i;
        a aVar = a;
        if (aVar == null) {
            if (b) {
                aVar = null;
            } else {
                try {
                    aVar = new a();
                } catch (SecurityException unused) {
                    aVar = null;
                }
                a = aVar;
                b = true;
            }
        }
        if (aVar == null) {
            return null;
        }
        Class<?>[] classContext = aVar.getClassContext();
        String name = e.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static final void b(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void c(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
