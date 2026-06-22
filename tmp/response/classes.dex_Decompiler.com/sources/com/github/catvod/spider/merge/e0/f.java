package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
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
            throw new IllegalStateException(oZP.d("330E1E2D0931551B18610A3C1B0B572E1E325B1C1B27583F5B07122D1C30071C5914183C194F18334C3C011C57220D39190A0561053B551B1F244C26010E142A577501071E324C261D00022D08751B0003610434051F122F"));
        }
        return classContext[i];
    }

    public static final void b(String str) {
        System.err.println(oZP.d("26233175266F55") + str);
    }

    public static final void c(String str, Throwable th) {
        System.err.println(str);
        System.err.println(oZP.d("270A072E1E21100B57241436101F0328033B4F"));
        th.printStackTrace();
    }
}
