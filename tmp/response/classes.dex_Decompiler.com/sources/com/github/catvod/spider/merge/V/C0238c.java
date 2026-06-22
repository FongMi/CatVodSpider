package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.oZP;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.v.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0238c {
    private static boolean a;
    static /* synthetic */ Class b;

    static {
        try {
            a = System.getProperty(oZP.d("0D021B6F1F21070A162C4231100D0226")) != null;
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ Class a() {
        return C0238c.class;
    }

    private static void b(String str) {
        if (a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(oZP.d("263B25042D184F4F"));
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[PHI: r2
      0x0056: PHI (r2v2 java.lang.Class<com.github.catvod.spider.merge.v.c>) = (r2v0 java.lang.Class<com.github.catvod.spider.merge.v.c>), (r2v3 java.lang.Class<com.github.catvod.spider.merge.v.c>) binds: [B:15:0x004e, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object c() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.v.C0238c.c():java.lang.Object");
    }

    private static Object d(String str, ClassLoader classLoader) {
        String strD = oZP.d("251D18370531101D57");
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strD);
            stringBuffer.append(str);
            stringBuffer.append(oZP.d("550118354C331A1A1925"));
            throw new C0236a(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(strD);
            stringBuffer2.append(str);
            stringBuffer2.append(oZP.d("550C18340031550118354C37104F1E2F1F21140103280D21100B4D61"));
            stringBuffer2.append(e2);
            throw new C0236a(stringBuffer2.toString(), e2);
        }
    }
}
