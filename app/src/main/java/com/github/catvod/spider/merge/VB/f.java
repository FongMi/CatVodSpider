package com.github.catvod.spider.merge.VB;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
            throw new IllegalStateException(ZrJ.d("3F2222212D215937246D2E2C17276B223A225730272B7C2F572B2E2138200B3065183C2C1563243F682C0D306B2E29291526396D212B5937232868360D22282673650D2B223E6836112C3E212C65172C3F6D202409332E23"));
        }
        return classContext[i];
    }

    public static final void b(String str) {
        System.err.println(ZrJ.d("2A0F0D79027F59") + str);
    }

    public static final void c(String str, Throwable th) {
        System.err.println(str);
        System.err.println(ZrJ.d("2B263B223A311C276B2830261C333F24272B43"));
        th.printStackTrace();
    }
}
