package com.github.catvod.spider.merge.FM.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f {
    private static e a;
    private static boolean b;

    private f() {
    }

    public static Class<?> a() {
        int i;
        e eVar = a;
        if (eVar == null) {
            if (b) {
                eVar = null;
            } else {
                try {
                    eVar = new e();
                } catch (SecurityException unused) {
                    eVar = null;
                }
                a = eVar;
                b = true;
            }
        }
        if (eVar == null) {
            return null;
        }
        Class<?>[] classContext = eVar.getClassContext();
        String name = f.class.getName();
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
