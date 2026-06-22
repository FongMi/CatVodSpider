package com.github.catvod.spider.merge.cv;

import com.github.catvod.spider.merge.nIe;
import java.io.PrintStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class c {
    private static boolean a;
    static /* synthetic */ Class b;

    static {
        try {
            a = System.getProperty(nIe.d("3A0B3F6D3A3B3003322E672B27042624")) != null;
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ Class a() {
        return c.class;
    }

    private static void b(String str) {
        if (a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(nIe.d("1132010608027846"));
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[PHI: r2
      0x0056: PHI (r2v2 java.lang.Class<com.github.catvod.spider.merge.cv.c>) = 
      (r2v0 java.lang.Class<com.github.catvod.spider.merge.cv.c>)
      (r2v3 java.lang.Class<com.github.catvod.spider.merge.cv.c>)
     binds: [B:15:0x004e, B:12:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object c() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.cv.c.c():java.lang.Object");
    }

    private static Object d(String str, ClassLoader classLoader) {
        String strD = nIe.d("12143C35202B271473");
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strD);
            stringBuffer.append(str);
            stringBuffer.append(nIe.d("62083C3769292D133D27"));
            throw new a(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(strD);
            stringBuffer2.append(str);
            stringBuffer2.append(nIe.d("62053C36252B62083C37692D27463A2D3A3B2308272A283B27026963"));
            stringBuffer2.append(e2);
            throw new a(stringBuffer2.toString(), e2);
        }
    }
}
